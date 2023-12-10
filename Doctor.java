public class Doctor extends Staff {
    public String doctorName;
    public String jobTitle;
    public Doctor(String name, String jobTitle){
        super(name, jobTitle);
    }
    public void treat(){
        System.out.println("дал таблетку");
    }

}
