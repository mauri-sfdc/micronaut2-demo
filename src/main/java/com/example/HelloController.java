package com.example;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Single;

@Controller("/hello")
public class HelloController {
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    public HttpResponse<Single<String>> index() {
        return HttpResponse.ok(Single.error(new RuntimeException("oops"))); 
    }

}