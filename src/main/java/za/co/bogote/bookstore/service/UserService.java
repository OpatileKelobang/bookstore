package za.co.bogote.bookstore.service;

import za.co.bogote.bookstore.domain.User;
import za.co.bogote.bookstore.domain.security.PasswordResetToken;

public interface UserService {
    PasswordResetToken getPasswordRestToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);
}
