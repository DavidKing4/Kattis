import java.util.LinkedList;

public class DownTime{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int k = io.getInt();
		int c = 0;
		LinkedList<LinkedList<Integer>> q = new LinkedList<LinkedList<Integer>>();
		for(int i = 1; i < n; i++){
			int x = io.getInt();
			LinkedList t;
			if((t = q.peek()) == null || (t.size() == k && t.peek() > x - 1000)){
				//make new 
				LinkedList<Integer> s = new LinkedList<Integer>();
				s.add(x);
				if(k == 1){
					q.add(s);
				}else{
					q.addFirst(s);
				}
				c++;
				//shove that shit in the front
				//unless it can only handle one, then shove it in the back
			}else{
				LinkedList t = q.poll();
				if(t.size() == k){
					t.poll();
					t.add(x);
				}else{
					t.add(x);
					if(t.size() == k){
						q.add(s);
					}else{
						q.addFirst(s);
					}
				}
				//pop that shit
				//update that shit
				//put that shit right back in
			}
		}
		System.out.println(c);
	}
}