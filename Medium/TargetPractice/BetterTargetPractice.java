public class BetterTargetPractice{
	public static void main(String[] args){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		if(n < 5){
			io.println("success");
			io.flush();
		}
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

		targets[4][0] = io.getInt();
		targets[4][1] = io.getInt();
		Line[] lineArray = new Line[2];

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

		for(int i = 5; i < n; i++){
			targets[i][0] = io.getInt();
			targets[i][1] = io.getInt();
			if(!(lineArray[0].on(targets[i][0], targets[i][1]) || lineArray[1].on(targets[i][0], targets[i][1]))){
				io.println("failure");
				io.flush();
				return;
			}
		}

		io.println("success");
		io.flush();
	}
}