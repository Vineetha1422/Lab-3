package day7.task3;

public class CountTextDetails {
    public static void main(String[] args) {
		String input = "Java StringBuffer class is used to create mutable (modifiable) string.\n The StringBuffer class in java is same as String class except it is mutable\r i.e. it can be changed.";
		//Character count
		int charcount = input.length();
		System.out.println("Number of Characters : " + charcount);
		//Lines count
		String lines[] = input.split("\n|\r");
		System.out.println("Number of lines : " + lines.length);
		//Words Count
		String words[] = input.split("\\s");
		System.out.println("Number of words : " + words.length);
	}
}
