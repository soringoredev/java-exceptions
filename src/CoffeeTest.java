public class CoffeeTest {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DrinkCoffee drinkCoffee = new DrinkCoffee();

        for (int i = 1; i <= 5; i++) {

            Coffee coffee = coffeeMaker.makeCoffee();

            try {
                drinkCoffee.drinkCoffeee(coffee);
            } catch (TemperatureException exception) {
                System.out.println("Exception: " + exception.getMessage() + " \ntemp " + coffee.getTemp());
                System.out.println("Cafeaua va fi aruncata! Temp problem");
            } catch (ConcentrationException exception) {
                System.out.println("Exception: " + exception.getMessage() + " \nconc " + coffee.getConc());
                System.out.println("Cafeaua va fi aruncata! Conc problem");
            } finally {
                System.out.println("Cafeaua nu s-a primit.");
            }




        }

    }
}
