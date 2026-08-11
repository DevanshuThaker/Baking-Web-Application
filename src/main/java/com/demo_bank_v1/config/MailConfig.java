package com.demo_bank_v1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class MailConfig {

    @Bean
    public static JavaMailSenderImpl getMailConfig(){
        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();

        // Set Properties:
        Properties props = emailConfig.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        // Set Mail Credentials for Gmail SMTP:
        emailConfig.setHost("smtp.gmail.com");
        emailConfig.setPort(587);
        emailConfig.setUsername("devanshu.thaker.2002@gmail.com");
        emailConfig.setPassword("qayivcvucbkfrded"); // Replace with the App Password you generate

        return emailConfig;
    }
    // End Of Email Config Method.
}