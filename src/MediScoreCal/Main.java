package MediScoreCal;

public class Main {
    public static void main(String[] args) {
        try {
            Patient patient1 = new Patient(0, 0, 15, 95, 37.1f);
            int mediScore = MediScoreCalculator.calculateMediScore(patient1);
            System.out.println("The Medi Score for patient 1 is " + mediScore);

            Patient patient2 = new Patient(2, 0, 17, 95, 37.1f);
            mediScore = MediScoreCalculator.calculateMediScore(patient2);
            System.out.println("The Medi Score for patient 2 is " + mediScore);

            Patient patient3 = new Patient(2, 1, 23, 88, 38.5f);
            mediScore = MediScoreCalculator.calculateMediScore(patient3);
            System.out.println("The Medi Score for patient 3 is " + mediScore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}