package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de producos a registrar");
        int cantProducts = Integer.parseInt(scanner.nextLine());
        Product[] products = new Product[cantProducts];
        // leno el arrglo
        for(int i=0; i<products.length; i++){
            Product product = new Product();
            System.out.println("Ingrese nombre del producto");
            product.setName(scanner.nextLine());
            System.out.println("Ingrese el precio");
            product.setPrice(Double.parseDouble(scanner.nextLine()));
            products[i] = product;
        }
        // ahora voy a buscar dentro del arreglo
        System.out.println("Ingrese producto a buscar");
        String userInput = scanner.nextLine();
        for(int i=0; i<products.length; i++){
            if(products[i].getName().equals(userInput)){
                System.out.println(products[i].getPrice());
                break;
            }
            System.out.println(i);
        }
    }
}
