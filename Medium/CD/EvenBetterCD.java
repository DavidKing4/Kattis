import java.util.*;

public class EvenBetterCD{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);;
		int nJack, nJill, count, p, n, t;
		nJack = io.getInt();
		nJill = io.getInt();
		a: while(nJack != 0 || nJill != 0){
			count = 0;
			p = 0;
			int[] jack = new int[nJack];
			for(int i = 0; i < nJack; i++){
				jack[i] = io.getInt();
			}
			int j;
				for(j = 0; j < nJill; j++){
					n = io.getInt();
					if(p >= nJack){
						break;
					}
					if(p < nJack - 1 && n > jack[p]){
						p++;
						while(p < nJack - 1 && n > jack[p]){
							p++;
						}
					}
					if(n == jack[p]){
						count++;
						p++;
					}
				// }
			}
			for(int i = j; i < nJill; i++)
				io.getInt();
			io.println(count);
			io.flush();
			nJack = io.getInt();
			nJill = io.getInt();
		}
	}
}
