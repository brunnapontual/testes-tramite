
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
public class LoginTest {
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
  public void login() {
    driver.get("http://10.2.1.110:8080//");
    driver.findElement(By.linkText("entrar")).click();
    driver.findElement(By.id("password")).sendKeys("master1plus");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("kc-login")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#account-menu > span > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("#account-menu > span > span")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".fa-sign-out-alt")).click();
    driver.findElement(By.linkText("entrar")).click();
    driver.findElement(By.id("password")).sendKeys("usuario");
    driver.findElement(By.id("username")).sendKeys("usuario");
    driver.findElement(By.id("kc-login")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#account-menu > span > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}