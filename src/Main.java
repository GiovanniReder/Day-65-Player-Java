import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Audio audio1 = new Audio("audio1", 5, 3);
        audio1.play();
        // audio1.alzaVolume();
        //  audio1.alzaVolume();

        Audio audio2 = new Audio("audio2", 3, 3);
        audio2.play();
        //   audio2.abbassaVolume();
        //  audio2.abbassaVolume();


        Immagine img1 = new Immagine("pippo", 2);
        img1.show();
        //     img1.abbassaLuminosità();
        //    img1.alzaLuminosità();

        Video mp4 = new Video("filmato1", 1, 3, 2);
        mp4.play();
        //   mp4.abbassaLuminosità();
        //   mp4.alzaLuminosità();
        //  mp4.alzaVolume();
        //   mp4.abbassaVolume();
        System.out.println("--------FINE STAMPE MAIN-------");


        ElementoMultimediale[] array = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Premi 1 per generare un Immagine, premi 2 per genrare un Video, premi 3 per generare un Audio");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il nome dell'elemento generato: ");
            String nome = scanner.nextLine();

            switch (numero) {
                case 1:
                    System.out.println("Inserisci la luminosità: ");
                    int luminositàImg = scanner.nextInt();
                    String nomeImg = scanner.nextLine();
                    array[i] = new Immagine(nomeImg, luminositàImg);
                    break;
                case 2:
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositàVideo = scanner.nextInt();
                    array[i] = new Video(nome, durataVideo, volumeVideo, luminositàVideo);
                    break;
                case 3:
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    array[i] = new Audio(nome, durataAudio, volumeAudio);
                    break;
                default:
                    System.out.println("Errore nella scelta");
                    i--;
                    break;
            }
        }

        scanner.close();
    }


}

