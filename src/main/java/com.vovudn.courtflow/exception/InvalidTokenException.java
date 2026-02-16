package com.vovudn.courtflow.exception;

public class InvalidTokenException extends AppException {
    public InvalidTokenException() {
        super(ErrorCode.UNAUTHENTICATED);
    }
}
