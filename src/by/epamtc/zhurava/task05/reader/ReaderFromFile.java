package by.epamtc.zhurava.task05.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFile implements Reader{
	
	public String readFromFile() throws IOException {

		StringBuilder sb = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(
				new FileReader("source\\database.txt"))) {

			String line = reader.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = reader.readLine();
			}
		}

		return sb.toString();
	}


}
