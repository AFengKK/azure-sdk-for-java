// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Projection definition for what data to store in Azure Blob. */
@Fluent
public final class SearchIndexerKnowledgeStoreObjectProjectionSelector
        extends SearchIndexerKnowledgeStoreBlobProjectionSelector {
    /**
     * Creates an instance of SearchIndexerKnowledgeStoreObjectProjectionSelector class.
     *
     * @param storageContainer the storageContainer value to set.
     */
    @JsonCreator
    public SearchIndexerKnowledgeStoreObjectProjectionSelector(
            @JsonProperty(value = "storageContainer", required = true) String storageContainer) {
        super(storageContainer);
    }

    /** {@inheritDoc} */
    @Override
    public SearchIndexerKnowledgeStoreObjectProjectionSelector setReferenceKeyName(String referenceKeyName) {
        super.setReferenceKeyName(referenceKeyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SearchIndexerKnowledgeStoreObjectProjectionSelector setGeneratedKeyName(String generatedKeyName) {
        super.setGeneratedKeyName(generatedKeyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SearchIndexerKnowledgeStoreObjectProjectionSelector setSource(String source) {
        super.setSource(source);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SearchIndexerKnowledgeStoreObjectProjectionSelector setSourceContext(String sourceContext) {
        super.setSourceContext(sourceContext);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SearchIndexerKnowledgeStoreObjectProjectionSelector setInputs(List<InputFieldMappingEntry> inputs) {
        super.setInputs(inputs);
        return this;
    }
}
