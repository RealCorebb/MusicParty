package com.corebb.musicparty.gui;

import com.corebb.musicparty.MusicParty;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

public class musicplayer_gui extends Screen {

    private static final int WIDTH = 179;
    private static final int HEIGHT = 68;
    private  TextFieldWidget streamurl;
    private ResourceLocation GUI = new ResourceLocation(MusicParty.MODID, "textures/gui/spawner_gui.png");


    public musicplayer_gui() {
        super(new StringTextComponent("Spawn something"));
    }

    @Override
    protected void init() {
        int relX = (this.width - WIDTH) / 2;
        int relY = (this.height - HEIGHT) / 2;
        streamurl = new TextFieldWidget(this.font,relX+10,relY+10,160,20,"");
        streamurl.setMaxStringLength(1000);
        this.children.add(streamurl);
        addButton(new Button(relX + 10, relY + 37, 160, 20, "Play", button ->{}));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private void spawn(String id) {
      //  Networking.INSTANCE.sendToServer(new PacketSpawn(id, minecraft.player.dimension, minecraft.player.getPosition()));
        minecraft.displayGuiScreen(null);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
       // GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - WIDTH) / 2;
        int relY = (this.height - HEIGHT) / 2;
        this.blit(relX, relY, 0, 0, WIDTH, HEIGHT);

        super.render(mouseX, mouseY, partialTicks);
        streamurl.render(mouseX,mouseY,partialTicks);
    }


    public static void open() {
        Minecraft.getInstance().displayGuiScreen(new musicplayer_gui());
    }
}
