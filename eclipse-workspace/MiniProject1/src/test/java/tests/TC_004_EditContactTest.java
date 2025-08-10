package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.EditContactPage;
import utils.Utility;

public class TC_004_EditContactTest extends ProjectSpecificationMethod {
	
	@DataProvider(name = "EditContactData")
    public Object[][] getEditContactData() throws IOException {
        
		String filePath = System.getProperty("user.dir") + "/src/test/resources/EditContactData.xlsx";
        
		return Utility.readExcelData(filePath, "Sheet1");
    }

    @Test(dataProvider = "EditContactData")
    public void editContactTest(String firstName, String lastName, String birthDate, String email, String phone, String street1, String street2,
                                String city, String state, String postalCode, String country, String type, String expectedMessage) throws InterruptedException {

       

        EditContactPage editContact = new EditContactPage(driver);

        editContact.updateFirstName(firstName);
        editContact.updateLastName(lastName);
        editContact.updateBirthDate(birthDate);
        editContact.updateEmail(email);
        editContact.updatePhone(phone);
        editContact.updateStreet1(street1);
        editContact.updateStreet2(street2);
        editContact.updateCity(city);
        editContact.updateState(state);
        editContact.updatePostalCode(postalCode);
        editContact.updateCountry(country);
        editContact.clickSave();

        if (type.equalsIgnoreCase("Valid")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("/contactList"),
                    "Edit contact failed for valid data");
        } else {
            Assert.assertTrue(editContact.getErrorMessage().contains(expectedMessage),
                    "Error message mismatch for edit contact");
        }
    }

}
