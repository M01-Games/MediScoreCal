package MediScoreCal;

public class Main {
    public static void main(String[] args) {
        try {
            Patient patient1 = new Patient(0, 0, 15, 95, 37.1f, 1, false, 6.2f, 0);
            int mediScore = MediScoreCalculator.calculateMediScore(patient1);
            System.out.println("The Medi Score for patient 1 is \n" + mediScore);

            Patient patient2 = new Patient(2, 0, 17, 95, 37.1f, 2, false, 6.2f, 0);
            mediScore = MediScoreCalculator.calculateMediScore(patient2);
            System.out.println("The Medi Score for patient 2 is \n" + mediScore);

            Patient patient3 = new Patient(2, 1, 23, 88, 38.5f, 1, true, 4.5f, 5);
            mediScore = MediScoreCalculator.calculateMediScore(patient3);
            System.out.println("The Medi Score for patient 3 is \n" + mediScore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}