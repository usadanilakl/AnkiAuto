package com.anki_auto.runners;

import com.anki_auto.Driver;
import com.anki_auto.enums.DeckDad;
import com.anki_auto.enums.TypeDad;
import com.anki_auto.pages.LoginPage;
import com.anki_auto.pages.MainPage;
import com.anki_auto.pages.NewCardPage;

public class AnkiCreateCardsDad {
    public static void main(String[] args) {
        String input = "I work$Я работаю%\n" +
                "You leave$Ты уходишь%\n" +
                "He supports$Он поддерживает%\n" +
                "She promises$Она обещает%\n" +
                "It gets$Оно получает%\n" +
                "We set$Мы устанавливаем%\n" +
                "They put$Они ставят%\n" +
                "I give$Я даю%\n" +
                "You take$Ты берешь%\n" +
                "He builds$Он строит%\n" +
                "She breaks$Она ломает%";


        Driver.get().get("https://ankiweb.net/account/login");
        new LoginPage().login("dad");
        new MainPage().addCards();
        new NewCardPage().createSpanish(
                TypeDad.BASIC_R.getName(),
                DeckDad.PRONOUN_VERB_NOUN.getName(),
                input
        );
    }
}
