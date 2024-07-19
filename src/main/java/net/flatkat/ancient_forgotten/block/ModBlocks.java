package net.flatkat.ancient_forgotten.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.flatkat.ancient_forgotten.AncientAndForgotten;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block UNKNOWN_BLOCK = registerBlock("unknown_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block ROSE = registerBlock("rose",
        new FlowerBlock(StatusEffects.SPEED, 5, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_ROSE = Registry.register(Registries.BLOCK, new Identifier(AncientAndForgotten.MOD_ID, "potted_rose"),
            new FlowerPotBlock(ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AncientAndForgotten.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AncientAndForgotten.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        AncientAndForgotten.LOGGER.info("Registering ModBlocks for " + AncientAndForgotten.MOD_ID);
    }
}
