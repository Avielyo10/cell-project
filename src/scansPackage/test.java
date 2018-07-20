package scansPackage;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		scans testing = scans.createDs("C:\\Users\\Aviel\\eclipse-workspace\\cellProject\\data");
//		for (int i = 0; i < testing.size(); i++) {
//			System.out.println(testing[i]);
//		}
		System.out.println(testing.toString());
	}

}
