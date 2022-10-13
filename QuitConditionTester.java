package kr.ac.kookmin.debugDemo;

public class QuitConditionTester {

	public static void main(String[] args) throws IOException {
		BufferedReader bufReader =
				new BufferedReader(new InputStreamReader(System.in));
				StringBuffer s;
				StringBuffer quit = new StringBuffer("Quit");
				
				while (true) {
					System.out.println("Enter any string. To quit, type Quit");
					s = new StringBuffer(bufReader.readLine());
					if (s.equals(quit)) {
						System.out.println("Goodbye");
						System.exit(0);
					} else {
						System.out.println("You typed \"" + s + "\"!");
					}
				}
			}
}
