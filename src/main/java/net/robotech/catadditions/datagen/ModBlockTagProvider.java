package net.robotech.catadditions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.robotech.catadditions.CatAdditions;
import net.robotech.catadditions.block.ModBlocks;
import net.robotech.catadditions.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, CatAdditions.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AURIC_ORE.get(),
                        ModBlocks.AURIC_BLOCK.get(),
                        ModBlocks.AURIC_DEEPSLATE_ORE.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.AURIC_ORE.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.AURIC_DEEPSLATE_ORE.get());

        tag(ModTags.Blocks.NEED_AURIC_TOOL)
                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.AURIC_BLOCK.get());

        tag(ModTags.Blocks.INCORRECT_FOR_AURIC_TOOL)
                .remove(Tags.Blocks.NEEDS_NETHERITE_TOOL);

    }
}
