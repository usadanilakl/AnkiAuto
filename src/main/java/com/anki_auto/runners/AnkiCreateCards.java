package com.anki_auto.runners;

import com.anki_auto.Driver;
import com.anki_auto.enums.Deck;
import com.anki_auto.enums.Type;
import com.anki_auto.pages.LoginPage;
import com.anki_auto.pages.MainPage;
import com.anki_auto.pages.NewCardPage;
import org.openqa.selenium.WebDriver;

public class AnkiCreateCards {
    public static void main(String[] args) {
        String input = "Yo necesito ayuda$ I need help%Yo tengo un libro$ I have a book%Yo puedo hablar español$ I can speak Spanish%Yo estoy leyendo un libro$ I am reading a book%Yo fui a la tienda$ I went to the store%Yo estoy feliz$ I am happy%Yo no entiendo$ I don't understand%Yo tengo que ir$ I have to go";


        Driver.get().get("https://ankiweb.net/account/login");
        new LoginPage().login("me");
        new MainPage().addCards();
        new NewCardPage().create(
                Type.BASIC_R.getName(),
                Deck.TEST.getName(),
                input
        );
    }
}
