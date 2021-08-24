package com.mytests.micronaut;

import jakarta.inject.Singleton;

@Singleton
public class SomeService implements MyService {
    @Override
    public void run() {
        System.out.println(1);
    }
}