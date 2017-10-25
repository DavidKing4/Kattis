import java.util.Scanner;

public class TwoZeroFourEight{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[][] gameState = new int[4][4];
		for(int j = 0; j < 4; j++){
			for(int i = 0; i < 4; i++){
				gameState[i][j] = s.nextInt();
			}
		}
		int direction = s.nextInt(), n, p;

		if(direction == 1){
			gameState = Rotate(gameState);
		}else if(direction == 2){
			gameState = Rotate(Rotate(gameState));
		}else if(direction == 3){
			gameState = Rotate(Rotate(Rotate(gameState)));
		}

		for(int j = 0; j < 4; j++){
			n = 0;
			for(int i = 1; i < 4; i++){
				if(gameState[i][j] != 0){
					for(int k = i - 1; k >= n; k--){
						if(gameState[i][j] == gameState[k][j]){
							gameState[k][j] *= 2;
							gameState[i][j] = 0;
							n = k + 1;
						}else if(gameState[k][j] != 0){
							break;
						}
					}
				}
			}
			for(int i = 0; i < 3; i++){
				if(gameState[i][j] == 0 && gameState[i + 1][j] != 0){
					p = i;
					while(p >= 0 && gameState[p][j] == 0){
						gameState[p][j] = gameState[p + 1][j];
						gameState[p + 1][j] = 0;
						p--;
					}
				}
			}
		}

		if(direction == 1){
			gameState = Rotate(Rotate(Rotate(gameState)));
		}else if(direction == 2){
			gameState = Rotate(Rotate(gameState));
		}else if(direction == 3){
			gameState = Rotate(gameState);
		}

		for(int j = 0; j < 4; j++){
			for(int i = 0; i < 4; i++){
				System.out.print(gameState[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static int[][] Rotate(int[][] gameState){
		int[][] temp = new int[4][4];
		for(int j = 0; j < 4; j++){
			for(int i = 0; i < 4; i++){
				temp[i][j] = gameState[3 - j][i];
			}
		}
		return temp;
	}
}