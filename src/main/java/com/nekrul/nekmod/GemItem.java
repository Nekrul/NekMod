package com.nekrul.nekmod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GemItem extends Item {

    public GemItem(){
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("gem");
    }



}
