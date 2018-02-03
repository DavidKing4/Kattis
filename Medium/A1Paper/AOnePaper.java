import java.util.PriorityQueue;
import java.lang.Math;

public class AOnePaper{
	public static void main(String[] args){
	 	Kattio io = new Kattio(System.in, System.out);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int n = io.getInt();
		int p = 1;
		double t = 0;
		int x;

		for(int i = 1; i <= n - 1; i++){
			x = io.getInt();
			if(p - x*(1/(Math.pow(2, i))) > 0){
				t += (Math.pow(2, -1/4.0)/Math.pow(2, i/2.0));
				p -= x*(1/(Math.pow(2, i)));
			}else if(p - x*(1/(Math.pow(2, i))) <= 0){
				System.out.println(i);
				System.out.println(t);
				return;
				//figure how much to incrase the tape by
				//increase tape
				//print the tape length
				//return
			}
		}
	}
}