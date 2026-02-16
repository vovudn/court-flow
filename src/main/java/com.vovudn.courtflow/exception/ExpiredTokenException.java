package com.vovudn.courtflow.exception;

public class ExpiredTokenException extends AppException {
    public ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
