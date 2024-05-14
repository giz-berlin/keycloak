package org.keycloak.policy;

import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class ValidateOnLoginPasswordPolicyProvider implements PasswordPolicyProvider {
    @Override
    public PolicyError validate(RealmModel realm, UserModel user, String password) {
        return null;
    }

    @Override
    public PolicyError validate(String user, String password) {
        return null;
    }

    @Override
    public Object parseConfig(String value) {
        return null;
    }

    @Override
    public void close() {

    }
}
