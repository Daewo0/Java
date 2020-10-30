package Home_Work1;

import java.util.Scanner;

class Main{
        //Домашняя работа 1
        //1.задание;
public static void main(String[] args) {
        //2. задание
        int i = 2230;
        long l = 4L;
        byte b = 127;
        short s =5555;
        String str = "String";
        double d = 2.0;
        float f = 1.23f;
        char c = 'c';
        boolean bool = false;


        //3.задание
        Scanner read = new Scanner(System.in);
        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();
        int D = read.nextInt();
        System.out.println(firstMethod (A,B,C,D));

        //4.задание
        A = read.nextInt();
        B = read.nextInt();
        System.out.println(secondMethod(A,B));

        //5.задание
        A = read.nextInt();
        thirdMethod(A);

        //6.задание
        A = read.nextInt();
        System.out.println(fourthMethod(A));

        //7.задание
        String name = read.nextLine();
        fifthMethod(name);

        //8. задание
        A = read.nextInt();
        sixthMethod(A);
        }

static int firstMethod(int a,int b, int c, int d){
        return a * (b + (c / d));
        }

static boolean secondMethod(int a, int b){
        return ( (a + b >= 10) && (a + b <= 20) );
        }

static void thirdMethod(int a){
        if (a < 0) System.out.println("отрицательное число");
        else System.out.println("положительное число");
        }

static boolean fourthMethod(int a){
        return a < 0;
        }

static void fifthMethod(String name){
        System.out.println("Привет, " + name + "!");
        }

static void sixthMethod(int a){
        if ( ((a % 4 == 0) && (a % 100 != 0)) || ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))  ) System.out.println("Год високосный");
        else System.out.println("Год не високосный");}
        }


