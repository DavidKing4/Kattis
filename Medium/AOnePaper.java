import java.util.PriorityQueue;
import java.lang.Math;

public class AOnePaper{
	public static void main(String[] args){
	 	Kattio io = new Kattio(System.in, System.out);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int n = io.gettInt();
		int p = 1;
		int t, x;

		for(int i = 1; i <= n; i++){
			x = io.gettInt();
			if(p - x*(1/(Math.pow(2, i))) > 0){
				t += (Math.pow(2, -1/4)/Math.pow(2, i/2));
				p -= x*(1/(Math.pow(2, i)));
			}if(p - x*(1/(Math.pow(2, i))) <= 0){
				System.out.println(t);
				//figure how much to incrase the tape by
				//increase tape
				//print the tape length
				//return
			}
		}
	}
}