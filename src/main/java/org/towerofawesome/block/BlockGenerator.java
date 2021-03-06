package org.towerofawesome.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.towerofawesome.References;

/**
 * Created by Forecaster on 22/04/2016.
 */
public class BlockGenerator extends Block
{
  public BlockGenerator(String unlocalizedName, Material material)
  {
    super(material);
    this.setBlockName(unlocalizedName);
    this.setBlockTextureName(References.MOD_ID + ":" + unlocalizedName);
    this.setBlockUnbreakable();
    this.setCreativeTab(CreativeTabs.tabRedstone);
    References.log("Create new block with texture name: " + References.MOD_ID + ":" + unlocalizedName);
  }

  //@Override
  //public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
  //{
  //  return new TileEntityGenerator();
  //}
}
