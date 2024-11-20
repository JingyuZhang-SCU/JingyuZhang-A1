// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {

    private String clinicLocation;


    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Unknown Clinic";
    }


    public GeneralPractitioner(int ID, String name, String specialty, String clinicLocation) {
        super(ID, name, specialty);
        this.clinicLocation = clinicLocation;
    }


    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
    }


    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }
}
