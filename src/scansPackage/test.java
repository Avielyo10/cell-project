package scansPackage;

import java.io.IOException;

import writing.toCsv;

public class test {

	public static void main(String[] args) throws IOException {
		scans testing = scans.createDs("C:\\Users\\Aviel\\eclipse-workspace\\cellProject\\data");
		toCsv.writeToCsv(testing);
	}

}
