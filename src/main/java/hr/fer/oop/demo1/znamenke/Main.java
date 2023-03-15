package hr.fer.oop.demo1.znamenke;

public class Main {
    public static void main(String[] args) {
        System.out.println(common_digit(12, 13));
    }

    static boolean common_digit(int twoDigitNum1, int twoDigitNum2) {
        if ((twoDigitNum1 / 100 == 0 && twoDigitNum1 / 10 != 0) && (twoDigitNum2 / 100 == 0 && twoDigitNum2 / 10 != 0)) {
            int[] num1 = new int[]{twoDigitNum1 / 10, twoDigitNum1 % 10};
            int[] num2 = new int[]{twoDigitNum2 / 10, twoDigitNum2 % 10};
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (num1[i] == num2[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
