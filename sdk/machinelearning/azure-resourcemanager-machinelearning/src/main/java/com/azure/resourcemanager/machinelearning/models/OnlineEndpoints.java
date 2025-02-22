// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of OnlineEndpoints. */
public interface OnlineEndpoints {
    /**
     * List Online Endpoints.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineEndpoint entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OnlineEndpointData> list(String resourceGroupName, String workspaceName);

    /**
     * List Online Endpoints.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Name of the endpoint.
     * @param count Number of endpoints to be retrieved in a page of results.
     * @param computeType EndpointComputeType to be filtered by.
     * @param skip Continuation token for pagination.
     * @param tags A set of tags with which to filter the returned models. It is a comma separated string of tags key or
     *     tags key=value. Example: tagKey1,tagKey2,tagKey3=value3 .
     * @param properties A set of properties with which to filter the returned models. It is a comma separated string of
     *     properties key and/or properties key=value Example: propKey1,propKey2,propKey3=value3 .
     * @param orderBy The option to order the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineEndpoint entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OnlineEndpointData> list(
        String resourceGroupName,
        String workspaceName,
        String name,
        Integer count,
        EndpointComputeType computeType,
        String skip,
        String tags,
        String properties,
        OrderString orderBy,
        Context context);

    /**
     * Delete Online Endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Delete Online Endpoint (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * Get Online Endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return online Endpoint.
     */
    OnlineEndpointData get(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Get Online Endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return online Endpoint along with {@link Response}.
     */
    Response<OnlineEndpointData> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * List EndpointAuthKeys for an Endpoint using Key-based authentication.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return keys for endpoint authentication.
     */
    EndpointAuthKeys listKeys(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * List EndpointAuthKeys for an Endpoint using Key-based authentication.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return keys for endpoint authentication along with {@link Response}.
     */
    Response<EndpointAuthKeys> listKeysWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * Regenerate EndpointAuthKeys for an Endpoint using Key-based authentication (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param body RegenerateKeys request .
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateKeys(
        String resourceGroupName, String workspaceName, String endpointName, RegenerateEndpointKeysRequest body);

    /**
     * Regenerate EndpointAuthKeys for an Endpoint using Key-based authentication (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param body RegenerateKeys request .
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateKeys(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        RegenerateEndpointKeysRequest body,
        Context context);

    /**
     * Retrieve a valid AAD token for an Endpoint using AMLToken-based authentication.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Token.
     */
    EndpointAuthToken getToken(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * Retrieve a valid AAD token for an Endpoint using AMLToken-based authentication.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Token along with {@link Response}.
     */
    Response<EndpointAuthToken> getTokenWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, Context context);

    /**
     * Get Online Endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return online Endpoint along with {@link Response}.
     */
    OnlineEndpointData getById(String id);

    /**
     * Get Online Endpoint.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return online Endpoint along with {@link Response}.
     */
    Response<OnlineEndpointData> getByIdWithResponse(String id, Context context);

    /**
     * Delete Online Endpoint (asynchronous).
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete Online Endpoint (asynchronous).
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new OnlineEndpointData resource.
     *
     * @param name resource name.
     * @return the first stage of the new OnlineEndpointData definition.
     */
    OnlineEndpointData.DefinitionStages.Blank define(String name);
}
