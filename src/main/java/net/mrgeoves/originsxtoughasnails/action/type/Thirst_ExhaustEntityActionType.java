package net.mrgeoves.originsxtoughasnails.action.type;

import io.github.apace100.apoli.action.ActionConfiguration;
import io.github.apace100.apoli.action.type.EntityActionType;
import org.jetbrains.annotations.NotNull;

public class Thirst_ExhaustEntityActionType extends EntityActionType {

    @Override
    public @NotNull ActionConfiguration<?> getConfig() {
        return OxTanEntityActionTypes.THIRST_EXHAUST_ENTITY_ACTION;
    }


}
