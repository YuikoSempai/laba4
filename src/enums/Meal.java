package src.enums;

import java.util.Arrays;

public enum Meal {
    MEAT("Мясо"),
    BREAD("Хлеб"),
    SALAD("Салат");

    private String name;

    Meal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void menu() {
        System.out.println(Arrays.toString(Meal.values()));
    }

    @Override
    public String toString() {
        return name;
    }

}
