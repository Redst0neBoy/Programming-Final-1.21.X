package net.redst0ne.programmingfinal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.redst0ne.programmingfinal.ProgrammingFinal;
import net.redst0ne.programmingfinal.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PROGRAMMING_FINAL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ProgrammingFinal.MOD_ID, "programming_final_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PREPARED_ENDSTONE))
                    .displayName(Text.translatable("itemgroup.programming-final.programming_final_items"))
                    .entries((displayContext, entries) ->{
                        entries.add(ModItems.BLUE);
                        entries.add(ModItems.BLUE_APPLE);
                        entries.add(ModItems.BLUESTONE_DUST);
                        entries.add(ModItems.PREPARED_ENDSTONE);
                        entries.add(ModBlocks.MOONSTONE);
                        entries.add(ModBlocks.BLUESTONE_ORE);
                    }).build());




    public static void registerItemGroups() {
        ProgrammingFinal.LOGGER.info("Registering Item Groups for" + ProgrammingFinal.MOD_ID);
    }
}
