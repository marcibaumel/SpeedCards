package project.Model;

public class CardObject {
    private int attackPoint;
    private int health;
    private String cardName;
    private String imgPath;
    private String des;

    public CardObject(int attackPoint, int health, String cardName, String imgPath, String des) {
        this.attackPoint=attackPoint;
        this.health=health;
        this.cardName=cardName;
        this.imgPath=imgPath;
        this.des=des;
    }



    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getDes() {
        return des;
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
