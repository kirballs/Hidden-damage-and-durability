package com.kirballs.hiddendamageanddurability;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(HiddenDamageAndDurabilityMod.MOD_ID)
public final class HiddenDamageAndDurabilityMod {
    public static final String MOD_ID = "hidden_damage_and_durability";

    public HiddenDamageAndDurabilityMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModClientConfig.SPEC);
    }
}
