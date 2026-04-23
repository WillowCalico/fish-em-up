package net.willow.fishemup.item;

import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.willow.fishemup.FishEmUp;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FishEmUp.MOD_ID);

    public static final DeferredItem<FishingRodItem> netherite_fishing_rod = ITEMS.register("netherite_fishing_rod",
            ()-> new FishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(256)
                    .fireResistant()

            ));

    public static final DeferredItem<FishingRodItem> diamond_fishing_rod = ITEMS.register("diamond_fishing_rod",
            ()-> new FishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(128)
            ));

    public static final DeferredItem<FishingRodItem> iron_fishing_rod = ITEMS.register("iron_fishing_rod",
            ()-> new FishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(86)
            ));

    public static final DeferredItem<FishingRodItem> gold_fishing_rod = ITEMS.register("gold_fishing_rod",
            ()-> new FishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(76)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
