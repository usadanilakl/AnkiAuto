package com.anki_auto.runners;

import com.anki_auto.Driver;
import com.anki_auto.data.Phrases;
import com.anki_auto.data.Pronouns;
import com.anki_auto.enums.Deck;
import com.anki_auto.enums.Type;
import com.anki_auto.pages.LoginPage;
import com.anki_auto.pages.MainPage;
import com.anki_auto.pages.NewCardPage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnkiCreateCards {
    public static void main(String[] args) {


        String input = Pronouns.phrases;

        Set<String> mixUpList = new HashSet<String>(Arrays.asList(input.split("%")));
        input = "";
        for (String word : mixUpList) {
            input += word + "%";
        }


        Driver.get().get("https://ankiweb.net/account/login");
        new LoginPage().login("me");
        new MainPage().addCards();

//        new NewCardPage().createSpanish(
//                Type.BASIC_O.getName(),
//                Deck.PRONOUNS_SPANISH.getName(),
//                input
//        );
        new NewCardPage().createEnglish(
                Type.BASIC_O.getName(),
                Deck.PRONOUNS_ENGLISH.getName(),
                input
        );
    }
}
