// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeStatusTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Self-hosted integration runtime status. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SelfHosted")
@Fluent
public final class SelfHostedIntegrationRuntimeStatus extends IntegrationRuntimeStatus {
    /*
     * Self-hosted integration runtime status type properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SelfHostedIntegrationRuntimeStatusTypeProperties innerTypeProperties =
        new SelfHostedIntegrationRuntimeStatusTypeProperties();

    /**
     * Get the innerTypeProperties property: Self-hosted integration runtime status type properties.
     *
     * @return the innerTypeProperties value.
     */
    private SelfHostedIntegrationRuntimeStatusTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the createTime property: The time at which the integration runtime was created, in ISO8601 format.
     *
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().createTime();
    }

    /**
     * Get the taskQueueId property: The task queue id of the integration runtime.
     *
     * @return the taskQueueId value.
     */
    public String taskQueueId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().taskQueueId();
    }

    /**
     * Get the nodeCommunicationChannelEncryptionMode property: The node communication Channel encryption mode.
     *
     * @return the nodeCommunicationChannelEncryptionMode value.
     */
    public String nodeCommunicationChannelEncryptionMode() {
        return this.innerTypeProperties() == null
            ? null
            : this.innerTypeProperties().nodeCommunicationChannelEncryptionMode();
    }

    /**
     * Get the internalChannelEncryption property: It is used to set the encryption mode for node-node communication
     * channel (when more than 2 self-hosted integration runtime nodes exist).
     *
     * @return the internalChannelEncryption value.
     */
    public IntegrationRuntimeInternalChannelEncryptionMode internalChannelEncryption() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().internalChannelEncryption();
    }

    /**
     * Get the version property: Version of the integration runtime.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().version();
    }

    /**
     * Get the nodes property: The list of nodes for this integration runtime.
     *
     * @return the nodes value.
     */
    public List<SelfHostedIntegrationRuntimeNodeInner> nodes() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().nodes();
    }

    /**
     * Set the nodes property: The list of nodes for this integration runtime.
     *
     * @param nodes the nodes value to set.
     * @return the SelfHostedIntegrationRuntimeStatus object itself.
     */
    public SelfHostedIntegrationRuntimeStatus withNodes(List<SelfHostedIntegrationRuntimeNodeInner> nodes) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SelfHostedIntegrationRuntimeStatusTypeProperties();
        }
        this.innerTypeProperties().withNodes(nodes);
        return this;
    }

    /**
     * Get the scheduledUpdateDate property: The date at which the integration runtime will be scheduled to update, in
     * ISO8601 format.
     *
     * @return the scheduledUpdateDate value.
     */
    public OffsetDateTime scheduledUpdateDate() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scheduledUpdateDate();
    }

    /**
     * Get the updateDelayOffset property: The time in the date scheduled by service to update the integration runtime,
     * e.g., PT03H is 3 hours.
     *
     * @return the updateDelayOffset value.
     */
    public String updateDelayOffset() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().updateDelayOffset();
    }

    /**
     * Get the localTimeZoneOffset property: The local time zone offset in hours.
     *
     * @return the localTimeZoneOffset value.
     */
    public String localTimeZoneOffset() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().localTimeZoneOffset();
    }

    /**
     * Get the capabilities property: Object with additional information about integration runtime capabilities.
     *
     * @return the capabilities value.
     */
    public Map<String, String> capabilities() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().capabilities();
    }

    /**
     * Get the serviceUrls property: The URLs for the services used in integration runtime backend service.
     *
     * @return the serviceUrls value.
     */
    public List<String> serviceUrls() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceUrls();
    }

    /**
     * Get the autoUpdate property: Whether Self-hosted integration runtime auto update has been turned on.
     *
     * @return the autoUpdate value.
     */
    public IntegrationRuntimeAutoUpdate autoUpdate() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().autoUpdate();
    }

    /**
     * Get the versionStatus property: Status of the integration runtime version.
     *
     * @return the versionStatus value.
     */
    public String versionStatus() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().versionStatus();
    }

    /**
     * Get the links property: The list of linked integration runtimes that are created to share with this integration
     * runtime.
     *
     * @return the links value.
     */
    public List<LinkedIntegrationRuntime> links() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().links();
    }

    /**
     * Set the links property: The list of linked integration runtimes that are created to share with this integration
     * runtime.
     *
     * @param links the links value to set.
     * @return the SelfHostedIntegrationRuntimeStatus object itself.
     */
    public SelfHostedIntegrationRuntimeStatus withLinks(List<LinkedIntegrationRuntime> links) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SelfHostedIntegrationRuntimeStatusTypeProperties();
        }
        this.innerTypeProperties().withLinks(links);
        return this;
    }

    /**
     * Get the pushedVersion property: The version that the integration runtime is going to update to.
     *
     * @return the pushedVersion value.
     */
    public String pushedVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().pushedVersion();
    }

    /**
     * Get the latestVersion property: The latest version on download center.
     *
     * @return the latestVersion value.
     */
    public String latestVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().latestVersion();
    }

    /**
     * Get the autoUpdateEta property: The estimated time when the self-hosted integration runtime will be updated.
     *
     * @return the autoUpdateEta value.
     */
    public OffsetDateTime autoUpdateEta() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().autoUpdateEta();
    }

    /**
     * Get the serviceRegion property: The service region of the integration runtime.
     *
     * @return the serviceRegion value.
     */
    public String serviceRegion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceRegion();
    }

    /**
     * Set the serviceRegion property: The service region of the integration runtime.
     *
     * @param serviceRegion the serviceRegion value to set.
     * @return the SelfHostedIntegrationRuntimeStatus object itself.
     */
    public SelfHostedIntegrationRuntimeStatus withServiceRegion(String serviceRegion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SelfHostedIntegrationRuntimeStatusTypeProperties();
        }
        this.innerTypeProperties().withServiceRegion(serviceRegion);
        return this;
    }

    /**
     * Get the newerVersions property: The newer versions on download center.
     *
     * @return the newerVersions value.
     */
    public List<String> newerVersions() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newerVersions();
    }

    /**
     * Set the newerVersions property: The newer versions on download center.
     *
     * @param newerVersions the newerVersions value to set.
     * @return the SelfHostedIntegrationRuntimeStatus object itself.
     */
    public SelfHostedIntegrationRuntimeStatus withNewerVersions(List<String> newerVersions) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SelfHostedIntegrationRuntimeStatusTypeProperties();
        }
        this.innerTypeProperties().withNewerVersions(newerVersions);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SelfHostedIntegrationRuntimeStatus"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SelfHostedIntegrationRuntimeStatus.class);
}
