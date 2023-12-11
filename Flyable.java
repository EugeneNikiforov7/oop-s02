public interface Flyable {
    void run();
    default double getFlySpeed(){
        return 20.2;
    }
}
