import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.*;

/*
 * Write a program to read a file and find the number of occurrence of the word "Bangalore" 
 * and every time Bangalore appears move to new line and write the new contain to a new file.
*/
class FileReadWrite {
	public static void main(String[] args) {
		Path path = Paths.get("/Users/vikabber/Java-Programs/myTestFile.txt");
		String[] lines = new String[7];
		try (BufferedReader reader = Files.newBufferedReader(path);) {
			String line = reader.readLine();
			String searchString = "Bangalore";
			int count = 0;

			int lineCount = 0;
			while (line != null) {

				String new_line = line + "\n";

				if (line.contains(searchString)) {
					count = count + 1;
					int at = line.indexOf(searchString);
					new_line = line.substring(0, at) + "\n" + line.substring(at);

				}
				lines[lineCount] = new_line;
				lineCount = lineCount + 1;
				line = reader.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// file write
		Path wrpath = Paths.get("/Users/vikabber/Java-Programs/writeFile.txt");

		for (String line : lines) {
			System.out.println("Line = " + line);
			try (var fw = new FileWriter(wrpath.toString(), true)) {
				fw.append(line);

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}
}

/* INPUT : 
 * Conclusion of Essay on Bangalore All in all, Bangalore is a beautiful city with the right balance of traditional and modern culture. Everyone must give this city 
a visit at least once in their life and see for themselves the excellence of the city bustling with youth and vigour. FAQ of Essay on Bangalore Question 1: What 
Bangalore is famous for? Answer 1: Bangalore is famous for being the Silicon Valley of India. This capital city of Karnataka is a renowned IT hub and is home 
to some of the world’s major IT corporations which operate out of the city. Moreover, Bangalore is also the hub to many start-ups and Indian tech companies. 
Question 2: Why is the Bangalore climate good? Answer 2: Since Bangalore is at the centre of the peninsula and is not too far off from the coasts on both 
sides, it benefits from both the monsoons. The city stands at a height of about 900mts or 3000ft from sea level. As a result, the higher the altitude, the colder 
it tends to get.
*/

/* OUTPUT :
 
Conclusion of Essay on 
Bangalore All in all, Bangalore is a beautiful city with the right balance of traditional and modern culture. Everyone must give this city a visit at least once in their life and see for themselves the excellence of the city bustling with youth and vigour. FAQ of Essay on 
Bangalore Question 1: What 
Bangalore is famous for? Answer 1: Bangalore is famous for being the Silicon Valley of India. This capital city of Karnataka is a renowned IT hub and is home to some of the world’s major IT corporations which operate out of the city. Moreover, 
Bangalore is also the hub to many start-ups and Indian tech companies. Question 2: Why is the 
Bangalore climate good? Answer 2: Since Bangalore is at the centre of the peninsula and is not too far off from the coasts on both sides, it benefits from both the monsoons. The city stands at a height of about 900mts or 3000ft from sea level. As a result, the higher the altitude, the colder 
it tends to get.

*/
