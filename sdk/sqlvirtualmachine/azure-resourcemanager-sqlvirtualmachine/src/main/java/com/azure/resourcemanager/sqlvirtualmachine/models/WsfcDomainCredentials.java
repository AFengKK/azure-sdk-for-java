// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Domain credentials for setting up Windows Server Failover Cluster for SQL availability group. */
@Fluent
public final class WsfcDomainCredentials {
    /*
     * Cluster bootstrap account password.
     */
    @JsonProperty(value = "clusterBootstrapAccountPassword")
    private String clusterBootstrapAccountPassword;

    /*
     * Cluster operator account password.
     */
    @JsonProperty(value = "clusterOperatorAccountPassword")
    private String clusterOperatorAccountPassword;

    /*
     * SQL service account password.
     */
    @JsonProperty(value = "sqlServiceAccountPassword")
    private String sqlServiceAccountPassword;

    /**
     * Get the clusterBootstrapAccountPassword property: Cluster bootstrap account password.
     *
     * @return the clusterBootstrapAccountPassword value.
     */
    public String clusterBootstrapAccountPassword() {
        return this.clusterBootstrapAccountPassword;
    }

    /**
     * Set the clusterBootstrapAccountPassword property: Cluster bootstrap account password.
     *
     * @param clusterBootstrapAccountPassword the clusterBootstrapAccountPassword value to set.
     * @return the WsfcDomainCredentials object itself.
     */
    public WsfcDomainCredentials withClusterBootstrapAccountPassword(String clusterBootstrapAccountPassword) {
        this.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
        return this;
    }

    /**
     * Get the clusterOperatorAccountPassword property: Cluster operator account password.
     *
     * @return the clusterOperatorAccountPassword value.
     */
    public String clusterOperatorAccountPassword() {
        return this.clusterOperatorAccountPassword;
    }

    /**
     * Set the clusterOperatorAccountPassword property: Cluster operator account password.
     *
     * @param clusterOperatorAccountPassword the clusterOperatorAccountPassword value to set.
     * @return the WsfcDomainCredentials object itself.
     */
    public WsfcDomainCredentials withClusterOperatorAccountPassword(String clusterOperatorAccountPassword) {
        this.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
        return this;
    }

    /**
     * Get the sqlServiceAccountPassword property: SQL service account password.
     *
     * @return the sqlServiceAccountPassword value.
     */
    public String sqlServiceAccountPassword() {
        return this.sqlServiceAccountPassword;
    }

    /**
     * Set the sqlServiceAccountPassword property: SQL service account password.
     *
     * @param sqlServiceAccountPassword the sqlServiceAccountPassword value to set.
     * @return the WsfcDomainCredentials object itself.
     */
    public WsfcDomainCredentials withSqlServiceAccountPassword(String sqlServiceAccountPassword) {
        this.sqlServiceAccountPassword = sqlServiceAccountPassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
