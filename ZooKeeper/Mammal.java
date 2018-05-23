

public class Mammal {
	protected int energyLevel = 100;
    protected String name = null;

    public Mammal(String name) {
        this.name = name;
        
    }

    public String getName() {
        return this.name;
    }

    public int displayEnergy() {
        System.out.println(String.format("%s has %d energy", this.name, this.energyLevel));
        return this.energyLevel;
    }
    public void changeEnergy(int amount) {
        this.energyLevel += amount;
    }

    

}
