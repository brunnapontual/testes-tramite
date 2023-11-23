
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SelecionarTipodeEmendaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void selecionarTipodeEmenda() {
    // Abrir Site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    // Teste botões do menu
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
    // Verificar se opções aparecem e garantir que texto tá certo (sem seleção)
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-option-label"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-option-label")).getText(), is("1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)"));
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    driver.findElement(By.xpath("//div/div[2]/div")).click();
    // Verificar se opções aparecem e garantir que texto tá certo (selecionado o 1)
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    assertThat(driver.findElement(By.cssSelector(".ng-option-label")).getText(), is(not("1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)")));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-option-label"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-option-label")).getText(), is("2. Impositiva - Transferência Especial"));
    // Botão X
    driver.findElement(By.cssSelector(".ng-clear-wrapper")).click();
    assertThat(driver.findElement(By.cssSelector(".form-text")).getText(), is("O campo é obrigatório."));
    // Fechar
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
  }
}