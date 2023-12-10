
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat() {
        };
        cat.setName("Barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("Max", new Chumka("chumka"), "Vasya", LocalDate.of(3, 12, 22)) {
        };
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("12.00");
        Fish fish = new Fish();
        Duck duck = new Duck();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        dog.LiveCycle();

        fish.breathe();
        fish.go();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());

    }
}
