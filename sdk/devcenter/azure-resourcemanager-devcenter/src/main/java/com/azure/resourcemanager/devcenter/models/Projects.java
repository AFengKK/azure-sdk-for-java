// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Projects. */
public interface Projects {
    /**
     * Lists all projects in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Project> list();

    /**
     * Lists all projects in the subscription.
     *
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Project> list(Integer top, Context context);

    /**
     * Lists all projects in the resource group.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Project> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all projects in the resource group.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Project> listByResourceGroup(String resourceGroupName, Integer top, Context context);

    /**
     * Gets a specific project.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific project along with {@link Response}.
     */
    Response<Project> getByResourceGroupWithResponse(String resourceGroupName, String projectName, Context context);

    /**
     * Gets a specific project.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific project.
     */
    Project getByResourceGroup(String resourceGroupName, String projectName);

    /**
     * Deletes a project resource.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String projectName);

    /**
     * Deletes a project resource.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String projectName, Context context);

    /**
     * Gets a specific project.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific project along with {@link Response}.
     */
    Project getById(String id);

    /**
     * Gets a specific project.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific project along with {@link Response}.
     */
    Response<Project> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a project resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a project resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Project resource.
     *
     * @param name resource name.
     * @return the first stage of the new Project definition.
     */
    Project.DefinitionStages.Blank define(String name);
}
