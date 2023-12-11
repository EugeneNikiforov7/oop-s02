public interface Swimable {
    void run();
    default double getSwimSpeed(){
        return 3.3;
    }
}
