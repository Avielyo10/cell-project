package writing;

import java.io.File;
import java.io.IOException;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import scansPackage.scans;

/**
 * writing wifi scans to kml
 * @author Aviel
 *
 */
public class toKml {
	/**
	 * take the DS of final top ten csv and creates kml file
	 * @param dataLists
	 * @throws IOException
	 */
	public static void writeToKml(scans dataLists) throws IOException {
		String fileName = "out";
		fileName+=".kml";
		final Kml kml = new Kml();
		Document doc = kml.createAndSetDocument().withName("cell scans");
		for (int i = 0; i < dataLists.size(); i++) {
			String name = dataLists.get(i).getUserId();
			name = name.substring(1, name.length()-1);
			Placemark placemark = doc.createAndAddPlacemark().withName(name.replaceAll("&", "&amp;"));
			placemark.createAndSetPoint()
			.addToCoordinates(Double.parseDouble(dataLists.get(i).getGps_longitude()), Double.parseDouble(dataLists.get(i).getGps_latitude()));
			placemark.createAndSetTimeStamp().withWhen(dataLists.get(i).getStartTime());
		}
		kml.marshal(new File(fileName));
	}
}
