// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enabled or Disabled. */
public final class EnhancedSecurityState extends ExpandableStringEnum<EnhancedSecurityState> {
    /** Static value Invalid for EnhancedSecurityState. */
    public static final EnhancedSecurityState INVALID = fromString("Invalid");

    /** Static value Enabled for EnhancedSecurityState. */
    public static final EnhancedSecurityState ENABLED = fromString("Enabled");

    /** Static value Disabled for EnhancedSecurityState. */
    public static final EnhancedSecurityState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a EnhancedSecurityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnhancedSecurityState.
     */
    @JsonCreator
    public static EnhancedSecurityState fromString(String name) {
        return fromString(name, EnhancedSecurityState.class);
    }

    /**
     * Gets known EnhancedSecurityState values.
     *
     * @return known EnhancedSecurityState values.
     */
    public static Collection<EnhancedSecurityState> values() {
        return values(EnhancedSecurityState.class);
    }
}
