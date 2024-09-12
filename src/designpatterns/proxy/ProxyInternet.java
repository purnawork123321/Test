package designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    Internet realInternet =new RealInternet();

    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
        realInternet.connectTo(serverHost);
    }
}
