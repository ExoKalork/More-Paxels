package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class BasaltPaxel extends MainPaxels {
	
	public BasaltPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("BasaltPaxel");
		this.setMaxDamage(ConfigHandler.BasaltDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.basaltIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}