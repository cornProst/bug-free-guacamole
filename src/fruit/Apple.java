package fruit;

public class Apple {
	int price;
	int grade;
	

	public void eat() {
		price -= 500;
	}
	
	boolean clean;
	
	public void ate() {
		price -= 800;
	}
	
	public void clean() {
		clean = true;
	}
}
