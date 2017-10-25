import java.util.*;

public class Aaah{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String ah1 = s.next();
		String ah2 = s.next();
		System.out.println((ah1.length() >= ah2.length())?"go":"no");
	}
}