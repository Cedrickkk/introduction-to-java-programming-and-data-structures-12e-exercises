package main.chapter5;

public class Test {
    public static void main(String[] args) {
        //        Scanner input = new Scanner(System.in);
        //        int number, sum = 0, count;
        //        for (count = 0; count < 5; ++count) {
        //            number = input.nextInt();
        //            sum += number;
        //        }
        //
        //        System.out.println("sum = " + sum);
        //        System.out.println("count = " + count);
        //        Scanner input = new Scanner(System.in);
        //        int number, max;
        //        number = input.nextInt();
        //        max = number;
        //        while (number != 0) {
        //            number = input.nextInt();
        //            if (number > max) {
        //                max = number;
        //            }
        //        }
        //        System.out.println(max);


        //        int i = 0;
        //        long j = 0;
        //        while (i <= 1000) {
        //            j = j + i;
        //            i++;
        //        }
        //
        //        System.out.println("j = " + j);
        //
        //        long x = 0;
        //        for (int k = 0; k <= 1000; k++) {
        //            x = x + k;
        //        }
        //        System.out.println("x = " + x);
        //
        //        int z = 0;
        //        long a = 0;
        //        do {
        //            a += z;
        //            z++;
        //        } while (z <= 1000);
        //
        //        System.out.println("a = " + a);
        //
        //
        //        int n = 0;
        //        for (int m = 1; n < 10000; m++) {
        //            n += m;
        //        }
        //
        //        System.out.println("n = " + n);

        // int i = 0;
        // while (i < 5) {
        //     for (int j = i; j > 1; j--) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println("****");
        //     i++;
        // }

        // for (int i = 0; i < 5; i++) {
        //     int j = 0;
        //     while (j < i) {
        //         System.out.print(j + " ");
        //         j++;
        //     }
        // }

        // int i = 5;
        // while (i >= 1) {
        //     int num = 1;
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num + "xxx");
        //         num *= 2;
        //     }
        //     System.out.println();
        //     i--;
        // }

        int i = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
