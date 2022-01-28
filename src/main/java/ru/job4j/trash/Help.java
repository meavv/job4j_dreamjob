package ru.job4j.trash;

import java.util.Scanner;

public class Help {
    static int hour = 12;
    static int min = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        Help help = new Help();
        help.time(h, m);
    }

    public void time(int h, int m) {
        int absHour = Math.abs(hour - h);
        int absMin = Math.abs(min - m);
        System.out.println((absHour >= 12 ? 0 : absHour) + " " + (absMin >= 60 ? 0 : absMin));
    }
}