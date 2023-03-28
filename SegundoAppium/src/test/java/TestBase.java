import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public static void Android_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        //capabilities.setCapability("app", "/Users/n1njaMEMO/IdeaProjects/AppiumPageObject/apps/ToDo.apk");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/ToDo.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }


    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}