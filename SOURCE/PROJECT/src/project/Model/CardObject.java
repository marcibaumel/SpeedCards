package project.Model;

public class CardObject {
    private int attackPoint;
    private int health;
    private String cardName;

    public void setCard(int attackPoint, int health, String cardName)
    {
        this.attackPoint=attackPoint;
        this.health=health;
        this.cardName=cardName;
    }


    public int getAttackPoint() {
        return attackPoint;
    }

    public CardObject setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public CardObject setHealth(int health) {
        this.health = health;
        return this;
    }

    public String getCardName() {
        return cardName;
    }

    public CardObject setCardName(String cardName) {
        this.cardName = cardName;
        return this;
    }
}
