package ChapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private String dateOfBirth;
    private double height;
    private double weight;
    private int age;
    private int maxHeartRate;
    private double targetHeartRate;
    private double bodyMassIndex;

    public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return monthOfBirth + "/" + dayOfBirth + "/" + yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void calculateAge() {
        age = 2021 - yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setMaxHeartRate() {
        maxHeartRate = 220 - age;
    }

    public int getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setTargetHeartRate() {
        targetHeartRate =  0.5 * maxHeartRate;
    }

    public double getTargetHeartRate() {
        return targetHeartRate;
    }

    public void setBodyMassIndex() {
        bodyMassIndex = weight * 703 / (height * height);
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

}
