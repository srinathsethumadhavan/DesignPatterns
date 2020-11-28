package Proxy.ProtectionProxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String string) throws BannedsiteException {
		
		System.out.println("connecting to"+ string +".....");
		
	}

}
