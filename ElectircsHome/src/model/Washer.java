package model;

public class Washer extends HomeElectrics{
    private final double BASE_CAPACITY = 5;

    private double capacity;

    public Washer(){
    }

    public Washer(double price, double weight) {
        super(price, weight);
    }

    public Washer(double price, String color, char energy, double weight, double capacity) {
        super(price, color, energy, weight);
        this.capacity = capacity;
    }

    //metodos publicos
    @Override
    public double finalPrice() {
        if (this.capacity > 30){
            return super.finalPrice() + 50;
        }
        return super.finalPrice();
    }
}
