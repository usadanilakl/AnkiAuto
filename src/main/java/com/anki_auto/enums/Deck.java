package com.anki_auto.enums;

public enum Deck {
    PHRASES("Phrases"),
    PHRASES_SPANISH("Phrases Spanish"),
    PHRASES_ENGLISH("Phrases English"),
    GREETINGS("Greetings"),
    TO_BE("To Be"),
    PRONOUNS_SPANISH("Pronouns Spanish"),
    PRONOUNS_ENGLISH("Pronouns English"),
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
