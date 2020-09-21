package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="pageobject1"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesTest"
     )             
public class pageobject1 {

	@LinkType()
	@FindBy(linkText = "Leads")
	public WebElement leads;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail;
	@LinkType()
	@FindBy(linkText = "VDres Ltd-")
	public WebElement vDresLtd;
	@ButtonType()
	@FindByLabel(label = "Edit Paycheck stubs from last 30 days.")
	public WebElement editPaycheckStubsFromLast30Days;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity1;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail1;
	@LinkType()
	@FindBy(linkText = "VDACT-")
	public WebElement vDACT;
	@TextType()
	@FindBy(xpath = "//button[@title='Save']")
	public WebElement Save;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity11;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity2;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement Activity;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail11;
	@ButtonType()
	@FindByLabel(label = "Edit CC Score")
	public WebElement CC_Score__c;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity21;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail2;
	@LinkType()
	@FindBy(linkText = "MarTech-")
	public WebElement marTech;
	@ButtonType()
	@FindByLabel(label = "Edit Paycheck stubs from last 30 days.")
	public WebElement editPaycheckStubsFromLast30Days1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputNumber[@label= 'Quantity']")
	public WebElement SLA__Bronze__Locked_Product__Item_1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputNumber[@label= 'Quantity']")
	public WebElement SLA__Bronze__Locked_Product__Item_11;
	@TextType()
	@FindBy(xpath = "//input[@id='10829:0']")
	public WebElement SLA__Bronze__Locked_Product__Item_12;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity22;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity3;
	@TextType()
	@FindBy(id = "19584:0")
	public WebElement SLA__Bronze__Locked_Product__Item_13;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity4;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity5;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity51;
	@LinkType()
	@FindBy(id = "activityTab__item")
	public WebElement activity511;
	@LinkType()
	@FindBy(xpath = "//forcegenerated-flexipage_opportunity_rec_simple_opportunity__view_js//a[@id='activityTab__item']")
	public WebElement activity6;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail21;
	@LinkType()
	@FindBy(linkText = "Proposal/Price Quote")
	public WebElement proposalPriceQuote;
			
}
