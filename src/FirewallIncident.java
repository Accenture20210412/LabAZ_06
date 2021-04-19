public enum FirewallIncident {
    LOV_SEVERITY(1), MEDIUM_SEVERITY(2),
    HIGH_SEVERITY(3), EXTREME_SEVERITY(4);
    private int value;

    private FirewallIncident(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
