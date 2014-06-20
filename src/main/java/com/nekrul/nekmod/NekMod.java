package com.nekrul.nekmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "nekmod", name = "NekMod", version = "1.7.2-1.0")
public class NekMod {

    @Mod.Instance("NekMod")
    public static NekMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
     public void postInit(FMLPostInitializationEvent event){

    }
}

