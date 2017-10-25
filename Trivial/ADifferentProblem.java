import java.util.*;

public class ADifferentProblem{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			long n = s.nextLong();
			long m = s.nextLong();
			System.out.println(Math.abs(n - m));
		}
	}
}