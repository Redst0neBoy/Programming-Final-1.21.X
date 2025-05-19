package net.redst0ne.programmingfinal.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redst0ne.programmingfinal.ProgrammingFinal;

public class ModItems {

    public static final Item BLUE = registerItem("blue", new Item(new Item.Settings()));

    public static final Item BLUE_APPLE = registerItem("blue_apple", new Item(new Item.Settings()));

    public static final Item PREPARED_ENDSTONE = registerItem("prepared_endstone", new Item(new Item.Settings()));

    public static final Item BLUESTONE_DUST = registerItem("bluestone_dust", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ProgrammingFinal.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ProgrammingFinal.LOGGER.info("Registering Mod Items for " + ProgrammingFinal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLUE_APPLE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PREPARED_ENDSTONE);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLUESTONE_DUST);

        });
    }
}
