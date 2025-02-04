package net.mrgeoves.originstoughasnails.power.type;

import io.github.apace100.apoli.action.EntityAction;
import io.github.apace100.apoli.action.ItemAction;
import io.github.apace100.apoli.condition.EntityCondition;
import io.github.apace100.apoli.condition.ItemCondition;
import io.github.apace100.apoli.data.TypedDataObjectFactory;
import io.github.apace100.apoli.power.PowerConfiguration;
import io.github.apace100.apoli.power.type.PowerType;
import io.github.apace100.apoli.power.type.Prioritized;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataType;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;
import org.jetbrains.annotations.NotNull;
import toughasnails.api.thirst.IThirst;

import java.util.Optional;

public class DrinkableItemPowerType extends PowerType implements Prioritized<DrinkableItemPowerType> {
    public static final TypedDataObjectFactory<DrinkableItemPowerType> DATA_FACTORY = PowerType.createConditionedDataFactory(
            new SerializableData()
                    .add("entity_action", EntityAction.DATA_TYPE.optional(), Optional.empty())
                    .add("item_action", ItemAction.DATA_TYPE.optional(), Optional.empty())
                    .add("result_item_action", ItemAction.DATA_TYPE.optional(), Optional.empty())
                    .add("item_condition", ItemCondition.DATA_TYPE.optional(), Optional.empty())
                    .add("result_stack", SerializableDataTypes.ITEM_STACK.optional(), Optional.empty())
                    .add("consume_animation", SerializableDataType.enumValue(UseAction.class), UseAction.EAT)
                    .add("consume_sound", SerializableDataTypes.SOUND_EVENT, SoundEvents.ENTITY_GENERIC_EAT)
                    .add("priority", SerializableDataTypes.INT, 0),
            (data, condition) -> new DrinkableItemPowerType(
                    data.get("entity_action"),
                    data.get("item_action"),
                    data.get("result_item_action"),
                    data.get("item_condition"),
                    data.get("result_stack"),
                    data.get("consume_animation"),
                    data.get("consume_sound"),
                    data.get("priority"),
                    condition
            ),
            (powerType, serializableData) -> serializableData.instance()
                    .set("entity_action", powerType.entityAction)
                    .set("item_action", powerType.consumedItemAction)
                    .set("result_item_action", powerType.resultItemAction)
                    .set("item_condition", powerType.itemCondition)
                    .set("result_stack", powerType.resultStack)
                    .set("consume_animation", powerType.consumeAnimation)
                    .set("consume_sound", powerType.consumeSoundEvent)
                    .set("priority", powerType.getPriority())

    );

    private final Optional<EntityAction> entityAction;
    private final Optional<ItemAction> resultItemAction;
    private final Optional<ItemAction> consumedItemAction;

    private final Optional<ItemCondition> itemCondition;

    private final Optional<ItemStack> resultStack;
    private final UseAction consumeAnimation;
    private final SoundEvent consumeSoundEvent;


    private final int priority;

    public DrinkableItemPowerType(Optional<EntityAction> entityAction, Optional<ItemAction> consumedItemAction, Optional<ItemAction> resultItemAction, Optional<ItemCondition> itemCondition, Optional<ItemStack> resultStack, UseAction consumeAnimation, SoundEvent consumeSoundEvent, int priority, Optional<EntityCondition> condition) {
        super(condition);
        this.entityAction = entityAction;
        this.consumedItemAction = consumedItemAction;
        this.resultItemAction = resultItemAction;
        this.itemCondition = itemCondition;
        this.resultStack = resultStack;
        this.consumeAnimation = consumeAnimation;
        this.consumeSoundEvent = consumeSoundEvent;
        this.priority = priority;

    }

    @Override
    public @NotNull PowerConfiguration<?> getConfig() {
        return ToughAsNailsPowerTypes.DRINKABLE_ITEM;
    }

    @Override
    public int getPriority() {
        return priority;
    }
}
