package com.anki_auto.enums;

public enum Deck {
    PHRASES("Phrases"),
    PHRASES_SPANISH("Phrases Spanish"),
    PHRASES_ENGLISH("Phrases English"),
    GREETINGS("Greetings"),
    TO_BE("To Be"),
    PRONOUT_VERB("Pronoun+Verb"),
    TEST("Test"),
    VERBS("Verbs"),
    TENSES("Tenses"),
    TENSES_ENGLISH("Tenses English"),
    TENSES_SPANISH("Tenses Spanish");

    private final String name;

    Deck(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
