import java.util.PriorityQueue;

public class BestCD{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int nJack, nJill, count, t;
		Integer t1, t2;

		nJack = io.getInt();
		nJill = io.getInt();
		while(nJack != 0 || nJill != 0){
			count = 0;
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
			for(int i = 0; i < nJack; i++){
				pq.add(io.getInt());
			}
			for(int i = 0; i < nJill; i++){
				pq.add(io.getInt());
			}
			t = pq.size()/2;
			t1 = pq.poll();
			for(int i = 0; i < t + 1; i++){
				if((t2 = pq.poll()) == null)break;
				if(t1.compareTo(t2) == 0){
					count++;
				}
				if((t1 = pq.poll()) == null)break;
				if(t1.compareTo(t2) == 0){
					count++;
				}
			}
			io.println(count);
			io.flush();
			nJack = io.getInt();
			nJill = io.getInt();
		}
	}
}