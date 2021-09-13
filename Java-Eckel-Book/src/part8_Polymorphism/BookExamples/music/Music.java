package part8_Polymorphism.BookExamples.music;

public class Music {
    public enum Note {
        MIDDLE_C, C_SHARP, B_FLAT;
    }

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
