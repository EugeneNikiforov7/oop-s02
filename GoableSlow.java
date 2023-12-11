public interface GoableSlow {
    void run();
    default double getSpeedSlowRun(){
        return 2.2;
    }
}
