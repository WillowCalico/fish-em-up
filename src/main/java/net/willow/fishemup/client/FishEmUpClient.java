package net.willow.fishemup.client;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.willow.fishemup.item.ModItems;

@EventBusSubscriber(Dist.CLIENT)
public class FishEmUpClient {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemProperties.register(ModItems.netheriterod.get(), ResourceLocation.withDefaultNamespace("cast"), (ClampedItemPropertyFunction) FishEmUpClient::castPropertyFunction);
            ItemProperties.register(ModItems.diamondrod.get(), ResourceLocation.withDefaultNamespace("cast"), (ClampedItemPropertyFunction) FishEmUpClient::castPropertyFunction);
            ItemProperties.register(ModItems.ironrod.get(), ResourceLocation.withDefaultNamespace("cast"), (ClampedItemPropertyFunction) FishEmUpClient::castPropertyFunction);
            ItemProperties.register(ModItems.goldrod.get(), ResourceLocation.withDefaultNamespace("cast"), (ClampedItemPropertyFunction) FishEmUpClient::castPropertyFunction);
        });
    }
    public static float castPropertyFunction(ItemStack item, ClientLevel level, LivingEntity entity, int id) {
        if (entity == null) return 0;
        boolean inMainHand = entity.getMainHandItem() == item;
        boolean inOffHand = entity.getOffhandItem() == item;
        if (entity.getMainHandItem().getItem() instanceof FishingRodItem) inOffHand = false;
        return (inMainHand || inOffHand) && entity instanceof Player player && player.fishing != null ? 1 : 0;
    }
}
