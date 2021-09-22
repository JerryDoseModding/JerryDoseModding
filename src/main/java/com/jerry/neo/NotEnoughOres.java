package com.jerry.neo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jerry.neo.core.oregeneration.OreGen;
import com.jerry.neo.core.oreregistrations.loopitem;
import com.jerry.neo.core.oreregistrations.ores;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NotEnoughOres.MODID)
public class NotEnoughOres
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "neo";
    public static final ItemGroup NEO_TAB = new NEOGroup("neo");

    public NotEnoughOres() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	loopitem.ITEMS.register(bus);
    	ores.ORES.register(bus);
    	
    	MinecraftForge.EVENT_BUS.register(this);
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
    
    public static class NEOGroup extends ItemGroup{

		public NEOGroup(String p_i1853_2_) {
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return Items.IRON_ORE.getDefaultInstance();
		}
    	
    }
}
