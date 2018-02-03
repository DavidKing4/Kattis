public class WordNumber{
	public String word;
	public int number;

	public WordNumber(String thisword, int thisnumber){
		word = thisword;
		number = thisnumber;
	}

	public int compareString(String s){
		return this.word.compareTo(s);
	}
}