package org.keycloak.policy;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.models.PasswordPolicy;

public class ValidateOnLoginPasswordPolicyProviderFactory implements PasswordPolicyProviderFactory {

    @Override
    public String getDisplayName() {
        return "Validate Policy on Login";
    }

    @Override
    public String getConfigType() {
        return null;
    }

    @Override
    public String getDefaultConfigValue() {
        return null;
    }

    @Override
    public boolean isMultiplSupported() {
        return false;
    }

    @Override
    public PasswordPolicyProvider create(KeycloakSession session) {
        return new ValidateOnLoginPasswordPolicyProvider();
    }

    @Override
    public void init(Config.Scope config) {

    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return PasswordPolicy.VALIDATE_ON_LOGIN_ID;
    }
}
