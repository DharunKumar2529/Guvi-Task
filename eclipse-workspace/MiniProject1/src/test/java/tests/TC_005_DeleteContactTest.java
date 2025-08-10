package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import utils.Utility;

public class TC_005_DeleteContactTest extends ProjectSpecificationMethod {
	
	@DataProvider(name = "DeleteContactData")
    public Object[][] getDeleteContactData() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/DeleteContactData.xlsx";
        return Utility.readExcelData(filePath, "Sheet1");
    }

    @Test(dataProvider = "DeleteContactData")
    public void deleteContactTest(String contactName, String type, String expectedMessage) throws InterruptedException {
        

        try {
            driver.findElement(By.xpath("//td[text()='" + contactName + "']/following-sibling::td/button[text()='Edit']/../button[text()='Delete']")).click();

            if (type.equalsIgnoreCase("Valid")) {
                Assert.assertTrue(driver.getPageSource().contains(expectedMessage),
                        "Delete contact failed for: " + contactName);
            } else {
                Assert.assertTrue(driver.getPageSource().contains(expectedMessage),
                        "Error message mismatch for: " + contactName);
            }
        } catch (Exception e) {
            Assert.assertTrue(type.equalsIgnoreCase("NotFound"), 
                    "Contact was not found but expected type is not 'NotFound'");
        }
    }

}
