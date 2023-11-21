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
public class EditadaexcluidaouenviadaTest {
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
  public void editadaexcluidaouenviada() {
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/gabinete?page=1&size=5&sort=id,desc&filter=true&gabId=11051&fbidVZero=true");
    // Verificar botões | Visualizar
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[2]/button/span"));
      assert(elements.size() > 0);
    }
    // Editar
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[2]/span"));
      assert(elements.size() > 0);
    }
    // Excluir
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[3]/span"));
      assert(elements.size() > 0);
    }
    // Abrir visualizar
    driver.findElement(By.xpath("//div[2]/button/span")).click();
    // Mandou pra outra página?
    assertThat(driver.findElement(By.id("jhi-legislativo-proposta-emenda-loa-heading")).getText(), is("Proposta de Emenda ao PLOA 2024"));
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/gabinete?page=1&size=5&sort=id,desc&filter=true&gabId=11051&fbidVZero=true");
    // Clicar Editar
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[2]/span"));
      assert(elements.size() > 0);
    }
    // Clicar Excluir
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[3]/span"));
      assert(elements.size() > 0);
    }
  }
}