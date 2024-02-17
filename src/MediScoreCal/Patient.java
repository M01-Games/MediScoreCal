package MediScoreCal;

public class Patient {
    int airOrOxygen;
    int consciousness;
    int respirationRate;
    int spO2;
    float temperature;

    // constructor
    public Patient(int airOrOxygen, int consciousness, int respirationRate, int spO2, float temperature) {
        this.airOrOxygen = airOrOxygen;
        this.consciousness = consciousness;
        this.respirationRate = respirationRate;
        this.spO2 = spO2;
        this.temperature = temperature;
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
}
