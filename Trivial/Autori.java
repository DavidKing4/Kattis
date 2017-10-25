import java.util.*;

public class Autori{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String ans = "", in = s.nextLine();
		for(int i = 0; i < in.length(); i++){
			if(Character.isUpperCase(in.charAt(i))){
				ans += in.charAt(i);
			}
		}
		System.out.print(ans);
	}
}