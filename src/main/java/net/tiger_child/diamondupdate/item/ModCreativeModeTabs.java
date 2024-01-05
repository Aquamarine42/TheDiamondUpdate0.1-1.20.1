package net.tiger_child.diamondupdate.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tiger_child.diamondupdate.DiamondUpdate;
import net.tiger_child.diamondupdate.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiamondUpdate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DIAMOND_TAB = CREATIVE_MODE_TABS.register("diamond_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.diamond_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.REDDIAMOND.get());
                        pOutput.accept(ModItems.ORANGEDIAMOND.get());
                        pOutput.accept(ModItems.YELLOWDIAMOND.get());
                        pOutput.accept(ModItems.GREENDIAMOND.get());
                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(ModItems.PURPLEDIAMOND.get());
                        pOutput.accept(ModItems.PINKDIAMOND.get());
                        pOutput.accept(ModItems.BROWNDIAMOND.get());
                        pOutput.accept(ModItems.BLACKDIAMOND.get());
                        pOutput.accept(ModItems.GRAYDIAMOND.get());
                        pOutput.accept(ModItems.WHITEDIAMOND.get());

                        pOutput.accept(ModBlocks.REDDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.ORANGEDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.YELLOWDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.GREENDIAMOND_BLOCK.get());
                        pOutput.accept(Items.DIAMOND_BLOCK);
                        pOutput.accept(ModBlocks.PURPLEDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.PINKDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.BROWNDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.BLACKDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.GRAYDIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.WHITEDIAMOND_BLOCK.get());

                        pOutput.accept(Items.DIAMOND_SHOVEL);
                        pOutput.accept(Items.DIAMOND_PICKAXE);
                        pOutput.accept(Items.DIAMOND_AXE);
                        pOutput.accept(Items.DIAMOND_HOE);

                        pOutput.accept(Items.DIAMOND_SWORD);

                        pOutput.accept(Items.DIAMOND_HELMET);
                        pOutput.accept(Items.DIAMOND_CHESTPLATE);
                        pOutput.accept(Items.DIAMOND_LEGGINGS);
                        pOutput.accept(Items.DIAMOND_BOOTS);

                        pOutput.accept(Items.DIAMOND_HORSE_ARMOR);

                        pOutput.accept(Items.ENCHANTING_TABLE);

                        pOutput.accept(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
                        pOutput.accept(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE);
                        pOutput.accept(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE);

                        pOutput.accept(Items.JUKEBOX);
                        pOutput.accept(Items.FIREWORK_STAR);

                    })
                    .build());

    public static void register(IEventBus eventBus) {

        CREATIVE_MODE_TABS.register(eventBus);

    }

}
