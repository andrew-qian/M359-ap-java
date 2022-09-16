package Unit2.examples.instrumentClass;

public class InstrumentDriver {
    public static void main(String[] args) {

        Instrument i1 = new Instrument("Violin", 1000.00, false);
        Instrument i2 = new Instrument("Guitar", 499.99);

        i1.getInstrumentName();
        i1.setInstrumentName("Working");

        i1.printInstrument();
        i2.printInstrument();
    }

}
