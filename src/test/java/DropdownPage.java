import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage extends BasePage {


    public DropdownPage open() {

        open(config.dropDownPath(), "DropDown Menu : Dummy-Site : @GlobalSQA");

        return this;
    }

    void checkNumberOfListItems() {

        List<WebElement> countryList = driver.findElements(By.xpath("//div[@rel-title='Select Country']//option"));

        if (countryList.size() != 249) {
            throw new IllegalStateException("The number of dropdown elements does not match the expected result. Number of elements in the list are "
                    + countryList.size());
        }

    }
}
