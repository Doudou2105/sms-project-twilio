package com.doucode.smsprojecttwilio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {
    
    private String accountSid;
    private String authToken;
    private String trialNumber;

    

    public TwilioConfiguration() {
    }

    /**
     * @return String return the accountSid
     */
    public String getAccountSid() {
        return accountSid;
    }

    /**
     * @param accountSid the accountSid to set
     */
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    /**
     * @return String return the authToken
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * @param authToken the authToken to set
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * @return String return the trialNumber
     */
    public String getTrialNumber() {
        return trialNumber;
    }

    /**
     * @param trialNumber the trialNumber to set
     */
    public void setTrialNumber(String trialNumber) {
        this.trialNumber = trialNumber;
    }

}