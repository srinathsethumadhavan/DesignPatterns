package Proxy.ProtectionProxy;

public class Client {

	public static void main(String[] args) throws BannedsiteException {
		
		Internet proxyInternet = new ProxyInternet();
		try {
			proxyInternet.connectTo("fds.com");
			proxyInternet.connectTo("abc.com");
			
		}catch(BannedsiteException b) {
			System.out.println(b);
		}
		
		
		
	}
}
