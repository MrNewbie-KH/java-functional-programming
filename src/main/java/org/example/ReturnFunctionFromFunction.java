package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ReturnFunctionFromFunction {
    Function <Integer,Function<Integer,Integer>> multiplyBy = new Function<Integer, Function<Integer, Integer>>() {
        @Override
        public Function<Integer, Integer> apply(Integer outer) {
            return new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer inner) {
                    return outer*inner;
                }
            };
        }
    };
//    error in my business logic
//    Function<Integer,Integer> multiplier = (num1,num2)->num1*num2;
//    the problem with my first approach is the function is dependant so I can't create the lambda outside and then use it inside
    Function <Integer,Function<Integer,Integer>> getMultiplyByLambdas = (num) -> (x)->num*x;

    public static void main(String[] args) {
        ReturnFunctionFromFunction function = new ReturnFunctionFromFunction();
        Function<Integer,Integer> doubleIt= function.multiplyBy.apply(2);
        System.out.println(doubleIt.apply(5));
        Function<Integer,Integer>tripleIt= function.multiplyBy.apply(3);
        System.out.println(tripleIt.apply(5));
       Integer curring =  function.multiplyBy.apply(2).apply(3);
        System.out.println(curring);
        System.out.println("==========================================");
        System.out.println(function.getMultiplyByLambdas.apply(5).apply(5));
    }
}

