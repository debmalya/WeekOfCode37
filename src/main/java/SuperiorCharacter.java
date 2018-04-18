import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SuperiorCharacter {

	static long maximumSuperiorCharacters(int[] freq) {
		long r = 0L;

		int typeOfLetters = 0;
		int totalNumberOfCharacters = 0;

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				typeOfLetters++;
				totalNumberOfCharacters += freq[i];
			}
		}

		if (typeOfLetters > 2) {

		}

		return r;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int[] freq = new int[26];

			String[] freqItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int freqItr = 0; freqItr < 26; freqItr++) {
				int freqItem = Integer.parseInt(freqItems[freqItr]);
				freq[freqItr] = freqItem;
			}

			long result = maximumSuperiorCharacters(freq);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}

}
