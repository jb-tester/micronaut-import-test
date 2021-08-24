package com.mytests.micronaut;

import com.mytests.micronaut.jakartaLibrary.NamedLibBeanWithInjections;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import org.atinject.tck.auto.GasEngine;

/**
 * *
 * <p>Created by irina on 8/24/2021.</p>
 * <p>Project: micronaut-3-test</p>
 * *
 */
@Controller("/")
public class TestController {

    @Inject
    GasEngine engine;

    @Get("/car")
    public String car() {
        return engine.toString();
    }
    @Inject
    NamedLibBeanWithInjections lib1;
    @Get("/lib1")
    public String lib1() {
        return lib1.toString();
    }
}
