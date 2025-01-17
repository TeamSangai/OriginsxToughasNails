package net.mrgeoves.originsxtoughasnails.power.type;

import io.github.apace100.apoli.power.PowerConfiguration;
import io.github.apace100.apoli.power.type.PowerType;
import org.jetbrains.annotations.NotNull;

public class ModifyThirstExhaustion extends PowerType {
	public ModifyThirstExhaustion() {

	}
	@Override
	public @NotNull PowerConfiguration<?> getConfig() {
		return OxTanPowerTypes.MODIFY_THIRST_EXHAUSTION;
	}
}