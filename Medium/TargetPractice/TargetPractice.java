public class TargetPractice{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int p, count = 1, x1 = 0, y1 = 0, x2, y2;
		double m1 = 0, m2;
		boolean cont = true;
		if(n < 5){
			io.println("success");
			io.flush();
		}
		int[][] point = new int[n][2];
		for(int i = 0; i < n; i++){
			point[i][0] = io.getInt();
			point[i][1] = io.getInt();
		}
		a: for(int i = 0; i < n; i++){
			x1 = point[i][0];
			y1 = point[i][1];
			for(int j = i + 1; j < n; j++){
				if(x1 - point[j][0] == 0){
					count = 1;
					p = 0;
					while(count < 3 && p < n){
						if(p != i && (y1 - point[p][1] == 0)){
							count++;
						}
						p++;
					}
					if(count > 3)break a;	
				}else{
					m1 = (y1 - point[j][1])/(x1 - point[j][0]);
					count = 1;
					p = 0;
					while(count < 3 && p < n){
						if(p != i && (y1 - point[p][1] == m1 * (x1 - point[p][0]))){
							count++;
						}
						p++;
					}
				}
				if(count > 3)break a;
			}
		}
		if(count < 3){
			System.out.println("failure");
			return;
		}
		a: for(int i = 0; i < n; i++){
			cont = true;
			if(y1 != point[i][1] || x1 != point[i][0]){
				x2 = point[i][0];
				y2 = point[i][1];
				b: for(int j = i + 1; j < n; j++){
					if(y1 - point[j][1] != m1 * (x1 - point[j][0])){
						if(x2 - point[j][0] == 0){
							p = 0;
							while(p < n){
								if(p != i && p != j && (y2 - point[p][1] != 0)){
									cont = false;
									break b;
								}
								p++;
							}	
						}else{
							m2 = (y2 - point[j][1])/(x2 - point[j][0]);
							p = 0;
							while(p < n){
								if(p != i && p != j && (y2 - point[p][1] != m2 * (x2 - point[p][0]))){
									cont = false;
									break b;
								}
								p++;
							}
						}
					}
				}
			}
			if(cont){
				break a;
			}
		}
		if(cont){
			io.println("success");
			io.flush();
		}
	}
}