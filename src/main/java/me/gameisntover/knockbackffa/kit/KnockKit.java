package me.gameisntover.knockbackffa.kit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class KnockKit {


    public File cfile;
    public FileConfiguration config;
    private final String name;

    public KnockKit(String name) {
        this.name = name;
        cfile = new File(KitManager.folder, name + ".yml");
        config = YamlConfiguration.loadConfiguration(cfile);
    }



    public File getfile() {
        return cfile;
    }

    public FileConfiguration get() {
        return config;
    }


    public void save() {
        try {
            config.save(cfile);
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Error saving " + cfile.getName() + "!");
        }
    }
    public String getName(){
        return config.getString("name");
    }
    public List<String> getDescription(){
        return config.getStringList("lore");
    }
    public Material getIcon(){
        return Material.getMaterial(config.getString("icon"));
    }
    public List<ItemStack> getItems(){
        return Arrays.asList(get().getList("contents").toArray(new ItemStack[0]));
    }
    public void setItems(List<ItemStack> items){
        get().set("contents",items);
        save();
    }
    public void setIcon(String icon){
        get().set("icon",icon);
        save();
    }
    public void setPrice(double price){
        get().set("price",price);
        save();
    }
    public double getPrice(){
        return get().getDouble("price");
    }
    public void setDescription(List<String> description){
         get().set("lore", description);
        save();
    }
}