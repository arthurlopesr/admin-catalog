package com.arthurlopes.java.domain.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UseCaseTest {

    @Test
    void testCreteUseCase() {
        Assertions.assertNotNull(new UseCase());
    }
}