package scansPackage;

import java.io.IOException;

import writing.toCsv;
import writing.toKml;

public class test {

	public static void main(String[] args) throws IOException {
		scans testing = scans.createDs("C:\\Users\\Aviel\\eclipse-workspace\\cellProject\\data");
		toCsv.writeToCsv(testing);
		toKml.writeToKml(testing);
	}
}
