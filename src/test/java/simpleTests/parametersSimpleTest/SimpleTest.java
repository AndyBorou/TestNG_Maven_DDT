package simpleTests.parametersSimpleTest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTest {


    @Parameters({"username", "password"})
    @Test
    public void connectToH2 (@Optional("usernameOptional")  String userName, @Optional("passwordOptional") String password){

            System.out.println(userName +" "+ password );

    }

}
