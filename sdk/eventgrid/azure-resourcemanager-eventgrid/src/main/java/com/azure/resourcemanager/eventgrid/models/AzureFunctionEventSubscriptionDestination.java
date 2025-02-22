// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.AzureFunctionEventSubscriptionDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Information about the azure function destination for an event subscription. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("AzureFunction")
@Fluent
public final class AzureFunctionEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Azure Function Properties of the event subscription destination.
     */
    @JsonProperty(value = "properties")
    private AzureFunctionEventSubscriptionDestinationProperties innerProperties;

    /**
     * Get the innerProperties property: Azure Function Properties of the event subscription destination.
     *
     * @return the innerProperties value.
     */
    private AzureFunctionEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     *
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @return the maxEventsPerBatch value.
     */
    public Integer maxEventsPerBatch() {
        return this.innerProperties() == null ? null : this.innerProperties().maxEventsPerBatch();
    }

    /**
     * Set the maxEventsPerBatch property: Maximum number of events per batch.
     *
     * @param maxEventsPerBatch the maxEventsPerBatch value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withMaxEventsPerBatch(maxEventsPerBatch);
        return this;
    }

    /**
     * Get the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @return the preferredBatchSizeInKilobytes value.
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredBatchSizeInKilobytes();
    }

    /**
     * Set the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     *
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withPreferredBatchSizeInKilobytes(
        Integer preferredBatchSizeInKilobytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withPreferredBatchSizeInKilobytes(preferredBatchSizeInKilobytes);
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryAttributeMappings();
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withDeliveryAttributeMappings(deliveryAttributeMappings);
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
