package net.mrgeoves.originstoughasnails.power.type;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import io.github.apace100.apoli.component.PowerHolderComponent;
import io.github.apace100.apoli.condition.EntityCondition;
import io.github.apace100.apoli.power.PowerConfiguration;
import io.github.apace100.apoli.power.type.ValueModifyingPowerType;
import io.github.apace100.apoli.util.modifier.Modifier;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import toughasnails.thirst.ThirstHandler;

import java.util.List;
import java.util.Optional;

public class ModifyThirstExhaustionPowerType extends ValueModifyingPowerType {
	public ModifyThirstExhaustionPowerType(List<Modifier> modifiers, Optional<EntityCondition> condition) {
		super(modifiers, condition);
	}


    @Override
	public @NotNull PowerConfiguration<?> getConfig() {
		return ToughAsNailsPowerTypes.MODIFY_THIRST_EXHAUSTION;
	}
}