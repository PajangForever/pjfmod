package name.pjfmod;

//import name.pjfmod.ziDingYi.AdvancementsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PjfmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		//fabricDataGenerator.createPack().addProvider(AdvancementsProvider::new);
	}
}
