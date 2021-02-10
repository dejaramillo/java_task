package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;
    private ArrayList<AvailableAppoinment> availableAppoinments = new ArrayList<>();




    public Doctor(String name,String email){
        super(name,email);
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void addAvailableAppoinment(String date, String time){
        availableAppoinments.add(new Doctor.AvailableAppoinment(date,time));
    }

    public ArrayList<AvailableAppoinment> getAvailableAppoinments(){
        return availableAppoinments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+speciality+ "\nAvailable"+ availableAppoinments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Cancelorogia");
    }

    public static class AvailableAppoinment{
        private int idAvailableAppoinment;
        private Date date;
        private  String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppoinment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getIdAvailableAppoinment() {
            return idAvailableAppoinment;
        }

        public void setIdAvailableAppoinment(int idAvailableAppoinment) {
            this.idAvailableAppoinment = idAvailableAppoinment;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointmenets \nDate: "+date+"\nTime: "+
                    time;
        }
    }

}
