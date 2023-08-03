package com.pn2;

import javax.annotation.Nullable;
import net.lepidodendron.block.BlockZirconGlass;
import net.lepidodendron.entity.render.RenderHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ClientProxypnaddon2 implements IProxypnaddon2 {
    public static KeyBinding keyB = new KeyBinding("key.lepidodendron.seetaxidermy", 68, "key.categories.misc");

    public ClientProxypnaddon2() {
    }

    public void init(FMLInitializationEvent event) {
        ClientRegistry.registerKeyBinding(keyB);
    }

    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain("lepidodendron");
        RenderHandler.RegisterEntityRenders();
    }

    public void postInit(FMLPostInitializationEvent event) {
        // Register Block Colors
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new IBlockColor() {
            @Override
            public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex) {
                if (worldIn != null && pos != null) {
                    return BiomeColorHelper.getGrassColorAtPos(worldIn, pos);
                }
                return -1;
            }
        }, BlockZirconGlass.block);
    }

    public void serverLoad(FMLServerStartingEvent event) {
    }
}
