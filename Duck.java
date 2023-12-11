
import java.time.LocalDate;

public class Duck extends Animal implements GoableSlow, Flyable, Swimable {
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getFlySpeed() {
        return Flyable.super.getFlySpeed();
    }

    @Override
    public void run() {

    }

    @Override
    public double getSpeedSlowRun() {
        return GoableSlow.super.getSpeedSlowRun();
    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }
}
