package com.example;

import java.util.List;

public interface Predator {

    List<String> eatMeat() throws Exception;

    int getKittens() throws Exception;

    List<String> getFood(String string) throws Exception;

}