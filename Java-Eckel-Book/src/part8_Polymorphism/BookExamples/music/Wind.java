package part8_Polymorphism.BookExamples.music;

public class Wind extends Instrument{
    @Override
    public void play(Music.Note n) {
        System.out.println("Wind.play() " + n);
    }
}
