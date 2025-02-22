// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.deviceupdate.fluent.models.AccountInner;
import com.azure.resourcemanager.deviceupdate.models.AccountUpdate;

/** An instance of this class provides access to all the operations defined in AccountsClient. */
public interface AccountsClient {
    /**
     * Returns list of Accounts.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Accounts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> list();

    /**
     * Returns list of Accounts.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Accounts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> list(Context context);

    /**
     * Returns list of Accounts.
     *
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Accounts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> listByResourceGroup(String resourceGroupName);

    /**
     * Returns list of Accounts.
     *
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Accounts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Returns account details for the given account name.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device Update account details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Returns account details for the given account name.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device Update account details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountInner> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Checks whether account exists.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void head(String resourceGroupName, String accountName);

    /**
     * Checks whether account exists.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> headWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Creates or updates Account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param account Account details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of device Update account details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginCreate(
        String resourceGroupName, String accountName, AccountInner account);

    /**
     * Creates or updates Account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param account Account details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of device Update account details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginCreate(
        String resourceGroupName, String accountName, AccountInner account, Context context);

    /**
     * Creates or updates Account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param account Account details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device Update account details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner create(String resourceGroupName, String accountName, AccountInner account);

    /**
     * Creates or updates Account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param account Account details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device Update account details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner create(String resourceGroupName, String accountName, AccountInner account, Context context);

    /**
     * Deletes account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName);

    /**
     * Deletes account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, Context context);

    /**
     * Deletes account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Deletes account.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, Context context);

    /**
     * Updates account's patchable properties.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param accountUpdatePayload Updated Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of device Update account details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginUpdate(
        String resourceGroupName, String accountName, AccountUpdate accountUpdatePayload);

    /**
     * Updates account's patchable properties.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param accountUpdatePayload Updated Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of device Update account details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginUpdate(
        String resourceGroupName, String accountName, AccountUpdate accountUpdatePayload, Context context);

    /**
     * Updates account's patchable properties.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param accountUpdatePayload Updated Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device Update account details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(String resourceGroupName, String accountName, AccountUpdate accountUpdatePayload);

    /**
     * Updates account's patchable properties.
     *
     * @param resourceGroupName The resource group name.
     * @param accountName Account name.
     * @param accountUpdatePayload Updated Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return device Update account details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(
        String resourceGroupName, String accountName, AccountUpdate accountUpdatePayload, Context context);
}
