package scansPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * @author Aviel
 */
@SuppressWarnings("serial")
public class scans extends ArrayList<scan> {
	scan scan;
	public scans() {
		this.scan = new scan();
	} 
	/**
	 * creates scans from path
	 * @param path
	 * @return all csv lines 
	 * @throws IOException
	 */
	public static scans createDs(String path) throws IOException {
		scans csvLines = new scans();
//		int j =0;
		File folder = new File(path);//take folder
		File[] listOfFiles = folder.listFiles();{//create array of files in this folder
			for (int i = 0; i < listOfFiles.length; i++) {//Iterate the files
				File file = listOfFiles[i];//insert to the array
				if (file.isFile() && file.getName().endsWith(".csv")) {//take the csv file 
					FileReader in = new FileReader(listOfFiles[i]);
					BufferedReader br = new BufferedReader(in);
					br.readLine();
					String data;
					while ((data=br.readLine())!= null) {
						scan line = new scan(data);
						line.name = file.getName();
						csvLines.add(line);//adding lines 
//						j++;
					}
					in.close();
				}
			}
		}
		return csvLines;
	}
}