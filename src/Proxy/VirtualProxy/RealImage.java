package Proxy.VirtualProxy;

public class RealImage implements Image {

	private String img;
	public RealImage(String img) {
		this.img = img;
		loadImage(img);
	}
	private void loadImage(String img2) {
		System.out.println(img + "   loading from harddisk");
		
	}
	public void display() {
		
		System.out.println(this.img + "  is displayed");
	}
	

}
