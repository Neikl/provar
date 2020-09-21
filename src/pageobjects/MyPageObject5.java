package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject5"                                
     , summary=""
     , relativeUrl=""
     , connection="Test1"
     )             
public class MyPageObject5 {

	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity;
			
}
