// Generated by Selenium IDE
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
public class DeduzidoseDotaoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void deduzidoseDotao() {
    // Abrir site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    // Verificar botões
    driver.findElement(By.xpath("(//input[@type=\'text\'])[5]")).click();
    // Ação Deduzida
    driver.findElement(By.xpath("(//input[@type=\'text\'])[5]")).click();
    driver.findElement(By.xpath("//div[13]/div/acao-searchable-dropdown/bmd-help-input/div/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//div[13]/div/acao-searchable-dropdown/bmd-help-input/div/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    // Grupo de Despesa Deduzido
    driver.findElement(By.xpath("(//input[@type=\'text\'])[6]")).click();
    driver.findElement(By.xpath("//div[15]/div/grupo-despesa-searchable-dropdown/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//div[15]/div/grupo-despesa-searchable-dropdown/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//div[2]/div[3]/div")).click();
    // Fonte de Recursos - Dotação
    driver.findElement(By.xpath("(//input[@type=\'text\'])[7]")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    // Botão X¹ existe?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-clear-wrapper"));
      assert(elements.size() > 0);
    }
    // Botão X
    driver.findElement(By.cssSelector(".ng-clear-wrapper")).click();
    // Botão X² existe?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-clear-wrapper"));
      assert(elements.size() > 0);
    }
    // Botão X
    driver.findElement(By.cssSelector(".ng-clear-wrapper")).click();
    // Botão X³ existe?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-clear-wrapper"));
      assert(elements.size() > 0);
    }
    // Botão X
    driver.findElement(By.cssSelector(".ng-clear-wrapper")).click();
    // Botão X4 existe?
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-clear-wrapper"));
      assert(elements.size() == 0);
    }
    // Opções estão vazias
    {
      List<WebElement> elements = driver.findElements(By.xpath("(//input[@type=\'text\'])[5]"));
      assert(elements.size() == 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("(//input[@type=\'text\'])[6]"));
      assert(elements.size() == 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("(//input[@type=\'text\'])[7]"));
      assert(elements.size() == 0);
    }
    // Aparece os 3 automaticamente ao selecionar emenda?
    driver.findElement(By.xpath("//input[@type=\'text\']")).click();
    driver.findElement(By.xpath("//span[contains(.,\'1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)\')]")).click();
    assertThat(driver.findElement(By.xpath("//div/div/ng-select/div/div/div[2]/span[2]")).getText(), is("2866 - Reserva para Emendas Parlamentares"));
    assertThat(driver.findElement(By.xpath("//grupo-despesa-searchable-dropdown/div/ng-select/div/div/div[2]/span[2]")).getText(), is("33 - Outras Despesas Correntes"));
    assertThat(driver.findElement(By.xpath("//div/div/ng-select/div/div/div[2]/span[2]")).getText(), is("5000 - Recursos não vinculados de Impostos"));
  }
}
