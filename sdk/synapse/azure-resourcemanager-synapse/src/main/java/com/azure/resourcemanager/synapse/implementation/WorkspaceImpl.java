// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.synapse.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.synapse.models.CspWorkspaceAdminProperties;
import com.azure.resourcemanager.synapse.models.DataLakeStorageAccountDetails;
import com.azure.resourcemanager.synapse.models.EncryptionDetails;
import com.azure.resourcemanager.synapse.models.ManagedIdentity;
import com.azure.resourcemanager.synapse.models.ManagedVirtualNetworkSettings;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnection;
import com.azure.resourcemanager.synapse.models.PurviewConfiguration;
import com.azure.resourcemanager.synapse.models.VirtualNetworkProfile;
import com.azure.resourcemanager.synapse.models.Workspace;
import com.azure.resourcemanager.synapse.models.WorkspacePatchInfo;
import com.azure.resourcemanager.synapse.models.WorkspacePublicNetworkAccess;
import com.azure.resourcemanager.synapse.models.WorkspaceRepositoryConfiguration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public final class WorkspaceImpl implements Workspace, Workspace.Definition, Workspace.Update {
    private WorkspaceInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedIdentity identity() {
        return this.innerModel().identity();
    }

    public DataLakeStorageAccountDetails defaultDataLakeStorage() {
        return this.innerModel().defaultDataLakeStorage();
    }

    public String sqlAdministratorLoginPassword() {
        return this.innerModel().sqlAdministratorLoginPassword();
    }

    public String managedResourceGroupName() {
        return this.innerModel().managedResourceGroupName();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String sqlAdministratorLogin() {
        return this.innerModel().sqlAdministratorLogin();
    }

    public VirtualNetworkProfile virtualNetworkProfile() {
        return this.innerModel().virtualNetworkProfile();
    }

    public Map<String, String> connectivityEndpoints() {
        Map<String, String> inner = this.innerModel().connectivityEndpoints();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String managedVirtualNetwork() {
        return this.innerModel().managedVirtualNetwork();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public EncryptionDetails encryption() {
        return this.innerModel().encryption();
    }

    public UUID workspaceUid() {
        return this.innerModel().workspaceUid();
    }

    public Map<String, Object> extraProperties() {
        Map<String, Object> inner = this.innerModel().extraProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedVirtualNetworkSettings managedVirtualNetworkSettings() {
        return this.innerModel().managedVirtualNetworkSettings();
    }

    public WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration() {
        return this.innerModel().workspaceRepositoryConfiguration();
    }

    public PurviewConfiguration purviewConfiguration() {
        return this.innerModel().purviewConfiguration();
    }

    public String adlaResourceId() {
        return this.innerModel().adlaResourceId();
    }

    public WorkspacePublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public CspWorkspaceAdminProperties cspWorkspaceAdminProperties() {
        return this.innerModel().cspWorkspaceAdminProperties();
    }

    public Map<String, Object> settings() {
        Map<String, Object> inner = this.innerModel().settings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Boolean azureADOnlyAuthentication() {
        return this.innerModel().azureADOnlyAuthentication();
    }

    public Boolean trustedServiceBypassEnabled() {
        return this.innerModel().trustedServiceBypassEnabled();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WorkspaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspacePatchInfo updateWorkspacePatchInfo;

    public WorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Workspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    WorkspaceImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new WorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceImpl update() {
        this.updateWorkspacePatchInfo = new WorkspacePatchInfo();
        return this;
    }

    public Workspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .update(resourceGroupName, workspaceName, updateWorkspacePatchInfo, Context.NONE);
        return this;
    }

    public Workspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .update(resourceGroupName, workspaceName, updateWorkspacePatchInfo, context);
        return this;
    }

    WorkspaceImpl(WorkspaceInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public Workspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public WorkspaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkspaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkspaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withTags(tags);
            return this;
        }
    }

    public WorkspaceImpl withIdentity(ManagedIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withIdentity(identity);
            return this;
        }
    }

    public WorkspaceImpl withDefaultDataLakeStorage(DataLakeStorageAccountDetails defaultDataLakeStorage) {
        this.innerModel().withDefaultDataLakeStorage(defaultDataLakeStorage);
        return this;
    }

    public WorkspaceImpl withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword) {
        if (isInCreateMode()) {
            this.innerModel().withSqlAdministratorLoginPassword(sqlAdministratorLoginPassword);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withSqlAdministratorLoginPassword(sqlAdministratorLoginPassword);
            return this;
        }
    }

    public WorkspaceImpl withManagedResourceGroupName(String managedResourceGroupName) {
        this.innerModel().withManagedResourceGroupName(managedResourceGroupName);
        return this;
    }

    public WorkspaceImpl withSqlAdministratorLogin(String sqlAdministratorLogin) {
        this.innerModel().withSqlAdministratorLogin(sqlAdministratorLogin);
        return this;
    }

    public WorkspaceImpl withVirtualNetworkProfile(VirtualNetworkProfile virtualNetworkProfile) {
        this.innerModel().withVirtualNetworkProfile(virtualNetworkProfile);
        return this;
    }

    public WorkspaceImpl withConnectivityEndpoints(Map<String, String> connectivityEndpoints) {
        this.innerModel().withConnectivityEndpoints(connectivityEndpoints);
        return this;
    }

    public WorkspaceImpl withManagedVirtualNetwork(String managedVirtualNetwork) {
        this.innerModel().withManagedVirtualNetwork(managedVirtualNetwork);
        return this;
    }

    public WorkspaceImpl withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.innerModel().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    public WorkspaceImpl withEncryption(EncryptionDetails encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withEncryption(encryption);
            return this;
        }
    }

    public WorkspaceImpl withManagedVirtualNetworkSettings(
        ManagedVirtualNetworkSettings managedVirtualNetworkSettings) {
        if (isInCreateMode()) {
            this.innerModel().withManagedVirtualNetworkSettings(managedVirtualNetworkSettings);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withManagedVirtualNetworkSettings(managedVirtualNetworkSettings);
            return this;
        }
    }

    public WorkspaceImpl withWorkspaceRepositoryConfiguration(
        WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withWorkspaceRepositoryConfiguration(workspaceRepositoryConfiguration);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withWorkspaceRepositoryConfiguration(workspaceRepositoryConfiguration);
            return this;
        }
    }

    public WorkspaceImpl withPurviewConfiguration(PurviewConfiguration purviewConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withPurviewConfiguration(purviewConfiguration);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withPurviewConfiguration(purviewConfiguration);
            return this;
        }
    }

    public WorkspaceImpl withPublicNetworkAccess(WorkspacePublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateWorkspacePatchInfo.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public WorkspaceImpl withCspWorkspaceAdminProperties(CspWorkspaceAdminProperties cspWorkspaceAdminProperties) {
        this.innerModel().withCspWorkspaceAdminProperties(cspWorkspaceAdminProperties);
        return this;
    }

    public WorkspaceImpl withAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
        this.innerModel().withAzureADOnlyAuthentication(azureADOnlyAuthentication);
        return this;
    }

    public WorkspaceImpl withTrustedServiceBypassEnabled(Boolean trustedServiceBypassEnabled) {
        this.innerModel().withTrustedServiceBypassEnabled(trustedServiceBypassEnabled);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
