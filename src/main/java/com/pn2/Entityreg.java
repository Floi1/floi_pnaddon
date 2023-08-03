package com.pn2;

import com.pn2.Entity.test;
import net.lepidodendron.LepidodendronMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entityreg {
    public
    Entityreg ( ) {
    }

    private static
    void registerEntity ( String name , Class < ? extends Entity > entity , int id , int range , int color1 , int color2 ) {
        EntityRegistry.registerModEntity ( new ResourceLocation ( "lepidodendron:" + name ) , entity , name , id , LepidodendronMod.instance , range , 1 , true , color1 , color2 );
    }

    private static
    void registerEntityNoEgg ( String name , Class < ? extends Entity > entity , int id , int range ) {
        EntityRegistry.registerModEntity ( new ResourceLocation ( "lepidodendron:" + name ) , entity , name , id , LepidodendronMod.instance , range , 1 , true );
    }

    public static
    void registerEntities ( ) {
        registerEntity ("prehistoric_flora_walliserops", test.class, 1, 48, -8896764, -10867366 );

    }
}