package net.robotech.catadditions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.robotech.catadditions.CatAdditions;
import net.robotech.catadditions.Item.ModItems;
import net.robotech.catadditions.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, CatAdditions.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.AURIC_REPAIRABLES)
                .add(ModItems.AURIC_SHARD.getKey());

        tag(ItemTags.SWORDS)
                .add(ModItems.AURIC_SWORD.getKey());
        tag(ItemTags.AXES)
                .add(ModItems.AURIC_AXE.getKey());
        tag(ItemTags.PICKAXES)
                .add(ModItems.AURIC_PICKAXE.getKey());
        tag(ItemTags.SHOVELS)
                .add(ModItems.AURIC_SHOVEL.getKey());
        tag(ItemTags.HOES)
                .add(ModItems.AURIC_HOE.getKey());

        tag(ItemTags.HEAD_ARMOR).add(ModItems.AURIC_HELMET.getKey());
        tag(ItemTags.CHEST_ARMOR).add(ModItems.AURIC_CHESTPLATE.getKey());
        tag(ItemTags.LEG_ARMOR).add(ModItems.AURIC_LEGGINGS.getKey());
        tag(ItemTags.FOOT_ARMOR).add(ModItems.AURIC_BOOTS.getKey());



    }
}
