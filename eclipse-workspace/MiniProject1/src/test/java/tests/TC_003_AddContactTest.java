package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.AddContactPage;
import utils.Utility;

public class TC_003_AddContactTest extends ProjectSpecificationMethod{
	
	@DataProvider(name = "AddContactData")
    public Object[][] getAddContactData() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/AddContactData.xlsx";
        return Utility.readExcelData(filePath, "Sheet1");
    }

    @Test(dataProvider = "AddContactData")
    public void addContactTest(String firstName, String lastName, String birthDate,String email, String phone, String street1, String street2,
                               String city, String state, String postalCode, String country, String type, String expectedMessage) throws InterruptedException {

    	
        AddContactPage addContact = new AddContactPage(driver);

        addContact.enterFirstName(firstName);
        addContact.enterLastName(lastName);
        addContact.enterBirthDate(birthDate);
        addContact.enterEmail(email);
        addContact.enterPhone(phone);
        addContact.enterStreet1(street1);
        addContact.enterStreet2(street2);
        addContact.enterCity(city);
        addContact.enterState(state);
        addContact.enterPostalCode(postalCode);
        addContact.enterCountry(country);
        addContact.clickSubmit();

        if (type.equalsIgnoreCase("Valid")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("/contactList"),
                    "Contact not added successfully for valid data");
        } else {
            Assert.assertTrue(addContact.getErrorMessage().contains(expectedMessage),
                    "Error message mismatch for invalid contact addition");
        }
    }

}
