import java.util.Scanner;

public class Bing{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		Node t = new Node();

		for(int i = 0; i < n; i++){
			String st = s.nextLine();
			System.out.println(t.update(st) - 1);
		}
	}
}