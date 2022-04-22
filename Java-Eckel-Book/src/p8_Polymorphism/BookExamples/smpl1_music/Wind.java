package p8_Polymorphism.BookExamples.smpl1_music;


public class Wind extends Instrument{
    @Override
    public void play(Music.Note n) {
        System.out.println("Wind.play() " + n);
    }
}
