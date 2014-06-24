package com.nekrul.nekmod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GemBlock extends Block{

    public GemBlock(Material material){
        super(material);
    }
    public final static Block gemBlock = new GemBlock(Material.ground)
            .setHardness(10F).setStepSound(Block.soundTypeMetal)
            .setBlockName("gemBlock").setCreativeTab(CreativeTabs.tabBlock);
}
