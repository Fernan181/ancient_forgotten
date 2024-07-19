package net.flatkat.ancient_forgotten.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flatkat.ancient_forgotten.AncientAndForgotten;
import net.flatkat.ancient_forgotten.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANCIENT_FORGOTTEN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AncientAndForgotten.MOD_ID, "ancient_forgotten"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ancient_forgotten"))
                    .icon(() -> new ItemStack(ModBlocks.ROSE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ROSE);
                    }).build());


    public static void registerItemGroups(){
        AncientAndForgotten.LOGGER.info("Registering Item Groups for " + AncientAndForgotten.MOD_ID);
    }
}
