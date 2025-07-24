package chapter03.ex20;

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
	
	static class AlarmBell extends Animal {

		@Override
		public void sound() {
			System.out.println("ALARM!!");
			
		}
		
	}
			

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Dog();
		
		a1.sound(); //멍멍
		a2.sound(); //짹쨱

		Animal a3 = new AlarmBell();
		a3.sound();
}
}
