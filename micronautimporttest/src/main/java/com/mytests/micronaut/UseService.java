package com.mytests.micronaut;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/24/2021.</p>
 * <p>Project: micronaut-3-test</p>
 * *
 */
@Singleton
public class UseService {

    @Inject MyService service;
}
