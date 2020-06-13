package ru.buseso.dreamtime.helpme;

import net.md_5.bungee.api.plugin.Plugin;

public final class HelpMe extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new HelpCmd("help"));
    }
}
