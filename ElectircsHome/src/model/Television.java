package model;

public class Television extends HomeElectrics{
    //Atributos por defecto
    private  final double BASE_INCH = 20;
    private final boolean BASE_TDT =  false;

    //atributos
    private double inch;
    private boolean tdt;

    public Television() {
    }

    public Television(double price, double weight) {
        super(price, weight);
    }

    public Television(double price, String color, char energy, double weight, double inch, boolean tdt) {
        super(price, color, energy, weight);
        this.inch = inch;
        this.tdt = tdt;
    }

    public double getInch() {
        return inch;
    }

    public boolean isTdt() {
        return tdt;
    }

    //metodo publico

    @Override
    public double finalPrice() {
        if (this.inch > 40){
            double average = super.finalPrice() * (0.3);
            if (this.tdt == true){
                return super.finalPrice() + average + 50;
            }else{
                return super.finalPrice() + average;
            }
        }

        return super.finalPrice();
    }
}
