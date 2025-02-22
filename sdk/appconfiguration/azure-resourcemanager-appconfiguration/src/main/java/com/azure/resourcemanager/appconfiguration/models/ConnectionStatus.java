// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectionStatus. */
public final class ConnectionStatus extends ExpandableStringEnum<ConnectionStatus> {
    /** Static value Pending for ConnectionStatus. */
    public static final ConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for ConnectionStatus. */
    public static final ConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for ConnectionStatus. */
    public static final ConnectionStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for ConnectionStatus. */
    public static final ConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a ConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionStatus.
     */
    @JsonCreator
    public static ConnectionStatus fromString(String name) {
        return fromString(name, ConnectionStatus.class);
    }

    /**
     * Gets known ConnectionStatus values.
     *
     * @return known ConnectionStatus values.
     */
    public static Collection<ConnectionStatus> values() {
        return values(ConnectionStatus.class);
    }
}
