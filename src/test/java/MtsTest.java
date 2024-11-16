import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // Установка WebDriver
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized"); // Максимизация окна при запуске

        driver = new FirefoxDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Переход на веб-сайт
        driver.get("https://www.mts.by");
        acceptCookies();
    }

    private void acceptCookies() {
        try {
            WebElement acceptCookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree")));
            if (acceptCookieButton.isDisplayed()) {
                acceptCookieButton.click();
            }
        } catch (Exception e) {
            System.out.println("Кнопка согласия с куками не найдена.");
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Закрывает драйвер после теста
        }
    }

    @Test
    @DisplayName("Check title Payment Section")
    public void checkTitlePaymentSection() {
        WebElement titlePayment = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//section[@class='pay']//h2[contains(text(),'Онлайн пополнение') and contains(., 'без комиссии')]")));
        assertTrue(titlePayment.isDisplayed(), "Заголовок секции 'Оплата' не отображается.");
    }

    @Test
    @DisplayName("Check icons for pay Payment Section")
    public void checkIconsForPayPaymentSection() {
        WebElement icons = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay__partners']//ul")));
        String[] expectedIcons = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"};

        for (String text : expectedIcons) {
            WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//img[@alt='" + text + "']")));
            assertTrue(icon.isDisplayed(), text + " icon is not displayed.");
        }
    }

    @Test
    @DisplayName("Check link about service")
    public void checkLinkAboutService() {
        WebElement moreAboutServiceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='pay']//a[contains(text(), 'Подробнее о сервисе')]")));
        assertTrue(moreAboutServiceLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена на странице.");
        moreAboutServiceLink.click();

        wait.until(ExpectedConditions.urlToBe("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", "Переход на страницу 'Подробнее о сервисе' не произошел.");
    }

    @Test
    @DisplayName("Test Form Online Payment")
    public void testFormOnlinePayment() {
        WebElement onlinePaymentBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']//section")));
        fillPaymentForm(onlinePaymentBlock);

        // Допустим, на странице есть iframe
        driver.switchTo().frame(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe"))));

        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root")));
        assertTrue(popup.isDisplayed(), "Всплывающее окно не отображается.");

        driver.switchTo().defaultContent(); // Возврат к основному контенту
    }

    private void fillPaymentForm(WebElement onlinePaymentBlock) {
        onlinePaymentBlock.findElement(By.xpath("//*[@id='connection-phone']")).sendKeys("297777777");
        onlinePaymentBlock.findElement(By.xpath("//*[@id='connection-sum']")).sendKeys("50");
        onlinePaymentBlock.findElement(By.xpath("//*[@id='connection-email']")).sendKeys("ivanov@gmail.com");
        onlinePaymentBlock.findElement(By.xpath("//*[@id='pay-connection']/button")).click();
    }
}