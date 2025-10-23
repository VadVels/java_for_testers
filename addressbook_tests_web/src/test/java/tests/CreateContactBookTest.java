import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactBookTest {
    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        if (driver == null) {
            driver = new FirefoxDriver();
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
            driver.get("http://localhost/addressbook/");
            driver.manage().window().setSize(new Dimension(1264, 729));
            driver.findElement(By.name("user")).sendKeys("admin");
            driver.findElement(By.name("pass")).click();
            driver.findElement(By.name("pass")).sendKeys("secret");
            driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
        }

    }


    @Test
    public void createContactBook() {
        if (!isElementPresent(By.linkText("add new"))) {
            driver.findElement(By.name("Enter")).click();
        }
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("test");
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys("test");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("test");
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).sendKeys("test");
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).sendKeys("test");
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).sendKeys("test");
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).sendKeys("test");
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).sendKeys("test");
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys("test");
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).sendKeys("test");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("test@mail,ru");
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("homepage")).click();
        driver.findElement(By.name("homepage")).sendKeys("test");
        driver.findElement(By.name("bday")).click();
        {
            WebElement dropdown = driver.findElement(By.name("bday"));
            dropdown.findElement(By.xpath("//option[. = '7']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(61) > option:nth-child(9)")).click();
        driver.findElement(By.name("bmonth")).click();
        {
            WebElement dropdown = driver.findElement(By.name("bmonth"));
            dropdown.findElement(By.xpath("//option[. = 'October']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(62) > option:nth-child(11)")).click();
        driver.findElement(By.name("byear")).click();
        driver.findElement(By.name("byear")).sendKeys("2000");
        driver.findElement(By.name("aday")).click();
        {
            WebElement dropdown = driver.findElement(By.name("aday"));
            dropdown.findElement(By.xpath("//option[. = '7']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(66) > option:nth-child(9)")).click();
        driver.findElement(By.name("amonth")).click();
        {
            WebElement dropdown = driver.findElement(By.name("amonth"));
            dropdown.findElement(By.xpath("//option[. = 'August']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(67) > option:nth-child(9)")).click();
        driver.findElement(By.name("ayear")).click();
        driver.findElement(By.name("ayear")).sendKeys("2005");
        driver.findElement(By.name("new_group")).click();
        {
            WebElement dropdown = driver.findElement(By.name("new_group"));
            dropdown.findElement(By.xpath("//option[. = 'Group name']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(71) > option:nth-child(3)")).click();
        driver.findElement(By.cssSelector("input:nth-child(75)")).click();
        driver.findElement(By.linkText("home page")).click();
    }

    private boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }

    }

    @Test
    public void createContactBookWithEmty() {

        if (!isElementPresent(By.linkText("add new"))) {
            driver.findElement(By.name("Enter")).click();
        }
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("");
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys("");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("");
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).sendKeys("");
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).sendKeys("");
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).sendKeys("");
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).sendKeys("");
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).sendKeys("");
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys("");
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).sendKeys("");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("homepage")).click();
        driver.findElement(By.name("homepage")).sendKeys("");
        driver.findElement(By.name("bday")).click();
        {
            WebElement dropdown = driver.findElement(By.name("bday"));
            dropdown.findElement(By.xpath("//option[. = '7']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(61) > option:nth-child(9)")).click();
        driver.findElement(By.name("bmonth")).click();
        {
            WebElement dropdown = driver.findElement(By.name("bmonth"));
            dropdown.findElement(By.xpath("//option[. = 'October']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(62) > option:nth-child(11)")).click();
        driver.findElement(By.name("byear")).click();
        driver.findElement(By.name("byear")).sendKeys("2000");
        driver.findElement(By.name("aday")).click();
        {
            WebElement dropdown = driver.findElement(By.name("aday"));
            dropdown.findElement(By.xpath("//option[. = '7']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(66) > option:nth-child(9)")).click();
        driver.findElement(By.name("amonth")).click();
        {
            WebElement dropdown = driver.findElement(By.name("amonth"));
            dropdown.findElement(By.xpath("//option[. = 'August']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(67) > option:nth-child(9)")).click();
        driver.findElement(By.name("ayear")).click();
        driver.findElement(By.name("ayear")).sendKeys("2005");
        driver.findElement(By.name("new_group")).click();
        {
            WebElement dropdown = driver.findElement(By.name("new_group"));
            dropdown.findElement(By.xpath("//option[. = 'Group name']")).click();
        }
        driver.findElement(By.cssSelector("select:nth-child(71) > option:nth-child(3)")).click();
        driver.findElement(By.cssSelector("input:nth-child(75)")).click();
        driver.findElement(By.linkText("home page")).click();
    }


}
