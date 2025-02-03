package net.mrgeoves.originstoughasnails.power.type;

import io.github.apace100.apoli.power.PowerConfiguration;
import io.github.apace100.apoli.power.type.PowerType;
import io.github.apace100.apoli.power.type.PowerTypes;
import io.github.apace100.apoli.power.type.ValueModifyingPowerType;
import io.github.apace100.apoli.registry.ApoliRegistries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ToughAsNailsPowerTypes {
	public static <T extends PowerType> PowerConfiguration<T> register(PowerConfiguration<T> configuration) {
		@SuppressWarnings("unchecked") PowerConfiguration<PowerType> casted = (PowerConfiguration<PowerType>) configuration;
		Registry.register(ApoliRegistries.POWER_TYPE, casted.id(), casted);
		return configuration;
	}
	public static final PowerConfiguration<ModifyThirstExhaustionPowerType> MODIFY_THIRST_EXHAUSTION = PowerTypes.register(
			ValueModifyingPowerType.createModifyingConfiguration(Identifier.of("originstoughsasnails","modify_thirst_exhaustion"), ModifyThirstExhaustionPowerType::new)
	);

	public static void register() {
	}
}