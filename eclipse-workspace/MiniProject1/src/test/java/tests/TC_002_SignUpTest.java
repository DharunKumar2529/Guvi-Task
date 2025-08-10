package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.SignUpPage;
import utils.Utility;

public class TC_002_SignUpTest extends ProjectSpecificationMethod {
	
	@DataProvider(name = "SignUpData")
    public Object[][] getSignUpData() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/SignUpData.xlsx";
        return Utility.readExcelData(filePath, "Sheet1");
    }

    @Test(dataProvider = "SignUpData")
    public void signUpTest(String firstName, String lastName, String email, String password, String type, String expectedMessage) {

        SignUpPage signUp = new SignUpPage(driver);

        signUp.enterFirstName(firstName);
        signUp.enterLastName(lastName);
        signUp.enterEmail(email);
        signUp.enterPassword(password);
        signUp.clickSignUp();

        if (type.equalsIgnoreCase("Valid")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("/login"),
                    "Sign up failed for valid user");
        } else {
            Assert.assertTrue(signUp.getErrorMessage().contains(expectedMessage),
                    "Error message mismatch for case: " + type);
        }
    }

}
