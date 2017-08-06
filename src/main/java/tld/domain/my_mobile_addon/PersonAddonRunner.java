package tld.domain.my_mobile_addon;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.classes.MobileDriverSettings;
import io.testproject.java.enums.DriverType;

public class PersonAddonRunner {
	
	
	public static void main(String[] args) throws Exception {
		try {
			// Initialize driver settings
			driverSettings = getDriverSettings();
			// Initialize the runner
			runner = new TestProjectRunner(devToken, driverSettings, true);

			// Run the AddPerson action
			runAddPersonCodeBlock("John", "Smith");
			// Run the FindPerson element action
			runFindPersonCodeBlock("John Smith");

		} catch (Throwable e) {
			// Handle failure...

		} finally {
			// Close the runner (also closes the application)
			runner.close();
		}
	}
	
	private static void runAddPersonCodeBlock(String firstName, String lastName) {
		try {
			// Create an instance of the AddPerson action
			AddPersonAction addPerson = new AddPersonAction();
			// Set the parameters
			addPerson.firstName = firstName;
			addPerson.lastName = lastName;
			// Run the action
			runner.run(addPerson);
		} catch (Throwable e) {
			// Handle failure...
		}
	}
	
	private static void runFindPersonCodeBlock(String fullName) {
		try {
			// Create an instance of the FindPersonInListAction
			FindPersonInListAction findPerson = new FindPersonInListAction();
			// Set the parameters
			findPerson.fullName = fullName;
			// Run the action (passing the "persons" element locator)
			runner.run(findPerson, By.id("persons"));
		} catch (Throwable e) {
			// Handle failure...
		}
	}
	
	private static DriverSettings getDriverSettings() {
		DriverSettings driverSettings = new DriverSettings();
		// Declare that Android driver is required
		driverSettings.setDriverType(DriverType.Appium_Android);
		// Specify target device UDID and Name
		driverSettings.setDeviceUdid("DEVICE_UDID");
		driverSettings.setDeviceName("DEVICE_NAME");
		// Specify mobile app settings
		MobileDriverSettings mobileSettings = new MobileDriverSettings();
		mobileSettings.setAndroidPackage("io.testproject.demo");
		mobileSettings.setAndroidActivity(".MainActivity");
		driverSettings.setMobileSettings(mobileSettings);
		return driverSettings;
	}
}
