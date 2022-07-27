import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // задание 1
        int[] arr = generateRandomArray();
        int monthlyExpense = 0;
        for (int i : arr) {
            monthlyExpense += i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц " + monthlyExpense + " рублей");

        // задание 2
        int minSumDey = arr[0];
        int maxSumDey = arr[0];
        for (int i : arr) {
            if (i > maxSumDey) maxSumDey = i;
        }
        for (int i = 0; i > arr.length; i++) {
            if (i < minSumDey) ;
            minSumDey = i;
        }
        System.out.println("Максимальная сумма трат за день " + maxSumDey + " рублей.");
        System.out.println("Минимальная сумма трат за день " + minSumDey + " рублей.");
        //задание 3
        double average = 0;
        double sum = 0;
        if (arr.length > 0) ;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


        //задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i< reverseFullName.length;i++){
        }

        int name = reverseFullName.length;
        char x;
        for (int i = 0;i<name/2;i++) {
            x = reverseFullName[name - i - 1];
            reverseFullName[name - i - 1] = reverseFullName[i];
            reverseFullName[i] = x;
        }

        for (int i = 0; i<reverseFullName.length;i++){
            System.out.print(reverseFullName[i]);
        }



    }
}















