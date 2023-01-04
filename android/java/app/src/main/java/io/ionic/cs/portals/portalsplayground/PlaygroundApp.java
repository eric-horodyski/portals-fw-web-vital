package io.ionic.cs.portals.portalsplayground;

import android.app.Application;

import io.ionic.portals.PortalManager;

public class PlaygroundApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PortalManager.register(getString(R.string.portals_api_key));

        String name = "playground";
        String startDir = "portals/playground";
        PortalManager.newPortal(name).setStartDir(startDir).create();
    }
}
