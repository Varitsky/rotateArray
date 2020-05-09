package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        rotateArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    }

    public static void rotateArray(int[] arr) {
        int x;                                  // модифицированный адрес ячейк
        int[] arrNew = new int[arr.length];     // новый массив, без массива тяжк


        System.out.print("Масив до смещения:    ");          // печать массива до смещения
        for (int i = 0; i < arr.length; i++) {               // печать массива до смещения
            System.out.print(arr[i] + " ");                  // печать массива до смещения
        }                                                    // печать массива до смещения

        Scanner scanner = new Scanner(System.in);            // размер сдвига
        System.out.print("\n" + "Введите шаг вращения массива: ");  // размер сдвига
        int n = scanner.nextInt();                           // размер сдвига

        if (Math.abs(n) > arr.length)                         //убрать лишние перемещения при |N| больше чем размер массива
            n = n % arr.length;


        if (n >= 0) {                                         // если вращаем в плюс
            for (int i = 0; i < arr.length; i++) {
                if ((i + n) >= arr.length){
                    x = i + n - arr.length;
                    arrNew[i] = arr[x];
                } else {
                    x = i + n;
                    arrNew[i] = arr[x];
                }
            }
        } else {
            n = arr.length + n;                                  //если вращаем в минус
            for (int i = 0; i < arr.length; i++) {
                if ((i + n) >= arr.length){
                    x = i + n - arr.length;
                    arrNew[i] = arr[x];
                } else {
                    x = i + n;
                    arrNew[i] = arr[x];
                }
            }
        }

        System.out.print("Масив после смещения: ");   // печать массива после смещения
        for (int i = 0; i < arrNew.length; i++) {             // печать массива после смещения
            System.out.print(arrNew[i] + " ");                // печать массива после смещения
        }                                                     // печать массива после смещения
    }
}



