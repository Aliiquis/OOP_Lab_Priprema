package hr.fer.oop.demo1.samoglasnici;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(brojSamoglasnika(sc.nextLine()));
    }

    public static int brojSamoglasnika(String str) {
        int count = 0;
        String slova = "aeiou";
        for (Character c : str.toLowerCase().toCharArray()) {
            if (slova.contains(c.toString())) {
                count++;
            }
        }
        return count;
    }
}
