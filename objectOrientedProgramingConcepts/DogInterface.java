package objectOrientedProgramingConcepts;



interface Animal {
	   public void barking();
	   public void sleeping();
	}
public class DogInterface implements Animal {
	
	public void barking() {
		   System.out.println("barking");
	   }

	 public void sleeping() {
		   System.out.println("sleeping");

	
	   }

	   public static void main(String args[]) {
		   DogInterface d = new DogInterface();
	     d.barking();
	     d.sleeping();
	   }
	} 