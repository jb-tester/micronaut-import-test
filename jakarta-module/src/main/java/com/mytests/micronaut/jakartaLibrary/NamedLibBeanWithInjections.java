package com.mytests.micronaut.jakartaLibrary;

import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * *
 * <p>Created by irina on 8/24/2021.</p>
 * <p>Project: micronaut-3-test</p>
 * *
 */
@Named
public class NamedLibBeanWithInjections {

    @Inject LibBean1 bean1;
    @Inject LibBean2 bean2;

    @Override
    public String toString() {
        return "NamedLibBeanWithInjections{" +
                "bean1=" + bean1 +
                ", bean2=" + bean2 +
                '}';
    }
}
