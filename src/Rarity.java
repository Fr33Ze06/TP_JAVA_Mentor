public enum Rarity {
    COMMON(1.0F),
    UNCOMMON(1.05F),
    RARE(1.1F),
    EPIC(1.15F),
    LEGENDARY(1.2F);

    private final float priceMultiplier;

    Rarity(float priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
}
