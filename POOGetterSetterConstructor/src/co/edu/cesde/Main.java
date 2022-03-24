package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double price;
        Product monitorHp = new Product();
        monitorHp.setPrice();
        Product cpuHp = new Product();
        cpuHp.setPrice();
        System.out.println("PRecio monitor: " + monitorHp.getPrice());
        System.out.println("PRecio cpu: " + cpuHp.getPrice());
	// write your code here
    }
}
