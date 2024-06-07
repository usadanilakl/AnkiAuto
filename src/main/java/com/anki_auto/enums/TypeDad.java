package com.anki_auto.enums;

public enum TypeDad {
    BASIC_R("Простая (с обратной карточкой)"),
    BASIC_O("Простая (с обратной по выбору)"),
    BASIC_T("Простая (с вводом ответа)"),
    CLOZE ("Задание с пропусками"),
    PICTURE ("Скрытие части изображений"),
    ;

    private final String name;

    TypeDad(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
