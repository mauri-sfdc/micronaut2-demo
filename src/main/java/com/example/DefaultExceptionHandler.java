package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import javax.inject.Singleton;

@Singleton
public class DefaultExceptionHandler implements ExceptionHandler<Throwable, MutableHttpResponse<?>> {
    @Override
    public MutableHttpResponse<?> handle(HttpRequest request, Throwable exception) {
        return HttpResponse.ok("gotcha, exception handled: " + exception);
    }
}