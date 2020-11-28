package Proxy.VirtualProxy;

public class ProxyImage implements Image {

	Image image;
	private String img;
	protected ProxyImage(String img) {
		super();
		this.img = img;
	}
	@Override
	public void display() {
		if(image==null)
			image = new RealImage(img);
		
			image.display();
		
	}
	
	
}
