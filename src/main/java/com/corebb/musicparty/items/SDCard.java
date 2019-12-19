package com.corebb.musicparty.items;

import com.corebb.musicparty.MusicParty;
import net.minecraft.item.Item;

public class SDCard extends Item {
    public SDCard(){
        super(new Item.Properties()
                .maxStackSize(1)
                .group(MusicParty.setup.itemGroup));
        setRegistryName("sdcard");
    }
}
