package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AssignFunctionToVariable {

   BiFunction<Integer,Integer,Integer> addUsingAnonymousClass = new BiFunction<Integer, Integer, Integer>() {
        @Override
        public Integer apply(Integer integer1,Integer integer2) {
            return integer1+integer2;
        }
    };
   BiFunction <Integer,Integer,Integer> addUsingLambdas = (Integer integer, Integer integer2) -> integer+integer2;

    public static void main(String[] args) {
       AssignFunctionToVariable assignFunctionToVariable = new AssignFunctionToVariable();
       System.out.println(assignFunctionToVariable.addUsingAnonymousClass.apply(5,10));
       System.out.println(assignFunctionToVariable.addUsingLambdas.apply(5,5));
    }
}
