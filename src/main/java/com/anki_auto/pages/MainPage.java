package com.anki_auto.pages;

import com.anki_auto.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(10));
    public MainPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//a[@href='https://ankiuser.net:/add']")
    public WebElement add;
    public void addCards(){
        wait.until(ExpectedConditions.visibilityOf(add));
        add.click();
    }

}
