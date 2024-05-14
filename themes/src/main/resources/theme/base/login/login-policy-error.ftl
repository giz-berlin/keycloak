<#import "template.ftl" as layout>
<@layout.registrationLayout displayMessage=false; section>
    <#if section = "header">
        ${msg("passwordPolicyErrorTitle")}
    <#elseif section = "form">
    <div id="kc-terms-text">
        ${kcSanitize(msg("passwordPolicyErrorMessage"))?no_esc}
    </div>
    <form class="form-actions" action="${url.loginAction}" method="POST">
        <#if !userReadOnly>
            <input class="${properties.kcButtonClass!} ${properties.kcButtonPrimaryClass!} ${properties.kcButtonLargeClass!}" name="continueToUpdate" id="kc-accept" type="submit" value="${msg("doContinue")}"/>
        </#if>
        <input class="${properties.kcButtonClass!} ${properties.kcButtonDefaultClass!} ${properties.kcButtonLargeClass!}" name="cancelUpdate" id="kc-decline" type="submit" value="${msg("doCancel")}"/>
    </form>
    <div class="clearfix"></div>
    </#if>
</@layout.registrationLayout>
