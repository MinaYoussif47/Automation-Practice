package pom;

import org.openqa.selenium.By;

import utilitiesPages.ConfigUtil;
import utilitiesPages.ElementAction;

public class HomePage extends ElementAction {
	//=============================Locators==================================
    static By signIn = By.cssSelector("a[title='Log in to your customer account']");
    //=============================Strings==================================
   
    //===================================Actions===================================
    public static void openAutomationPractice() {
        System.out.println(ConfigUtil.Web_URL);
        driver.navigate().to(ConfigUtil.Web_URL);
    }
    
    public static void clickSignIn()
    {
    	getElement(signIn).click();
    }
    //-----------------------------------Assertions--------------------------------
   
    //------------------------------Text Assertions----------------------------------
}
