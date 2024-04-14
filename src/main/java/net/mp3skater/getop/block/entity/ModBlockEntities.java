package net.mp3skater.getop.block.entity;

import net.mp3skater.getop.GetOP;
import net.mp3skater.getop.block.ModBlocks;
import net.mp3skater.getop.block.entity.custom.AnvilOfSageBlock_Entity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, GetOP.MOD_ID);

    public static final RegistryObject<BlockEntityType<AnvilOfSageBlock_Entity>> ANVIL_OF_SAGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("anvil_of_sage_block_entity", () ->
                    BlockEntityType.Builder.of(AnvilOfSageBlock_Entity::new,
                            ModBlocks.ANVILOFSAGE_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}