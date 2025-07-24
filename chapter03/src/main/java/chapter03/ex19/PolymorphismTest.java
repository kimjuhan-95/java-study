package chapter03.ex19;

public class PolymorphismTest {
	static abstract class Animal {
		private String species;
		
		public String gerSpecies() {
			return species;
		}
		
		public void setSprcies(String species) {
			this.species = species;
			
		}
		
		public abstract void sound();

	
		
	}
	
	static class Dog extends Animal {
		public void sound() {
			System.out.println("멍멍");
			
		}
	}

	static class sparrow extends Animal {
		public void sound() {
			System.out.println("쨱쨱");
		}
	}
			

	public static void main(String[] args) {
		Animal a1 = new Dog();
		
		a1.sound();

}
}
