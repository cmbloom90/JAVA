public class ProjectClassTest {
	public static void main(String[] args){
		
		ProjectClass project1 = new ProjectClass();
		ProjectClass project2 = new ProjectClass("name");
		ProjectClass project3 = new ProjectClass("name", "description");
		
		String pitch1 = project1.elevatorPitch();
		String pitch2 = project2.elevatorPitch();
		String pitch3 = project3.elevatorPitch();
		
		System.out.println(pitch1);
		System.out.println(pitch2);
		System.out.println(pitch3);
		
		project1.setName("New name");
		project1.setDescription("New description");
		String pitch4 = project1.elevatorPitch();
		System.out.println(pitch4);

		String str1 = project3.getName();
		String str2 = project2.getDescription();
		System.out.println(str1);
		System.out.println(str2);
    }
}