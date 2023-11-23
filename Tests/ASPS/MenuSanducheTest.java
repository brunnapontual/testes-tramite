
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
public class MenuSanducheTest {
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
  public void menuSanduche() {
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/gabinete");
    driver.manage().window().setSize(new Dimension(890, 860));
    driver.findElement(By.cssSelector(".fa-bars")).click();
    driver.findElement(By.cssSelector(".fa-bars")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".navbar-nav"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".nav-item:nth-child(1) span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#legislativo-menu > span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#tutorial-menu > span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#account-menu > span > span"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".nav-item:nth-child(1) > .nav-link"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".nav-item:nth-child(1) span > span")).getText(), is("INÍCIO"));
    assertThat(driver.findElement(By.cssSelector("#legislativo-menu > span > span")).getText(), is("LEGISLATIVO"));
    assertThat(driver.findElement(By.cssSelector("#tutorial-menu > span > span")).getText(), is("TUTORIAL PLOA 2024"));
    assertThat(driver.findElement(By.cssSelector("#account-menu > span > span")).getText(), is("USUARIO"));
    driver.findElement(By.cssSelector(".fa-bars > path")).click();
  }
}