public class ConcentrationException extends Exception {
    // properties
    int c;

    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }
}
