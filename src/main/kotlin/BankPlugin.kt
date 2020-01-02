package org.irvinebubble.banks

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class BankPlugin : JavaPlugin() {
    override fun onEnable() {
        log("Enabling Banks...")
        //Bukkit.getServer().pluginManager.registerEvents(JoinListener(), this)
    }

    override fun onDisable() {
        log("Disabling Banks...")
    }

    private fun log(message: String) {
        logger.info("$message")
    }
}