public class CoffeeMaker {

    Coffee makeCoffee() {
        System.out.println("Fac o cafea ...");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t, c);
        return coffee;
    }
}
