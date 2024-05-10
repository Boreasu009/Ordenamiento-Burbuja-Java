package org.example;

public class Main {
    public static void main(String[] args) {
        int num[] = {10, -2, 8, 2, 1, 30 };

        imprimirArray(num);

        //Orden de Mayor a menor
        for(int j=0; j<num.length - 1; j++) {
            for (int i = 0; i < num.length - 1; i++) {
                //int i = 0;
                System.out.print(".");

                if (num[i] < num[i + 1]) {
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }

        System.out.println();

        imprimirArray(num);

        System.out.println();

        System.out.println("Cambios realizados para la Rama DEV");

    }
    public static void imprimirArray(int num[]){
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " - " );
        }
        System.out.println();
    }
}