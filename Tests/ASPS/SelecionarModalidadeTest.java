
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
public class SelecionaraModalidadeTest {
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
  public void selecionaraModalidade() {
    // Abrir site
    driver.get("http://10.2.1.110:8080/legislativo-proposta-emenda-loa/2024/EMENDA/new");
    // Teste botões menu
    driver.findElement(By.xpath("(//input[@type=\'text\'])[2]")).click();
    driver.findElement(By.cssSelector(".justify-content-center")).click();
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
    // Verificar se opções aparecem e garantir que texto tá certo (sem seleção)
    driver.findElement(By.xpath("(//input[@type=\'text\'])[2]")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-dropdown-panel"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-option")).getText(), is("20 - Transferências à União"));
    assertThat(driver.findElement(By.xpath("//div[2]/div[2]")).getText(), is("22 - Execução Orçamentária Delegada à União"));
    assertThat(driver.findElement(By.xpath("//div[2]/div[3]/div")).getText(), is("30 - Transferências a Estados e ao Distrito Federal"));
    assertThat(driver.findElement(By.xpath("//div[4]/div")).getText(), is("32 - Execução Orçamentária Delegada a Estados e ao Distrito Federal"));
    assertThat(driver.findElement(By.xpath("//div[2]/div[5]/div")).getText(), is("40 - Transferências a Municípios"));
    assertThat(driver.findElement(By.xpath("//div[6]/div")).getText(), is("41 - Transferências a Município - Fundo a Fundo"));
    assertThat(driver.findElement(By.xpath("//div[2]/div[7]/div")).getText(), is("42 - Execução Orçamentária Delegada a Municípios"));
    assertThat(driver.findElement(By.xpath("//div[8]/div")).getText(), is("45 - Transferências Fundo a Fundo aos Municípios à conta de recursos de que tratam os §§ 1º e 2º do art.24 da Lei C"));
    assertThat(driver.findElement(By.xpath("//div[9]/div")).getText(), is("46 - Transferências Fundo a Fundo aos Municípios à conta de recursos de que trata o art.25 da Lei Complementar nº 1"));
    assertThat(driver.findElement(By.xpath("//div[10]/div")).getText(), is("50 - Transferências a Instituições Privadas sem Fins Lucrativos"));
    assertThat(driver.findElement(By.xpath("//div[11]/div")).getText(), is("60 - Transferências a Instituições Privadas com Fins Lucrativos"));
    assertThat(driver.findElement(By.xpath("//div[12]/div")).getText(), is("67 - Execução de Contrato de Parceria Público-Privada - PPP"));
    assertThat(driver.findElement(By.xpath("//div[13]/div")).getText(), is("70 - Transferências a Instituições Multigovernamentais"));
    assertThat(driver.findElement(By.xpath("//div[14]/div")).getText(), is("71 - Transferências a Consórcios Públicos mediante contrato de rateio"));
    assertThat(driver.findElement(By.xpath("//div[15]/div")).getText(), is("72 - Execução Orçamentária Delegada a Consórcios Públicos"));
    assertThat(driver.findElement(By.xpath("//div[16]/div")).getText(), is("73 - Transferências a Consórcios Públicos mediante contrato de rateio à conta de recursos de que tratam os §§ 1º e"));
    assertThat(driver.findElement(By.xpath("//div[17]/div")).getText(), is("74 - Transferências a Consórcios Públicos mediante contrato de rateio à conta de recursos de que trata o art. 25 da"));
    assertThat(driver.findElement(By.xpath("//div[18]/div")).getText(), is("75 - Transferências a Instituições Multigovernamentais à conta de recursos de que tratamos §§ 1ºe 2º do art. 24 da"));
    assertThat(driver.findElement(By.xpath("//div[19]/div")).getText(), is("76 - Transferências a Instituições Multigovernamentais à conta de recursos de que trata o art. 25 da Lei Complement"));
    assertThat(driver.findElement(By.xpath("//div[20]/div")).getText(), is("80 - Transferências ao Exterior"));
    assertThat(driver.findElement(By.xpath("//div[21]/div")).getText(), is("90 - Aplicações Diretas"));
    assertThat(driver.findElement(By.xpath("//div[22]/div")).getText(), is("91 - Aplicação Direta Decorrente de Operação entre Órgãos, Fundos e Entidades Integrantes dos Orçamentos Fiscal e d"));
    assertThat(driver.findElement(By.xpath("//div[23]/div")).getText(), is("92 - Aplicação Direta de Recursos Recebidos de Outros Entes da Federação Decorrentes de Delegação ou Descentralizaç"));
    assertThat(driver.findElement(By.xpath("//div[24]/div")).getText(), is("93 - Aplicação Direta Dec.de Operação de Órgãos,Fundos e Entidades Integrantes dos Orç.Fiscal e da Seg.Social com C"));
    assertThat(driver.findElement(By.xpath("//div[25]/div")).getText(), is("94 - Aplicação Direta Decorrente de Operação de Órgãos,Fundos e Entidades Integrantes dos Orçamentos Fiscal e da Se"));
    assertThat(driver.findElement(By.xpath("//div[26]/div")).getText(), is("95 - Aplicação Direta à conta de recursos de que tratam os §§ 1º e 2º do art.24 da Lei Complementar nº 141, de 2012"));
    assertThat(driver.findElement(By.xpath("//div[27]/div")).getText(), is("96 - Aplicação Direta à conta de recursos de que trata o art.25 da Lei Complementar nº 141, de 2012"));
    assertThat(driver.findElement(By.xpath("//div[28]/div")).getText(), is("99 - Reserva de Contingência"));
    // Com opção selecionada
    driver.findElement(By.xpath("//div/div[2]/div/div")).click();
    driver.findElement(By.cssSelector(".ng-arrow-wrapper:nth-child(3)")).click();
    assertThat(driver.findElement(By.xpath("//div/div[2]/div/div")).getText(), is(not("20 - Transferências à União")));
    // Com emenda selecionada (Impositiva Saúde)
    driver.findElement(By.xpath("//ng-select/div/span")).click();
    driver.findElement(By.xpath("//div/div[2]/div")).click();
    driver.findElement(By.xpath("//modalidade-searchable-dropdown/div/ng-select/div/span")).click();
    assertThat(driver.findElement(By.xpath("//div[2]/div[2]")).getText(), is(not("22 - Execução Orçamentária Delegada à União")));
    // Botão X
    driver.findElement(By.cssSelector(".ng-clear-wrapper")).click();
    assertThat(driver.findElement(By.cssSelector(".form-text")).getText(), is("O campo é obrigatório."));
  }
}