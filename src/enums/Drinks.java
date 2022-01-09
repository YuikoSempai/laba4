package src.enums;

import java.util.Arrays;

public enum Drinks {
    COLA("Кола"),
    BEER("Пиво"),
    TEA("Чай"),
    WATER("Вода"),
    COFE("Кофе");

    private String name;

    Drinks(String name) {
        this.name = name;
    }

    Drinks() {
    };

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void menu() {
        System.out.println(Arrays.toString(Drinks.values()));
    }
}
