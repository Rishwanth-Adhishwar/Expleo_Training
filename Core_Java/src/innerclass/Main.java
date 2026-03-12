package innerclass;

class Person {

	int age = 21;
	static int weight = 45;

	static class Gender {
		void nonStaticDisplay() {
			System.out.println("Non static Display Method");
			System.out.println("Weight Value: " + weight);
		}

		static void staticDisplay() {
			System.out.println("in static display Method");
			System.out.println("Weight Value: " + weight);
		}
	}

	Gender g = new Gender();

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.g.nonStaticDisplay();
		p.g.staticDisplay();

	}

}
