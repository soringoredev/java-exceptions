public class DrinkCoffee {

    // metoda

    void drinkCoffeee (Coffee coffee) throws TemperatureException, ConcentrationException {

        // if for temp
        if(coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Coffee is too hot.");
        }

        // if for conc
        if (coffee.getConc() > 55) {
            throw new ConcentrationException(coffee.getConc(), "Coffee concentration is too high.");
        }

    }
}
