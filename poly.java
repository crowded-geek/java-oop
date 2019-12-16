public class poly {
    public static void main(String args[]) {
        Vehical a = new Vehical(); // Vehical reference and object
        Vehical b = new Bike(); // Vehical reference but Bike object
        Vehical c = new Car(); // Vehical reference but Car object
        a.move(); // runs the method in Vehical class
        b.move(); // runs the method in Bike class
        c.move(); // runs the methon in Car class
    }
}

class Vehical {
    public void move() {
        System.out.println("Vehicals can move");
    }
}
class Bike extends Vehical {
    public void move() {
        System.out.println("Bike has 2 wheels");
    }
}
class Car extends Vehical {
    public void move() {
        System.out.println("Car has 4 wheels");
    }
}
