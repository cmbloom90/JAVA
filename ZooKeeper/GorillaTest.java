
public class GorillaTest {
	public static void main(String[] args){
		Gorilla silver = new Gorilla("Han", 100);
		System.out.println(silver.name);
		silver.throwSomething().throwSomething().throwSomething().displayEnergy();
		silver.eatBananas().eatBananas().displayEnergy();
		silver.climb().displayEnergy();
	}
}


