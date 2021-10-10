package chapter3;


public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile patientHealthProfile = new HealthProfile("Sarah", "Akinkunmi", " ", 5, 15, 2000, 61.4173, 121.254);

        System.out.println("Patient's first name is: " + patientHealthProfile.getFirstName());
        System.out.println("Patient's last name is: " + patientHealthProfile.getLastName());
        System.out.println("Patient's gender is: " + patientHealthProfile.getGender());
        System.out.println("Patient's date of birth is: " + patientHealthProfile.getDateOfBirth());
        System.out.println("Patient's weight is: " + patientHealthProfile.getWeight());
        System.out.println("Patient's height is: " + patientHealthProfile.getHeight());
        patientHealthProfile.calculateAge();
        System.out.println("The patient's age is: " + patientHealthProfile.getAge());
        patientHealthProfile.setMaxHeartRate();
        System.out.println("The maximum heart rate for patient is: " + patientHealthProfile.getMaxHeartRate());
        patientHealthProfile.setTargetHeartRate();
        System.out.println("The target heart rate for patient is: " + patientHealthProfile.getTargetHeartRate());
        patientHealthProfile.setBodyMassIndex();
        System.out.println("Patient's BMI is: " + patientHealthProfile.getBodyMassIndex());
    }
}
