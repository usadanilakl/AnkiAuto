package com.anki_auto.enums;

public enum Deck {
    PHRASES("Phrases"),
    TEST("Test");

    private final String name;

    Deck(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
