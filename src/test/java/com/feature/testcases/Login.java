package com.feature.testcases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {

	@Given("^user launch ([^\"]*) browser$")
	public void launchBrowser(String browser) {	
		System.out.println("launching browser");
	}
	
	@And("^user enters the ([^\"]*) in the address bar$")
	public void enterUrl(String url) {
		System.out.println("navigate to URL :"+url);
	}
	
	@And("^user enters ([^\"]*) in the ([^\"]*) field$")
	public void enterUserName(String emailAddress, String usernameField) {
		System.out.println("user enters email as: "+emailAddress+" in the "+usernameField+" field");
	}
	
	@And("^user enters ([^\"]*) in the ([^\"]*) field$")
	public void enterPwd(String pwd, String pwdField) {
		System.out.println("user enters pwd as: "+pwd+" in the "+pwdField+" field");
	}
	
	@When("^user clicks on the ([^\"]*) button$")
	public void clickLoginBtn(String loginBtn) {
		System.out.println("user clicks on "+loginBtn);
	}
	
	@When("^user should remain on ([^\"]*)$")
	public void pageValidation(String loginBtn) {
		System.out.println("User remains on the "+loginBtn+" page");
	}
}
