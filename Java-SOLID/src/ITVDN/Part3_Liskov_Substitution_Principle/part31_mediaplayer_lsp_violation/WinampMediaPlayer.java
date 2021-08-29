package ITVDN.Part3_Liskov_Substitution_Principle.part31_mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer{
    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
