package com.anki_auto.enums;

public enum Type {
    BASIC_R("Basic (and reversed card)"),
    BASIC_O("Basic (optional reversed card)"),
    BASIC_T("Basic (type in the answer)"),
    CLOZE ("Cloze"),
    PICTURE ("Image Occlusion"),
    ;

    private final String name;

    Type(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
