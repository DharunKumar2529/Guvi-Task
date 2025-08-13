package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
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
	
	@BeforeTest
	public void setup() throws Exception {
		testName="Signup Test";
		testDescription="Testing the Signup functionality of the application with valid and invalid details";
		testAuthor="Dharun Kumar";
		testCategory="Smoke Test";
	}

    @Test(dataProvider = "SignUpData")
    public void signUpTest(String firstName, String lastName, String email, String password, String type, String expectedMessage) {

        SignUpPage signUp = new SignUpPage(driver);
        
        signUp.signupbtn();
        signUp.enterFirstName(firstName);
        signUp.enterLastName(lastName);
        signUp.enterEmail(email);
        signUp.enterPassword(password);
        signUp.clickSignUp();
    }

}
