package edu.skypro.homework.normaldifficulty.lesson1;

public class Main {
    public static void main(String[] args) {
        task123();
        task4();
        task5();
        task6();
        task7();
    }

    private static void printSeparator() {
        System.out.println("-------------------------");
    }

    private static void task123() {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763_789;
        System.out.println(paper);
        printSeparator();
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
        printSeparator();
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7_639;
        System.out.println(paper);
        printSeparator();
    }

    private static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        printSeparator();
    }

    private static void task5() {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        printSeparator();
    }

    private static void task6() {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;

        var totalBoxersWeight=firstBoxer+secondBoxer;
        System.out.println("Общий вес боксеров " +
                totalBoxersWeight + " кг");

        var differenceBoxersWeight = Math.abs(firstBoxer - secondBoxer);
        System.out.println("Разница в весе составляет " +
                differenceBoxersWeight + " кг");
        printSeparator();
    }

    private static void task7() {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;

        var firstWay = secondBoxer - firstBoxer;
        var secondWay = secondBoxer % firstBoxer;

        System.out.println("firstWay = " + firstWay);
        System.out.println("secondWay = " + secondWay);
        printSeparator();
    }

    private static void task8() {
    }
}