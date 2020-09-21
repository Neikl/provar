package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject1"                                
     , summary=""
     , relativeUrl=""
     , connection="Test1"
     )             
public class MyPageObject1 {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement Leads_Tab;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-item-root/a[normalize-space(.)='Opportunities']")
	public WebElement opportunities;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity;
	@ButtonType()
	@AuraBy(componentXPath = "//ui:button[@press= 'c.updateProcessStep']")
	public WebElement PathAssistantStep_MarkAsCurrentStatus;
	@LinkType()
	@FindBy(linkText = "Kim-")
	public WebElement kim;
	@LinkType()
	@FindBy(linkText = "Neol-")
	public WebElement neol;
	@LinkType()
	@FindBy(xpath = "//a[@href='/lightning/r/0062w000004ZsyOAAS/view']")
	public WebElement flora;
	@LinkType()
	@FindBy(linkText = "William-")
	public WebElement william;
	@ButtonType()
	@AuraBy(componentXPath = "//ui:button[@press= 'c.convertAction']")
	public WebElement submitConvert;
	@FindBy(xpath = "//div/div/div/div/div/a[normalize-space(.)='Ananya-']")
	@LinkType()
	public WebElement ananya;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='David-']")
	public WebElement david;
	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(linkText = "Campaigns with Leads and Converted Lead Information")
		public WebElement campaignsWithLeadsAndConvertedLeadInformation;
	}
	@FindBy(xpath = "//iframe[]")
	public Frame frame;
	@LinkType()
	@FindBy(linkText = "Opportunity Status")
	public WebElement REPORT_NAME;
			
}
