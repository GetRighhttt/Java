package objectorientedprogramming;

public class CarExample {

    /*
  This is how we create a class.

  This is how we create a constructor for our Car object.

  static keyword means  that we want to use the class inside the
  public static void main(String[] args) class.

  Constructor is how we can construct an object of the class when the
  class is called in Main.

  "this" is used to refer to the current instance of the class or in other
  words, the scope of the class you're working in.
  */
    static class Car {

        // first we create some properties of the class
        String name;
        String type;
        String engineType;
        boolean isLuxury;

        // constructor
        Car(String name, String type, String engineType, boolean isLuxury) {

            // "this" points to this class
            this.name = name;
            this.type = type;
            this.engineType = engineType;
            this.isLuxury = isLuxury;
        }

    }

    public static void main(String[] args) {
        /*
        This is how we create objects of our classes.

        When we created the object, we created a constructor to accept
        properties when the class is first called.
         */
        Car honda =new Car("Honda",
                "Civic", "V6", false);

        Car elantra = new Car("Hyundai", "Elantra",
                "V4", false);

        System.out.println("These are the objects of the class that we " +
                "have created:");
        System.out.println("Name: " + honda.name +
                ", type: " + honda.type +
                ", engine type: " + honda.engineType
                + ", isLuxury: " + honda.isLuxury + "!");
        System.out.println("Name: " + elantra.name +
                ", type: " + elantra.type +
                ", engine type: " + elantra.engineType
                + ", isLuxury: " + elantra.isLuxury + "!");
    }

}
