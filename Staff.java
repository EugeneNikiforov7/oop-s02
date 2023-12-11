public abstract class Staff {
    protected String name;
    private String jobTitle;
    public Staff(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
