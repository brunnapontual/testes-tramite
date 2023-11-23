
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
public class SelecionarAoTest {
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
  public void selecionarAo() {
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).click();
    driver.findElement(By.xpath("//div/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//div/div/ng-select/div/span")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-dropdown-panel-items"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-input:nth-child(3) > input"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".col:nth-child(9) .svg-inline--fa"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-value-label")).getText(), is("10 - Concessão de Vale Transporte e Auxílio Alimentação a Servidores da Secretaria da Casa Civil"));
    driver.findElement(By.xpath("//div/div/ng-select/div/span")).click();
    driver.findElement(By.xpath("//ng-select/div/span")).click();
    driver.findElement(By.xpath("//span[contains(.,\'1. Impositiva - Saúde (Ações e Serviços Públicos de Saúde)\')]")).click();
    driver.findElement(By.xpath("(//input[@type=\'text\'])[2]")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div")).click();
    driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[1013]/div/span"));
      assert(elements.size() == 0);
    }
  }
}