//task-4
public interface Vehicles {
    void setPrice(double price);

    void getPrice();

    void start();

    void stop();

    void fly();
}

interface Movable{
    void start();
    void stop();
}

interface Flyable{
    void fly();
}

class Car implements Vehicles, Movable{
    static double price;

    public Car(double price) {
        this.price = price;
    }
    @Override
    public void setPrice(double price){
        this.price = price;
    }
    public void getPrice(){
        System.out.println("Price is: $" + price);
        
    }
    @Override
    public void start(){
        System.out.println("Car is starting");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }

    public static void main(String[] args) {
        Vehicles car = new Car(price);
        car.setPrice(20000.00);
        car.getPrice();
        car.start();
        car.stop();
        
    }
    @Override
    public void fly() {
        
    }
  
}

class Aeroplane implements Vehicles, Movable, Flyable{
    double price;

    @Override
    public void setPrice(double price){
        this.price = price;
    }
    public void getPrice(){
        System.out.println("Price is: $" + price);
        
    }
    @Override
    public void start(){
        System.out.println("Aeroplane is starting");
    }

    @Override
    public void stop(){
        System.out.println("Aeroplane is stopping");
    }

    @Override
    public void fly(){
        System.out.println("Aeroplane can fly");
    }

    public static void main(String[] args) {
        Vehicles aeroplane = new Aeroplane();
        aeroplane.setPrice(50000.00);
        aeroplane.getPrice();
        aeroplane.start();
        aeroplane.stop();
        aeroplane.fly();
    }

    
}
