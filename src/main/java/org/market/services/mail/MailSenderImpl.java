package org.market.services.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service(value = "mailSender")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class MailSenderImpl implements MailSender {

    private final JavaMailSender mailSender;

    @Override
    public void send(String mailTo, String subject, String message) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
            helper.setTo(mailTo);
            helper.setSubject(subject);
            mimeMessage.setContent(message, "text/html");
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
