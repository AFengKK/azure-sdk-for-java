// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Action;
import com.azure.resourcemanager.appcontainers.models.ActiveRevisionsMode;
import com.azure.resourcemanager.appcontainers.models.AppProtocol;
import com.azure.resourcemanager.appcontainers.models.BindingType;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.CustomDomain;
import com.azure.resourcemanager.appcontainers.models.Dapr;
import com.azure.resourcemanager.appcontainers.models.Ingress;
import com.azure.resourcemanager.appcontainers.models.IngressTransportMethod;
import com.azure.resourcemanager.appcontainers.models.IpSecurityRestrictionRule;
import com.azure.resourcemanager.appcontainers.models.LogLevel;
import com.azure.resourcemanager.appcontainers.models.RegistryCredentials;
import com.azure.resourcemanager.appcontainers.models.Secret;
import com.azure.resourcemanager.appcontainers.models.TrafficWeight;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ConfigurationTests {
    @Test
    public void testDeserialize() {
        Configuration model =
            BinaryData
                .fromString(
                    "{\"secrets\":[{\"name\":\"kn\",\"value\":\"scwsv\"},{\"name\":\"otogtwrupqs\",\"value\":\"nmic\"}],\"activeRevisionsMode\":\"Multiple\",\"ingress\":{\"fqdn\":\"o\",\"external\":false,\"targetPort\":2060505199,\"exposedPort\":1344905503,\"transport\":\"tcp\",\"traffic\":[{\"revisionName\":\"fcnj\",\"weight\":534363981,\"latestRevision\":false,\"label\":\"hbttkphyw\"}],\"customDomains\":[{\"name\":\"jtoqne\",\"bindingType\":\"Disabled\",\"certificateId\":\"lfplp\"},{\"name\":\"oxuscrpabgyepsbj\",\"bindingType\":\"Disabled\",\"certificateId\":\"qugxywpmueefjzwf\"},{\"name\":\"kqujidsuyono\",\"bindingType\":\"SniEnabled\",\"certificateId\":\"aocqxtccmgy\"},{\"name\":\"dxyt\",\"bindingType\":\"SniEnabled\",\"certificateId\":\"yrxvwfudwpznt\"}],\"allowInsecure\":false,\"ipSecurityRestrictions\":[{\"name\":\"lrqjbhckfr\",\"description\":\"rxsbkyvp\",\"ipAddressRange\":\"ca\",\"action\":\"Deny\"}]},\"registries\":[{\"server\":\"zka\",\"username\":\"uwbc\",\"passwordSecretRef\":\"wbme\",\"identity\":\"seyvj\"},{\"server\":\"rts\",\"username\":\"spkdee\",\"passwordSecretRef\":\"ofmxagkvtmelmqkr\",\"identity\":\"hvljuahaquh\"},{\"server\":\"hmdua\",\"username\":\"exq\",\"passwordSecretRef\":\"fadmws\",\"identity\":\"r\"}],\"dapr\":{\"enabled\":false,\"appId\":\"gomz\",\"appProtocol\":\"http\",\"appPort\":491284864,\"httpReadBufferSize\":838222488,\"httpMaxRequestSize\":1787960878,\"logLevel\":\"error\",\"enableApiLogging\":true},\"maxInactiveRevisions\":941784903}")
                .toObject(Configuration.class);
        Assertions.assertEquals("kn", model.secrets().get(0).name());
        Assertions.assertEquals("scwsv", model.secrets().get(0).value());
        Assertions.assertEquals(ActiveRevisionsMode.MULTIPLE, model.activeRevisionsMode());
        Assertions.assertEquals(false, model.ingress().external());
        Assertions.assertEquals(2060505199, model.ingress().targetPort());
        Assertions.assertEquals(1344905503, model.ingress().exposedPort());
        Assertions.assertEquals(IngressTransportMethod.TCP, model.ingress().transport());
        Assertions.assertEquals("fcnj", model.ingress().traffic().get(0).revisionName());
        Assertions.assertEquals(534363981, model.ingress().traffic().get(0).weight());
        Assertions.assertEquals(false, model.ingress().traffic().get(0).latestRevision());
        Assertions.assertEquals("hbttkphyw", model.ingress().traffic().get(0).label());
        Assertions.assertEquals("jtoqne", model.ingress().customDomains().get(0).name());
        Assertions.assertEquals(BindingType.DISABLED, model.ingress().customDomains().get(0).bindingType());
        Assertions.assertEquals("lfplp", model.ingress().customDomains().get(0).certificateId());
        Assertions.assertEquals(false, model.ingress().allowInsecure());
        Assertions.assertEquals("lrqjbhckfr", model.ingress().ipSecurityRestrictions().get(0).name());
        Assertions.assertEquals("rxsbkyvp", model.ingress().ipSecurityRestrictions().get(0).description());
        Assertions.assertEquals("ca", model.ingress().ipSecurityRestrictions().get(0).ipAddressRange());
        Assertions.assertEquals(Action.DENY, model.ingress().ipSecurityRestrictions().get(0).action());
        Assertions.assertEquals("zka", model.registries().get(0).server());
        Assertions.assertEquals("uwbc", model.registries().get(0).username());
        Assertions.assertEquals("wbme", model.registries().get(0).passwordSecretRef());
        Assertions.assertEquals("seyvj", model.registries().get(0).identity());
        Assertions.assertEquals(false, model.dapr().enabled());
        Assertions.assertEquals("gomz", model.dapr().appId());
        Assertions.assertEquals(AppProtocol.HTTP, model.dapr().appProtocol());
        Assertions.assertEquals(491284864, model.dapr().appPort());
        Assertions.assertEquals(838222488, model.dapr().httpReadBufferSize());
        Assertions.assertEquals(1787960878, model.dapr().httpMaxRequestSize());
        Assertions.assertEquals(LogLevel.ERROR, model.dapr().logLevel());
        Assertions.assertEquals(true, model.dapr().enableApiLogging());
        Assertions.assertEquals(941784903, model.maxInactiveRevisions());
    }

    @Test
    public void testSerialize() {
        Configuration model =
            new Configuration()
                .withSecrets(
                    Arrays
                        .asList(
                            new Secret().withName("kn").withValue("scwsv"),
                            new Secret().withName("otogtwrupqs").withValue("nmic")))
                .withActiveRevisionsMode(ActiveRevisionsMode.MULTIPLE)
                .withIngress(
                    new Ingress()
                        .withExternal(false)
                        .withTargetPort(2060505199)
                        .withExposedPort(1344905503)
                        .withTransport(IngressTransportMethod.TCP)
                        .withTraffic(
                            Arrays
                                .asList(
                                    new TrafficWeight()
                                        .withRevisionName("fcnj")
                                        .withWeight(534363981)
                                        .withLatestRevision(false)
                                        .withLabel("hbttkphyw")))
                        .withCustomDomains(
                            Arrays
                                .asList(
                                    new CustomDomain()
                                        .withName("jtoqne")
                                        .withBindingType(BindingType.DISABLED)
                                        .withCertificateId("lfplp"),
                                    new CustomDomain()
                                        .withName("oxuscrpabgyepsbj")
                                        .withBindingType(BindingType.DISABLED)
                                        .withCertificateId("qugxywpmueefjzwf"),
                                    new CustomDomain()
                                        .withName("kqujidsuyono")
                                        .withBindingType(BindingType.SNI_ENABLED)
                                        .withCertificateId("aocqxtccmgy"),
                                    new CustomDomain()
                                        .withName("dxyt")
                                        .withBindingType(BindingType.SNI_ENABLED)
                                        .withCertificateId("yrxvwfudwpznt")))
                        .withAllowInsecure(false)
                        .withIpSecurityRestrictions(
                            Arrays
                                .asList(
                                    new IpSecurityRestrictionRule()
                                        .withName("lrqjbhckfr")
                                        .withDescription("rxsbkyvp")
                                        .withIpAddressRange("ca")
                                        .withAction(Action.DENY))))
                .withRegistries(
                    Arrays
                        .asList(
                            new RegistryCredentials()
                                .withServer("zka")
                                .withUsername("uwbc")
                                .withPasswordSecretRef("wbme")
                                .withIdentity("seyvj"),
                            new RegistryCredentials()
                                .withServer("rts")
                                .withUsername("spkdee")
                                .withPasswordSecretRef("ofmxagkvtmelmqkr")
                                .withIdentity("hvljuahaquh"),
                            new RegistryCredentials()
                                .withServer("hmdua")
                                .withUsername("exq")
                                .withPasswordSecretRef("fadmws")
                                .withIdentity("r")))
                .withDapr(
                    new Dapr()
                        .withEnabled(false)
                        .withAppId("gomz")
                        .withAppProtocol(AppProtocol.HTTP)
                        .withAppPort(491284864)
                        .withHttpReadBufferSize(838222488)
                        .withHttpMaxRequestSize(1787960878)
                        .withLogLevel(LogLevel.ERROR)
                        .withEnableApiLogging(true))
                .withMaxInactiveRevisions(941784903);
        model = BinaryData.fromObject(model).toObject(Configuration.class);
        Assertions.assertEquals("kn", model.secrets().get(0).name());
        Assertions.assertEquals("scwsv", model.secrets().get(0).value());
        Assertions.assertEquals(ActiveRevisionsMode.MULTIPLE, model.activeRevisionsMode());
        Assertions.assertEquals(false, model.ingress().external());
        Assertions.assertEquals(2060505199, model.ingress().targetPort());
        Assertions.assertEquals(1344905503, model.ingress().exposedPort());
        Assertions.assertEquals(IngressTransportMethod.TCP, model.ingress().transport());
        Assertions.assertEquals("fcnj", model.ingress().traffic().get(0).revisionName());
        Assertions.assertEquals(534363981, model.ingress().traffic().get(0).weight());
        Assertions.assertEquals(false, model.ingress().traffic().get(0).latestRevision());
        Assertions.assertEquals("hbttkphyw", model.ingress().traffic().get(0).label());
        Assertions.assertEquals("jtoqne", model.ingress().customDomains().get(0).name());
        Assertions.assertEquals(BindingType.DISABLED, model.ingress().customDomains().get(0).bindingType());
        Assertions.assertEquals("lfplp", model.ingress().customDomains().get(0).certificateId());
        Assertions.assertEquals(false, model.ingress().allowInsecure());
        Assertions.assertEquals("lrqjbhckfr", model.ingress().ipSecurityRestrictions().get(0).name());
        Assertions.assertEquals("rxsbkyvp", model.ingress().ipSecurityRestrictions().get(0).description());
        Assertions.assertEquals("ca", model.ingress().ipSecurityRestrictions().get(0).ipAddressRange());
        Assertions.assertEquals(Action.DENY, model.ingress().ipSecurityRestrictions().get(0).action());
        Assertions.assertEquals("zka", model.registries().get(0).server());
        Assertions.assertEquals("uwbc", model.registries().get(0).username());
        Assertions.assertEquals("wbme", model.registries().get(0).passwordSecretRef());
        Assertions.assertEquals("seyvj", model.registries().get(0).identity());
        Assertions.assertEquals(false, model.dapr().enabled());
        Assertions.assertEquals("gomz", model.dapr().appId());
        Assertions.assertEquals(AppProtocol.HTTP, model.dapr().appProtocol());
        Assertions.assertEquals(491284864, model.dapr().appPort());
        Assertions.assertEquals(838222488, model.dapr().httpReadBufferSize());
        Assertions.assertEquals(1787960878, model.dapr().httpMaxRequestSize());
        Assertions.assertEquals(LogLevel.ERROR, model.dapr().logLevel());
        Assertions.assertEquals(true, model.dapr().enableApiLogging());
        Assertions.assertEquals(941784903, model.maxInactiveRevisions());
    }
}
