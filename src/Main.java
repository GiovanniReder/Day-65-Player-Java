import entities.Audio;

public class Main {
    public static void main(String[] args) {

        Audio audio1= new Audio("audio1", "audio1", 5,3);
        audio1.playAudio();
        audio1.alzaVolume();
        
        Audio audio2= new Audio("audio2", "audio2", 3,2);
        audio2.playAudio();
        audio2.abbassaVolume();

    }
}