package MediScoreCal;

public class Patient {
    int airOrOxygen;
    int consciousness;
    int respirationRate;
    int spO2;
    float temperature;
    int lastMeal;
    boolean isFasting;
    float CBG;
    int previousScore;

    // constructor
    public Patient(int airOrOxygen, int consciousness, int respirationRate, int spO2, float temperature, int lastMeal, boolean isFasting, float CBG, int previousScore) {
        this.airOrOxygen = airOrOxygen;
        this.consciousness = consciousness;
        this.respirationRate = respirationRate;
        this.spO2 = spO2;
        this.temperature = temperature;
        this.lastMeal = lastMeal;
        this.isFasting = isFasting;
        this.CBG = CBG;
        this.previousScore = previousScore;
    }

    // getters
    public int getAirOrOxygen() {
        return airOrOxygen;
    }

    public int getConsciousness() {
        return consciousness;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public int getSpO2() {
        return spO2;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getLastMeal() {
        return lastMeal;
    }

    public boolean getIsFasting() {
        return isFasting;
    }

    public float getCBG() {
        return CBG;
    }

    public int getPreviousScore() {
        return previousScore;
    }
}
