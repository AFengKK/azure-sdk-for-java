// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for WorkloadsClient class. */
public interface WorkloadsClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the PhpWorkloadsClient object to access its operations.
     *
     * @return the PhpWorkloadsClient object.
     */
    PhpWorkloadsClient getPhpWorkloads();

    /**
     * Gets the WordpressInstancesClient object to access its operations.
     *
     * @return the WordpressInstancesClient object.
     */
    WordpressInstancesClient getWordpressInstances();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the SapVirtualInstancesClient object to access its operations.
     *
     * @return the SapVirtualInstancesClient object.
     */
    SapVirtualInstancesClient getSapVirtualInstances();

    /**
     * Gets the SapCentralInstancesClient object to access its operations.
     *
     * @return the SapCentralInstancesClient object.
     */
    SapCentralInstancesClient getSapCentralInstances();

    /**
     * Gets the SapDatabaseInstancesClient object to access its operations.
     *
     * @return the SapDatabaseInstancesClient object.
     */
    SapDatabaseInstancesClient getSapDatabaseInstances();

    /**
     * Gets the SapApplicationServerInstancesClient object to access its operations.
     *
     * @return the SapApplicationServerInstancesClient object.
     */
    SapApplicationServerInstancesClient getSapApplicationServerInstances();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the MonitorsClient object to access its operations.
     *
     * @return the MonitorsClient object.
     */
    MonitorsClient getMonitors();

    /**
     * Gets the ProviderInstancesClient object to access its operations.
     *
     * @return the ProviderInstancesClient object.
     */
    ProviderInstancesClient getProviderInstances();

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    SkusClient getSkus();
}
