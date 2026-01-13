package net.joltthewolf.cobblemonarmory.registry;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public final class RightClickEntityRegistry {
    private RightClickEntityRegistry() {}

    public static void init() {
        UseEntityCallback.EVENT.register((player, world, hand, target, hitResult) -> {
            // Only main-hand interactions
            if (hand != InteractionHand.MAIN_HAND) return InteractionResult.PASS;

            // Must be holding our smithing upgrade
            ItemStack held = player.getItemInHand(hand);
            if (held.isEmpty() || held.getItem() != ItemRegistry.COBBLEMON_SMITHING_UPGRADE) {
                return InteractionResult.PASS;
            }

            // Only care about cobblemon:pokemon entity type
            String typeKey = String.valueOf(BuiltInRegistries.ENTITY_TYPE.getKey(target.getType()));
            if (!"cobblemon:pokemon".equals(typeKey)) return InteractionResult.PASS;

            // Match by display name
            String name = target.getDisplayName().getString();

            // Drop mapping
            if ("Rayquaza".equals(name)) {
                dropAndConsume(player, target, ItemRegistry.RAYQUAZA_SCALE);
                return InteractionResult.SUCCESS; // stop further handling
            } else if ("Bastiodon".equals(name)) {
                dropAndConsume(player, target, ItemRegistry.BASTIODON_SKULL);
                return InteractionResult.SUCCESS;
            }

            return InteractionResult.PASS;
        });
    }

    private static void dropAndConsume(Player player, Entity at, net.minecraft.world.item.Item drop) {
        if (at.level() instanceof ServerLevel server) {
            ItemEntity entityToSpawn = new ItemEntity(
                    server,
                    at.getX(), at.getY(), at.getZ(),
                    new ItemStack(drop)
            );
            entityToSpawn.setPickUpDelay(10);
            server.addFreshEntity(entityToSpawn);
        }
        // Consume exactly one from the hand that was used
        ItemStack hand = player.getItemInHand(InteractionHand.MAIN_HAND);
        hand.shrink(1);
    }
}
