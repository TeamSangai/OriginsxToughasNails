package net.mrgeoves.originsxtoughasnails.power.type;

public class ModifyThirstExhaustion extends PowerType {
	public ModifyThirstExhaustion() {

	}
	@Override
	public @NotNull PowerConfiguration<?> getConfig() {
		return OxTanPowerTypes.MODIFY_THIRST_EXHAUSTION;
	}
}