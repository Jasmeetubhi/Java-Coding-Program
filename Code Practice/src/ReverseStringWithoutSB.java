
public class ReverseStringWithoutSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = reverse("HelloWorld");
		System.out.println(rev);
	}
	
	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }

}
