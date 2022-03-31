package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        double[] numbers = {4,10,20,8.2,3};
        System.out.println("Ingrse tamaño");
        int size = inputData.nextInt();
        String[] names = new String[size];
        for(int i=0; i<names.length; i++){
            System.out.println("Ingrese el nombre: ");
            names[i] = inputData.nextLine();
        }
        System.out.println(numbers[2]);
        numbers[2] = 5;
        System.out.println(numbers[2]);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + "-");
        }
        for(int i=0; i<5; i++){
            System.out.println("Ingres el numero: "+(i+1));
            numbers[i] = inputData.nextDouble();
        }
        for(int i=0; i<5; i++){
            System.out.println(numbers[i]);
        }
    }
}
