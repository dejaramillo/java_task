package model;

import java.util.Scanner;
import static model.InsertAndExitMoney.*;

public class CheckMenu {
    public static void showCheckMenu(){
        int response = 0;

        Check check = new Check("Daniel Jaramillo",200000.00);
        do{
            System.out.println(check+"\n");
            System.out.println("1.Ingresar dinero");
            System.out.println(("2.Retirar Dinero"));
            System.out.println("3.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());



            switch (response){
                case 1:
                    insertMoney(check);
                    break;
                case 2:
                    exitMoney(check);
                    break;
                case 3:
                    System.out.println("Gracias Por usar nuestros servicios");
                default:
                    System.out.println("Por favor ingrese la opcion correcta");
            }

        }while(response != 3);
    }
}
