package com.corebb.musicparty.setup;

import com.corebb.musicparty.blocks.ModBlocks;
import com.corebb.musicparty.blocks.MusicPlayerScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{
    @Override
    public void init() {
        ScreenManager.registerFactory(ModBlocks.musicplayer_container, MusicPlayerScreen::new);
    }

    @Override
    public World getClientWorld(){
        return Minecraft.getInstance().world;
    }
    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
