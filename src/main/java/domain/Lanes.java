package domain;

public enum Lanes {
    TOP("top"),
    MID("mid"),
    ADC("adc"),
    SUP("sup"),
    JUNGLE("jungle");

    private String lane;

    Lanes(String lane) {
        this.lane = lane;
    }

    public String getLane() {
        return lane;
    }
}
