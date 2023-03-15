package hr.fer.oop.demo1.ispreplitanje;

import java.util.Arrays;

public class StringLab {
    static String stringFloss(String[] elements) {
        StringBuilder[] arr = new StringBuilder[elements.length];
        Arrays.setAll(arr, i -> new StringBuilder(elements[i]));
        StringBuilder toReturn = new StringBuilder();
        int n = 0;
        for (String str : elements) {
            if (str.length() > n) {
                n = str.length();
            }
        }
        for (int i = 0; i < n; i++) {
            for (StringBuilder stringBuilder : arr) {
                if (stringBuilder.length() != 0) {
                    toReturn.append(stringBuilder.charAt(0));
                    stringBuilder.deleteCharAt(0);
                }
            }
        }
        return toReturn.toString();
    }
}
