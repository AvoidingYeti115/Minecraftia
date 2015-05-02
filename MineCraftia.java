package avoidingyeti.minecraftia;

import avoidingyeti.minecraftia.item.ItemSilveringot;
import avoidingyeti.minecraftia.item.ItemSilverknife;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "mc", name = "MineCraftia", version = "0.5.0 Alpha" )
public class MineCraftia {

			public static Item itemSilverknife;
			public static Item itemSilveringot;
			public static Block blockSivlerore;
			
			public static Item itemApplejuice; 
			public static Item itemOrangejuice;
			public static Item itemCranberryjuice;
			public static Item itemCreeperjuice;
			public static Item itemMangojuice;
			public static Item itemPearjuice;
			public static Item itemCherryjuice;
			public static Item itemPineapplejuice;
			public static Item itemStrawberryjuice;
			
			
			
			
	public static final Item.ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("silverToolMaterial", 0, 0, 0, 5, 0);
	public static final Item.ToolMaterial boneToolMaterial = EnumHelper.addToolMaterial("boneToolMaterial", 0, 0, 0, 5, 0);
	
			
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		itemSilverknife = new ItemSilverknife(silverToolMaterial).setUnlocalizedName("itemSilverknife").setTextureName(null).setCreativeTab(tabMinecraftia).setCreativeTab(tabMinecraftia);
		itemSilveringot = new ItemSilveringot().setUnlocalizedName("itemSilveringot").setTextureName(null);
		itemApplejuice = new ItemFood(2, 0.5F, false).setUnlocalizedName("itemApplejuice").setTextureName("mc:apple_juice").setCreativeTab(tabMinecraftia);
		itemOrangejuice = new ItemFood(2, 0.5F, false).setUnlocalizedName("itemOranglejuice").setTextureName(null).setCreativeTab(tabMinecraftia);
		itemCranberryjuice = new ItemFood(2, 0.5F, false).setUnlocalizedName("itemCranberryjuice").setTextureName(null).setCreativeTab(tabMinecraftia);
		itemCreeperjuice = new ItemFood(2, 0.5F, false).setUnlocalizedName("itemCreeperjuice").setTextureName(null);
		
		
		
		
		
		
		//false mean cant be eaten by wolf
		
		
		GameRegistry.registerItem(itemApplejuice, itemApplejuice.getUnlocalizedName().substring(5));
		
		
	}
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	public void Init(FMLPostInitializationEvent e){
		
		
		
	}
	
	public static CreativeTabs tabMinecraftia = new CreativeTabs("tabMinecraftia") {
		@Override
		public Item getTabIconItem (){
			return new ItemStack(itemApplejuice).getItem();
		}
	
	
	
	};
}
