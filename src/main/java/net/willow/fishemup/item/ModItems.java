package net.willow.fishemup.item;

import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.willow.fishemup.FishEmUp;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FishEmUp.MOD_ID);

    public static final DeferredItem<FishingRodItem> netheriterod = ITEMS.register("netheriterod",
            ()-> new FishingRodItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<FishingRodItem> diamondrod = ITEMS.register("diamondrod",
            ()-> new FishingRodItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<FishingRodItem> ironrod = ITEMS.register("ironrod",
            ()-> new FishingRodItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<FishingRodItem> goldrod = ITEMS.register("goldrod",
            ()-> new FishingRodItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
