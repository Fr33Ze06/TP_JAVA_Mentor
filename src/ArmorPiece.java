public enum ArmorPiece {
    HELMET(0.98F),
    CHESTPLATE(1.12F),
    GAUNTLETS(0.95F),
    LEGGINGS(1.05F);

    private final float priceMultiplier;

    ArmorPiece(float priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
}
