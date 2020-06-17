package study;

public class Dog {
	
	int size;
	String breed;
	String name;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}
