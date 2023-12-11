public class Doctor extends Staff {
    public Nurse nurse;
    public Doctor(String name, String jobTitle, Nurse nurse){
        super(name,jobTitle);
        this.nurse=nurse;

        }

    public void treat(){
        System.out.println("дал таблетку");
    }

    @Override
    public String toString() {
        return super.toString() +
                " nurse=" + nurse +
                '}';
    }
}
