package Spotify;

import java.util.ArrayList;

public class Playliste {

    private ArrayList <Sang> playliste;

    public Playliste(){
        playliste = new ArrayList<Sang>();
    }
    public void addSang(Sang valg){
        playliste.add(valg);
    }
    public void removeSang(Sang valg){
        if(playliste.contains(valg)){
            System.out.println("findes ikke");
        } else {
            playliste.remove(valg);
        }
    }
    public void clearPlaylist(){
        playliste.clear();
    }
    public Sang searchSong(String titel){
        for (Sang s : playliste){
            if (titel.equals(s.getTitel())){
                System.out.println(s);
                return s;
            }
        }
        System.out.println("Hov! Denne sang er ikke på listen. Prøv igen.");
        return null;
    }

    public void editTitel(String titel1, String titel2){
       searchSong(titel1).setTitel(titel2);
    }

    @Override
    public String toString() {
         String liste = "";
         for(Sang s : playliste){
             liste += s;
             liste += "\n";
         }
         return liste;
    }
}
