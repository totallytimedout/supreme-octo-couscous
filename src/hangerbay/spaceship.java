package hangerbay;

public class spaceship implements scannable {
    public lifeform Captain;
    public String CaptainName;
    public String Description;
    public String Name;

    public lifeform getCaptain() {
        return Captain;
    }

    public void setCaptain(lifeform captain) {
        Captain = captain;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String scan() {
        return ("Ship Captain: " + this.getCaptain().Name + "\nShip Name: " + Name + "\nShip Description: "
                + Description);
    }

    public spaceship(lifeform captain, String description, String name) {
        Captain = captain;
        CaptainName = captain.Name;
        Description = description;
        Name = name;
    }

    public spaceship() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
};