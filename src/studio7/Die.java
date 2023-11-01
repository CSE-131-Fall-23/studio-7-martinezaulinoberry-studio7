package studio7;

public class Die {
	private int sides;
	
	public int throwDie() {
		return (int)(Math.random()*this.sides + 1);
	}
	
	public Die(int initSides) {
		this.sides = initSides;
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(6);
		System.out.println(d1.throwDie());
	}

	//setters and getters
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

}
