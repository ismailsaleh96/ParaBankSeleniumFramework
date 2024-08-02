package tests;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class MobilecompatibilityTest extends TestBase {

    HomePage homeObject ;

    @Test
    public void testMobileResolutions() {

        homeObject = new HomePage(driver);

        int[][] resolutions = {
                {360, 640},  // Small Mobile
                {375, 667},  // iPhone 6/7/8
                {414, 736},  // iPhone 6/7/8 Plus
                {768, 1024}, // iPad
                {1280, 800}  // Small Tablet
        };

        for (int[] resolution : resolutions) {
            int width = resolution[0];
            int height = resolution[1];

            driver.manage().window().setSize(new Dimension(width, height));

            // Add your assertions or checks here to verify that the site looks correct

            // Example assertion (you should replace this with actual checks)

            Assert.assertTrue(homeObject.paraBankIsOpenedLink.getText().contains("ParaBank Is Now Re-Opened"), "title is incorrect for resolution: " + width + "x" + height);
        }
    }
}
