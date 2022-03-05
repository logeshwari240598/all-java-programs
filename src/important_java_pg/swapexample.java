package important_java_pg;

public class swapexample {
	
	
	public void swapinthirdvariable1() {
		
       int myamount= 20;
		
		int mybrotheramount=50;
		
		System.out.println("After swapping" + myamount +"After swapping " + mybrotheramount );
		
		int mymomamount= myamount;
		
		myamount=mybrotheramount;
		
		mybrotheramount=mymomamount;
		
		System.out.println("After swapping:" + myamount + "After swapping :" + mybrotheramount );
		
		
		System.out.println("****************************************************************");
		

	}
		
		public void swapinthirdvariable() {
		
		int first=20;
		
		int second=50;
		
		System.out.println("first swapping" + first +"second swapping " + second );
		
		first= first-second; //-30
		
		second= first+second; //70
		
		first= second-first; //70-
		
		System.out.println("first swapping" + first +"second swapping " + second );
		
		}
		
		public void swapinthirdvariablemuldiv() {
			
			int firstmul=20;
			
			int seconddiv=50;
			
			System.out.println("first swapping" + firstmul +"second swapping " + seconddiv );
			
			firstmul= firstmul*seconddiv; //-30
			
			seconddiv= firstmul/seconddiv; //70
			
			firstmul= firstmul/seconddiv; //70-
			
			System.out.println("first swapping" + firstmul +"second swapping " + seconddiv );
			
			}
		
		
		public static void main(String[] args) {
			
			swapexample numbers = new swapexample();
			 
			//numbers.swapinthirdvariable();
			
			numbers.swapinthirdvariablemuldiv();
		
	}
	

}
