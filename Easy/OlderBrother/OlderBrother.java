import java.lang.Math;

public class OlderBrother{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int q = io.getInt();
		if(q == 1){
			System.out.println("no");
			return;
		}
		int l = (int)Math.sqrt(q) + 1;
		boolean[] sieve = new boolean[q];
		Link o = new Link();
		o.value = 2;
		FastLL ll = new FastLL();
		ll.head = o;
		ll.ass = o;
		ll.length = 1;
		for(int i = 2; i < l; i++){
			if(sieve[i] == false){
				Link m = new Link();
				m.value = i;
				ll.add(m);
				for(int j = (int)(Math.pow(i,2)); j <= q; j += i){
					sieve[j - 1] = true;
				}
			}
		}
		ll.pop();
		if(sieve[q - 1] == false){
			System.out.println("yes");
			return;
		}
		System.out.println("here");
		Function(ll, q);
	}

	private static void Function(FastLL ll, int q){
		int p, n, t;
		while(ll.length > 0){
			p = ll.pop();
			n = 2;
			if(q % p == 0){
				while((t = (int)Math.pow(p,n)) <= q){
					if(t == q){
						System.out.println("yes");
						return;
					}
					n++;
				}
			}
		}
		System.out.println("no");
	}
}