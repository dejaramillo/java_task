package model;

import java.util.Scanner;

public class InsertAndExitMoney {

    public static void insertMoney(Check check){
        int money = 0;

        System.out.println("Ingrese la cantidad a ingresar");

        Scanner ins = new Scanner(System.in);
        money = Integer.valueOf(ins.nextLine());
        if (money <= 0){
            System.out.println("No se puede realizar una consignacion por ese valor");
        }else {
            Double saldo = check.getCantidad();
            Double result = saldo + money;

            check.setCantidad(result);
        }
    }

    public static void exitMoney(Check check){
        int money = 0;

        System.out.println("Ingrese la cantidad a retirar");

        Scanner ext = new Scanner(System.in);
        money = Integer.valueOf(ext.nextLine());

        Double saldo = check.getCantidad();
        Double result = saldo - money;
        if (result < 0){
            check.setCantidad(0.0);
        }else {
            check.setCantidad(result);
        }
    }

}
