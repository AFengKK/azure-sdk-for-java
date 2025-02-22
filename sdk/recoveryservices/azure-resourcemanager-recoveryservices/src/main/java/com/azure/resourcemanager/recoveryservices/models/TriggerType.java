// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TriggerType. */
public final class TriggerType extends ExpandableStringEnum<TriggerType> {
    /** Static value UserTriggered for TriggerType. */
    public static final TriggerType USER_TRIGGERED = fromString("UserTriggered");

    /** Static value ForcedUpgrade for TriggerType. */
    public static final TriggerType FORCED_UPGRADE = fromString("ForcedUpgrade");

    /**
     * Creates or finds a TriggerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggerType.
     */
    @JsonCreator
    public static TriggerType fromString(String name) {
        return fromString(name, TriggerType.class);
    }

    /**
     * Gets known TriggerType values.
     *
     * @return known TriggerType values.
     */
    public static Collection<TriggerType> values() {
        return values(TriggerType.class);
    }
}
