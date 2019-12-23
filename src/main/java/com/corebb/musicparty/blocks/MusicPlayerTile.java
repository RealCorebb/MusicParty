package com.corebb.musicparty.blocks;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import com.corebb.musicparty.player.PlayerDispatcher;

import javax.annotation.Nullable;

import static com.corebb.musicparty.blocks.ModBlocks.musicplayer_tile;


public class MusicPlayerTile extends TileEntity implements ITickableTileEntity , INamedContainerProvider {
    public static String decoder="mp3";
    public static String streamurl=null;
    public static boolean play_mark=false;
    public PlayerDispatcher player = null;
    public MusicPlayerTile() {
        super(musicplayer_tile);
    }
    @Override
    public void tick() {
        if (world.isRemote) {
            return;
        }
        if(play_mark){
            System.out.println("Play NOW");
            play_mark=false;
            startstream();
        }
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent(getType().getRegistryName().getPath());
    }

    @Nullable
    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new MusicPlayerContainer(i, world, pos, playerInventory, playerEntity);
    }

    public void startstream(){
        player = new PlayerDispatcher(decoder, streamurl, this.world, pos.getX(), pos.getY(), pos.getZ());
    }
    public static void play(String play_decoder,String play_streamurl){
        decoder=play_decoder;
        streamurl=play_streamurl;
        play_mark=true;
    }
}
