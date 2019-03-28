package objectOrientedProgramingConcepts;

interface MyTelevision{
	public void setType();
}

public class TelevisionInterface implements MyTelevision{
	public void setType() {
		// TODO Auto-generated method stub
		System.out.println("sony");
	}
	public static void main(String []args){
		
		TelevisionInterface t= new TelevisionInterface();
		t.setType();
	}

}