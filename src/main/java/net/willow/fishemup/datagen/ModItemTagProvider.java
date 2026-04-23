package net.willow.fishemup.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.willow.fishemup.FishEmUp;
import net.willow.fishemup.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, FishEmUp.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.FISHING_ENCHANTABLE)
                .add(ModItems.netherite_fishing_rod.get())
                .add(ModItems.diamond_fishing_rod.get())
                .add(ModItems.iron_fishing_rod.get())
                .add(ModItems.gold_fishing_rod.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.netherite_fishing_rod.get())
                .add(ModItems.diamond_fishing_rod.get())
                .add(ModItems.iron_fishing_rod.get())
                .add(ModItems.gold_fishing_rod.get());
    }
}
