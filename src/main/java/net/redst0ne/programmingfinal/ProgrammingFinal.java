package net.redst0ne.programmingfinal;

import net.fabricmc.api.ModInitializer;

import net.redst0ne.programmingfinal.block.ModBlocks;
import net.redst0ne.programmingfinal.item.ModItemGroups;
import net.redst0ne.programmingfinal.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// yo ts cool
public class ProgrammingFinal implements ModInitializer {
	public static final String MOD_ID = "programming-final";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}