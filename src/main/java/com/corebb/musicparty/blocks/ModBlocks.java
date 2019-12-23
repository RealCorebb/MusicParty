package com.corebb.musicparty.blocks;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;
public class ModBlocks {
    @ObjectHolder("musicparty:musicplayer")
    public static MusicPlayer MusicPlayer;

    @ObjectHolder("musicparty:musicplayer")
    public static TileEntityType<MusicPlayerTile> musicplayer_tile;

    @ObjectHolder("musicparty:musicplayer")
    public static ContainerType<MusicPlayerContainer> musicplayer_container;
}
