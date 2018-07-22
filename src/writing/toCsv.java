package writing;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.opencsv.CSVWriter;

import scansPackage.scan;
import scansPackage.scans;


/**
 * writing scans to csv
 * @author Aviel
 *
 */
public class toCsv {
	/** write csv file from wifi scans
	 * @param finalCsv
	 * @param fileName
	 * @throws IOException
	 */
	@SuppressWarnings("null")
	public static void writeToCsv(scans finalScans) throws IOException {
		ArrayList<scan> finalCsv = finalScans;
		String fileName = "out";
		fileName+=".csv";
		@SuppressWarnings("deprecation")
		CSVWriter writer = new CSVWriter(new FileWriter(fileName), ',');//writing finished csv
		for (int i = 0; i < finalCsv.size(); i++) {
			String[] str=finalCsv.get(i).toString().split(",");
			String temp1=str[0];
			String temp2=str[str.length-1];
			str[0]=temp1.substring(1);
			str[str.length-1]=temp2.substring(0,str[str.length-1].length()-1);
			for (int j = 0; j < str.length; j++) {
				if(str[j].contains("\"")) {
					str[j] = str[j].substring(1, str[j].length()-1);
					if(str[j].contains("\"")) {
						str[j] = str[j].substring(1);
					}
				}
			}
			writer.writeNext(str);
		}
		writer.close();
	}
}
