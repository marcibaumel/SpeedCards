package project.Model;

public class AffectCard {
    private String Description;
    private int ModderAttack;
    private int ModderHealth;
    private int Price;
    private String Name;
    private String Path;


    public AffectCard()
    {

    }

    public AffectCard(String Description, int ModderAttack, int ModderHealth, int Price, String name, String path){
        this.Description=Description;
        this.ModderAttack=ModderHealth;
        this.ModderHealth=ModderHealth;
        this.Price=Price;
        this.Name=name;
        this.Path=path;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getImgPath(){return Path;}


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
