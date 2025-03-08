public class Coffee {
    // properties
    private int temp;
    private int conc;

    // constructor (init)
    Coffee(int t, int c) {
        temp = t; // temperature
        conc = c; // concentration
    }

    // getters


    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    @Override
    public String toString() {
        return "[coffee temperature = " + temp + " : " +
                "concentration coffee = " + conc + "]";
    }
}
