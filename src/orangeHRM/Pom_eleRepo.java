package orangeHRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import currenttime.HrsMnt;
import generic.ReadGenDDT;

public class Pom_eleRepo {
	// details to login
	@FindBy(xpath = "//input[@name='username']")
	private WebElement user;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	// details to add an employee and delete theemployee
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")
	private WebElement elepim;
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement empadd;
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement save;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement fnm;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lnm;
	@FindBy(xpath = "//label[.='Employee Id']/../following-sibling::div/input")
	private WebElement idis;
	@FindBy(xpath = "//a[.='Employee List']")
	private WebElement elist;
	@FindBy(xpath = "//label[.='Employee Name']/../following-sibling::div/div/div/input")
	private WebElement fnsearch;
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']/..")
	private WebElement delete_b;
	@FindBy(xpath = "//button[.=' Yes, Delete ']")
	private WebElement yesDelete_b;
	@FindBy(xpath = "//p[.='Successfully Deleted']")
	private WebElement confir;

	// details to add an user and deleter the user in Admin module
	@FindBy(xpath = "//span[.='Admin']")
	private WebElement adm;
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement add;
	@FindBy(xpath = "//label[.='User Role']/../following-sibling::div/div/div/div")
	private WebElement usrl;
	@FindBy(xpath = "//span[.='ESS']")
	private WebElement ess;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement ename;
	@FindBy(xpath = "//div[.='-- Select --' and @class='oxd-select-text-input']")
	private WebElement stc;
	@FindBy(xpath = "//span[.='Enabled']")
	private WebElement enb;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active'and @autocomplete='off']")
	private WebElement un;
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveus;
	@FindBy(xpath = "//p[.='Successfully Saved']")
	private WebElement cnf;
	@FindBy(xpath = "//div[.='Abhis Roy']")
	private WebElement cnffinal;
	@FindBy(xpath = "(//div[.='Abhis Roy']/../../../following-sibling::div/div/div/button)[1]")
	private WebElement deleteuser;
	@FindBy(xpath = "//p[.='Successfully Deleted']")
	private WebElement dltcon;

	// details for recruitment
	@FindBy(xpath = "//span[.='Recruitment']")
	private WebElement recrt;
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement rcrtad;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement rcrtnm;
	@FindBy(xpath = "//div[.='-- Select --']")
	private WebElement select;
	@FindBy(xpath = "//span[.='Junior Account Assistant']")
	private WebElement jracAss;
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement svcan;
	@FindBy(xpath = "//a[.='Candidates']")
	private WebElement candipage;
	@FindBy(xpath = "//div[.='Abhish  Roy']/../../../following-sibling::div/div/div/button[2]")
	private WebElement dltvac;
	@FindBy(xpath = "//button[.=' Yes, Delete ']")
	private WebElement fndlt;
	@FindBy(xpath = "//p[.='Successfully Deleted']")
	private WebElement cnfdlt;
	
	//details for timesheet
	@FindBy(xpath = "//span[.='Time']")
	private WebElement timenvg;

	public Pom_eleRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void user() {
		user.sendKeys(ReadGenDDT.readddt("Sheet1", 6, 0), Keys.TAB, ReadGenDDT.readddt("Sheet1", 6, 1), Keys.TAB,
				Keys.ENTER);
	}
	// pim module methods

	public void pim() {
		elepim.click();
	}

	public void addemp() {
		empadd.click();
	}

	public void save_button() {
		save.click();
	}

	public void fstnm() {
		fnm.sendKeys(ReadGenDDT.readddt("Sheet1", 3, 0));
	}

	public void lstnm() {
		lnm.sendKeys(ReadGenDDT.readddt("Sheet1", 3, 1));
	}

	public void id() {
		idis.sendKeys(HrsMnt.time());
	}

	public void elist_button() {
		elist.click();
	}

	public void fnsrc() {
		fnsearch.sendKeys(ReadGenDDT.readddt("Sheet1", 3, 0));
	}

	public void searchemp() {
		fnsearch.click();
	}

	public void delete() {
		delete_b.click();
	}

	public void yesDelete() {
		yesDelete_b.click();
	}

	public boolean confirmation() {
		boolean dis = confir.isDisplayed();
		return dis;
	}

	// admin module methods
	public void admin() {
		adm.click();
	}

	public void addUser() {
		add.click();
	}

	public void userRole() {
		usrl.click();
		ess.click();
	}

	public void empname() throws InterruptedException {
		ename.sendKeys(ReadGenDDT.readddt("Sheet1", 3, 4));
		Thread.sleep(3000);
		ename.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	public void status() {
		stc.click();
		enb.click();
	}

	public void unpwd() {
		un.sendKeys(ReadGenDDT.readddt("Sheet1", 3, 2), Keys.TAB, ReadGenDDT.readddt("Sheet1", 3, 3), Keys.TAB,
				ReadGenDDT.readddt("Sheet1", 3, 3));
	}

	public void saveUser() {
		saveus.click();
	}

	public boolean cnfmUser() {
		return cnf.isDisplayed();
	}

	public boolean finalconf() {
		return cnffinal.isDisplayed();
	}

	public void dltuser() {
		deleteuser.click();
	}

	public boolean cnfDeleted() {
		return dltcon.isDisplayed();
	}

	//recruitment modules
	public void recrutment() {
		recrt.click();
	}

	public WebElement addrcrt() {
		
		return rcrtad;
	}

	public void namercrt() {
		rcrtnm.sendKeys(ReadGenDDT.readddt("Sheet1", 3, 0), Keys.TAB, Keys.TAB, ReadGenDDT.readddt("Sheet1", 3, 1));
	}

	public void vacancy() throws InterruptedException {
		select.click();
		Thread.sleep(2000);
		jracAss.click();
	}
	public void candidateSave() {
		candipage.click();
		svcan.click();
	}
	
	public void vacancy_delete() {
		dltvac.click();
	}
	public void fiDlt() {
		fndlt.click();
	}
	public boolean cnfdltvanc() {
		return cnfdlt.isDisplayed();
	}
	public void time_button() {
		timenvg.click();
	}
	
}
