package net.willow.fishemup.item;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.willow.fishemup.FishEmUp;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FishEmUp.MOD_ID);

    public static final DeferredItem<TieredFishingRodItem> netherite_fishing_rod = ITEMS.register("netherite_fishing_rod",
            ()-> new TieredFishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(256)
                    .fireResistant(),
                    Tiers.NETHERITE
            ));

    public static final DeferredItem<TieredFishingRodItem> diamond_fishing_rod = ITEMS.register("diamond_fishing_rod",
            ()-> new TieredFishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(128),
                    Tiers.DIAMOND
            ));

    public static final DeferredItem<TieredFishingRodItem> iron_fishing_rod = ITEMS.register("iron_fishing_rod",
            ()-> new TieredFishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(86),
                    Tiers.IRON
            ));

    public static final DeferredItem<TieredFishingRodItem> gold_fishing_rod = ITEMS.register("gold_fishing_rod",
            ()-> new TieredFishingRodItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(76),
                    Tiers.GOLD
            ));

    // public static final DeferredItem<SmithingTemplateItem> diamond_upgrade_template = ITEMS.register("diamond_upgrade_template",
    //        ()-> new SmithingTemplateItem(
    //
    //       ));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
