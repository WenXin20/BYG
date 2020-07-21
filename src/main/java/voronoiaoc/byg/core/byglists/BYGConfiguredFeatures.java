package voronoiaoc.byg.core.byglists;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import voronoiaoc.byg.BYG;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGFeatureConfigs;

public class BYGConfiguredFeatures {

    public static ConfiguredFeature<?, ?> ALLIUM_BUSH = newConfiguredFeature("allium_bush", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ALLIUMBUSH_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_PINK_BUSH = newConfiguredFeature("pink_allium_bush", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINKALLIUMBUSH_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_TALL_BUSH = newConfiguredFeature("tall_allium_bush", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TALL_ALLIUM_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_TALL_PINK_BUSH = newConfiguredFeature("tall_pink_allium_bush", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TALL_PINK_ALLIUM_CONFIG));

    public static ConfiguredFeature<?, ?> AMARANTH = newConfiguredFeature("amaranth", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.AMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_MAGENTA = newConfiguredFeature("magenta_amaranth", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MAGENTAAMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_ORANGE = newConfiguredFeature("orange_amaranth", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ORANGEAMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_PURPLE = newConfiguredFeature("purple_amaranth", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLEAMARANTH_CONFIG));
    public static ConfiguredFeature<?, ?> AMARANTH_CYAN = newConfiguredFeature("cyan_amaranth", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CYANAMARANTH_CONFIG));

    public static ConfiguredFeature<?, ?> FERN_GRASS = newConfiguredFeature("short_grass", Feature.RANDOM_PATCH.configure(ConfiguredFeatures.Configs.TAIGA_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> SHORT_GRASS = newConfiguredFeature("short_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> TALL_GRASS = newConfiguredFeature("tall_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TALL_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> SOUL_FIRE_ON_NYLIUM = newConfiguredFeature("soul_fire_on_nylium", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SOULFIREONNYLIUM));

    public static ConfiguredFeature<?, ?> MINI_CACTI = newConfiguredFeature("mini_cacti", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MINI_CACTUS_CONFIG));
    public static ConfiguredFeature<?, ?> HORSE_WEED = newConfiguredFeature("horse_weed", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.HORSEWEED_CONFIG));
    public static ConfiguredFeature<?, ?> TINY_LILY_PAD = newConfiguredFeature("tiny_lily_pad", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TINY_LILYPAD_CONFIG));
    public static ConfiguredFeature<?, ?> WATER_SILK = newConfiguredFeature("water_silk", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WATER_SILK_CONFIG));
    public static ConfiguredFeature<?, ?> WINTER_SUCCULENT = newConfiguredFeature("winter_succulent", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_SUCCULENT_CONFIG));
    public static ConfiguredFeature<?, ?> BEACH_GRASS = newConfiguredFeature("beach_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BEACH_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> BEACH_SHORT_GRASS = newConfiguredFeature("short_beach_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SHORT_BEACH_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> WILTED_GRASS = newConfiguredFeature("wilted_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WILTED_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> LEAF_PILE = newConfiguredFeature("leaf_pile", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LEAF_PILE_CONFIG));
    public static ConfiguredFeature<?, ?> WEED_GRASS = newConfiguredFeature("weed_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WEED_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> WINTER_GRASS = newConfiguredFeature("winter_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_GRASS_CONFIG));
    public static ConfiguredFeature<?, ?> CALIFORNIA_POPPY = newConfiguredFeature("california_poppy", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CALIFORNIA_POPPY_CONFIG));
    public static ConfiguredFeature<?, ?> BLACK_PUFF = newConfiguredFeature("black_puff", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLACK_PUFF_CONFIG));
    public static ConfiguredFeature<?, ?> WEEPING_MILKCAP = newConfiguredFeature("weeping_milkcap", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WEEPING_MILKCAP_CONFIG));
    public static ConfiguredFeature<?, ?> WOOD_BLEWIT = newConfiguredFeature("wood_blewit", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WOOD_BLEWIT_CONFIG));
    public static ConfiguredFeature<?, ?> GREEN_MUSHROOM = newConfiguredFeature("green_mushroom", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GREEN_MUSHROOM_CONFIG));
    public static ConfiguredFeature<?, ?> BEGONIA = newConfiguredFeature("begonia", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BEGONIA_CONFIG));
    public static ConfiguredFeature<?, ?> BISTORT = newConfiguredFeature("bistort", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BISTORT_CONFIG));
    public static ConfiguredFeature<?, ?> GUZMANIA = newConfiguredFeature("guzmania", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GUZMANIA_CONFIG));
    public static ConfiguredFeature<?, ?> INCAN_LILY = newConfiguredFeature("incan_lily", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.INCAN_LILY_CONFIG));
    public static ConfiguredFeature<?, ?> LAZARUS_BELLFLOWER = newConfiguredFeature("lazarus_bellflower", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LAZARUS_BELLFLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> TORCH_GINGER = newConfiguredFeature("torch_ginger", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TORCH_GINGER_CONFIG));
    public static ConfiguredFeature<?, ?> RICHEA = newConfiguredFeature("richea", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RICHEA_CONFIG));
    public static ConfiguredFeature<?, ?> JAPANESE_ORCHID = newConfiguredFeature("japanese_orchid", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.JAPANESEORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> AZALEA = newConfiguredFeature("azalea", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.AZALEA_CONFIG));
    public static ConfiguredFeature<?, ?> PRAIRIE_GRASS = newConfiguredFeature("prairie_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PRAIRIEGRASS_CONFIG));
    public static ConfiguredFeature<?, ?> PRAIRIE_TALL_GRASS = newConfiguredFeature("tall_prairie_grass", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.TALLPRAIRIEGRASS_CONFIG));
    public static ConfiguredFeature<?, ?> BLUE_GLOWSHROOM = newConfiguredFeature("blue_glowshroom", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUE_GLOWSHROOM_CONFIG));
    public static ConfiguredFeature<?, ?> PURPLE_GLOWSHROOM = newConfiguredFeature("purple_glowshroom", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_GLOWSHROOM_CONFIG));

    public static ConfiguredFeature<?, ?> PRICKLY_PEAR_CACTI = newConfiguredFeature("prickly_pear_cacti", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PRICKLY_PEAR_CONFIG));
    public static ConfiguredFeature<?, ?> GOLDEN_SPINED_CACTI = newConfiguredFeature("golden_spined_cacti", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GOLDEN_SPINED_CONFIG));

    public static ConfiguredFeature<?, ?> PINK_CHERRY_FOLIAGE = newConfiguredFeature("pink_cherry_foliage", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_CHERRY_FOLIAGE));
    public static ConfiguredFeature<?, ?> WHITE_CHERRY_FOLIAGE = newConfiguredFeature("white_cherry_foliage", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WHITE_CHERRY_FOLIAGE));

    public static ConfiguredFeature<?, ?> WARPED_CACTI = newConfiguredFeature("warped_cacti", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WARPED_CACTUS_CONFIG));

    public static ConfiguredFeature<?, ?> BLUE_BERRY_BUSH = newConfiguredFeature("blue_berry_bush", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUEBERRY_BUSH_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE = newConfiguredFeature("rose", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> ANGELICA = newConfiguredFeature("angelica", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ANGELICA_CONFIG));
    public static ConfiguredFeature<?, ?> CROCUS = newConfiguredFeature("crocus", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CROCUS_CONFIG));
    public static ConfiguredFeature<?, ?> IRIS = newConfiguredFeature("iris", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.IRIS_CONFIG));
    public static ConfiguredFeature<?, ?> ANEMONE_WHITE = newConfiguredFeature("white_anemone", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WHITE_ANEMONE_CONFIG));
    public static ConfiguredFeature<?, ?> ANEMONE_PINK = newConfiguredFeature("pink_anemone", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_ANEMONE_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_WINTER = newConfiguredFeature("winter_rose", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> SNOWDROPS = newConfiguredFeature("snowdrops", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.SNOWDROPS_CONFIG));
    public static ConfiguredFeature<?, ?> ALLIUM_PINK = newConfiguredFeature("pink_allium", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_ALLIUM_CONFIG));
    public static ConfiguredFeature<?, ?> DAISY_ORANGE = newConfiguredFeature("orange_daisy", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ORANGE_DAISY_CONFIG));
    public static ConfiguredFeature<?, ?> CORNFLOWER_RED = newConfiguredFeature("red_cornflower", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RED_CORNFLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> SAGE_WHITE = newConfiguredFeature("white_sage", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WHITE_SAGE_CONFIG));
    public static ConfiguredFeature<?, ?> SAGE_PURPLE = newConfiguredFeature("purple_sage", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_SAGE_CONFIG));
    public static ConfiguredFeature<?, ?> DELPHINIUM = newConfiguredFeature("delphinium", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.DELPHINIUM_CONFIG));
    public static ConfiguredFeature<?, ?> FOXGLOVE = newConfiguredFeature("foxglove", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FOXGLOVE_CONFIG));
    public static ConfiguredFeature<?, ?> DAFFODIL_YELLOW = newConfiguredFeature("yellow_daffodil", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.YELLOW_DAFFODIL_CONFIG));
    public static ConfiguredFeature<?, ?> PUMPKIN_CONFIG = newConfiguredFeature("pumpkin", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PUMPKIN_CONFIG));
    public static ConfiguredFeature<?, ?> ALPINE_BELLFLOWER = newConfiguredFeature("alpine_bellflower", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.ALPINE_BELLFLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> WINTER_SCILLA = newConfiguredFeature("winter_scilla", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.WINTER_SCILLA_CONFIG));
    public static ConfiguredFeature<?, ?> KOVAN_FLOWER = newConfiguredFeature("kovan_flower", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.KOVAN_FLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> FIRECRACKER_BUSH = newConfiguredFeature("firecracker_bush", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FIRECRACKER_CONFIG));

    public static ConfiguredFeature<?, ?> TULIP_GREEN = newConfiguredFeature("green_tulip", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.GREEN_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_CYAN = newConfiguredFeature("cyan_tulip", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CYAN_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_MAGENTA = newConfiguredFeature("magenta_tulip", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.MAGENTA_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_PURPLE = newConfiguredFeature("purple_tulip", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_TULIP_CONFIG));
    public static ConfiguredFeature<?, ?> TULIP_YELLOW = newConfiguredFeature("yellow_tulip", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.YELLOW_TULIP_CONFIG));

    public static ConfiguredFeature<?, ?> REEDS = newConfiguredFeature("reeds", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.REEDS_CONFIG));
    public static ConfiguredFeature<?, ?> CATTAIL = newConfiguredFeature("cattail", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CATTAIL_CONFIG));

    public static ConfiguredFeature<?, ?> GLOWCANE_BLUE = newConfiguredFeature("blue_glowcane", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLUE_GLOWCANE_CONFIG));
    public static ConfiguredFeature<?, ?> GLOWCANE_PURPLE = newConfiguredFeature("purple_glowcane", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_GLOWCANE_CONFIG));
    public static ConfiguredFeature<?, ?> GLOWCANE_RED = newConfiguredFeature("red_glowcane", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RED_GLOWCANE_CONFIG));
    public static ConfiguredFeature<?, ?> GLOWCANE_PINK = newConfiguredFeature("pink_glowcane", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_GLOWCANE_CONFIG));

    public static ConfiguredFeature<?, ?> LOLI_POP = newConfiguredFeature("loli_pop", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.LOLLI_POP_CONFIG));
    public static ConfiguredFeature<?, ?> ORCHID_RED = newConfiguredFeature("red_orchid", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.RED_ORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> ORCHID_PINK = newConfiguredFeature("pink_orchid", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_ORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> ORCHID_PURPLE = newConfiguredFeature("purple_orchid", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PURPLE_ORCHID_CONFIG));
    public static ConfiguredFeature<?, ?> LEATHER_FLOWER_PEACH = newConfiguredFeature("peach_leather_flower", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PEACH_LEATHER_FLOWER_CONFIG));
    public static ConfiguredFeature<?, ?> LEATHER_FLOWER_VIOLET = newConfiguredFeature("violet_leather_flower", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.VIOLET_LEATHER_FLOWER_CONFIG));

    public static ConfiguredFeature<?, ?> DAFFODIL_PINK = newConfiguredFeature("pink_daffodil", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.PINK_DAFFODIL_CONFIG));
    public static ConfiguredFeature<?, ?> DAFFODIL = newConfiguredFeature("daffodil", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.DAFFODIL_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_BLACK = newConfiguredFeature("black_rose", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.BLACK_ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_CYAN = newConfiguredFeature("cyan_rose", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.CYAN_ROSE_CONFIG));
    public static ConfiguredFeature<?, ?> ROSE_OSIRIA = newConfiguredFeature("osiria_rose", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.OSIRIA_CONFIG));
    public static ConfiguredFeature<?, ?> FAIRY_SLIPPER = newConfiguredFeature("fairy_slipper", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.FAIRYSLIPPER_CONFIG));

    public static ConfiguredFeature<?, ?> IVIS_ROOTS = newConfiguredFeature("ivis_roots", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.IVIS_ROOTS));
    public static ConfiguredFeature<?, ?> IVIS_SPROUT = newConfiguredFeature("ivis_sprout", Feature.RANDOM_PATCH.configure(BYGFeatureConfigs.IVIS_SPROUT));

    public static final ConfiguredFeature<?, ?> RANDOM_ALLIUM_FLOWER = newConfiguredFeature("rs_allium_flower", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
                ALLIUM_TALL_BUSH.withChance(0.25F),
                ALLIUM_TALL_PINK_BUSH.withChance(0.25F),
                ALLIUM_BUSH.withChance(0.25F)),
                ALLIUM_PINK_BUSH)).decorate(ConfiguredFeatures.Decorators.field_26166).repeat(150));

    public static final ConfiguredFeature<?, ?> RANDOM_AMARANTH_FLOWER = newConfiguredFeature("rs_amaranth_flower", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
            AMARANTH_CYAN.withChance(0.2F),
            AMARANTH_MAGENTA.withChance(0.2F),
            AMARANTH_ORANGE.withChance(0.2F),
            AMARANTH_PURPLE.withChance(0.2F)),
            AMARANTH)).decorate(ConfiguredFeatures.Decorators.field_26166).repeat(150));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWCANE = newConfiguredFeature("rs_glowcane", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
            GLOWCANE_BLUE.withChance(0.25F),
            GLOWCANE_PINK.withChance(0.25F),
            GLOWCANE_PURPLE.withChance(0.25F)),
            GLOWCANE_RED)).decorate(ConfiguredFeatures.Decorators.field_26166).repeat(20));

    public static final ConfiguredFeature<?, ?> RANDOM_FERN_GRASS = newConfiguredFeature("rs_fern_grass", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
            FERN_GRASS.withChance(0.50F)),
            SHORT_GRASS)).decorate(ConfiguredFeatures.Decorators.field_26166));

    public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(BYG.MODID, registryName), configuredFeature);
        return configuredFeature;
    }
}
