// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Azure key vault key. */
@Fluent
public final class KeyVaultKey {
    /*
     * The key URL, unversioned. For example:
     * https://contosovault.vault.azure.net/keys/azureKey.
     */
    @JsonProperty(value = "keyUrl")
    private String keyUrl;

    /**
     * Get the keyUrl property: The key URL, unversioned. For example:
     * https://contosovault.vault.azure.net/keys/azureKey.
     *
     * @return the keyUrl value.
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set the keyUrl property: The key URL, unversioned. For example:
     * https://contosovault.vault.azure.net/keys/azureKey.
     *
     * @param keyUrl the keyUrl value to set.
     * @return the KeyVaultKey object itself.
     */
    public KeyVaultKey withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
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
