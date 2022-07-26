package net.sRt0rt1t4.new_ores_plus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sRt0rt1t4.new_ores_plus.newOresMod;

public class ModItems {

    public static final Item RAW_ADAMANTIUM = registerItem("raw_adamantium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ADAMANTIUM = registerItem("adamantium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    //Methods for item creation.
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(newOresMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        newOresMod.LOGGER.debug("Registering Mod Items for " + newOresMod.MOD_ID);

    }
}
