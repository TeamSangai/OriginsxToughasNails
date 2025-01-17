package net.mrgeoves.originsxtoughasnails.power.type;

public class OxTanPowerTypes {
	public static <T extends PowerType> PowerConfiguration<T> register(PowerConfiguration<T> configuration) {
		PowerConfiguration<PowerType> casted = (PowerConfiguration<PowerType>) configuration;
		Registry.register(ApoliRegistries.POWER_TYPE, casted.id(), casted);
		return configuration;
	}
	public static final PowerConfiguration<ModifyThirstExhaustion> MODIFY_THIRST_EXHAUSTION = register(
			PowerConfiguration.dataFactory(Identifier.of("origins-x-tough-as-nails", "modify_thirst_exhaustion"), ModifyThirstExhaustion::new)
	);
	public static void register() {

	}
}