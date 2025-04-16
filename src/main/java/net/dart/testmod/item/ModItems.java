package net.dart.testmod.item;

import net.dart.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final  Item FUNNY_ITEM = registerItem("funny_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID , name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering mod items for " + TestMod.MOD_ID);
    }
}
