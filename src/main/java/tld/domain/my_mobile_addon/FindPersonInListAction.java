package tld.domain.my_mobile_addon;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.testproject.java.enums.ExecutionResultType;
import io.testproject.java.sdk.generated.codeblocks.ElementAction;

public class FindPersonInListAction extends ElementAction {

	public Integer index;
	String fullName;
	
	@Override
	protected ExecutionResultType execute() throws Exception {
		
		// Get containing element that was passed by the runner
		MobileElement personsList = this.getElement(MobileElement.class);
		
		index = -1;
		// Getting all child elements in the "persons" list element
		List<MobileElement> entries = personsList.findElementsByXPath(".//*");
		// Looking for the relevant element
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).getText().equals(fullName)) {
				index = i;
				break;
			}
		}

		
		return null;
	}

}
