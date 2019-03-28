package objectOrientedProgramingConcepts;

	class Dog1 {
	   String name;
	   String color;
	   void setName(String name){
		   System.out.println("barking"+name);
	   }

	   void barking() {
		   System.out.println("barking");
	   }

	   void hungry() {
		   System.out.println("hungry");
	   }

	   void sleeping() {
		   System.out.println("sleeping");
	   }
	}

public class Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.barking();
		d.hungry();
		d.sleeping();
		d.setName("gdfrg");

	}

}


