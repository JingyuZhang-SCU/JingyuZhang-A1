// HealthProfessional.java
public class HealthProfessional {
    private int ID;
    private String name;
    private String specialty; // 例如，专长领域

    // Default constructor, initialised to default values
    public HealthProfessional() {
        this.ID = 0;
        this.name = "Unknown";
        this.specialty = "General";
    }

    // Constructor with references, initialises all variables
    public HealthProfessional(int ID, String name, String specialty) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
    }
    
    // Print doctor's details
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
