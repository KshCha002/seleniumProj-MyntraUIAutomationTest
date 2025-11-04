package MyntraAutomates.src;

// public class LoginTestMyntra {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestMyntra {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "/Users/I529023/Downloads/chromedriver-mac-arm64"); 
        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Open Myntra homepage
            driver.get("https://www.myntra.com/");
            Thread.sleep(3000);

            // Locate the search bar element by its class name
            WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));

            // Check if the search bar is displayed
            if (searchBar.isDisplayed()) {
                System.out.println("Search bar is displayed. Test passed!");
            } else {
                System.out.println("Search bar is not displayed. Test failed.");
            }

            // Wait to observe
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}