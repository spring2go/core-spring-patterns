package io.spring2go.corespring.display;

// VGA×ªHDMIÊÊÅäÆ÷
public class Vga2HdmiAdapter implements IHdmi {

	private IVga vgaDisplay;
	
	public Vga2HdmiAdapter(IVga vgaDisplay) {
		this.vgaDisplay = vgaDisplay;
	}
	
	public void openHdmi() {
		// ÊÊÅäÂß¼­
		this.vgaDisplay.openVga();
		System.out.println("Opening HDMI device");
	}

}
