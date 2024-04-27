package ch.ksrminecraft.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
