package com.nekrul.nekmod;

import com.nekrul.nekmod.proxy.IProxy;
import com.nekrul.nekmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NekMod {

    @Mod.Instance(Reference.MOD_ID)
    public static NekMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;




    public static Item gem;
    public static  Block gemBlock;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        gem = new GemItem();
        gemBlock =new GemBlock(Material.iron)
                .setHardness(10F).setStepSound(Block.soundTypeMetal)
                .setBlockName("gemBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("nekmod:gemBlock");
        gemBlock.setHarvestLevel("pickaxe", 3);
        GameRegistry.registerItem(gem, "gem");
        GameRegistry.registerBlock(gemBlock, "gemBlock");
        GameRegistry.addShapedRecipe(new ItemStack(gemBlock), "XXX", "XXX", "XXX", 'X', gem);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.farmland), Blocks.dirt, Items.stone_hoe);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.command_block), "X X", " Y ", "X X", 'Y',
                Blocks.noteblock, 'X', Items.redstone);
        GameRegistry.addSmelting(Blocks.redstone_block, new ItemStack(Blocks.diamond_block), 100f);
    }

    @Mod.EventHandler
     public void postInit(FMLPostInitializationEvent event){

    }
}

