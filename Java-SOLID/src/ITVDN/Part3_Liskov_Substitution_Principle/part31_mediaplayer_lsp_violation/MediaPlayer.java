package ITVDN.Part3_Liskov_Substitution_Principle.part31_mediaplayer_lsp_violation;

public class MediaPlayer {
    public void playAudio() {
        System.out.println("Playing the audio...");
    }

    public void playVideo() {
        System.out.println("Playing the video...");
    }
}
