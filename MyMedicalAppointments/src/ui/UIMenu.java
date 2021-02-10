package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final  String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Septiembre","octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1Doctor
        //userType = 2 patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Daniel Jaramillo","dan@email.com"));
        doctors.add(new Doctor("Anai","das@email.com"));
        doctors.add(new Doctor("Eduardo ramirez","danss@email.com"));

        ArrayList<Patient>patients = new ArrayList<>();
        patients.add(new Patient("Carlos Sanchez","car@email.com"));
        patients.add(new Patient("Jose Sanchez","caro@email.com"));
        patients.add(new Patient("Mario Sosa","cara@email.com"));

       boolean emailCorrect = false;
       do {
           System.out.println("Insert your email: [a@a.com]");
           Scanner sc = new Scanner((System.in));
           String email = sc.nextLine();
           if(userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener los datos del usuario logeaedo
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
           }
           else if (userType == 2){
               for (Patient p: patients) {
                   emailCorrect = true;
                   patientLogged = p;
                   UIPatientMenu.showPatientMenu();
               }
           }
       }while (!emailCorrect);

    }


    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + "."+ MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
