

public class Gorilla extends Mammal {
	public Gorilla(String name, int energyLevel){
		super(name);
		this.energyLevel=100;
	}
	public Gorilla throwSomething(){
		this.energyLevel -= 5;
		System.out.println("The Gorilla threw something");
		return this;
	}
	public Gorilla eatBananas(){
		this.energyLevel += 10;
		System.out.println("The Gorilla ate bananas");
		return this;
	}
	public Gorilla climb(){
		this.energyLevel -= 10;
		System.out.println("The Gorilla climbed a tree");
		return this;
	}

}


