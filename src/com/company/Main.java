package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(100, 100));
        System.out.println(ageTemperature(25, 60));
        System.out.println(ageTemperature(10, 15));
        System.out.println(ageTemperature(15, 30));
        System.out.println(ageTemperature(30, 25));

        System.out.println(ageTemperature(generateRandomAge(), 17));
    }

    public static String ageTemperature(int age, int temperature) {
        String convert_1 = "Можно идти гулять";
        String convert_3 = "Оставайтесь дома";
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return convert_1;
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return convert_1;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return convert_1;
        } else if (age > 45 && temperature < -10 && temperature > 25) {
            return convert_3;
        }
        return convert_3;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(50);
        return age;
    }
}
