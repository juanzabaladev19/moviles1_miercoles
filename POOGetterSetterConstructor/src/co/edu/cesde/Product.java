package co.edu.cesde;

import java.util.Scanner;

public class Product {

    private double price;
    private String name;
    private String reference;
    private String kindOfMeasure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getKindOfMeasure() {
        return kindOfMeasure;
    }

    public void setKindOfMeasure(String kindOfMeasure) {
        this.kindOfMeasure = kindOfMeasure;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    double size;
    String code;

    void setPrice(){
        Scanner inputDaa = new Scanner(System.in);
        System.out.println("Ingree el precio");
        double price = inputDaa.nextDouble();
        if(price <= 10000000){
            this.price = price;
        }
        else{
            System.out.println("No se puede un precio mayor a 10 millones");
        }

    }
    double getPrice(){
        return this.price;
    }
}
