public class Doctor extends Staff {
    public String name;
    public String jobTitle;
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
        return "Doctor{" +
                "doctorName='" + getName() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", nurse=" + nurse +
                '}';
    }
}
