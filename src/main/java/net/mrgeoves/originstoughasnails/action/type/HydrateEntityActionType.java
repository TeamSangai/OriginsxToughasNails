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

public class HydrateEntityActionType extends EntityActionType {
    public static final TypedDataObjectFactory<HydrateEntityActionType> DATA_FACTORY = TypedDataObjectFactory.simple(
            new SerializableData()
                    .add("hydration", SerializableDataTypes.FLOAT)
                    .add("thirst", SerializableDataTypes.INT),
            data -> new HydrateEntityActionType(
                    data.get("hydration"),
                    data.get("thirst")
            ),
            (actionType, serializableData) -> serializableData.instance()
                    .set("hydration", actionType.hydration)
                    .set("thirst", actionType.thirstint)
    );

    private final float hydration;
    private final int thirstint;

    public HydrateEntityActionType(float hydration, int thirstint) {
        this.hydration = hydration;
        this.thirstint = thirstint;
    }
    public void accept(EntityActionContext context) {

        if (context.entity() instanceof PlayerEntity player) {
            IThirst thirst = ThirstHelper.getThirst(player);
            thirst.addHydration(hydration);
            thirst.addThirst(thirstint);
        }

    }
    @Override
    protected void execute(Entity entity) {

    }
    @Override
    public @NotNull ActionConfiguration<?> getConfig() {
        return ToughAsNailsEntityActionTypes.HYDRATE;
    }
}
