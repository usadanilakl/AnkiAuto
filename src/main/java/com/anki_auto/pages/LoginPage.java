package com.anki_auto.pages;

import com.anki_auto.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(10));
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement password;
    @FindBy(xpath = "//button[.='Log In']")
    public WebElement loginButton;
    public void login(String user){
        wait.until(ExpectedConditions.visibilityOf(username));
        if(user.equals("me")){
            username.sendKeys("usadanilakl@gmail.com");
            password.sendKeys("87168814");
        }
        if(user.equals("dad")){
            username.sendKeys("klokof1964@gmail.com");
            password.sendKeys("159951");
        }

        loginButton.click();
    }

}
