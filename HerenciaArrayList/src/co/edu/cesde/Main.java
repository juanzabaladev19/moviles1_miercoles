package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        List<Monitor> monitores = new ArrayList();
        boolean flagStop = false;
        while (!flagStop){
            Monitor monitor = new Monitor();
            System.out.println("Ingrese marca");
            monitor.setBrand(scanner.nextLine());
            System.out.println("Ingrese nombre");
            monitor.setName("Monitor LG");
            System.out.println("Ingrese nombre");
            monitor.setReference(scanner.nextLine());
            System.out.println("Ingrese resolución de pantalla");
            monitor.setResolution(Double.parseDouble(scanner.nextLine()));
            System.out.println("Ingrese tamaño de pantalla");
            monitor.setScreenSize(Double.parseDouble(scanner.nextLine()));
            monitores.add(monitor);
            System.out.println("Desea continuar 1-si , 2-no");
            int stop = Integer.parseInt(scanner.nextLine());
            if(stop == 1){
                flagStop = true;
            }
        }
    }
}
