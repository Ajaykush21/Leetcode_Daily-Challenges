package Easy;

public class Determine_if_String_Halves_Are_Alike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="book";
		System.out.println(halvesAreAlike(s));
		

	}
	 public static boolean halvesAreAlike(String s) {
	        int count1=0;
	        int count2=0;
	        for(int i=0;i<s.length()/2;i++){
	            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
	                count1++;
	            }
	        }
	        for(int i=s.length()/2;i<s.length();i++){
	            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
	                count2++;
	            }
	        }
	        if(count1==count2){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }

}
