package ru.sunnyars.infmekatech.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.sunnyars.infmekatech.InfMekaTech;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfMekaTech.MOD_ID);


    public static final RegistryObject<Item> SQUARE = ITEMS.register("square",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INFMEKATECH_TAB)));
    public static final RegistryObject<Item> CIRCLE = ITEMS.register("circle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INFMEKATECH_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
