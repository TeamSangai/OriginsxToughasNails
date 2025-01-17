package net.mrgeoves.originsxtoughasnails.power.type;

import io.github.apace100.apoli.power.PowerConfiguration;
import io.github.apace100.apoli.power.type.PowerType;
import io.github.apace100.apoli.registry.ApoliRegistries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OxTanPowerTypes {
	public static <T extends PowerType> PowerConfiguration<T> register(PowerConfiguration<T> configuration) {
		@SuppressWarnings("unchecked") PowerConfiguration<PowerType> casted = (PowerConfiguration<PowerType>) configuration;
		Registry.register(ApoliRegistries.POWER_TYPE, casted.id(), casted);
		return configuration;
	}
	public static final PowerConfiguration<ModifyThirstExhaustion> MODIFY_THIRST_EXHAUSTION = register(
			PowerConfiguration.simple(Identifier.of("origins-x-tough-as-nails", "modify_thirst_exhaustion"), (ModifyThirstExhaustion) -> new Class(ModifyThirstExhaustion))
	);
	public static void register() {

	}
}