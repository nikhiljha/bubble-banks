package org.irvinebubble.banks

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class HelpCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        sender.sendMessage(
            arrayOf<String>(
                "=== Irvine Bubble Bank | Help ===",
                "I haven't made this command yet.",
                "But welcome anyways."
            )
        )
        return true
    }
}
