import java.util.Scanner;

public class Carrots{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0){
			System.out.println(0);
		}else{
			int m = s.nextInt();
			System.out.println(m);
		}
	}
}