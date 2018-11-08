package org.market.services.mail;

import lombok.NonNull;

public interface MailSender {
    void send(@NonNull String mailTo, @NonNull String subject, @NonNull String message);
}
