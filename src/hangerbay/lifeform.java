package hangerbay;

public class lifeform implements scannable {
    public String Name;
    public String race;
    public spaceship ship;
    public int age;

    public String scan() {
        return ("Race: " + this.getRace() + "\nShip: " + this.getShip().Name
                + "\nName: " + this.getName());
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public spaceship getShip() {
        return ship;
    }

    public void setShip(spaceship ship) {
        this.ship = ship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String Description;

    public void setName(String x) {
        this.Name = x;
    };

    public String getName() {
        return Name;
    }
}
