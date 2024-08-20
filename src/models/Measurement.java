package models;

public class Measurement {
    double value;

    Measurement(double value) {
        this.value = value;
    }

    double getCm() {
        return value * 100;
    }

    double getKm() {
        return value * 1000;
    }

    double getMm() {
        return value * 1000;
    }

    double getDm() {
        return value * 10;
    }

}
