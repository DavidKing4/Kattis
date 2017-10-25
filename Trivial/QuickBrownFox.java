import java.util.Scanner;

public class QuickBrownFox{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), count, t;
		char c;
		String input;
		s.nextLine();
		for(int i = 0; i < n; i++){
			count = 26;
			boolean[] picked = new boolean[26];
			input = s.nextLine();

			for(int j = 0; j < input.length(); j++){
				c = input.charAt(j);
				c = Character.toLowerCase(c);
				if((t = (int)(c) - 97) >= 0 && t < 26){
					if(picked[t] == false){
						picked[t] = true;
						count--;
					}
				}
			}
			if(count == 0){
				System.out.println("pangram");
			}else{
				System.out.print("missing ");
				for(int j = 0; j < 26; j++){
					if(picked[j] == false){
						System.out.print((char)(j + 97));
					}
				}
				System.out.println();
			}
		}
	}
}