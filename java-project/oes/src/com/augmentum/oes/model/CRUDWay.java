package com.augmentum.oes.model;

public enum CRUDWay {
    delete("delete"),
    details("details"),
    update("update"),
    create("create"),
    goCreatePage("goCreatePage"),
    edit("edit"),
    cancel("cancel");

    private String value;

    public String getValue() {
        return this.value;
    }

    private CRUDWay(String value) {
        this.value = value;
    }
}
