package com.arthurlopes.java.domain.application;

import arthurlopes.admincatalog.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}