package com.sky.exception;

/**
 * Exception indicating that an account has been locked.
 */
public class AccountLockedException extends BaseException {

    /**
     * Constructs a new AccountLockedException with no detail message.
     */
    public AccountLockedException() {
    }

    /**
     * Constructs a new AccountLockedException with the specified detail message.
     *
     * @param msg the detail message
     */
    public AccountLockedException(String msg) {
        super(msg);
    }

}
