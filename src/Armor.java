public class Armor extends Equipment{
    private ArmorCategory category;
    private ArmorPiece armorPiece;

    public Armor(String name, Rarity rarity, int price, ArmorCategory category, ArmorPiece armorPiece) {
        super(name, rarity, price);
        this.category = category;
        this.armorPiece = armorPiece;
        calculatePrice();
    }

    public ArmorPiece getArmorPiece() {
        return armorPiece;
    }

    public void setArmorPiece(ArmorPiece armorPiece) {
        this.armorPiece = armorPiece;
    }

    public ArmorCategory getCategory() {
        return category;
    }

    public void setCategory(ArmorCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "category=" + category +
                ", armorPiece=" + armorPiece +
                '}';
    }

    private void calculatePrice() {
        int basePrice = super.getPrice();

        switch (category) {
            case LIGHT:
                basePrice *= LIGHT.pr;
                break;
            case MEDIUM:
                basePrice *= 1.5;
                break;

        }

        switch (armorPiece) {
            case LIGHT:
                basePrice *= 1.1;
                break;
            case MEDIUM:
                basePrice *= 1.3;
                break;
        }

        super.setPrice(Math.round(basePrice));
    }
}
