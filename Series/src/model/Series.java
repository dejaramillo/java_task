package model;

public class Series implements Delivereable {
    private final static int NUM_TEMPORADAS_DEF=3;
    public final static int MAYOR=1;
    public final static int MENOR=-1;
    public final static int IGUAL=0;


    private String title;
    private  int numberOfSeason;
    private boolean delivered;
    private String gender;
    private String author;



    public String getTitle() {
        return title;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public String getGender() {
        return gender;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfSeason(int numberOfSeason) {
        this.numberOfSeason = numberOfSeason;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAuthor(String author) {
        this.author = author;
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
        if (delivered){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Title: "+title+"\nNumber of season: "+numberOfSeason+
                "\nDelivered: "+delivered+"\nGender: "+gender+"\nAuthor: "+author;
    }

    @Override
    public int compareTo(Object a) {
        int status = MENOR;
        //castear objeto
        Series ref = (Series) a;
        if (numberOfSeason>ref.getNumberOfSeason()){
            status = MAYOR;
        }else if (numberOfSeason== ref.getNumberOfSeason()){
            status = IGUAL;
        }
        return status;
    }
    //equalsIgnoreCase compara dos string sin importar mayusculas o minuisculas, retorna true si son iguales o false si son diferentes
    public boolean equals(Series a){
        if (title.equalsIgnoreCase(a.getTitle()) && author.equalsIgnoreCase(a.getAuthor())){
            return true;
        }
        return false;
    }

    public Series() {
        this("",NUM_TEMPORADAS_DEF,"","");
    }

    public Series(String title, String author) {
        this(title,NUM_TEMPORADAS_DEF,"",author);
    }

    public Series(String title, int numberOfSeason, String gender, String author) {
        this.title = title;
        this.numberOfSeason = numberOfSeason;
        this.gender = gender;
        this.author = author;
        this.delivered = false;
    }


}