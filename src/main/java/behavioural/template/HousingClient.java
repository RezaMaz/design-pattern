package behavioural.template;

// Most of the times, subclasses calls methods from super class but in template pattern, superclass template method calls methods from subclasses,
// this is known as Hollywood Principle – “don’t call us, we’ll call you.”.

// Methods in base class with default implementation are referred as Hooks and they are intended to be overridden by subclasses,
// if you want some of the methods to be not overridden, you can make them final,
public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

}
