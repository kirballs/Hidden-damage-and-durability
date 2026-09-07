package com.kirballs.hiddendamageanddurability;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ModClientConfig {
    public static final ForgeConfigSpec SPEC;
    private static final ForgeConfigSpec.BooleanValue SHOW_DURABILITY_TOOLTIP;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        SHOW_DURABILITY_TOOLTIP = builder
                .comment("Show durability tooltip lines while still filtering damage and attribute lines.")
                .define("showDurabilityTooltip", false);

        SPEC = builder.build();
    }

    private ModClientConfig() {
    }

    public static boolean showDurabilityTooltip() {
        return SHOW_DURABILITY_TOOLTIP.get();
    }
}
