package pom;

import org.openqa.selenium.By;

import utilitiesPages.ElementAction;



public class LoginPage extends ElementAction {
	
	
	 By email = By.id("email");
	    By password = By.id("passwd");
	    By submitLogin = By.id("SubmitLogin");
	    //=============================Strings==================================
	    
	    //===================================Actions===================================
	    public void typeEmail(String emailValue)
	    {
	    	getElement(email).sendKeys(emailValue);
	    }
	    public void typePassword(String passwordValue)
	    {
	    	getElement(password).sendKeys(passwordValue);
	    }
	    public void clickSubmit()
	    {
	    	getElement(submitLogin).click();
	    }
	    //-----------------------------------Assertions--------------------------------
	   
	    //------------------------------Text Assertions----------------------------------

}
