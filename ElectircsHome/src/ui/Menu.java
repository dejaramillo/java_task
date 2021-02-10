package ui;

import model.HomeElectrics;
import model.Television;
import model.Washer;

public class Menu {
    public static void  showMenu(){
        HomeElectrics[] objectList = new HomeElectrics[10];
        //Asignamos cada una de las posiciones como queramos
        objectList[0]=new HomeElectrics(200, "Verde", 'C', 60);
        objectList[1]=new Washer(150, 30);
        objectList[2]=new Television(500, "negro", 'E', 80, 42, false);
        objectList[3]=new HomeElectrics();
        objectList[4]=new HomeElectrics(600, "gris", 'D', 40);
        objectList[5]=new Washer(300, "blanco", 'Z',40 , 40);
        objectList[6]=new Television(250, 70);
        objectList[7]=new Washer(400, "verde", 'A',100 , 15);
        objectList[8]=new Television(200, "naranja", 'C',60 , 30, true);
        objectList[9]=new HomeElectrics(50, 10);

        double sumHomeElectrics = 0;
        double sumHomeWasher = 0;
        double sumTelevision = 0;


        //Recorrer el array de objetos
        for (int i = 0; i < objectList.length; i++) {
            if (objectList[i] instanceof HomeElectrics){
                sumHomeElectrics += objectList[i].finalPrice();
            }
            if (objectList[i] instanceof Washer){
                sumHomeWasher += objectList[i].finalPrice();
            }
            if (objectList[i] instanceof Television){
                sumTelevision += objectList[i].finalPrice();
            }
        }

        System.out.println("La suma de los electrodomesticos menos de televisores y lavadoras es de: "+sumHomeElectrics+ "\n");
        System.out.println("La suma de las lavadoras es: "+sumHomeWasher+ "\n");
        System.out.println("La suma de los televisores es: "+sumTelevision+ "\n");

    }
}
