public class ProjectClass{
    private String name;
    private String description;
    
    
    public ProjectClass(){
        this.name= "placeholder";
        this.description="placeholder";
    }
    public ProjectClass(String name){
        this.name= name;
        this.description= "placeholder";

    }
    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
        
    }
    public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
    }
    public String elevatorPitch(){
		
			String pitch = String.format("%s: %s", this.name, this.description);
			return pitch;
		
		
	}
}