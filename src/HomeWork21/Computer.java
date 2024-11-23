package HomeWork21;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer() {
        this.processor = new Processor();
        this.memory = new Memory("Samsung", "16Gb");
        this.storage = new Storage("TDK", "16Trb");
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
}
