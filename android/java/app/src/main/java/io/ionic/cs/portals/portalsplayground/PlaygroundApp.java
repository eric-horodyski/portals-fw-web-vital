package io.ionic.cs.portals.portalsplayground;

import android.app.Application;

import io.ionic.portals.PortalManager;

public class PlaygroundApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PortalManager.register(getString(R.string.portals_api_key));

        
        PortalManager.newPortal("portal_angular").setStartDir("portals/angular").create();
        PortalManager.newPortal("portal_react").setStartDir("portals/react").create();
        PortalManager.newPortal("portal_vue").setStartDir("portals/vue").create();
    }
}
