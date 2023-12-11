import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    public VeterinaryClinic addStaff(Staff staff){
        staffs.add(staff);
        return this;
    }
    public void dismissStaff(Staff staff){
        staffs.remove(staff);
    }
    public List<Staff> getStaffs(){
        return staffs;
    }

    public List<Animal> getPatients(){
        return patients;
    }
//    public void addPatient(Animal patient){
//        patients.add(patient);
//    }
     public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients) {
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
}
