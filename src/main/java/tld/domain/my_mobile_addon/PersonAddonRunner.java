package tld.domain.my_mobile_addon;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.classes.MobileDriverSettings;
import io.testproject.java.enums.DriverType;

public class PersonAddonRunner {
	
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
