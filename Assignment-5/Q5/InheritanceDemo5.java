class Person {
    int personId;
    String personName;
    int age;

    public Person(int personId, String personName, int age) {
        this.personId = personId;
        this.personName = personName;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Person Name: " + personName);
        System.out.println("Age: " + age);
    }

    public boolean checkAge() {
        return age >= 18;
    }
}

class Doctor extends Person {
    String specialization;
    double consultationFee;

    public Doctor(int personId, String personName, int age,
                  String specialization, double consultationFee) {
        super(personId, personName, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public double calculateConsultationAmount() {
        return consultationFee;
    }

    public void displayDoctorDetails() {
        displayPersonDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Consultation Amount: " + calculateConsultationAmount());
        System.out.println("Is Adult: " + checkAge());
    }
}

class Patient extends Person {
    String disease;
    int roomNumber;

    public Patient(int personId, String personName, int age,
                   String disease, int roomNumber) {
        super(personId, personName, age);
        this.disease = disease;
        this.roomNumber = roomNumber;
    }

    public double calculateRoomCharge() {
        return roomNumber * 100.0;
    }

    public void displayPatientDetails() {
        displayPersonDetails();
        System.out.println("Disease: " + disease);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Charge: " + calculateRoomCharge());
        System.out.println("Is Adult: " + checkAge());
    }
}

public class InheritanceDemo5 {
    public static void main(String[] args) {
        Doctor d = new Doctor(301, "Dr. Smith", 45, "Cardiology", 500);
        d.displayDoctorDetails();

        System.out.println("-------------------");

        Patient p = new Patient(401, "Bob", 30, "Flu", 12);
        p.displayPatientDetails();
    }
}
