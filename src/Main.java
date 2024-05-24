import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

public class Main {
    public static void main(String[] args) {

        Audio audio1= new Audio("audio1", "audio1", 5,5);
        audio1.play();
        audio1.alzaVolume();
        audio1.alzaVolume();

        Audio audio2= new Audio("audio2", "audio2", 3,1);
        audio2.play();
        audio2.abbassaVolume();
        audio2.abbassaVolume();


        Immagine img1= new Immagine("pippo", "pippo", 2);
        img1.show();

        Video mp4= new Video("filmato1", 1,3,2);
        mp4.play();
        mp4.abbassaLuminosità();
        mp4.alzaLuminosità();
        mp4.alzaVolume();


        mp4.abbassaVolume();


        ElementoMultimediale[] array= new ElementoMultimediale[5];

    }
}