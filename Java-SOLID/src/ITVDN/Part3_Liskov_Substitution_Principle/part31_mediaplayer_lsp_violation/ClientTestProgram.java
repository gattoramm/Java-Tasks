package ITVDN.Part3_Liskov_Substitution_Principle.part31_mediaplayer_lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<MediaPlayer> allPlayers = new ArrayList<>();

        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoAndMediaPlayers(allPlayers);

        System.out.println("-----------------------------------------");

        allPlayers.add(new WinampMediaPlayer());

        playVideoAndMediaPlayers(allPlayers);
    }

    public static void playVideoAndMediaPlayers(List<MediaPlayer> allPlayers) {
        for(var player : allPlayers) {
            player.playVideo();
        }
    }
}
