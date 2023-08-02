package com.pn2;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = pn2.MODID, name = pn2.NAME, version = pn2.VERSION, dependencies = "required-after:llibrary@[1.7.20")
public class pn2 {
    public static final String MODID = "pn2";
    public static final String NAME = "pn2";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public
    void preInit ( FMLPreInitializationEvent event ) {
        logger = event.getModLog ( );
    }

    @EventHandler
    public
    void init ( FMLInitializationEvent event ) {
        // some example code
        logger.info ( "DIRT BLOCK >> {}" , Blocks.DIRT.getRegistryName ( ) );
    }
}
