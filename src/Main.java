public class Main {
    public static void main(String[] args) {


        int [] ball = new int [3];
        ball [0] = 1;
        ball [1] = 2;
        ball [2] = 3;
        int ballSize = ball.length;
        for (int i = 0; i < ballSize; i++) {
            System.out.print(ball[i] + ", ");
        }

        System.out.println();

        double [] d = {1.57, 7.654, 9.986};
        int dSize = d.length;
        for (int i = 0; i < dSize; i++) {
            System.out.print(d[i] + ", ");
        }

        System.out.println();


        int [] arr = new int [5];

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        int arrSize = arr.length;

        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + ", ");

        }

        System.out.println();


        //Задание 3
        System.out.println("Задание 3");

        for (int i = ballSize-1; i >= 0; i--) {
            System.out.print(ball[i] + ", ");
        }

        System.out.println();

        for (int i = dSize-1; i >= 0; i--) {
            System.out.print(d[i] + ", ");
        }

        System.out.println();

        for (int i = arrSize-1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        System.out.println("Задание 4");

        for (int i = 0; i < ballSize; i++) {
            if (ball[i] % 2 != 0) {
                System.out.print((ball[i] + 1) + ", ");
            } else {System.out.print(ball[i] + ", ");
            }

        }











    }
}