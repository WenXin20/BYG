package corgiaoc.byg.common.world.feature.features.nether.glowstonegardens;

import com.mojang.serialization.Codec;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import corgiaoc.byg.core.byglists.BYGBlocks;

import java.util.Random;

public class NetherBristle extends Feature<NoFeatureConfig> {
    public NetherBristle(Codec<NoFeatureConfig> config) {
        super(config);
    }

    public static final EnumProperty<DoubleBlockHalf> HALF;

    public boolean func_241855_a(ISeedReader worldIn, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if (!worldIn.isAirBlock(pos) || worldIn.getBlockState(pos.down()).getBlock() != BYGBlocks.OVERGROWN_NETHERRACK) {
            return false;
        } else {
            worldIn.setBlockState(pos, BYGBlocks.NETHER_BRISTLE.getDefaultState(), 10);
            worldIn.setBlockState(pos.offset(Direction.UP), BYGBlocks.NETHER_BRISTLE.getDefaultState().with(HALF, DoubleBlockHalf.UPPER), 10);
            return true;
        }
    }

    static {
        HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    }
}