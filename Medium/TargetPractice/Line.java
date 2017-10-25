public class Line{
	public double x1; 
	public double y1;
	public double x2;
	public double y2;
	public boolean vertical;
	public boolean horizontal;

	Line(int x1, int y1 , int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		if(x2 - x1 == 0){
			this.vertical = true;
		}else if(y2 - y1 ==0){
			this.horizontal = true;
		}
	}

	public boolean on(int x, int y){

		if(this.vertical){
			if(this.x1 == x)
				return true;
			return false;
		}

		if(this.horizontal){
			if(this.y1 == y)
				return true;
			return false;
		}

		if((this.x2 - x) == 0 || (this.y2 - y) == 0){
			if((this.x2 - x) == 0 && (this.y2 - y) == 0)
				return true;
			return false;
		}

		if((this.x1 - x)/(this.x2 - x) == (this.y1 - y)/(this.y2 - y))
			return true;
		return false;
	}
}