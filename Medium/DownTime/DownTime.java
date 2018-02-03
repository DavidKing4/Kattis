import java.lang.Integer;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class DownTime{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int k = io.getInt();
		int c = 0;
		Comparator<LinkedList<Integer>> compare = new IntegerLLComparator();
		PriorityQueue<LinkedList<Integer>> q = new PriorityQueue<LinkedList<Integer>>(compare);
		for(int i = 0; i < n; i++){
			int x = io.getInt();
			LinkedList<Integer> t;
			if((t = q.peek()) == null || (t.size() == k && t.peek() > x - 1000)){
				//make new 
				LinkedList<Integer> s = new LinkedList<Integer>();
				s.add(x);
				q.add(s);				
				c++;
				//shove that shit in the front
				//unless it can only handle one, then shove it in the back
			}else{
				t = q.poll();
				if(t.size() == k){
					t.poll();
					t.add(x);
					q.add(t);
				}else{
					t.add(x);
					q.add(t);
				}
				//pop that shit
				//update that shit
				//put that shit right back in
			}
		}
		System.out.println(c);
	}
}