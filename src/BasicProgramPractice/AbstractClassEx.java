package BasicProgramPractice;
abstract class shape{
	abstract void draw();
	
	void display() {
		System.out.println("Displaying shape");
	}
}
class circle extends shape{

	@Override
	void draw() {
		 System.out.println("Drawing Circle");
		
	}
	
}
class rectangle extends circle{
	void draw() {
		 System.out.println("Drawing Rectangle");
		
	}
}
public class AbstractClassEx {

	public static void main(String[] args) {
		AbstractClassEx a1=new AbstractClassEx();
		
	}

}
