package net.flatkat.ancient_forgotten.loot;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.flatkat.ancient_forgotten.AncientAndForgotten;
import net.flatkat.ancient_forgotten.item.ModItems;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLoot {

    // TODO: Flatkat this is probs not the correct table, no idea what its called
    private static final Identifier SNIFFER_TABLE = new Identifier("minecraft:gameplay/sniffer_digging");

    private static final Identifier SNIFFER_PHASE = new Identifier(AncientAndForgotten.MOD_ID, "sniffer_phase");

    public static void init() {
        // Make sure this modification happens before other mods potentially add loot pools
        LootTableEvents.MODIFY.addPhaseOrdering(SNIFFER_PHASE, Event.DEFAULT_PHASE);
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(id.equals(SNIFFER_TABLE)) {
                tableBuilder.modifyPools(pool -> {
                    pool.with(ItemEntry.builder(ModItems.RUBY).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1))));
                });
            }
        });
    }


}
