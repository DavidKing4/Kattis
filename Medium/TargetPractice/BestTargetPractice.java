public class BestTargetPractice{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt(), count, notOn = 0;
		boolean skip = true, notOnBool = false;
		if(n < 5){
			io.println("success");
			io.flush();
			return;
		}
		int p;
		int[][] targets = new int[n][2];
		for(int i = 0; i < 4; i++){
			targets[i][0] = io.getInt();
			targets[i][1] = io.getInt();
		}

		Line[] l = new Line[6];
		Line t1 = new Line(targets[0][0], targets[0][1], targets[1][0], targets[1][1]); //0 1
		l[0] = t1;
		Line t2 = new Line(targets[0][0], targets[0][1], targets[2][0], targets[2][1]); //0 2
		l[1] = t2;
		Line t3 = new Line(targets[0][0], targets[0][1], targets[3][0], targets[3][1]); //0 3
		l[2] = t3;
		Line t4 = new Line(targets[1][0], targets[1][1], targets[2][0], targets[2][1]); //1 2
		l[5] = t4;
		Line t5 = new Line(targets[1][0], targets[1][1], targets[3][0], targets[3][1]); //1 3
		l[4] = t5;
		Line t6 = new Line(targets[2][0], targets[2][1], targets[3][0], targets[3][1]); //2 3
		l[3] = t6;

		Line[] lineArray = new Line[2];

		a: for(int i = 0; i < 6; i++){ //checks if any lines are the same;
			count = 0;
			for(int j = 0; j < 4; j++){
				if(l[i].on(targets[j][0], targets[j][1])){
					count++;
					if(count >= 3){
						lineArray[0] = l[i];
						if(j == 2){
							if(!(l[i].on(targets[j + 1][0], targets[j + 1][1]))){
								notOnBool = true;
								notOn = 3;
							}
						}
						skip = false;
						break a;
					}
				}else{
					notOn = j;
				}
			}
		}

		int k;

		if(!skip){
			for(k = 4; k < n; k++){
				targets[k][0] = io.getInt();
				targets[k][1] = io.getInt();
				if(!(lineArray[0].on(targets[k][0], targets[k][1]))){
					if(!notOnBool){
						notOnBool = true;
						notOn = k;
					}else{
						Line t = new Line(targets[notOn][0], targets[notOn][1], targets[k][0], targets[k][1]);
						lineArray[1] = t;
						k++;
						break;
					}
				}
			}
		}else{
			targets[4][0] = io.getInt();
			targets[4][1] = io.getInt();
			k = 5;
			a: while(true){
				for(int i = 0; i < 6; i++){
					if(l[i].on(targets[4][0], targets[4][1])){
						lineArray[0] = l[i];
						lineArray[1] = l[(i + 3) % 6];
						break a;
					}
				}
				io.println("failure");
				io.flush();
				return;
			}
		}

		for(k = k; k < n; k++){
			targets[k][0] = io.getInt();
			targets[k][1] = io.getInt();
			if(!(lineArray[0].on(targets[k][0], targets[k][1]) || lineArray[1].on(targets[k][0], targets[k][1]))){
				io.println("failure");
				io.flush();
				return;
			}
		}
		io.println("success");
		io.flush();

	} 
}
