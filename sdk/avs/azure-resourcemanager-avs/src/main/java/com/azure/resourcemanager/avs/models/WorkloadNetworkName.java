// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkloadNetworkName. */
public final class WorkloadNetworkName extends ExpandableStringEnum<WorkloadNetworkName> {
    /** Static value default for WorkloadNetworkName. */
    public static final WorkloadNetworkName DEFAULT = fromString("default");

    /**
     * Creates or finds a WorkloadNetworkName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkloadNetworkName.
     */
    @JsonCreator
    public static WorkloadNetworkName fromString(String name) {
        return fromString(name, WorkloadNetworkName.class);
    }

    /**
     * Gets known WorkloadNetworkName values.
     *
     * @return known WorkloadNetworkName values.
     */
    public static Collection<WorkloadNetworkName> values() {
        return values(WorkloadNetworkName.class);
    }
}
