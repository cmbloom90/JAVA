public class Dragon extends Mammal {
    public Dragon (String name, int energyLevel){
        super(name);
        this.energyLevel= 300;
    }
    public Dragon fly(){
        this.energyLevel -= 50;
        System.out.println("The Dragon is in flight.");
        return this;
    }
    public Dragon eatHumans(){
        this.energyLevel += 25;
        System.out.println("Oh well the Dragon ate another person.");
        return this;
    }
    public Dragon attackTown(){
        this.energyLevel -= 100;
        System.out.println("The Dragon lit the town on fire!!");
        return this;
    }

}