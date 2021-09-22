package com.jerry.neo.core.oreregistrations;

import com.jerry.neo.NotEnoughOres;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class loopitem {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NotEnoughOres.MODID);
	
	@Mod.EventBusSubscriber(modid = NotEnoughOres.MODID, bus = Bus.MOD)
	public static class ModEventBusSubscriber {
	    
	    @SubscribeEvent
	    public static void registerItems(RegistryEvent.Register<Item> event) {
	        final IForgeRegistry<Item> registry = event.getRegistry();
	        ores.ORES.getEntries().stream().map(RegistryObject::get)
	                .forEach(block -> {
	                    final Item.Properties properties = new Item.Properties().tab(NotEnoughOres.NEO_TAB);
	                    final BlockItem blockItem = new BlockItem(block, properties);
	                    blockItem.setRegistryName(block.getRegistryName());
	                    registry.register(blockItem);
	        });
	    }   
	}
}
