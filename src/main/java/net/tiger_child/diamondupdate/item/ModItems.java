package net.tiger_child.diamondupdate.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tiger_child.diamondupdate.DiamondUpdate;

public class ModItems {

    //colored diamonds
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DiamondUpdate.MOD_ID);

    public static final RegistryObject<Item> REDDIAMOND = ITEMS.register("reddiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORANGEDIAMOND = ITEMS.register("orangediamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> YELLOWDIAMOND = ITEMS.register("yellowdiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GREENDIAMOND = ITEMS.register("greendiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURPLEDIAMOND = ITEMS.register("purplediamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINKDIAMOND = ITEMS.register("pinkdiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BROWNDIAMOND = ITEMS.register("browndiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACKDIAMOND = ITEMS.register("blackdiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAYDIAMOND = ITEMS.register("graydiamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITEDIAMOND = ITEMS.register("whitediamond",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }
}
