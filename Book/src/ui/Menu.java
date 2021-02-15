package ui;

import model.Book;

import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        Book book1 = new Book("1234567891011","game og throne", "RR martin",500);
        Book book2 = new Book("1234567891012","100 años de soledad", "Garcia Marquez",1000);

        System.out.println("Datos del libro 1: \n "+book1);
        System.out.println("Datos del libro 2: \n "+book2);


        if (book1.getNumberPages() > book2.getNumberPages()){
            System.out.println("El libro uno tiene mas paginas");
        }else if (book1.getNumberPages() == book2.getNumberPages()){
            System.out.println("Tienen la misma cantidad de paginas");
        }else {
            System.out.println("El libro dos tiene mas paginas");
        }
    }
}
