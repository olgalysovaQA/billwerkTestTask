import Config.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

abstract public class BasePage {

    protected static WebDriver driver;

    static ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }


    protected static void open(String url, String pageTitle){

        driver.get(config.url() + url);

        if (!driver.getTitle().equals(pageTitle)) {
            throw new IllegalStateException("This page is not " + pageTitle + ". The current page is " + driver.getCurrentUrl());
        }
    }

}
