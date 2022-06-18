package me.exzork;

import emu.grasscutter.Grasscutter;
import me.exzork.commands.ApplyCommand;
import emu.grasscutter.plugin.Plugin;

public class GCEnkaCopy extends Plugin {
    @Override
    public void onEnable() {
        getHandle().registerCommand(new ApplyCommand());
    }
    public static GCEnkaCopy getInstance() {
        return (GCEnkaCopy) Grasscutter.getPluginManager().getPlugin("GCEnkaCopy");
    }
}
