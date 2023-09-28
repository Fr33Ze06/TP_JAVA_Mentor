public enum WeaponCategory {
    ONEHANDED(0.92F),
    TWOHANDED(1.15F);
    private final float priceMultiplier;
    WeaponCategory(float priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
}
