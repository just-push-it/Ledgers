package us.alitz.Ledgers.api;

import java.util.HashMap;

public interface Settings {
	public String getSettingValue(int settingID);
	
	public String getSettingDescription(int settingID);
	
	public String getSettingName(int settingID);
	
	public HashMap<Integer, String> getSettingList();
}
