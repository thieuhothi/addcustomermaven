package tests;

import org.openqa.selenium.support.PageFactory;
import pages.AddCustomerPage;
import runner.TestRunner;

public class pageProvider {
public  static AddCustomerPage addCustomerPage;
    public static AddCustomerPage getAddCustomerPage() {
        if (addCustomerPage == null) {
            addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
        }
        return addCustomerPage;
    }

}
