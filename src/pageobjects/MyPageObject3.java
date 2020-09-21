package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject3"                                
     , summary=""
     , relativeUrl=""
     , connection="Test1"
     )             
public class MyPageObject3 {

	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'/lightning/r/006')]")
	public WebElement john;
	@LinkType()
	@FindBy(xpath = "//a[@data-ownerid='2861:0']")
	public WebElement ContactName;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity;
			
}
