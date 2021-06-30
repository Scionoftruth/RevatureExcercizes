package fixtures;

public abstract class Fixture {
	
	private String name;
	
	private String shortDescription;
	
	private String longDescription;
	
	public Fixture() {}
	
	public Fixture(String name, String shortDescription, String longDescription){
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortDescription() {
		return this.shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getLongDescription() {
		return this.longDescription;
	}
	
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
