package net.willow.fishemup.item;

import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Tier;

public class TieredFishingRodItem extends FishingRodItem {

    private final Tier tier;

    public TieredFishingRodItem(Properties properties, Tier tier) {
        super(properties);
        this.tier = tier;

    }

    @Override
    public int getEnchantmentValue() {
        return tier.getEnchantmentValue();
    }
}
