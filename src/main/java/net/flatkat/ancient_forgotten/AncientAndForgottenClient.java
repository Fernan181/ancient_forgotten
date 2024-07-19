package net.flatkat.ancient_forgotten;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.flatkat.ancient_forgotten.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class AncientAndForgottenClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ROSE, RenderLayer.getCutout());

    }
}
