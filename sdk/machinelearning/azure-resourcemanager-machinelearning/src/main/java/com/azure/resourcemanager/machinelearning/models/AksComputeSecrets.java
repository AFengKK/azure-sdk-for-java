// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeSecretsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Secrets related to a Machine Learning compute based on AKS. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("AKS")
@Fluent
public final class AksComputeSecrets extends ComputeSecretsInner {
    /*
     * Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     */
    @JsonProperty(value = "userKubeConfig")
    private String userKubeConfig;

    /*
     * Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     */
    @JsonProperty(value = "adminKubeConfig")
    private String adminKubeConfig;

    /*
     * Image registry pull secret.
     */
    @JsonProperty(value = "imagePullSecretName")
    private String imagePullSecretName;

    /**
     * Get the userKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @return the userKubeConfig value.
     */
    public String userKubeConfig() {
        return this.userKubeConfig;
    }

    /**
     * Set the userKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @param userKubeConfig the userKubeConfig value to set.
     * @return the AksComputeSecrets object itself.
     */
    public AksComputeSecrets withUserKubeConfig(String userKubeConfig) {
        this.userKubeConfig = userKubeConfig;
        return this;
    }

    /**
     * Get the adminKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @return the adminKubeConfig value.
     */
    public String adminKubeConfig() {
        return this.adminKubeConfig;
    }

    /**
     * Set the adminKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @param adminKubeConfig the adminKubeConfig value to set.
     * @return the AksComputeSecrets object itself.
     */
    public AksComputeSecrets withAdminKubeConfig(String adminKubeConfig) {
        this.adminKubeConfig = adminKubeConfig;
        return this;
    }

    /**
     * Get the imagePullSecretName property: Image registry pull secret.
     *
     * @return the imagePullSecretName value.
     */
    public String imagePullSecretName() {
        return this.imagePullSecretName;
    }

    /**
     * Set the imagePullSecretName property: Image registry pull secret.
     *
     * @param imagePullSecretName the imagePullSecretName value to set.
     * @return the AksComputeSecrets object itself.
     */
    public AksComputeSecrets withImagePullSecretName(String imagePullSecretName) {
        this.imagePullSecretName = imagePullSecretName;
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
    }
}
