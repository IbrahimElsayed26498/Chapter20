package com.company;

public class InvalidSibscriptException extends Throwable{


    InvalidSibscriptException(String message){
        System.err.println(message);
    }
}
