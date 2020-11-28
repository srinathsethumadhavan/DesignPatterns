package Proxy.VirtualProxy;

public class Client {

	public static void main(String[] args) {
		
Image proxyImage1 = new ProxyImage("sun.jpg");
proxyImage1.display();
proxyImage1.display();

Image proxyImage2 = new ProxyImage("star.jpg");
proxyImage2.display();
proxyImage2.display();
	}

}
