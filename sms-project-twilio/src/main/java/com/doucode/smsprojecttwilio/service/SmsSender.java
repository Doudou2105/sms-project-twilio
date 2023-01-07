package com.doucode.smsprojecttwilio.service;

import com.doucode.smsprojecttwilio.model.SmsRequest;

public interface SmsSender {
    
    void sendSms(SmsRequest smsRequest);
}