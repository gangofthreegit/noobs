package noobs.bis.constant;

public enum HotData {
	
	NORMAL_CLEAN("普通清扫", "blablabla"), FOREST_CLEAN("开荒清扫", "blablabla");
	
	private String description;
	
	private String name;
	
	private HotData(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}
	
}
