// AssignmentOne.java
import java.util.ArrayList;

public class AssignmentOne {

    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");


        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr.Zhang", "neurosurgery", "Diagnostic AreaA");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr.Cheng", "general medicine", "Diagnostic AreaB");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr.Zhao", "orthopaedic", "Diagnostic AreaC");


        Dietitian dt1 = new Dietitian(201, "Dr.Wang", "dietitians", "Higher");
        Dietitian dt2 = new Dietitian(202, "Dr.Wu", "dietitians", "Practice");


        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        gp3.printDetails();
        System.out.println();


        dt1.printDetails();
        System.out.println();
        dt2.printDetails();
        System.out.println();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");


        createAppointment("Ms.Liu", "1234567891", "09:00", gp1);
        createAppointment("Mr.Wang", "9876543211", "10:30", gp2);


        createAppointment("Miss.Wang", "1122334455", "11:00", dt1);
        createAppointment("Mr.Zhou", "5566778899", "14:00", dt2);


        printExistingAppointments();


        cancelBooking("9876543211");
        cancelBooking("9876543210");

        printExistingAppointments();

        System.out.println("------------------------------");
    }


    public static void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional doctor) {

        if (patientName == null || patientName.isEmpty() ||
                patientMobile == null || patientMobile.isEmpty() ||
                preferredTimeSlot == null || preferredTimeSlot.isEmpty() ||
                doctor == null) {
            System.out.println("Unable to create an appointment: the necessary information is missing.");
            return;
        }

        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, doctor);
        appointmentList.add(newAppointment);
        System.out.println("Appointment has been created:");
        newAppointment.printAppointmentDetails();
        System.out.println();
    }


    public static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("There are no current appointments available.");
            return;
        }

        System.out.println("A list of available appointments:");
        for (Appointment appointment : appointmentList) {
            appointment.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }


    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getPatientMobile().equals(patientMobile)) {
                System.out.println("Cancellation of appointments:");
                appointmentList.get(i).printAppointmentDetails();
                appointmentList.remove(i);
                System.out.println("The appointment has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No bookings found for mobile phone number " + patientMobile );
        }
        System.out.println();
    }
}
