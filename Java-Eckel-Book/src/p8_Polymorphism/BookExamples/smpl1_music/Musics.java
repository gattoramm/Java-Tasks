package p8_Polymorphism.BookExamples.smpl1_music;

public class Musics {
    public static void tune(Instrument i) {
        i.play(Music.Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
