package DPSingleton;

public class DataManager {
    private static DataManager dataManager;
    private String ID;

    public static DataManager getInstance(String ID) {
        if (dataManager == null) {
            dataManager = new DataManager(ID);
        }
        return dataManager;
    }
    
    private DataManager(String ID){
        this.ID = ID;
    }

    public String getID() {
		return this.ID;
	}
}
