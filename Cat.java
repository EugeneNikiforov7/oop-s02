import java.time.LocalDate;

public class Cat extends Animal implements Speakble, GoableSlow {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public double getSpeedSlowRun() {
        return GoableSlow.super.getSpeedSlowRun();
    }

}
