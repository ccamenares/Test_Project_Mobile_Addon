package tld.domain.my_mobile_addon;

import io.appium.java_client.MobileElement;
import io.testproject.java.enums.ExecutionResultType;
import io.testproject.java.sdk.generated.codeblocks.ElementAction;

public class FindPersonInListAction extends ElementAction {

	@Override
	protected ExecutionResultType execute() throws Exception {
		
		// Get containing element that was passed by the runner
		MobileElement personsList = this.getElement(MobileElement.class);
		
		return null;
	}

}
