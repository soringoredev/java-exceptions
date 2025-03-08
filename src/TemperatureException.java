public class TemperatureException extends Exception {
    // properties
    int t;

    public TemperatureException(int t, String msg) {
        super(msg);
        this.t = t;
    }
}
