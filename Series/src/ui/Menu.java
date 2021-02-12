package ui;

import model.Series;
import model.VideoGame;

public class Menu {
    public static void showMenu(){
        Series[] seriesList = new Series[5];
        VideoGame[] videoGamesList = new VideoGame[5];

        seriesList[0] = new Series();
        seriesList[1] = new Series("Juego de tronos", "George R. R. Martin");
        seriesList[2] = new Series("Los simpson",25,"Humor","Matt Groening");
        seriesList[3] = new Series("Padre de familia",12,"Humor","Set MacFarlen");
        seriesList[4] = new Series("Breaking Bad", 5,"Thriller","Vince Gilligan");

        videoGamesList[0] = new VideoGame();
        videoGamesList[1] = new VideoGame("Assasins Creed 2",30,"Aventura","EA");
        videoGamesList[2] = new VideoGame("God of war 3",   "Santa monica");
        videoGamesList[3] = new VideoGame("Super mario bros",30,"Multi platafforma","Nintendo");
        videoGamesList[4] = new VideoGame("Fifa 20",50,"Sport","EA");

        seriesList[1].deliver();
        seriesList[4].deliver();
        videoGamesList[0].deliver();
        videoGamesList[3].deliver();


        int delivered = 0;

        for (int i = 0; i < seriesList.length; i++) {
            if (seriesList[i].isDeliver()){
                delivered++;
                seriesList[i].refund();
            }
            if (videoGamesList[i].isDeliver()){
                delivered++;
                videoGamesList[i].isDeliver();
            }
        }
        System.out.println("Hay " +delivered+ " Articulos entregados");

        Series maxSeries = seriesList[0];
        VideoGame maxVideoGames = videoGamesList[0];
        for (int i = 1; i < seriesList.length; i++) {
            if (seriesList[i].compareTo(maxSeries) == Series.MAYOR){
                maxSeries = seriesList[i];
            }
            if (videoGamesList[i].compareTo(maxVideoGames) == VideoGame.MAYOR){
                maxVideoGames = videoGamesList[i];
            }
        }

        System.out.println(maxSeries);
        System.out.println(maxVideoGames);


    }
}
