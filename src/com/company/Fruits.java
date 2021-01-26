package com.company;

public enum Fruits {


    Orange("Апельсин", 3), APPLE("Яблоко", 2), LIME("Лимон", 4), BANANA("Банан", 1);
    private String russ;
    private int weight;

    Fruits(String russ, int weight) {
        this.russ = russ;
        this.weight = weight;
    }

    public String getName(){
        return russ;

    }
public int getWeight(){
        return weight;
}
}
