package com.rexi.rexbread.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static final CreativeModeTab BREB_TAB = new CreativeModeTab("brebtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DOUGH.get());
        }
    };
}
