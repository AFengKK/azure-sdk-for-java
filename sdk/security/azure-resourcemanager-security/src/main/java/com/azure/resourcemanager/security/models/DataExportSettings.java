// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.DataExportSettingProperties;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents a data export setting. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("DataExportSettings")
@Fluent
public final class DataExportSettings extends SettingInner {
    /*
     * Data export setting data
     */
    @JsonProperty(value = "properties")
    private DataExportSettingProperties innerProperties;

    /**
     * Get the innerProperties property: Data export setting data.
     *
     * @return the innerProperties value.
     */
    private DataExportSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabled property: Is the data export setting enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Is the data export setting enabled.
     *
     * @param enabled the enabled value to set.
     * @return the DataExportSettings object itself.
     */
    public DataExportSettings withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataExportSettingProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
