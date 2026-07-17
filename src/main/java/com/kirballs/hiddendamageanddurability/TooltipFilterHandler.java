package com.kirballs.hiddendamageanddurability;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.regex.Pattern;

@Mod.EventBusSubscriber(modid = HiddenDamageAndDurabilityMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class TooltipFilterHandler {
    private static final Pattern DURABILITY_OR_DAMAGE_PATTERN = Pattern.compile("\\b(durability|damage)\\b", Pattern.CASE_INSENSITIVE);

    private TooltipFilterHandler() {
    }

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        if (!event.getItemStack().isDamageableItem()) {
            return;
        }

        List<Component> tooltip = event.getToolTip();
        if (tooltip.size() <= 1) {
            return;
        }

        tooltip.subList(1, tooltip.size()).removeIf(TooltipFilterHandler::shouldHideLine);
    }

    private static boolean shouldHideLine(Component line) {
        if (line.getContents() instanceof TranslatableContents translatableContents) {
            String key = translatableContents.getKey();
            if (key.contains("durability") || key.contains("damage")) {
                return true;
            }
        }

        return DURABILITY_OR_DAMAGE_PATTERN.matcher(line.getString()).find();
    }
}
