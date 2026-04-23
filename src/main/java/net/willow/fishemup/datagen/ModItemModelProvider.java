package net.willow.fishemup.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.willow.fishemup.FishEmUp;
import net.willow.fishemup.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FishEmUp.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fishingRodItem(ModItems.netherite_fishing_rod.getId());
        fishingRodItem(ModItems.diamond_fishing_rod.getId());
        fishingRodItem(ModItems.iron_fishing_rod.getId());
        fishingRodItem(ModItems.gold_fishing_rod.getId());

        basicItem(ModItems.gold_fishing_rod.get());
    }
    protected void fishingRodItem(ResourceLocation item) {
        withExistingParent(item.getPath(), "item/handheld_rod")
                .texture("layer0", item.withPrefix("item/"))
                .override()
                .predicate(ResourceLocation.withDefaultNamespace("cast"), 1)
                .model(withExistingParent(item.getPath() + "_cast", item.withPrefix("item/"))
                        .texture("layer0", item.withPrefix("item/").withSuffix("_cast")));

    }
}