// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    // Default constructor, initialised to default values
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Unknown Clinic";
    }

    // Constructor with references, initialises all variables
    public GeneralPractitioner(int ID, String name, String specialty, String clinicLocation) {
        super(ID, name, specialty);
        this.clinicLocation = clinicLocation;
    }

    // Print GP details
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
