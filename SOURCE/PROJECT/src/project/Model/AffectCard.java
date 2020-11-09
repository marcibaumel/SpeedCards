package project.Model;

public class AffectCard {
    private String Description;
    private int ModderAttack;
    private int ModderHealth;
    private int Price;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getModderAttack() {
        return ModderAttack;
    }

    public void setModderAttack(int modderAttack) {
        ModderAttack = modderAttack;
    }

    public int getModderHealth() {
        return ModderHealth;
    }

    public void setModderHealth(int modderHealth) {
        ModderHealth = modderHealth;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
