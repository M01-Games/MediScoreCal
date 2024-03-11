package MediScoreCal;

public class MediScoreCalculator {
    public static int calculateMediScore(Patient patient) throws Exception {
        int score = 0;

        // Air or oxygen
        if (patient.getAirOrOxygen() < 0 || patient.getAirOrOxygen() > 2) {
            throw new Exception("Invalid value for air_or_oxygen");
        } else {
            score += patient.getAirOrOxygen();
        }


        // Consciousness
        if (patient.getConsciousness() < 0 || patient.getConsciousness() > 1) {
            throw new Exception("Invalid value for consciousness");
        } else if (patient.getConsciousness() != 0) {
            score += 3;
        }

        // Respiration rate
        if (patient.getRespirationRate() < 0 || patient.getRespirationRate() > 100) {
            throw new Exception("Invalid value for respiration_rate");
        } else if (patient.getRespirationRate() <= 8 || patient.getRespirationRate() >= 25) {
            score += 3;
        } else if (patient.getRespirationRate() >= 21 && patient.getRespirationRate() <= 24) {
            score += 2;
        } else if (patient.getRespirationRate() >= 9 && patient.getRespirationRate() <= 11) {
            score += 1;
        } else if (patient.getRespirationRate() >= 12 && patient.getRespirationRate() <= 20) {
            score += 0;
        }

        // SpO2
        if (patient.getSpO2() < 0 || patient.getSpO2() > 100) {
            throw new Exception("Invalid value for spo2");
        } else if (patient.getSpO2() <= 83 || (patient.getAirOrOxygen() == 2 && patient.getSpO2() >= 97)) {
            score += 3;
        } else if (patient.getSpO2() == 84 || patient.getSpO2() == 85 || (patient.getAirOrOxygen() == 2 && patient.getSpO2() == 95) || (patient.getAirOrOxygen() == 2 && patient.getSpO2() == 96)) {
            score += 2;
        } else if (patient.getSpO2() == 86 || patient.getSpO2() == 87 || (patient.getAirOrOxygen() == 2 && patient.getSpO2() == 93) || (patient.getAirOrOxygen() == 2 && patient.getSpO2() == 94)) {
            score += 1;
        } else if (patient.getSpO2() >= 88 && patient.getSpO2() <= 92 || (patient.getAirOrOxygen() == 0 && patient.getSpO2() >= 93)) {
            score += 0;
        }

        // Temperature
        if (patient.getTemperature() < 0.0 || patient.getTemperature() > 50.0) {
            throw new Exception("Invalid value for temperature");
        } else if (patient.getTemperature() <= 35.0) {
            score += 3;
        } else if (patient.getTemperature() >= 39.1) {
            score += 2;
        } else if (patient.getTemperature() > 35.0 && patient.getTemperature() <= 36.0 || patient.getTemperature() >= 38.1 && patient.getTemperature() <= 39.0) {
            score += 1;
        } else if (patient.getTemperature() >= 36.1 && patient.getTemperature() <= 38.0) {
            score += 0;
        }

        // CBG
        if (patient.getLastMeal() >= 2 && !patient.getIsFasting()) {
            if (patient.getCBG() < 0 || patient.getCBG() > 100) {
                throw new Exception("Invalid value for Capillary Blood Glucose");
            } else if (patient.getCBG() <= 4.4 || patient.getCBG() >= 9.0) {
                score += 3;
            } else if (patient.getCBG() >= 4.5 && patient.getCBG() <= 5.8 || patient.getCBG() >= 7.9 && patient.getCBG() <= 8.9) {
                score += 2;
            } else if (patient.getCBG() >= 5.9 && patient.getCBG() <= 7.8) {
                score += 0;
            }
        } else if (patient.getIsFasting()) {
            if (patient.getCBG() < 0 || patient.getCBG() > 100) {
                throw new Exception("Invalid value for Capillary Blood Glucose");
            } else if (patient.getCBG() <= 3.4 || patient.getCBG() >= 6.0) {
                score += 3;
            } else if (patient.getCBG() >= 3.5 && patient.getCBG() <= 3.9 || patient.getCBG() >= 5.5 && patient.getCBG() <= 5.9) {
                score += 2;
            } else if (patient.getCBG() >= 4.0 && patient.getCBG() <= 5.4) {
                score += 0;
            }
        }

        // Previous Score
        if (patient.getPreviousScore() != 0 && score - patient.getPreviousScore() > 2) {
            System.out.println("\nAlert: Medi score has increased by more than 2 points within a 24 hour period.");
        }

        return score;
    }
}
