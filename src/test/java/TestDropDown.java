import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDropDown extends BaseTest {

    DropdownPage dropdownPage = new DropdownPage();

    @DisplayName("Checking the number of dropdown items")
    @Test
    public void checkingNumberOfDropDownList() {

        dropdownPage.open()
                    .checkNumberOfListItems();

    }
}
