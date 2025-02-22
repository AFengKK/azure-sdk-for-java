// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mediaservices.models.CommonEncryptionCbcs;
import com.azure.resourcemanager.mediaservices.models.CommonEncryptionCenc;
import com.azure.resourcemanager.mediaservices.models.EnvelopeEncryption;
import com.azure.resourcemanager.mediaservices.models.NoEncryption;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A Streaming Policy resource. */
@Fluent
public final class StreamingPolicyInner extends ProxyResource {
    /*
     * Class to specify properties of Streaming Policy
     */
    @JsonProperty(value = "properties")
    private StreamingPolicyProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Class to specify properties of Streaming Policy.
     *
     * @return the innerProperties value.
     */
    private StreamingPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the created property: Creation time of Streaming Policy.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the defaultContentKeyPolicyName property: Default ContentKey used by current Streaming Policy.
     *
     * @return the defaultContentKeyPolicyName value.
     */
    public String defaultContentKeyPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultContentKeyPolicyName();
    }

    /**
     * Set the defaultContentKeyPolicyName property: Default ContentKey used by current Streaming Policy.
     *
     * @param defaultContentKeyPolicyName the defaultContentKeyPolicyName value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingPolicyProperties();
        }
        this.innerProperties().withDefaultContentKeyPolicyName(defaultContentKeyPolicyName);
        return this;
    }

    /**
     * Get the envelopeEncryption property: Configuration of EnvelopeEncryption.
     *
     * @return the envelopeEncryption value.
     */
    public EnvelopeEncryption envelopeEncryption() {
        return this.innerProperties() == null ? null : this.innerProperties().envelopeEncryption();
    }

    /**
     * Set the envelopeEncryption property: Configuration of EnvelopeEncryption.
     *
     * @param envelopeEncryption the envelopeEncryption value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withEnvelopeEncryption(EnvelopeEncryption envelopeEncryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingPolicyProperties();
        }
        this.innerProperties().withEnvelopeEncryption(envelopeEncryption);
        return this;
    }

    /**
     * Get the commonEncryptionCenc property: Configuration of CommonEncryptionCenc.
     *
     * @return the commonEncryptionCenc value.
     */
    public CommonEncryptionCenc commonEncryptionCenc() {
        return this.innerProperties() == null ? null : this.innerProperties().commonEncryptionCenc();
    }

    /**
     * Set the commonEncryptionCenc property: Configuration of CommonEncryptionCenc.
     *
     * @param commonEncryptionCenc the commonEncryptionCenc value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withCommonEncryptionCenc(CommonEncryptionCenc commonEncryptionCenc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingPolicyProperties();
        }
        this.innerProperties().withCommonEncryptionCenc(commonEncryptionCenc);
        return this;
    }

    /**
     * Get the commonEncryptionCbcs property: Configuration of CommonEncryptionCbcs.
     *
     * @return the commonEncryptionCbcs value.
     */
    public CommonEncryptionCbcs commonEncryptionCbcs() {
        return this.innerProperties() == null ? null : this.innerProperties().commonEncryptionCbcs();
    }

    /**
     * Set the commonEncryptionCbcs property: Configuration of CommonEncryptionCbcs.
     *
     * @param commonEncryptionCbcs the commonEncryptionCbcs value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withCommonEncryptionCbcs(CommonEncryptionCbcs commonEncryptionCbcs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingPolicyProperties();
        }
        this.innerProperties().withCommonEncryptionCbcs(commonEncryptionCbcs);
        return this;
    }

    /**
     * Get the noEncryption property: Configurations of NoEncryption.
     *
     * @return the noEncryption value.
     */
    public NoEncryption noEncryption() {
        return this.innerProperties() == null ? null : this.innerProperties().noEncryption();
    }

    /**
     * Set the noEncryption property: Configurations of NoEncryption.
     *
     * @param noEncryption the noEncryption value to set.
     * @return the StreamingPolicyInner object itself.
     */
    public StreamingPolicyInner withNoEncryption(NoEncryption noEncryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingPolicyProperties();
        }
        this.innerProperties().withNoEncryption(noEncryption);
        return this;
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
