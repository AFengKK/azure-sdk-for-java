// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.AutoProvision;
import com.azure.resourcemanager.security.models.AwAssumeRoleAuthenticationDetailsProperties;
import com.azure.resourcemanager.security.models.AwsCredsAuthenticationDetailsProperties;
import com.azure.resourcemanager.security.models.GcpCredentialsDetailsProperties;
import com.azure.resourcemanager.security.models.HybridComputeSettingsProperties;
import com.azure.resourcemanager.security.models.ProxyServerProperties;
import com.azure.resourcemanager.security.models.ServicePrincipalProperties;

/** Samples for Connectors CreateOrUpdate. */
public final class ConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2020-01-01-preview/examples/Connectors/CreateUpdateGcpCredentialsConnectorSubscription_example.json
     */
    /**
     * Sample code: gcpCredentials - Create a cloud account connector for a subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void gcpCredentialsCreateACloudAccountConnectorForASubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .connectors()
            .define("gcp_dev")
            .withHybridComputeSettings(new HybridComputeSettingsProperties().withAutoProvision(AutoProvision.OFF))
            .withAuthenticationDetails(
                new GcpCredentialsDetailsProperties()
                    .withOrganizationId("AscDemoOrg")
                    .withType("service_account")
                    .withProjectId("asc-project-1234")
                    .withPrivateKeyId("6efg587hra2568as34d22326b044cc20dc2af")
                    .withPrivateKey(
                        "-----BEGIN PRIVATE KEY-----\n"
                            + "FAKE_PRIVATE_KEY_PLACEHOLDER"
                            + "-----END PRIVATE KEY-----\n")
                    .withClientEmail("asc-135@asc-project-1234.iam.gserviceaccount.com")
                    .withClientId("105889053725632919854")
                    .withAuthUri("https://accounts.google.com/o/oauth2/auth")
                    .withTokenUri("https://oauth2.googleapis.com/token")
                    .withAuthProviderX509CertUrl("https://www.googleapis.com/oauth2/v1/certs")
                    .withClientX509CertUrl(
                        "https://www.googleapis.com/robot/v1/metadata/x509/asc-135%40asc-project-1234.iam.gserviceaccount.com"))
            .create();
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2020-01-01-preview/examples/Connectors/CreateUpdateAwsCredConnectorSubscription_example.json
     */
    /**
     * Sample code: AwsCred - Create a cloud account connector for a subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void awsCredCreateACloudAccountConnectorForASubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .connectors()
            .define("aws_dev1")
            .withHybridComputeSettings(
                new HybridComputeSettingsProperties()
                    .withAutoProvision(AutoProvision.ON)
                    .withResourceGroupName("AwsConnectorRG")
                    .withRegion("West US 2")
                    .withProxyServer(new ProxyServerProperties().withIp("167.220.197.140").withPort("34"))
                    .withServicePrincipal(
                        new ServicePrincipalProperties()
                            .withApplicationId("ad9bcd79-be9c-45ab-abd8-80ca1654a7d1")
                            .withSecret("<secret>")))
            .withAuthenticationDetails(
                new AwsCredsAuthenticationDetailsProperties()
                    .withAwsAccessKeyId("AKIARPZCNODDNAEQFSOE")
                    .withAwsSecretAccessKey("<awsSecretAccessKey>"))
            .create();
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2020-01-01-preview/examples/Connectors/CreateUpdateAwsAssumeRoleConnectorSubscription_example.json
     */
    /**
     * Sample code: AwsAssumeRole - Create a cloud account connector for a subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void awsAssumeRoleCreateACloudAccountConnectorForASubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .connectors()
            .define("aws_dev2")
            .withHybridComputeSettings(
                new HybridComputeSettingsProperties()
                    .withAutoProvision(AutoProvision.ON)
                    .withResourceGroupName("AwsConnectorRG")
                    .withRegion("West US 2")
                    .withProxyServer(new ProxyServerProperties().withIp("167.220.197.140").withPort("34"))
                    .withServicePrincipal(
                        new ServicePrincipalProperties()
                            .withApplicationId("ad9bcd79-be9c-45ab-abd8-80ca1654a7d1")
                            .withSecret("<secret>")))
            .withAuthenticationDetails(
                new AwAssumeRoleAuthenticationDetailsProperties()
                    .withAwsAssumeRoleArn("arn:aws:iam::81231569658:role/AscConnector")
                    .withAwsExternalId("20ff7fc3-e762-44dd-bd96-b71116dcdc23"))
            .create();
    }
}
