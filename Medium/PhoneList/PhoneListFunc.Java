import java.util.*;

public class PhoneListFunc{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
		int t = s.nextInt(); 
		for(int i = 0; i < t; i++){

			int n = s.nextInt();
			String[] digits = new String[n];
			for(int j = 0; j < n; j++){
				digits[j] = s.next();
			}
			Arrays.sort(digits);
			int p1 = 0, p2 = 1;
			boolean ans = OuterLoop(digits, p1, p2);
			System.out.println((ans)?"YES":"NO");
		}
	}
	private static boolean OuterLoop(String[] digits, int p1, int p2){
		if (!InnerLoop(digits, p1, p2)){
			return false;
		}
		if(p1 == digits.length - 2){
			return true;
		}
		OuterLoop(digits, ++p1, p1 + 2);
		return true;
	}
	private static boolean InnerLoop(String[] digits, int p1, int p2){
		if(p2 == digits.length)
		return true;
		String num1 = digits[p1], num2 = digits[p2];
		int min = Math.min(num1.length(), num2.length());
		if(num1.charAt(0) != num2.charAt(0)){
			return true;
		}	
		if(!InnermostLoop(num1, num2, 1, min)){
			return false;

		}
		InnerLoop(digits, p1, ++p2);
		return true;
	}
	private static boolean InnermostLoop(String num1, String num2, int p3, int min){
		if(p3 > min - 1){
			return false;
		}
		if((num1.charAt(p3)) != (num2.charAt(p3))){
			return true;
		}
		if(!InnermostLoop(num1, num2, ++p3, min))
			return false;
		return true;
	}
}