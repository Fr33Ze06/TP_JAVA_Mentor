public enum ArmorCategory {
    LIGHT (0.92F),
    MEDIUM (1.05F),
    HEAVY (1.12F);

    private final float priceMultiplier;

    ArmorCategory(float priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

}
