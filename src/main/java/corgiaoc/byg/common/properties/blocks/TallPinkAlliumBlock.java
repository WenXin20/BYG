package corgiaoc.byg.common.properties.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import corgiaoc.byg.core.byglists.BYGBlocks;

import java.util.Random;

public class TallPinkAlliumBlock extends TallGrassBlock implements IGrowable {

    protected TallPinkAlliumBlock(Properties builder) {
        super(builder);

    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        DoublePlantBlock doubleplantblock = (DoublePlantBlock) (this == BYGBlocks.TALL_PINK_ALLIUM ? BYGBlocks.TALL_PINK_ALLIUM : BYGBlocks.TALL_PINK_ALLIUM);
        if (doubleplantblock.getDefaultState().isValidPosition(worldIn, pos) && worldIn.isAirBlock(pos.up())) {
            doubleplantblock.placeAt(worldIn, pos, 2);
        }

    }
}