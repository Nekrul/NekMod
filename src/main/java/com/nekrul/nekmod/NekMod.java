package com.nekrul.nekmod;

import com.nekrul.nekmod.proxy.IProxy;
import com.nekrul.nekmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NekMod {

    @Mod.Instance(Reference.MOD_ID)
    public static NekMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.farmland), Blocks.dirt, Items.stone_hoe);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.command_block), "X X", " Y ", "X X", 'Y', Blocks.noteblock, 'X', Items.redstone);
        GameRegistry.addSmelting(Blocks.redstone_block, new ItemStack(Blocks.diamond_block), 100f);
    }

    @Mod.EventHandler
     public void postInit(FMLPostInitializationEvent event){

    }
}

