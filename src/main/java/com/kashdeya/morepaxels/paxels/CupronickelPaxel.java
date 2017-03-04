package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;

public class CupronickelPaxel extends MainPaxels {
	
	public CupronickelPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("CupronickelPaxel");
		this.setMaxDamage(ConfigHandler.CupronickelDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.cupronickel_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}