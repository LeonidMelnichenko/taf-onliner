package by.itacademy.melnichenko.leonid.taf.onliner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest {
    @Test
    public void testLoginForm(){
        Page page = new Page();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLoginXpath));
        buttonLogin.click();

        WebElement inputLogin = driver.findElement(By.xpath(page.inputLoginXpath));
        inputLogin.sendKeys("mail@mail.com");

    }
}
