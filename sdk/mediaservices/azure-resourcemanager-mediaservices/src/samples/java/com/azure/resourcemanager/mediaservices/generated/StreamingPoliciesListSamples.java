// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for StreamingPolicies List. */
public final class StreamingPoliciesListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2022-08-01/examples/streaming-policies-list.json
     */
    /**
     * Sample code: Lists Streaming Policies.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsStreamingPolicies(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingPolicies().list("contoso", "contosomedia", null, null, null, Context.NONE);
    }
}
