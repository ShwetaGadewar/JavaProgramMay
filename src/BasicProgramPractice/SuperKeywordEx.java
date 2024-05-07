package BasicProgramPractice;

class Parent {
	int num;

	// constructor of the Parent class
	Parent() {
		num = 100;
	}

	// method to display the value of num
	void display() {
		System.out.println("Value of num in Parent class: " + num);
	}
}

class SuperKeywordEx extends Parent {

	int num;

	// constructor of the Child class
	SuperKeywordEx() {
		super(); // calling the constructor of the Parent class
		num = 200;
	}

	// method to display the value of num
	void display() {
		super.display(); // calling the display() method of the Parent class
		System.out.println("Value of num in Child class: " + num);
	}

	public static void main(String[] args) {

		SuperKeywordEx s1 = new SuperKeywordEx();
		s1.display();

	}

}
