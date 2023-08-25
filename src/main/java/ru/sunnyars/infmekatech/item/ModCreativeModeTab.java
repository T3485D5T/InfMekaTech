package ru.sunnyars.infmekatech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab INFMEKATECH_TAB = new CreativeModeTab("infmekatech_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CIRCLE.get());
        }
    };

}
