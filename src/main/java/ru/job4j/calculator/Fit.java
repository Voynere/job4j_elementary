package ru.job4j.calculator;

public class Fit {

    // Метод для расчета идеального веса по формуле
    private static double calculateWeight(short height, int heightOffset) {
        return (height - heightOffset) * 1.15;
    }

    // Идеальный вес для мужчины
    public static double manWeight(short height) {
        return calculateWeight(height, 100);
    }

    // Идеальный вес для женщины
    public static double womanWeight(short height) {
        return calculateWeight(height, 110);
    }

    public static void main(String[] args) {
        short height = 184;

        // Проверяем, что рост находится в разумных пределах
        if (height < 100 || height > 250) {
            System.out.println("Height should be between 100 and 250 cm.");
            return;
        }

        double man = manWeight(height);
        double woman = womanWeight(height);

        System.out.println("Man 184 is " + man);
        System.out.println("Woman 184 is " + woman);
    }

}