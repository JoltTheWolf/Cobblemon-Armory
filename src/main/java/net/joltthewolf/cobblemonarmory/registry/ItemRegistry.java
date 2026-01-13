package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import java.util.List;

public final class ItemRegistry {
    private static Item registerItem(String name, Item item) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, name),
                item
        );
    }
    //SMITHING TEMPLATE
    public static final Item COBBLEMON_SMITHING_UPGRADE = registerItem("cobblemon_smithing_upgrade",
            new SmithingTemplateItem(
                    Component.translatable("item.cobblemonarmory.smithing_upgrade.applies_to"),
                    Component.translatable("item.cobblemonarmory.smithing_upgrade.ingredients"),
                    Component.translatable("item.cobblemonarmory.smithing_upgrade.title"),
                    Component.translatable("item.cobblemonarmory.smithing_upgrade.base_slot_description"),
                    Component.translatable("item.cobblemonarmory.smithing_upgrade.additions_slot_description"),
                    List.of(ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                            ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                            ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                            ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots")),
                    List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))));

    // ITEMS
    public static final Item CHARIZARD_SCALES = register("charizard_scales", new Item(new Item.Properties().stacksTo(64)));
    public static final Item PRIMEAPE_FUR = register("primeape_fur", new Item(new Item.Properties().stacksTo(64)));
    public static final Item EEVEE_FUR = register("eevee_fur", new Item(new Item.Properties().stacksTo(64)));
    public static final Item HAXORUS_SHARD = register("haxorus_shard", new Item(new Item.Properties().stacksTo(64)));
    public static final Item STARMIE_PIECES = register("starmie_pieces", new Item(new Item.Properties().stacksTo(64)));
    public static final Item RAYQUAZA_SCALE = register("rayquaza_scale", new Item(new Item.Properties().stacksTo(64)));
    public static final Item TINKATON_HAMMER_PIECE = register("tinkaton_hammer_piece", new Item(new Item.Properties().stacksTo(64)));
    public static final Item TINKATON_HANDLE_PIECE = register("tinkaton_handle_piece", new Item(new Item.Properties().stacksTo(64)));
    public static final Item BASTIODON_SKULL = register("bastiodon_skull", new Item(new Item.Properties().stacksTo(64)));

    //WEAPONS
    public static final Item TINKATON_HAMMER = registerItem("tinkaton_hammer", new TinkatonHammerItem(new Item.Properties().stacksTo(1)));
    public static final Item STARMIE_SWORD = registerItem("starmie_sword", new StarmieSwordItem(new Item.Properties().stacksTo(1)));
    public static final Item PRIMEAPE_GLOVES = registerItem("primeape_gloves", new PrimeapeGlovesItem(new Item.Properties().stacksTo(1)));
    public static final Item SIRFETCHD_SWORD = registerItem("sirfetchd_sword", new SirfetchdSwordItem(new Item.Properties().stacksTo(1)));
    public static final Item BASTIODON_SHIELD = registerItem("bastiodon_shield", new BastiodonShieldItem(new Item.Properties().stacksTo(1)));
    public static final Item CERULEDGE_SWORD = registerItem("ceruledge_sword", new CeruledgeSwordItem(new Item.Properties().stacksTo(1)));

    //TRAINER HATS
    public static final Item REDS_HAT = registerItem("reds_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item ETHANS_HAT = registerItem("ethans_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item KRISS_HAT = registerItem("kriss_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item MAYS_HAT = registerItem("mays_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item DAWNS_HAT = registerItem("dawns_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item LEAFS_HAT = registerItem("leafs_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item LYRAS_HAT = registerItem("lyras_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item NATES_HAT = registerItem("nates_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item CALEMS_HAT = registerItem("calems_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item BRENDANS_HAT = registerItem("brendans_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item LUCASS_HAT = registerItem("lucass_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item HILBERTS_HAT = registerItem("hilberts_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item HILDAS_HAT = registerItem("hildas_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item ROSAS_HAT = registerItem("rosas_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item SERENAS_HAT = registerItem("serenas_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item SELENES_HAT = registerItem("selenes_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item ELIOS_HAT = registerItem("elios_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item GLORIAS_HAT = registerItem("glorias_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));
    public static final Item VICTORS_HAT = registerItem("victors_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("leather_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonHatProps(ArmorItem.Type.HELMET)));


    //ARMORS
    public static final Item CHARIZARD_HELMET = registerItem("charizard_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item CHARIZARD_CHESTPLATE = registerItem("charizard_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item CHARIZARD_LEGGINGS = registerItem("charizard_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item CHARIZARD_BOOTS = registerItem("charizard_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SQUIRTLE_GLASSES = registerItem("squirtle_glasses", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));

    public static final Item SHINY_CHARIZARD_HELMET = registerItem("shiny_charizard_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_CHARIZARD_CHESTPLATE = registerItem("shiny_charizard_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_CHARIZARD_LEGGINGS = registerItem("shiny_charizard_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_CHARIZARD_BOOTS = registerItem("shiny_charizard_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item ARMAROUGE_HELMET = registerItem("armarouge_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item ARMAROUGE_CHESTPLATE = registerItem("armarouge_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item ARMAROUGE_LEGGINGS = registerItem("armarouge_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item ARMAROUGE_BOOTS = registerItem("armarouge_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item CERULEDGE_HELMET = registerItem("ceruledge_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item CERULEDGE_CHESTPLATE = registerItem("ceruledge_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item CERULEDGE_LEGGINGS = registerItem("ceruledge_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item CERULEDGE_BOOTS = registerItem("ceruledge_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item HAXORUS_HELMET = registerItem("haxorus_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item HAXORUS_CHESTPLATE = registerItem("haxorus_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item HAXORUS_LEGGINGS = registerItem("haxorus_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item HAXORUS_BOOTS = registerItem("haxorus_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_HAXORUS_HELMET = registerItem("shiny_haxorus_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_HAXORUS_CHESTPLATE = registerItem("shiny_haxorus_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_HAXORUS_LEGGINGS = registerItem("shiny_haxorus_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_HAXORUS_BOOTS = registerItem("shiny_haxorus_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item EEVEE_HELMET = registerItem("eevee_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item EEVEE_CHESTPLATE = registerItem("eevee_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item EEVEE_LEGGINGS = registerItem("eevee_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item EEVEE_BOOTS = registerItem("eevee_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_EEVEE_HELMET = registerItem("shiny_eevee_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_EEVEE_CHESTPLATE = registerItem("shiny_eevee_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_EEVEE_LEGGINGS = registerItem("shiny_eevee_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_EEVEE_BOOTS = registerItem("shiny_eevee_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item ESPEON_HELMET = registerItem("espeon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item ESPEON_CHESTPLATE = registerItem("espeon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item ESPEON_LEGGINGS = registerItem("espeon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item ESPEON_BOOTS = registerItem("espeon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_ESPEON_HELMET = registerItem("shiny_espeon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_ESPEON_CHESTPLATE = registerItem("shiny_espeon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_ESPEON_LEGGINGS = registerItem("shiny_espeon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_ESPEON_BOOTS = registerItem("shiny_espeon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item FLAREON_HELMET = registerItem("flareon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item FLAREON_CHESTPLATE = registerItem("flareon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item FLAREON_LEGGINGS = registerItem("flareon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item FLAREON_BOOTS = registerItem("flareon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_FLAREON_HELMET = registerItem("shiny_flareon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_FLAREON_CHESTPLATE = registerItem("shiny_flareon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_FLAREON_LEGGINGS = registerItem("shiny_flareon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_FLAREON_BOOTS = registerItem("shiny_flareon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item GLACEON_HELMET = registerItem("glaceon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item GLACEON_CHESTPLATE = registerItem("glaceon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item GLACEON_LEGGINGS = registerItem("glaceon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item GLACEON_BOOTS = registerItem("glaceon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_GLACEON_HELMET = registerItem("shiny_glaceon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_GLACEON_CHESTPLATE = registerItem("shiny_glaceon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_GLACEON_LEGGINGS = registerItem("shiny_glaceon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_GLACEON_BOOTS = registerItem("shiny_glaceon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item JOLTEON_HELMET = registerItem("jolteon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item JOLTEON_CHESTPLATE = registerItem("jolteon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item JOLTEON_LEGGINGS = registerItem("jolteon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item JOLTEON_BOOTS = registerItem("jolteon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_JOLTEON_HELMET = registerItem("shiny_jolteon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_JOLTEON_CHESTPLATE = registerItem("shiny_jolteon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_JOLTEON_LEGGINGS = registerItem("shiny_jolteon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_JOLTEON_BOOTS = registerItem("shiny_jolteon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item LEAFEON_HELMET = registerItem("leafeon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item LEAFEON_CHESTPLATE = registerItem("leafeon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item LEAFEON_LEGGINGS = registerItem("leafeon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item LEAFEON_BOOTS = registerItem("leafeon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_LEAFEON_HELMET = registerItem("shiny_leafeon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_LEAFEON_CHESTPLATE = registerItem("shiny_leafeon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_LEAFEON_LEGGINGS = registerItem("shiny_leafeon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_LEAFEON_BOOTS = registerItem("shiny_leafeon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SYLVEON_HELMET = registerItem("sylveon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SYLVEON_CHESTPLATE = registerItem("sylveon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SYLVEON_LEGGINGS = registerItem("sylveon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SYLVEON_BOOTS = registerItem("sylveon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_SYLVEON_HELMET = registerItem("shiny_sylveon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_SYLVEON_CHESTPLATE = registerItem("shiny_sylveon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_SYLVEON_LEGGINGS = registerItem("shiny_sylveon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_SYLVEON_BOOTS = registerItem("shiny_sylveon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item UMBREON_HELMET = registerItem("umbreon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item UMBREON_CHESTPLATE = registerItem("umbreon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item UMBREON_LEGGINGS = registerItem("umbreon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item UMBREON_BOOTS = registerItem("umbreon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_UMBREON_HELMET = registerItem("shiny_umbreon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_UMBREON_CHESTPLATE = registerItem("shiny_umbreon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_UMBREON_LEGGINGS = registerItem("shiny_umbreon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_UMBREON_BOOTS = registerItem("shiny_umbreon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item VAPOREON_HELMET = registerItem("vaporeon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item VAPOREON_CHESTPLATE = registerItem("vaporeon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item VAPOREON_LEGGINGS = registerItem("vaporeon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item VAPOREON_BOOTS = registerItem("vaporeon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_VAPOREON_HELMET = registerItem("shiny_vaporeon_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_VAPOREON_CHESTPLATE = registerItem("shiny_vaporeon_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_VAPOREON_LEGGINGS = registerItem("shiny_vaporeon_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_VAPOREON_BOOTS = registerItem("shiny_vaporeon_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item RAYQUAZA_HELMET = registerItem("rayquaza_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item RAYQUAZA_CHESTPLATE = registerItem("rayquaza_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item RAYQUAZA_LEGGINGS = registerItem("rayquaza_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item RAYQUAZA_BOOTS = registerItem("rayquaza_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item SHINY_RAYQUAZA_HELMET = registerItem("shiny_rayquaza_armor_helmet", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));
    public static final Item SHINY_RAYQUAZA_CHESTPLATE = registerItem("shiny_rayquaza_armor_chestplate", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.CHESTPLATE, ArmorRegistry.commonProps(ArmorItem.Type.CHESTPLATE)));
    public static final Item SHINY_RAYQUAZA_LEGGINGS = registerItem("shiny_rayquaza_armor_leggings", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.LEGGINGS, ArmorRegistry.commonProps(ArmorItem.Type.LEGGINGS)));
    public static final Item SHINY_RAYQUAZA_BOOTS = registerItem("shiny_rayquaza_armor_boots", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.BOOTS, ArmorRegistry.commonProps(ArmorItem.Type.BOOTS)));

    public static final Item GALARIAN_WEEZING_HAT = registerItem("galarian_weezing_hat", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));

    public static final Item SLOWKING_CROWN = registerItem("slowking_crown", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));

    public static final Item GRENINJA_SCARF = registerItem("greninja_scarf", new ArmorItem(ArmorRegistry.resolveDatapackMaterial("armor_base"), ArmorItem.Type.HELMET, ArmorRegistry.commonProps(ArmorItem.Type.HELMET)));

    private static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, path);
    }


    private static Item register(String name, Item item) {
        return net.minecraft.core.Registry.register(
                net.minecraft.core.registries.BuiltInRegistries.ITEM,
                id(name),
                item
        );
    }

    public static void init() {
        CobblemonArmory.LOGGER.info("Registering Mod Items for " + CobblemonArmory.MOD_ID);
    }
}

