import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter some words: ");
		String sentence = scanner.nextLine();

		int wordCount = countWords(sentence);
		System.out.println("word count = " + wordCount);

		scanner.close();

	}

	public static int countWords(String sentence) {
		String[] words = sentence.split("\\s+");
		return words.length;
	}
}
