package ru.ez.springUcheba;

import org.springframework.stereotype.Component;


public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "I putt a spell on you";
    }
}
