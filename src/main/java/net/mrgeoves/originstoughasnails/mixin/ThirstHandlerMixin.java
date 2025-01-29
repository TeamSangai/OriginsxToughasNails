package net.mrgeoves.originstoughasnails.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import io.github.apace100.apoli.component.PowerHolderComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.mrgeoves.originstoughasnails.power.type.ModifyThirstExhaustionPowerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import toughasnails.thirst.ThirstHandler;

@Mixin (ThirstHandler.class)
public class ThirstHandlerMixin {
    @ModifyExpressionValue(
            method = "onPlayerTick",
            at = @At(value = "FIELD", target = "Ltoughasnails/config/ThirstConfig;thirstExhaustionThreshold:D")
    )
    private static double modifyExhaustionThreshold(double original, PlayerEntity player) {
        return PowerHolderComponent.modify(player, ModifyThirstExhaustionPowerType.class, original);
    }
}