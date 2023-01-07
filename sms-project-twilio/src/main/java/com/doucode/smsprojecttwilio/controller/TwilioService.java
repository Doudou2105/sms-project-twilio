package com.doucode.smsprojecttwilio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.doucode.smsprojecttwilio.model.SmsRequest;
import com.doucode.smsprojecttwilio.service.SmsSender;
import com.doucode.smsprojecttwilio.service.TwilioSmsSender;

@Service
public class TwilioService {

    private final SmsSender smsSender;

    @Autowired
    public TwilioService(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
    
}