public class Horse extends Animal implements Goable{
    public Horse(){
        super();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void run() {

    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
