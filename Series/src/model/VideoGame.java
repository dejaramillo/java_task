package model;

public class VideoGame implements Delivereable {

    private final static int HORAS_ESTIMADAS_DEF= 100;
    public final static int MAYOR= 1;
    public final static int MENOR= -1;
    public final static int IGUAL= 0;

    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String gender;
    private String company;

    //constructores




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Title: " +title+ "\nHours: " +estimatedHours+ "\nDelivered: "+delivered+
                "\nGender: " +gender+ "\nCompany: " +company;
    }

    @Override
    public void deliver() {
        this.delivered = true;
    }

    @Override
    public void refund() {
        this.delivered = false;
    }

    @Override
    public boolean isDeliver() {
        if (this.delivered){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int status = MENOR;
        VideoGame ref = (VideoGame) a;
        if (estimatedHours > ref.getEstimatedHours()){
            status = MAYOR;
        }else if (estimatedHours == ref.getEstimatedHours()){
            status = IGUAL;
        }
        return status;
    }

    public  boolean equals(VideoGame a){
        if (title.equalsIgnoreCase(a.getTitle()) && company.equalsIgnoreCase(a.getCompany())){
            return true;
        }
        return false;
    }

    public VideoGame() {
        this("",HORAS_ESTIMADAS_DEF,"","");
    }

    public VideoGame(String title, String company) {
        this(title,HORAS_ESTIMADAS_DEF,"",company);
    }

    public VideoGame(String title, int estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
        delivered = false;
    }

}
