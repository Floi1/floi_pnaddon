//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pn2;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public interface IProxypnaddon2 {
    void preInit(FMLPreInitializationEvent var1);

    void init(FMLInitializationEvent var1);

    void postInit(FMLPostInitializationEvent var1);

    void serverLoad(FMLServerStartingEvent var1);
}
