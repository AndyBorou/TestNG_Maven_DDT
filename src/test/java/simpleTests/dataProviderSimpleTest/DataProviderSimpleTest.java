package simpleTests.dataProviderSimpleTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimpleTest {

    @DataProvider
    public Object[][] dataMethod() {
        return new Object[][] { { "one" }, { "two" } };
    }

    @Test(dataProvider = "dataMethod")
    public void testMethod(String param) {
        System.out.println("The parameter value is: " + param);
    }
}
