public class Person implements Comparable<Person>{
	public String name;
	public double classInt;

	public void setName(String name){
		this.name = name.substring(0, name.length() - 1);
	}

	public void getClass(String classString){
		String[] classArray = classString.split("-");
		double u = 1;
		double c = 1.111111111;
		for(int i = classArray.length - 1; i >= 0; i--){
			if(classArray[i].compareTo("upper") == 0){
				c += u;
			}else if(classArray[i].compareTo("lower") == 0){
				c -= u;
			}
			u /= 10;
		}
		this.classInt = c;
	}

	@Override
	public int compareTo(Person p){
		if(p.classInt == this.classInt){
			return (p.name.compareTo(this.name) > 0) ? -1 : 1;
		}
		return (p.classInt > this.classInt) ? 1 : -1;
	}
}