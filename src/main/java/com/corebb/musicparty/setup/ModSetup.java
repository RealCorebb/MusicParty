package com.corebb.musicparty.setup;

import com.corebb.musicparty.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public ItemGroup itemGroup = new ItemGroup("musicparty") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.MusicPlayer);
        }
    };
    public void init(){

    }
}
