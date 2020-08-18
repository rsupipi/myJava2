package com.csi.microservices.base.common;

public enum Language {
    ENGLISH("en"),
    ARABIC("ar");

    private String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
