package dev.tom.cannoncore.commands;

import dev.splityosis.commandsystem.SYSCommand;
import dev.tom.cannoncore.commands.conditions.PlotEditCondition;
import dev.tom.cannoncore.items.Block36Item;
import dev.tom.cannoncore.objects.CannonPlayer;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class Block36Command extends CannonCoreCommand{


    private final String[] aliases;

    public Block36Command(String... aliases){
        super(aliases);
        this.aliases = aliases;
    }

    @Override
    public SYSCommand command() {
        return
        new SYSCommand(aliases)
                .executesPlayer((player, strings) -> {
                    CannonPlayer cannonPlayer = new CannonPlayer(player);
                    Block36Item block36Item = new Block36Item(player);
                    block36Item.giveItem();
                });
    }
}
