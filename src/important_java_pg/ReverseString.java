package important_java_pg;

public class ReverseString {

	public static void main(String[] args) {
		
		//String s= "logeshwari";
		
		//StringBuffer buffer=new StringBuffer();
		//buffer.append(s);
		
		//StringBuilder buffer=new StringBuilder();
		//buffer.append(s);
		
		//System.out.println(buffer.reverse());
		
		System.out.println("**********************************************");
		
		/*
		 * String s1= "logeshwari";
		 * 
		 * char[] chararray=s1.toCharArray();
		 * 
		 * String reverse="";
		 * 
		 * for(int i=chararray.length-1;i>=0;i--) {
		 * 
		 * reverse=reverse+chararray[i]; }
		 * 
		 * System.out.println(reverse);
		 */
		
		String s="ammukutty";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		

	}

}
