package net.mrgeoves.originstoughasnails.action.type;

import io.github.apace100.apoli.action.ActionConfiguration;
import io.github.apace100.apoli.action.type.EntityActionTypes;
import net.minecraft.util.Identifier;

public class ToughAsNailsEntityActionTypes {
    public static final ActionConfiguration<ThirstExhaustEntityActionType> THIRST_EXHAUST =
            EntityActionTypes.register(ActionConfiguration.of(Identifier.of("originstoughasnails","thirst_exhaust"),ThirstExhaustEntityActionType.DATA_FACTORY));
    public static final ActionConfiguration<HydrateEntityActionType> HYDRATE =
            EntityActionTypes.register(ActionConfiguration.of(Identifier.of("originstoughasnails", "hydrate"),HydrateEntityActionType.DATA_FACTORY));
    public static void register() {
    }
}
