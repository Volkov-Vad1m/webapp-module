package com.module.demo.templating.functions;

import java.util.Random;

public class HelloWorldTemplatingFunctions {

    public static final String FUNCTION_NAME = "hellofn";

    public String sayHello() {
        return "Hello world!";
    }

    public String sayHello(int headingLevel) {
        return String.format("<h%1$s>Hello world!</h%1$s>", headingLevel);
    }

    public String random() {
        Random rnd = new Random();
        int x = rnd.nextInt();
        return Integer.toString(x);
    }
}
