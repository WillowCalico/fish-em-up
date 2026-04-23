package net.willow.fishemup.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.willow.fishemup.FishEmUp;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FishEmUp.MOD_ID);

    public static final Supplier<CreativeModeTab> FISHEMUP_ITEMS_TAB = CREATIVE_MODE_TAB.register("fishemup_items_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.goldrod.get()))
                    .title(Component.translatable("creativetab.fishemup.fishemup_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.netheriterod);
                        output.accept(ModItems.diamondrod);
                        output.accept(ModItems.ironrod);
                        output.accept(ModItems.goldrod);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

    }

}
