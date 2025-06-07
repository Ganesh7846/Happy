//reverse the string using character
public class Main
{
	public static void main(String[] args) {
	    String st = "ganesh";
	    String s = "";
	    
	    for (int i=st.length()-1;i>=0 ;i-- ){
	        char ch = st.charAt(i);
	        String d = Character.toString(ch);
	        s = s.concat(d);
	    } 
		System.out.println("Hello World");
		System.out.println(st);
		System.out.println(s);
	
		
	}
}
