package hr.fer.oop.demo1.zamjena;

public class Main {
    public static void main(String[] args) {
        swap(new int[]{10, 20, 30, 40, 50, 60});
    }

    static void swap(int[] arr) {
        int tmp;
        int[] index = new int[]{(int) (Math.random() * arr.length), 0, 0};
        for (int i = 1; i < 3; i++) {
            boolean f = false;
            do {
                index[i] = (int) (Math.random() * arr.length);
                for (int j = 0; j < i; j++) {
                    if (index[j] == index[i]) {
                        f = true;
                        break;
                    } else {
                        f = false;
                    }
                }
            } while (f);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (index[i] > index[j]) {
                    tmp = index[i];
                    index[i] = index[j];
                    index[j] = tmp;
                }
            }
        }
        tmp = arr[index[1]];
        arr[index[1]] = arr[index[2]];
        arr[index[2]] = arr[index[0]];
        arr[index[0]] = tmp;
    }
}
