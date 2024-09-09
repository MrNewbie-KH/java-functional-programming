package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PassFunctionAsParameter {

    BiFunction <String, Function<String,String> ,String> register= new BiFunction<String, Function<String, String>, String>() {
        @Override
        public String apply(String s, Function<String, String> callback) {

            return callback.apply(s);
        }
    };
    Function<String,String> sendWelcomeEmail = new Function<String,String>() {
        @Override
        public String apply(String s) {
            return "Welcome : " + s+"@domain.com";
        }
    };
    public static void main(String[] args) {
        PassFunctionAsParameter passFunctionAsParameter = new PassFunctionAsParameter();
       String welcomeMessage = passFunctionAsParameter.register.apply("Mohamed",passFunctionAsParameter.sendWelcomeEmail);
        System.out.println(welcomeMessage);
    }
}
