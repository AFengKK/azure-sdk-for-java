// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.LiveEventsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventInner;
import com.azure.resourcemanager.mediaservices.models.AsyncOperationResult;
import com.azure.resourcemanager.mediaservices.models.LiveEvent;
import com.azure.resourcemanager.mediaservices.models.LiveEventActionInput;
import com.azure.resourcemanager.mediaservices.models.LiveEvents;

public final class LiveEventsImpl implements LiveEvents {
    private static final ClientLogger LOGGER = new ClientLogger(LiveEventsImpl.class);

    private final LiveEventsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public LiveEventsImpl(
        LiveEventsClient innerClient, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LiveEvent> list(String resourceGroupName, String accountName) {
        PagedIterable<LiveEventInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new LiveEventImpl(inner1, this.manager()));
    }

    public PagedIterable<LiveEvent> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<LiveEventInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new LiveEventImpl(inner1, this.manager()));
    }

    public LiveEvent get(String resourceGroupName, String accountName, String liveEventName) {
        LiveEventInner inner = this.serviceClient().get(resourceGroupName, accountName, liveEventName);
        if (inner != null) {
            return new LiveEventImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LiveEvent> getWithResponse(
        String resourceGroupName, String accountName, String liveEventName, Context context) {
        Response<LiveEventInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, liveEventName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LiveEventImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String liveEventName) {
        this.serviceClient().delete(resourceGroupName, accountName, liveEventName);
    }

    public void delete(String resourceGroupName, String accountName, String liveEventName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, liveEventName, context);
    }

    public void allocate(String resourceGroupName, String accountName, String liveEventName) {
        this.serviceClient().allocate(resourceGroupName, accountName, liveEventName);
    }

    public void allocate(String resourceGroupName, String accountName, String liveEventName, Context context) {
        this.serviceClient().allocate(resourceGroupName, accountName, liveEventName, context);
    }

    public void start(String resourceGroupName, String accountName, String liveEventName) {
        this.serviceClient().start(resourceGroupName, accountName, liveEventName);
    }

    public void start(String resourceGroupName, String accountName, String liveEventName, Context context) {
        this.serviceClient().start(resourceGroupName, accountName, liveEventName, context);
    }

    public void stop(
        String resourceGroupName, String accountName, String liveEventName, LiveEventActionInput parameters) {
        this.serviceClient().stop(resourceGroupName, accountName, liveEventName, parameters);
    }

    public void stop(
        String resourceGroupName,
        String accountName,
        String liveEventName,
        LiveEventActionInput parameters,
        Context context) {
        this.serviceClient().stop(resourceGroupName, accountName, liveEventName, parameters, context);
    }

    public void reset(String resourceGroupName, String accountName, String liveEventName) {
        this.serviceClient().reset(resourceGroupName, accountName, liveEventName);
    }

    public void reset(String resourceGroupName, String accountName, String liveEventName, Context context) {
        this.serviceClient().reset(resourceGroupName, accountName, liveEventName, context);
    }

    public AsyncOperationResult asyncOperation(String resourceGroupName, String accountName, String operationId) {
        AsyncOperationResultInner inner =
            this.serviceClient().asyncOperation(resourceGroupName, accountName, operationId);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AsyncOperationResult> asyncOperationWithResponse(
        String resourceGroupName, String accountName, String operationId, Context context) {
        Response<AsyncOperationResultInner> inner =
            this.serviceClient().asyncOperationWithResponse(resourceGroupName, accountName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LiveEvent operationLocation(
        String resourceGroupName, String accountName, String liveEventName, String operationId) {
        LiveEventInner inner =
            this.serviceClient().operationLocation(resourceGroupName, accountName, liveEventName, operationId);
        if (inner != null) {
            return new LiveEventImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LiveEvent> operationLocationWithResponse(
        String resourceGroupName, String accountName, String liveEventName, String operationId, Context context) {
        Response<LiveEventInner> inner =
            this
                .serviceClient()
                .operationLocationWithResponse(resourceGroupName, accountName, liveEventName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LiveEventImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LiveEvent getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, liveEventName, Context.NONE).getValue();
    }

    public Response<LiveEvent> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, liveEventName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        this.delete(resourceGroupName, accountName, liveEventName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        this.delete(resourceGroupName, accountName, liveEventName, context);
    }

    private LiveEventsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public LiveEventImpl define(String name) {
        return new LiveEventImpl(name, this.manager());
    }
}
