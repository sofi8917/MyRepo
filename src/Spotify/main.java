package Spotify;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean user = true;
        Playliste sang = new Playliste();

        while(user = true) {
            System.out.println("indtast sang");
            String Sang = sc.nextLine();
            System.out.println("indtast kunstner");
            String artist = sc.nextLine();
            Sang song = new Sang(Sang, artist);
            sang.addSang(song);
            System.out.println(song);

            System.out.println("vil du tilføje flere ja/nej");
            if(sc.nextLine().trim().equalsIgnoreCase("nej")) {
                System.out.println(sang);
                user = false;

                break;
            }

        }

        while(true) {
            System.out.println("du har nu lavet en playliste! vælg mellem følgende:");
            System.out.println("1. Tilføj ny sang \n 2. Fjern en sang \n 3. Vis alle sange \n 4. Søg efter en sang \n 5. Redigér en sang \n 6. slet playliste \n 7. luk lortet");
            int opgave = sc.nextInt();
            if (opgave == 1) {
                sc.nextLine();
                System.out.println("indtast sang");
                String S = sc.nextLine();
                System.out.println("indtast kunstner");
                String A = sc.nextLine();
                Sang ss = new Sang(S, A);
                sang.addSang(ss);
                System.out.println(ss);
                System.out.println();
            } else if (opgave == 2) {
                sc.nextLine();
                System.out.println("vælg sang");
                System.out.println(sang);
                String S = sc.nextLine();
                sang.removeSang(sang.searchSong(S));
                System.out.println("din playliste er nu opdateret:");
                System.out.println(sang);
                System.out.println();
            } else if (opgave == 3) {
                System.out.println(sang);
                System.out.println();
            } else if (opgave == 4) {
                sc.nextLine();
                System.out.println("vælg sang");
                System.out.println(sang);
                String S = sc.nextLine();
                sang.searchSong(S);
                System.out.println();
            } else if (opgave == 5) {
                sc.nextLine();
                System.out.println("vælg sang");
                System.out.println(sang);
                String S1 = sc.nextLine();
                String gammelTitel = "Gammel titel: " + S1;
                System.out.println("vælg ny titel");
                String S2 = sc.nextLine();
                String nyTitel = "Ny titel: " + S2;
                sang.editTitel(S1, S2);
                System.out.println(nyTitel);
                System.out.println();
            } else if (opgave == 6) {
                sc.nextLine();
                sang.clearPlaylist();
                System.out.println(sang + "du har slettet din playliste");
                System.out.println();
            } else if (opgave == 7) {
                sc.nextLine();
                System.out.println("Dit program er nu afsluttet");
                System.exit(0);
            }
        }

    }
}
