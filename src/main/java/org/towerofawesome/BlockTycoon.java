package org.towerofawesome;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.towerofawesome.init.ModBlocks;

/**
 * Created by Forecaster on 20/04/2016.
 */
@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)
public class BlockTycoon
{
  @Mod.Instance()
  public static BlockTycoon instance;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    References.log("PreInit stuff!");
    ModBlocks.init();
    //ModTileEntities.init();
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {
    References.log("Init BlockTycoon!");
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {
    References.log("PostInit BlockTycoon!");
  }
}
