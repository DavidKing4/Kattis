import java.util.Scanner;

public class BossBattle{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n <= 3){
			System.out.println("1");
			return;
		}
		int c = 0;
		int i = 0;
		int j = 0;
		while(true){
			c++;
			j += 2;
			if(i%n == j%n || i%n == (j%n) - 1 || i%n == (j%n) + 1){
				System.out.println(c);
				return;
			}
			i++;
		}
	}
}