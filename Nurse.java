public class Nurse extends Staff{
    public String nurseName;
    public String jobTitle;
    public Nurse(String name, String jobTitle){
        super(name, jobTitle);
    }
    public void injection(){
        System.out.println("поставила укол");
    }
}
