package net.mrgeoves.originsxtoughasnails.action.type;

import io.github.apace100.apoli.Apoli;
import io.github.apace100.apoli.action.ActionConfiguration;

public class OxTanEntityActionTypes {
    public static final ActionConfiguration<Thirst_ExhaustEntityActionType> THIRST_EXHAUST_ENTITY_ACTION = register(ActionConfiguration.of(Apoli.identifier("thirst_exhaust"),Thirst_ExhaustEntityActionType.DATA_FACTORY));
    public static void register() {

    }
}
