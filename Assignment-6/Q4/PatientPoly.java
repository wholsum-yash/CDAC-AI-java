class Patient {
    int patientId;
    String patientName;
    int age;

    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    public double calculateTreatmentCost() {
        return 500.0; // general treatment cost
    }
}

class InPatient extends Patient {
    int numberOfDays;
    double roomCharge;

    public InPatient(int patientId, String patientName, int age,
                     int numberOfDays, double roomCharge) {
        super(patientId, patientName, age);
        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    public double calculateTreatmentCost() {
        return super.calculateTreatmentCost() + (numberOfDays * roomCharge);
    }
}

class OutPatient extends Patient {
    double consultationFee;
    double medicineCost;

    public OutPatient(int patientId, String patientName, int age,
                      double consultationFee, double medicineCost) {
        super(patientId, patientName, age);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }


    public double calculateTreatmentCost() {
        return consultationFee + medicineCost;
    }
}

public class PatientPoly {
    public static void main(String[] args) {
        InPatient obj1 = new InPatient(101, "Dre", 45, 5, 2000);
        OutPatient obj2 = new OutPatient(102, "Jay", 30, 800, 1200);

        System.out.println("InPatient Treatment Cost: " + obj1.calculateTreatmentCost());
        System.out.println("OutPatient Treatment Cost: " + obj2.calculateTreatmentCost());
    }
}
