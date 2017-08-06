package tld.domain.my_mobile_addon;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.testproject.java.enums.ExecutionResultType;
import io.testproject.java.sdk.generated.codeblocks.Action;

public class AddPersonAction extends Action {

	String firstName;
	String lastName;
	
	@Override
	protected ExecutionResultType execute() throws Exception {
		
		// Get the driver
		AndroidDriver<MobileElement> androidDriver = this.getAndroidDriver(MobileElement.class);
		
		// Find First name element and type first name (e.g. John)
		MobileElement firstNameElement = androidDriver.findElement(By.id("firstName"));
		firstNameElement.sendKeys(this.firstName);
		// Find Last name element and type last name (e.g. 'Smith')
		MobileElement lastNameElement = androidDriver.findElement(By.id("lastName"));
		lastNameElement.sendKeys(this.lastName);
		
		return null;
	}

}
