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
            score += 1;
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
        } else if (patient.getTemperature() >= 35.1 && patient.getTemperature() <= 36.0 || patient.getTemperature() >= 38.1 && patient.getTemperature() <= 39.0) {
            score += 1;
        } else if (patient.getTemperature() >= 36.1 && patient.getTemperature() <= 38.0) {
            score += 0;
        }

        return score;
    }
}
