import java.util.Arrays;

public class PhoneList{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int t = io.getInt(); 
		for(int i = 0; i < t; i++){ //40

			int n = io.getInt();
			String[] digits = new String[n];
			for(int j = 0; j < n; j++){ //400,000
				digits[j] = io.getWord();
			}
			Arrays.sort(digits);
			int yes = 1;
			a: for(int j = 0; j < n - 1; j++){ //400,000
				String num1 = digits[j];
				b: for(int k = j + 1; k < n; k++){ //160,000,000,000
					String num2 = digits[k];
					int min = Math.min(num1.length(), num2.length());
					if((num1.charAt(0)) != (num2.charAt(0)))
						break b;
					yes = compareString(num1, num2, min);
					if(yes == 1)
						break b;
					if(yes == 2)
						break a;
				}
			}
			io.println((yes == 2)?"NO":"YES");
			io.flush();
		}
	}
	private static int compareString(String num1, String num2, int min){
		
		c: for(int l = 1; l < min; l++){ //1,600,000,000,000
			if((int)(num1.charAt(l)) < (int)(num2.charAt(l)))
				return 1;
		}
			return 2;
	}
}