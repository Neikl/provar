package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject7"                                
     , summary=""
     , relativeUrl=""
     , connection="Test1"
     )             
public class MyPageObject7 {

	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity;
	@LinkType()
	@FindBy(id = "activityTab__item")
	public WebElement activity1;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'activityTab__item')]")
	public WebElement activity11;
	@LinkType()
	@FindBy(xpath = "//a[contains(normalize-space(.),'Log a Call')]")
	public WebElement LogACall;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Subject']/following-sibling::div//input")
	public WebElement Subject;
			
}
