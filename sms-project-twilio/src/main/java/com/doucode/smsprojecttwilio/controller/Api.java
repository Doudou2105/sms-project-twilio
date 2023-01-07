package com.doucode.smsprojecttwilio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doucode.smsprojecttwilio.model.SmsRequest;

@RestController
@RequestMapping("api/sms")
public class Api {
    
    private final TwilioService twilioService;

    @Autowired
    public Api(TwilioService twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        twilioService.sendSms(smsRequest);
    }

}