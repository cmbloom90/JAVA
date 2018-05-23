public class DragonTest{
    public static void main(String[] args){
        Dragon dovah = new Dragon("Vulthuryol", 300);
        System.out.println(dovah.name);
        dovah.attackTown().attackTown().attackTown().displayEnergy();
        dovah.eatHumans().eatHumans().displayEnergy();
        dovah.fly().fly().displayEnergy();
    }
}