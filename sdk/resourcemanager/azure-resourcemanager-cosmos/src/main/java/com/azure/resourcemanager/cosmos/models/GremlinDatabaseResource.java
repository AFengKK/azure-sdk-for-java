// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB Gremlin database resource object. */
@Fluent
public class GremlinDatabaseResource {
    /*
     * Name of the Cosmos DB Gremlin database
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Name of the Cosmos DB Gremlin database.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB Gremlin database.
     *
     * @param id the id value to set.
     * @return the GremlinDatabaseResource object itself.
     */
    public GremlinDatabaseResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model GremlinDatabaseResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GremlinDatabaseResource.class);
}
