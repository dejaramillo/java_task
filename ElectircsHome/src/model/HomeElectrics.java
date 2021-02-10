package model;

import java.util.ArrayList;

public class HomeElectrics {
    //constantes
    private final char POWER_CONSUMPTION = 'F';
    private final  String BASECOLOR = "blanco";
    private final  int WEIGHTBASE = 5;
    private final double BASEPRICE = 100;

    //atributos de la clase

    private double price;
    private String color;
    private char energy;
    private double weight;

    public HomeElectrics() {
    }

    public HomeElectrics(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public HomeElectrics(double price, String color, char energy, double weight) {
        this.price = price;
        checkColor(color);
        this.color = color;
        checkCostEnergy(energy);
        this.energy = energy;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public char getEnergy() {
        return energy;
    }

    public double getWeight() {
        return weight;
    }
    //metodos privados
    private char checkCostEnergy(char energy){
        char[] listEnergy = {'A','B','C','D','E','F'};
        for (char energyLetter: listEnergy) {
            if (energy == energyLetter){
                break;
            }else{
                energy = POWER_CONSUMPTION;
            }
        }
        return energy;
    }

    private String checkColor(String color){
        String[] typesColors = {"blanco","negro","rojo","azul","gris"};
        for (String col : typesColors) {
            if (color == col){
                break;
            }else {
                return color = BASECOLOR;
            }
        }
        return color;
    }
    //metodos publicos
    public double finalPrice(){
        int energyValue = 0;
        int weightValue = 0;
        switch (this.energy){
            case 'A':
                energyValue = 100;
                break;
            case 'B':
                energyValue = 80;
                break;
            case 'C':
                energyValue = 60;
                break;
            case 'D':
                energyValue = 50;
                break;
            case 'E':
                energyValue = 30;
                break;
            case 'F':
                energyValue = 10;
                break;
            default:
                System.out.println("No tiene medidos de voltaje");
        }

        if (this.weight >= 0 && this.weight <= 19){
            weightValue = 10;
        }else if (this.weight >= 20 && this.weight <= 49){
            weightValue = 50;
        }else if (this.weight >= 50 && this.weight <= 79){
            weightValue = 80;
        }else if (this.weight >= 80){
            weightValue = 100;
        }

        return  this.price + weightValue + energyValue;
    }


}
