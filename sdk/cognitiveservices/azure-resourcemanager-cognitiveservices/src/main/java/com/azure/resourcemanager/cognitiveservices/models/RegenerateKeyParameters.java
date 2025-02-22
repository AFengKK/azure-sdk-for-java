// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Regenerate key parameters. */
@Fluent
public final class RegenerateKeyParameters {
    /*
     * key name to generate (Key1|Key2)
     */
    @JsonProperty(value = "keyName", required = true)
    private KeyName keyName;

    /**
     * Get the keyName property: key name to generate (Key1|Key2).
     *
     * @return the keyName value.
     */
    public KeyName keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: key name to generate (Key1|Key2).
     *
     * @param keyName the keyName value to set.
     * @return the RegenerateKeyParameters object itself.
     */
    public RegenerateKeyParameters withKeyName(KeyName keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyName in model RegenerateKeyParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegenerateKeyParameters.class);
}
