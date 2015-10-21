package com.uznu.training.lecture3;


public class Dish {

    int prices;
    String name;
    int calorie;

    public Dish(int prices, String name, int calorie) {
        this.prices = prices;
        this.name = name;
        this.calorie = calorie;
    }

    public String toString() {
        return String.format("Ціна: %3d  Назва: %10s, Калорії: %3d  ",
                this.prices, this.name, this.calorie);
    }


}
