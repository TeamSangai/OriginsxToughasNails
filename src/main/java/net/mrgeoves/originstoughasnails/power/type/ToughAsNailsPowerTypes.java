package net.mrgeoves.originstoughasnails.power.type;

import io.github.apace100.apoli.power.PowerConfiguration;

import io.github.apace100.apoli.power.type.PowerTypes;
import io.github.apace100.apoli.power.type.ValueModifyingPowerType;

import net.minecraft.util.Identifier;

public class ToughAsNailsPowerTypes {
	public static final PowerConfiguration<ModifyThirstExhaustionPowerType> MODIFY_THIRST_EXHAUSTION = PowerTypes.register(
			ValueModifyingPowerType.createModifyingConfiguration(Identifier.of("originstoughasnails","modify_thirst_exhaustion"), ModifyThirstExhaustionPowerType::new)
	);
	public static final PowerConfiguration<DrinkableItemPowerType> DRINKABLE_ITEM = PowerTypes.register(
			PowerType.createModifyingConfiguration(Identifier.of("originstoughasnails","drinkable_item"), DrinkableItemPowerType::new)
	);

	public static void register() {
	}
}