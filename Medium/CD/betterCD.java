import java.util.*;

public class BetterCD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int nJack, nJill, count, p1, p2, t;
		a: while(true){
			nJack = s.nextInt();
			nJill = s.nextInt();
			count = 0;
			if(nJack == 0 && nJill == 0)
				break a;
			int[] jack = new int[nJack];
			int[] jill = new int[nJill];
			for(int i = 0; i < nJack; i++){
				jack[i] = s.nextInt();
			}
			for(int i = 0; i < nJill; i++){
				jill[i] = s.nextInt();
			}
			if(nJack != 0 && nJill != 0){
				p1 = 0; p2 = 0;

				while(p1 < nJack && p2 < nJill){
					if(jack[p1] > jill[p2]){
						if((t = (Arrays.binarySearch(jill, p2, Math.min(p2 + 64, nJill - 1), jack[p1]))) >= 0){
							p2 = t;
							//System.out.println("p1 " + p1 + "p2 " + p2);
							count++;
						}else if((-1 * t) < nJill - 1){ //might break
							p2 = (-1 * t) - 1;
							//System.out.println("p2" + p2);
						}else{
							b: for(int i = 64; i < nJill - p2; i*=2){
								if((t = Arrays.binarySearch(jill, p2 + i, Math.min(p2 + 2*i, nJill - 1), jack[p1])) >= 0){
									p2 = t;
									count++;
									break b;
								}else if((-1 * t) < nJill){ //might break
									p2 = (-1 * t) - 1;
									break b;
								}
							}
							if(t == nJill - 1)
								p2 = nJill - 1;
						}
						p1++;
					}else if(jack[p1] < jill[p2]){
						if((t = (Arrays.binarySearch(jack, p1, Math.min(p1 + 64, nJack - 1), jill[p2]))) >= 0){
							p1 = t;
							count++;
						}else if((-1 * t) < nJack){ 
							p1 = (-1 * t) - 1;
							//System.out.println("p1" + p1);
						}else{
							b: for(int i = 64; i < nJack - p1; i*=2){
								if((t = Arrays.binarySearch(jack, p1 + i, Math.min(p1 + 2*i, nJack - 1), jill[p2])) >= 0){
									p1 = t;
									count++;
									break b;
								}else if((-1 * t) < nJack){ 
									p1 = (-1 * t) - 1;
									break b;
								}
							}
							if(t == nJack - 1)
								p1 = nJack - 1;
						}
						p2++;
					}else if(jack[p1] == jill[p2]){
						//System.out.println(p1 + " == " + p2);
						p1++;
						p2++;
						count++;
					}
				}
			}
			System.out.println(count);
		}	
	}
}