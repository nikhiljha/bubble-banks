package org.irvinebubble.banks

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

class BankPlugin : JavaPlugin() {
    override fun onEnable() {
        log("Enabling Banks...")
        getCommand("bank")!!.setExecutor(HelpCommand())
        log("Banks enabled successfully.")
    }

    override fun onDisable() {
        log("Disabling Banks...")
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return super.onCommand(sender, command, label, args)
    }

    private fun log(message: String) {
        logger.info(message)
    }
}