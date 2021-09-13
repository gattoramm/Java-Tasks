package part8_Polymorphism.BookExamples.music;

class Stringed extends Instrument {
    @Override
    public void play(Music.Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Music.Note n) {
        System.out.println("Brass.play() " + n);
    }
}

public class Music2 {
    public static void tune(Wind i) {
        i.play(Music.Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Music.Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Music.Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();

        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
