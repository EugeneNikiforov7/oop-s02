public interface GoableFast {
    void run();
    default double getRunFastSpeed(){
        return 45.5;
    }
}
