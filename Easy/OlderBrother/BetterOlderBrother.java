import java.lang.Math; 

public class BetterOlderBrother{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int q = io.getInt();
		if(q == 1){
			System.out.println("no");
			return;
		}
		int p = 2;
		int l = (int)Math.sqrt(q) + 1;
		p = Elephant(l, q);
		if(p < 0){
			System.out.println("no");
			return;
		} 	
		int m = (int)Math.sqrt(p) + 1;
		for(int i = 2; i < m; i++){
			if(p % i == 0){
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
	public static int Elephant(int l, int q){
		for(int i = 2; i <= l; i++){
			if(q % i == 0){
				if(NonRecursiveCheck(i, q)){
					return i;
				}else{
					return - 1;
				}
			}
		}
		return q;
	}

	public static boolean NonRecursiveCheck(double i, double q){
		while(q % i == 0){
			if(q/i == 1){
				return true;
			}
			q /= i;
		}
		return false;
	}
}
