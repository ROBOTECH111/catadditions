package net.robotech.catadditions.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.robotech.catadditions.CatAdditions;
import net.robotech.catadditions.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CatAdditions.MODID);

    public static final Supplier<CreativeModeTab> CAT_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("catadditions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AURIC_SHARD.get()))
                    .title(Component.translatable("creativetab.catadditions.catadittions_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_AURIC);
                        output.accept(ModItems.AURIC_SHARD);

                        output.accept(ModItems.AURIC_SWORD);
                        output.accept(ModItems.AURIC_PICKAXE);
                        output.accept(ModItems.AURIC_AXE);
                        output.accept(ModItems.AURIC_SHOVEL);
                        output.accept(ModItems.AURIC_HOE);

                        output.accept(ModItems.AURIC_HELMET);
                        output.accept(ModItems.AURIC_CHESTPLATE);
                        output.accept(ModItems.AURIC_LEGGINGS);
                        output.accept(ModItems.AURIC_BOOTS);

                        output.accept(ModBlocks.AURIC_BLOCK);
                        output.accept(ModBlocks.AURIC_ORE);
                        output.accept(ModBlocks.AURIC_DEEPSLATE_ORE);
                        output.accept(ModBlocks.AURIC_NETHER_ORE);
                        output.accept(ModBlocks.AURIC_END_ORE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
