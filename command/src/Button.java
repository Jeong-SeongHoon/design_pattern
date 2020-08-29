

public class Button {
	private OperatingSystem os;

	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}
	
	public void press() {
		os.exeInstallCmd();
	}
}
