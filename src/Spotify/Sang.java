package Spotify;

public class Sang {
    String titel;
    String artist;

    public Sang(String titel, String artist){
        this.titel = titel;
        this.artist = artist;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getTitel(){
        return titel;
    }

    public String getArtist(){
        return artist;
    }

    public String toString(){
        return "titel: " + titel + " " + "artist: " + artist;
    }

}
