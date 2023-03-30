public class Main {
    public static void main(String[] args) {

        BasicStructure audi = new BasicStructure();
        audi.color = "Black";
        audi.model = "A3";
        audi.power = "5000cc";

        Engine X = new Engine();
        X.cylinders = "8";
        X.size = "9001cc";
        X.weight = "35Kg";

        Lights neon = new Lights();
        neon.color = "red";
        neon.intensity = "300Lumens";
        neon.type = "exterior";
    }
}
