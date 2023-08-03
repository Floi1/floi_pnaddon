//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pn2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(
        modid = "pn2",
        name = "pn2",
        version = "1.0",
        dependencies = "required-after:llibrary@[1.7.20,)"
)
public class PN2addon {
    public static final String MODID = "PN2addon";
    public static final String NAME = "PN2addon";
    public static final String VERSION = "PN2addon";
    public static final SimpleNetworkWrapper PACKET_HANDLER = null;
    @SidedProxy (
            clientSide = "net.lepidodendron.ClientProxyLepidodendronMod",
            serverSide = "net.lepidodendron.ServerProxyLepidodendronMod"
    )
    public static IProxypnaddon2 proxy;
    @Instance ( "lepidodendron" )
    public static PN2addon instance;
    public Elementspnaddon elements = new Elementspnaddon ( );
}
