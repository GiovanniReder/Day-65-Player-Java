import entities.Audio;

public class Main {
    public static void main(String[] args) {

        Audio audio1= new Audio("audio1", "audio1", 5,5);
        audio1.playAudio();
        audio1.alzaVolume();

        Audio audio2= new Audio("audio2", "audio2", 3,1);
        audio2.playAudio();
        audio2.abbassaVolume();
        Audio audio3= new Audio("pippo", "pluto", 4,2);

    }
}