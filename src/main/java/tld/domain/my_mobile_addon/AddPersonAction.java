package tld.domain.my_mobile_addon;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.testproject.java.enums.ExecutionResultType;
import io.testproject.java.sdk.generated.codeblocks.Action;

public class AddPersonAction extends Action {

	@Override
	protected ExecutionResultType execute() throws Exception {
		
		// Get the driver
		AndroidDriver<MobileElement> androidDriver = this.getAndroidDriver(MobileElement.class);
		
		return null;
	}

}
