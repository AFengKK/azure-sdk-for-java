// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.ComplianceSegment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Compliance of a scope. */
@Fluent
public final class ComplianceInner extends ProxyResource {
    /*
     * Compliance data
     */
    @JsonProperty(value = "properties")
    private ComplianceProperties innerProperties;

    /**
     * Get the innerProperties property: Compliance data.
     *
     * @return the innerProperties value.
     */
    private ComplianceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the assessmentTimestampUtcDate property: The timestamp when the Compliance calculation was conducted.
     *
     * @return the assessmentTimestampUtcDate value.
     */
    public OffsetDateTime assessmentTimestampUtcDate() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentTimestampUtcDate();
    }

    /**
     * Get the resourceCount property: The resource count of the given subscription for which the Compliance calculation
     * was conducted (needed for Management Group Compliance calculation).
     *
     * @return the resourceCount value.
     */
    public Integer resourceCount() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceCount();
    }

    /**
     * Get the assessmentResult property: An array of segment, which is the actually the compliance assessment.
     *
     * @return the assessmentResult value.
     */
    public List<ComplianceSegment> assessmentResult() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentResult();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
