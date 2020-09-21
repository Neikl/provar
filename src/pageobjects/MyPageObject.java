package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Test1"
     )             
public class MyPageObject {

	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	@LinkType()
	public WebElement Leads_Tab;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads Menu']/lightning-icon/lightning-primitive-icon")
	public WebElement aaa;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns Menu']/lightning-icon/lightning-primitive-icon")
	public WebElement campdrop;
	@LinkType()
	@FindBy(linkText = "Digital Mortgages")
	public WebElement DigitalMortgages;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns']")
	public WebElement campaigns;
	@LinkType()
	@FindBy(linkText = "Opportunity Status")
	public WebElement REPORT_NAME;
			
}
