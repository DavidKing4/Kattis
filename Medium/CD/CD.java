import java.util.*;

public class CD{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int nJack, nJill, count, p1, p2, t, n1, n2;
		a: while(true){
			nJack = s.nextInt();
			nJill = s.nextInt();
			count = 0;
			if(nJack == 0 && nJill == 0)
				break a;
			if(nJack != 0 && nJill != 0){
				int[] jack = new int[nJack];
				int[] jill = new int[nJill];
				n1 = 2^((int)((Math.log(nJack/4)/Math.log(2))));
				n2 = 2^((int)((Math.log(nJill/4)/Math.log(2))));
				for(int i = 0; i < nJack; i++){
					jack[i] = s.nextInt();
				}
				for(int i = 0; i < nJill; i++){
					jill[i] = s.nextInt();
				}
				p1 = 0; p2 = 0;

				while(p1 < nJack - 1 && p2 < nJill - 1){
					if(jack[p1] > jill[p2]){
						
						if((t = (Arrays.binarySearch(jill, p2, ((int)((nJill - 1)/ n1) + p2), jack[p1]))) >= 0){
							p2 = t;
							System.out.println(p2);
							count++;
						}else{
							for(int i = n1/2; i > 2; i/=2){
								if((t = (Arrays.binarySearch(jill, ((int)((nJill - 1)/i) + p2), ((int)((nJill - 1)/(i/2)) + p2), jack[p1]))) >= 0){
									p2 = t;
									System.out.println(p2);
									count++;
								}
							}
						}
						p1++;
					}else if(jack[p1] < jill[p2]){
						if((t = (Arrays.binarySearch(jack, p1, ((int)((nJack - 1)/2) + p1), jill[p2]))) >= 0){
							p1 = t;
							System.out.println(p1);
							count++;
						}else{
							for(int i = n2/2; i > 2; i/=2){
								if(((t = (Arrays.binarySearch(jack, ((int)((nJack - 1)/i) + p1), ((int)((nJack - 1)/(i/2)) + p1), jill[p2]))) >= 0)){
									p1 = t;
									System.out.println(p1);
									count++;
								}
							}
						}
						p2++;
					}else if(jack[p1] == jill[p2]){
						count++;
						p1++;
						p2++;
					}
				}
			}
			System.out.println(count);
		}
	}
}