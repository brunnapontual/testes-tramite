
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class TransespecialerroTest {
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
  /**
   * 
   */
  @Test
  //teste transação especial com valor menor que a regra -> mensagem de erro
  public void transespecialerro() {
    driver.get("http://10.2.1.110:8080//");
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
    driver.findElement(By.cssSelector("#login > span")).click();
    driver.findElement(By.id("password")).sendKeys("usuario");
    driver.findElement(By.id("username")).sendKeys("usuario");
    driver.findElement(By.id("kc-login")).click();
    {
      WebElement element = driver.findElement(By.id("legislativo-menu"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("legislativo-menu")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("submenuEmendasLOA5Item")).click();
    driver.findElement(By.cssSelector("div > li:nth-child(2) span")).click();
    driver.findElement(By.cssSelector("#botao-editar > span")).click();
    driver.findElement(By.cssSelector(".ng-select-focused input")).click();
    driver.findElement(By.cssSelector("#a7ceecbc1f9e-0 > div")).click();
    driver.findElement(By.cssSelector(".ng-input:nth-child(2) > input")).click();
    driver.findElement(By.cssSelector(".ng-input:nth-child(2) > input")).click();
    driver.findElement(By.cssSelector("#acfa61eda659-0 > div")).click();
    driver.findElement(By.cssSelector(".ng-untouched > .input-group > #field_valor")).sendKeys("60000");
    assertThat(driver.findElement(By.cssSelector(".form-text")).getText(), is("As propostas aqui elencadas não cumprem a regra de destinação mínima de 70% das transferências especiais para despesas de capital (Grupos 44 - Investimentos ou 45 - Inversões Financeiras)."));
  }
}