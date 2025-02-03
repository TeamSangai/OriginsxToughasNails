package net.mrgeoves.originstoughasnails.action.type;

import io.github.apace100.apoli.Apoli;
import io.github.apace100.apoli.action.ActionConfiguration;
import net.minecraft.util.Identifier;

public class ToughAsNailsEntityActionTypes {
    public static final ActionConfiguration<ThirstExhaustEntityActionType> THIRST_EXHAUST_ENTITY_ACTION =
            register(ActionConfiguration.of(Identifier.of("originstoughasnails","thirst_exhaust"),ThirstExhaustEntityActionType.DATA_FACTORY));
    private static ActionConfiguration<ThirstExhaustEntityActionType> register(ActionConfiguration<ThirstExhaustEntityActionType> a) {
        return a;
    }

    public static void register() {
    }
}
