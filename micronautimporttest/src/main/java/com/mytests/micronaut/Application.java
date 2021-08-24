package com.mytests.micronaut;

import io.micronaut.context.annotation.Import;
import io.micronaut.runtime.Micronaut;

@Import(
        packages = {
                "org.atinject.tck.auto",
                "com.mytests.micronaut.jakartaLibrary"},
        // annotated = "javax.inject.Named"
        annotated = "*"
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
