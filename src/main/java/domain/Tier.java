package domain;

public enum Tier {
    S("s"),
    A("a"),
    B("b"),
    C("c"),
    D("d");

    private String tier;

    Tier(String tier) {
        this.tier = tier;
    }

    public String getTier() {
        return this.tier;
    }
}
