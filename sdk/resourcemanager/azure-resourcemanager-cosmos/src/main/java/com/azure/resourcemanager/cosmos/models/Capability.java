// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB capability object. */
@Fluent
public final class Capability {
    /*
     * Name of the Cosmos DB capability. For example, "name": "EnableCassandra". Current values also include
     * "EnableTable" and "EnableGremlin".
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: Name of the Cosmos DB capability. For example, "name": "EnableCassandra". Current values
     * also include "EnableTable" and "EnableGremlin".
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Cosmos DB capability. For example, "name": "EnableCassandra". Current values
     * also include "EnableTable" and "EnableGremlin".
     *
     * @param name the name value to set.
     * @return the Capability object itself.
     */
    public Capability withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
