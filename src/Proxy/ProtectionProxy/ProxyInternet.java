package Proxy.ProtectionProxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	
	RealInternet realinternet = new RealInternet();
	List<String> bannedSites;
	
	public ProxyInternet() {
		bannedSites = new ArrayList<>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ghi.com");
		bannedSites.add("jkl.com");
	}
	@Override
	public void connectTo(String site) throws BannedsiteException {

		if(bannedSites.contains(site))
			throw new BannedsiteException("Access denied");
		realinternet.connectTo(site);
	}

}
