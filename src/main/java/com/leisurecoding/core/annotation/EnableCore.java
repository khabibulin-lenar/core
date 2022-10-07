package com.leisurecoding.payngo.core.annotation;

import com.leisurecoding.payngo.core.CoreConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CoreConfiguration.class)
@Documented
public @interface EnableCore {
}
