// Dietitian.java
public class Dietitian extends HealthProfessional {
    private String certification;

    // Default constructor, initialised to default values
    public Dietitian() {
        super();
        this.certification = "Unknown Certification";
    }

    // Constructor with references, initialises all variables
    public Dietitian(int ID, String name, String specialty, String certification) {
        super(ID, name, specialty);
        this.certification = certification;
    }

    // Print dietitian details
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Dietitian");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
