package net.mrgeoves.originstoughasnails.action.type;

import io.github.apace100.apoli.action.ActionConfiguration;
import io.github.apace100.apoli.action.context.EntityActionContext;
import io.github.apace100.apoli.action.type.EntityActionType;
import io.github.apace100.apoli.data.TypedDataObjectFactory;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.NotNull;
import toughasnails.api.thirst.IThirst;
import toughasnails.api.thirst.ThirstHelper;

public class ThirstExhaustEntityActionType extends EntityActionType {

    public static final TypedDataObjectFactory<ThirstExhaustEntityActionType> DATA_FACTORY = TypedDataObjectFactory.simple(
            new SerializableData()
                    .add("amount", SerializableDataTypes.FLOAT),
            data -> new ThirstExhaustEntityActionType(
                    data.get("amount")
            ),
            (actionType, serializableData) -> serializableData.instance()
                    .set("amount", actionType.amount)
    );

    private final float amount;

    public ThirstExhaustEntityActionType(float amount) {
        this.amount = amount;
    }

    @Override
    public void accept(EntityActionContext context) {

        if (context.entity() instanceof PlayerEntity player) {
            IThirst thirst = ThirstHelper.getThirst(player);
            thirst.addExhaustion(amount);
        }

    }

    @Override
    protected void execute(Entity entity) {

    }

    @Override
    public @NotNull ActionConfiguration<?> getConfig() {
        return ToughAsNailsEntityActionTypes.THIRST_EXHAUST_ENTITY_ACTION;
    }


}
