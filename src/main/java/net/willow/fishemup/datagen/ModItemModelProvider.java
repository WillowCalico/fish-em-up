package net.willow.fishemup.datagen;

import net.minecraft.data.PackOutput;
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
        basicItem(ModItems.netherite_fishing_rod.get());
        basicItem(ModItems.diamond_fishing_rod.get());
        basicItem(ModItems.iron_fishing_rod.get());
        basicItem(ModItems.gold_fishing_rod.get());
    }
}
