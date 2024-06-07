package com.anki_auto.pages;

import com.anki_auto.Driver;
import com.anki_auto.Utils;
import com.anki_auto.enums.Type;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class NewCardPage {
    private final WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(10));
    public NewCardPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//span[.='Front']/../div[@class='col-10']/div")
    public WebElement front;
    @FindBy(xpath = "//span[.='Back']/../div[@class='col-10']/div")
    public WebElement back;
    @FindBy(xpath = "//span[.='Type']/../div[@class='col-10']/div")
    public WebElement type;
    @FindBy(xpath = "//span[.='Deck']/../div[@class='col-10']/div")
    public WebElement deck;
    @FindBy(xpath = "//button[.='Add']")
    public WebElement addButton;
    @FindBy(css = "div.logo-container")
    public WebElement logo;
    public void create(String type, String deck, String input){
        selectType(type);
        selectDeck(deck);
        List<Map<String, String>> cards = separate(input, new String[]{"%", "\\$"});
        System.out.println("length: "+cards.size());
        int added = 0;

        for (Map<String, String> card : cards) {
            addCard(card.get("english"),card.get("spanish"));
            System.out.println("added++ = " + added++);
        }

        System.out.println("added: "+added);
        Driver.closeDriver();

    }

    private void addCard(String eng, String span){
        while (true){
            if(front.getText().length()>0) front.clear();
            if(!logo.getAttribute("class").contains("spin"))front.sendKeys(eng);
            if(front.getText().equals(eng)) break;
        }
        while (true){
            if(back.getText().length()>0) back.clear();
            back.sendKeys(span);
            if(back.getText().equals(span)) break;
        }

        wait.until(ExpectedConditions.elementToBeClickable(addButton));
        addButton.click();
    }
    private List<Map<String,String>> separate(String input, String[] delimeters){
        List<Map<String,String>> result = new ArrayList<>();
        input = input.replace("\n","");
        String [] items = input.split(delimeters[0]);
        for (String item : items) {
            String[] card = item.split(delimeters[1]);
            Map<String,String> ready = new HashMap<>();
            ready.put("english",card[1]);
            ready.put("spanish",card[0]);
            result.add(ready);
        }
        return result;
    }

    private void selectType(String option){
        wait.until(ExpectedConditions.visibilityOf(type));
        type.click();
        type.findElement(By.xpath("//div[.='"+option+"']")).click();
    }
    private void selectDeck(String option){
        wait.until(ExpectedConditions.visibilityOf(deck));
        deck.click();
        deck.findElement(By.xpath("//div[.='"+option+"']")).click();
    }


}
