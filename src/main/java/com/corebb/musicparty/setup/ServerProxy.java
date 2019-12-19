package com.corebb.musicparty.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld(){
        throw new IllegalStateException("not server now!");
    }
}
