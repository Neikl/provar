package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject2"                                
     , summary=""
     , relativeUrl=""
     , connection="Test1"
     )             
public class MyPageObject2 {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='abc-' and contains(@href,'/lightning/r/006')]")
	public WebElement abc;
			
}
