package scansPackage;
import java.util.ArrayList;

public class scan {
	private ArrayList<String> scan;
	String userId;
	String deviceId;
	String startTime;
	String endTime;
	String uploadTime;
	String qmVersion;
	String androidVersion;
	String tx_data_cell_total_sum;
	String tx_voice_total_sum;
	String tx_data_cell_total_sec;
	String tx_voice_total_sec;
	String rx_data_cell_total_sum;
	String rx_data_cell_total_sec;
	String gps_latitude;
	String gps_longitude;
	String _id;
	public scan() {
		this.setScan(new ArrayList<String>());
	}
	public scan(String data){
		String splData[] = data.split(",");
		userId = splData[0];
		deviceId = splData[1];
		startTime = splData[2];
		endTime = splData[3];
		uploadTime = splData[4];
		qmVersion = splData[5];
		androidVersion = splData[6];
		tx_data_cell_total_sum = splData[12];
		tx_voice_total_sum = splData[20];
		tx_data_cell_total_sec = splData[27];
		tx_voice_total_sec = splData[35];
		rx_data_cell_total_sum = splData[42];
		rx_data_cell_total_sec = splData[50];
		gps_latitude = splData[70];
		gps_longitude = splData[71];
		_id = splData[72];
		ArrayList<String> _data = new ArrayList<String>();
		_data.add(userId);
		_data.add(deviceId);
		_data.add(startTime);
		_data.add(endTime);
		_data.add(uploadTime);
		_data.add(qmVersion);
		_data.add(androidVersion);
		_data.add(tx_data_cell_total_sum);
		_data.add(tx_voice_total_sum);
		_data.add(tx_data_cell_total_sec);
		_data.add(tx_voice_total_sec);
		_data.add(rx_data_cell_total_sum);
		_data.add(rx_data_cell_total_sec);
		_data.add(gps_latitude);
		_data.add(gps_longitude);
		_data.add(_id);
		this.setScan(_data);
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	public String getQmVersion() {
		return qmVersion;
	}
	public void setQmVersion(String qmVersion) {
		this.qmVersion = qmVersion;
	}
	public String getAndroidVersion() {
		return androidVersion;
	}
	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}
	public String getTx_data_cell_total_sum() {
		return tx_data_cell_total_sum;
	}
	public void setTx_data_cell_total_sum(String tx_data_cell_total_sum) {
		this.tx_data_cell_total_sum = tx_data_cell_total_sum;
	}
	public String getTx_voice_total_sum() {
		return tx_voice_total_sum;
	}
	public void setTx_voice_total_sum(String tx_voice_total_sum) {
		this.tx_voice_total_sum = tx_voice_total_sum;
	}
	public String getTx_data_cell_total_sec() {
		return tx_data_cell_total_sec;
	}
	public void setTx_data_cell_total_sec(String tx_data_cell_total_sec) {
		this.tx_data_cell_total_sec = tx_data_cell_total_sec;
	}
	public String getTx_voice_total_sec() {
		return tx_voice_total_sec;
	}
	public void setTx_voice_total_sec(String tx_voice_total_sec) {
		this.tx_voice_total_sec = tx_voice_total_sec;
	}
	public String getRx_data_cell_total_sum() {
		return rx_data_cell_total_sum;
	}
	public void setRx_data_cell_total_sum(String rx_data_cell_total_sum) {
		this.rx_data_cell_total_sum = rx_data_cell_total_sum;
	}
	public String getRx_data_cell_total_sec() {
		return rx_data_cell_total_sec;
	}
	public void setRx_data_cell_total_sec(String rx_data_cell_total_sec) {
		this.rx_data_cell_total_sec = rx_data_cell_total_sec;
	}
	public String getGps_latitude() {
		return gps_latitude;
	}
	public void setGps_latitude(String gps_latitude) {
		this.gps_latitude = gps_latitude;
	}
	public String getGps_longitude() {
		return gps_longitude;
	}
	public void setGps_longitude(String gps_longitude) {
		this.gps_longitude = gps_longitude;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	@Override
	public String toString() {
		return getScan().toString();
	}
	public ArrayList<String> getScan() {
		return scan;
	}
	public void setScan(ArrayList<String> scan) {
		this.scan = scan;
	}
}
