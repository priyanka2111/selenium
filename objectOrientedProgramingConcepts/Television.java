package objectOrientedProgramingConcepts;


	public class Television {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Television1 d1=new Television1();
			Television1 d2=new Television1();
			d1.SetSize(2);
			d2.SetSize(12);
			d1.setType("sony");
			d2.setType("lg");
		}

	}
	class  Television1{
		int size=0;
		String type;
		
		void SetSize(int newsize){
			size= newsize;
			System.out.println("size="+newsize);
			
		}
		void setType(String newtype){
			type =newtype;
				System.out.println("type="+newtype);
				
			}
		}


