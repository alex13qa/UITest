import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class testclass {

    public static void main(String[] args) {

//        System.out.println("Please, enter web site url");
//        Scanner readFromClientTerminal = new Scanner(System.in);
//        String webSite = readFromClientTerminal.nextLine();

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.quit();
    }
}
