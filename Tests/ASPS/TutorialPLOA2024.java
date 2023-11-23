
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
public class TutorialPLOA2024Test {
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
  public void tutorialPLOA2024() {
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/gabinete");
    driver.findElement(By.id("tutorial-menu")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".show:nth-child(2)"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".show > li:nth-child(1) span")).getText(), is("1 Regras"));
    assertThat(driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(2) span")).getText(), is("2 Sistema"));
    assertThat(driver.findElement(By.cssSelector("li:nth-child(3) > .dropdown-item > span")).getText(), is("3 Saúde (ASPS)"));
    assertThat(driver.findElement(By.cssSelector("li:nth-child(4) > .dropdown-item > span")).getText(), is("4 Transferência Especial"));
    assertThat(driver.findElement(By.cssSelector("li:nth-child(5) span")).getText(), is("5 Demais Destinações"));
    assertThat(driver.findElement(By.cssSelector("li:nth-child(6) span")).getText(), is("6 Enviar à SEGMD"));
  }
}