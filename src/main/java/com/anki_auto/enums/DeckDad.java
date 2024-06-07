package com.anki_auto.enums;

public enum DeckDad {
    SENTENCES("Предложения"),
    PRONOUN_VERB("Местоимение + глагол"),
    PRONOUN_VERB_2("Местоимение+глагол+местоимение+глагол"),
    PRONOUN_VERB_VERB("Местоимение+глагол+глагол"),
    PRONOUN_VERB_NOUN("Местоимение+гл+сущ");


    private final String name;

    DeckDad(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
