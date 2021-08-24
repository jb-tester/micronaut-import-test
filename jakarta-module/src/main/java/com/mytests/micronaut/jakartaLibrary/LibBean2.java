package com.mytests.micronaut.jakartaLibrary;

import jakarta.inject.Named;

/**
 * *
 * <p>Created by irina on 8/24/2021.</p>
 * <p>Project: micronaut-3-test</p>
 * *
 */
@Named
public class LibBean2 {
    @Override
    public String toString() {
        return "Named LibBean2{}";
    }
}
