package Examen2019;


import java.util.Arrays;

public class Multiploak {

    public static void main(String[] args) {
        printMultiploak(7, 3);
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        printMultiploak(2, 11);
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        System.out.println(Arrays.toString(getMultiploak(3, 20)));
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        System.out.println(Arrays.toString(getMultiploak(4, 6)));
    }

    public static int[] getMultiploak(int noren, int zenbat) {
        int[] array;
        array = new int[zenbat];
        int multiploa = 0;

        for (int i = 1; i <= zenbat; i++) {

            array[i - 1] = noren * i;

        }

        return array;
    }

    public static void printMultiploak(int noren, int zenbat) {
        int multiploa = 1;
        if (zenbat >= 10) {
            for (int i = 1; i <= zenbat; i++) {
                multiploa = noren * i;

                if (i == zenbat) {
                    System.out.println(multiploa);

                } else {
                    System.out.print(multiploa + " - ");
                }
            }

        } else {
            for (int i = 1; i <= zenbat; i++) {
                multiploa = noren * i;
                System.out.println(multiploa);

            }

        }
    }
}
