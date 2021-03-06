package me.gameisntover.knockbackffa.util;

import me.gameisntover.knockbackffa.configurations.ItemConfiguration;
import me.gameisntover.knockbackffa.gui.ItemBuilder;
import me.gameisntover.knockbackffa.gui.KEnchant;
import me.gameisntover.knockbackffa.multipleversion.KnockMaterial;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;

public enum Items {
    WAND(ItemBuilder.builder().material(KnockMaterial.BLAZE_ROD).name(ChatColor.GOLD + "PositionSelector Wand").itemflags(Collections.singletonList(ItemFlag.HIDE_ENCHANTS)).enchants(Collections.singletonList(new KEnchant(Enchantment.DURABILITY, 99))).build()),
    COSMETICS_MENU(ItemBuilder.builder().name(ItemConfiguration.get().getString("LobbyItems.cosmetic.name")).material(Material.getMaterial(ItemConfiguration.get().getString("LobbyItems.cosmetic.material"))).lores(ItemConfiguration.get().getStringList("LobbyItems.cosmetic.lore")).buttonMeta().build()),
    KITS_MENU(ItemBuilder.builder().name(ItemConfiguration.get().getString("LobbyItems.kits.name")).material(Material.getMaterial(ItemConfiguration.get().getString("LobbyItems.kits.material"))).lores(ItemConfiguration.get().getStringList("LobbyItems.kits.lore")).buttonMeta().build()),
    SHOP_MENU(ItemBuilder.builder().name(ItemConfiguration.get().getString("LobbyItems.shop.name")).material(Material.getMaterial(ItemConfiguration.get().getString("LobbyItems.shop.material"))).lores(ItemConfiguration.get().getStringList("LobbyItems.shop.lore")).buttonMeta().build()),
    KB_STICK(ItemBuilder.builder().name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.KBStick.name"))).material(KnockMaterial.STICK).enchants(new KEnchant(Enchantment.KNOCKBACK, ItemConfiguration.get().getInt("SpecialItems.KBStick.kb-level"))).buttonMeta().build()),
    KB_BOW(ItemBuilder.builder().name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.KBBow.name"))).buttonMeta().material(KnockMaterial.BOW).build()),
    KB_ARROW(ItemBuilder.builder().material(KnockMaterial.ARROW).name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.KBArrow.name"))).build()),
    BUILDING_BLOCK(ItemBuilder.builder().material(KnockMaterial.WHITE_WOOL).name(ChatColor.WHITE + "Building Block").build()),
    JUMP_PLATE(ItemBuilder.builder().material(KnockMaterial.GOLD_PLATE).name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.JumpPlate.name"))).build()),
    ENDER_PEARL(ItemBuilder.builder().material(KnockMaterial.ENDER_PEARL).name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.EnderPearl.name"))).build());
    public ItemStack item;

    Items(org.bukkit.inventory.ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return item;
    }
}
