package prospector.traverse.world.biomes;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.BiomeForest;
import prospector.traverse.world.WorldGenConstants;

public class BiomeForestedHills extends BiomeForest implements WorldGenConstants {

    public BiomeForestedHills(BiomeForest.Type type, String name) {
        super(type, new BiomeProperties(name).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()).setBaseHeight(Biomes.EXTREME_HILLS.getBaseHeight()).setHeightVariation(Biomes.EXTREME_HILLS.getHeightVariation()));
    }
}
