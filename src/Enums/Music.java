package Enums;

public class Music {

    private String title;
    private String artist;
    private MusicGenre genre;
    private int rank;

    public enum MusicGenre{
        POP("populært "),
        ROCK("vildt "),
        HIP_HOP("boing boing "),
        D_N_B("tramp "),
        COUNTRY("texas ");

        final String beskrivelse;
        MusicGenre(String beskrivelse){
            this.beskrivelse = beskrivelse;
        }

        public String getBeskrivelse() {
            return beskrivelse;
        }
    }

    public Music(String title, String artist, MusicGenre genre, int rank){
        this.title = title;
        this.artist = artist;
        this.rank = rank;
        this.genre = genre;
    }

    public void displayInfo(){
        System.out.println("Titel: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre);
        System.out.println("Rank 1-10: " + rank);
        System.out.println("Beskrivelse: " + genre.getBeskrivelse());
        System.out.println();

    }



}
