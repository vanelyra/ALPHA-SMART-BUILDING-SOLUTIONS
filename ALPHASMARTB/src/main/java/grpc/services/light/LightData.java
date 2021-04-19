package grpc.services.light;

public class LightData {

	private String type, typeId;
	private boolean on;
	private int intensity;
	
	public LightData() {
		this.type="Lighs";
		this.on=true;
		this.typeId="Light ID";
		this.intensity=40;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String gettypeId() {
		return typeId;
	}

	public void settypeId(String typeId) {
		this.typeId = typeId;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	
}
