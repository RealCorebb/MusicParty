package com.corebb.musicparty.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.Properties;

public class MusicPlayer extends Block{
    public MusicPlayer(){
        super(Properties.create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(2.0f)
            .lightValue(14)
        );
        setRegistryName("musicplayer");
    }
}
