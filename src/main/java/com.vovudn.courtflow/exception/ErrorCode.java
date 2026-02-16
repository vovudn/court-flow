package com.vovudn.courtflow.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // ===== Lỗi chung (1xxx) =====
    UNCATEGORIZED_EXCEPTION(1001, "Lỗi không xác định.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_PARAMETER_FORMAT(1002, "Định dạng tham số không hợp lệ.", HttpStatus.BAD_REQUEST),
    VALIDATION_FAILED(1003, "Lỗi xác thực dữ liệu.", HttpStatus.BAD_REQUEST),
    BAD_REQUEST(1004, "Yêu cầu không hợp lệ.", HttpStatus.BAD_REQUEST),
    INVALID_SIGNATURE(1005, "Chữ ký không hợp lệ.", HttpStatus.BAD_REQUEST),
    INVALID_KEY(1001, "Key không hợp lệ.", HttpStatus.BAD_REQUEST),
    EXPIRED_TOKEN(401, "Token hết hạn.", HttpStatus.UNAUTHORIZED),
    TOKEN_CREATION_FAIL(400, "Tạo token thất bại.", HttpStatus.BAD_REQUEST),
    URL_GENERATION_FAILED(1012, "Không thể tạo URL. Vui lòng thử lại.", HttpStatus.INTERNAL_SERVER_ERROR),
    USER_NOT_EXISTED(1006, "Người dùng không tồn tại.", HttpStatus.NOT_FOUND),
    // ===== Lỗi Xác thực & Phân quyền (2xxx) =====
    UNAUTHENTICATED(2001, "Yêu cầu xác thực. Vui lòng đăng nhập.", HttpStatus.UNAUTHORIZED),
    ACCESS_DENIED(2002, "Không có quyền truy cập tài nguyên này.", HttpStatus.FORBIDDEN),
    INVALID_CREDENTIALS(2003, "Email hoặc mật khẩu không chính xác.", HttpStatus.UNAUTHORIZED),
    TOKEN_INVALID(2004, "Token không hợp lệ hoặc đã bị thay đổi.", HttpStatus.UNAUTHORIZED),
    TOKEN_EXPIRED(2005, "Token đã hết hạn. Vui lòng đăng nhập lại.", HttpStatus.UNAUTHORIZED),
    ACCOUNT_LOCKED(2006, "Tài khoản đã bị khóa.", HttpStatus.FORBIDDEN),
    ACCOUNT_DISABLED(2007, "Tài khoản đã bị vô hiệu hóa.", HttpStatus.FORBIDDEN),
    EMAIL_NOT_VERIFIED(2008, "Email chưa được xác thực.", HttpStatus.FORBIDDEN),
    ACCOUNT_NOT_VERIFIED(2010, "Tài khoản chưa được xác thực. Vui lòng xác thực tài khoản trước khi tạo dự án.", HttpStatus.FORBIDDEN),
    UNAUTHORIZED(1007, "Bạn không có quyền truy cập tài nguyên này.", HttpStatus.FORBIDDEN),

    FORBIDDEN(2009, "Hành động không được phép.", HttpStatus.FORBIDDEN),

    // ===== Lỗi Hệ thống / Máy chủ (9xxx) =====
    INTERNAL_SERVER_ERROR(9001, "Đã có lỗi xảy ra ở phía máy chủ.", HttpStatus.INTERNAL_SERVER_ERROR),
    DATABASE_ERROR(9002, "Lỗi truy vấn cơ sở dữ liệu.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_DOB(400, "Ngày sinh phải lớn hơn 1950 và nhỏ hơn ngày hiện tại", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(400, "Mật khẩu phải tối thiểu {min} kí tự", HttpStatus.BAD_REQUEST),
    PASSWORD_EXISTED(409, "Mật khẩu đã được sử dụng trước đó", HttpStatus.CONFLICT),
    CONFIRM_PASSWORD_INVALID(400, "Mật khẩu xác nhận không khớp", HttpStatus.BAD_REQUEST);

    private final int code;
    private final String message;
    private final HttpStatus httpStatus;

    ErrorCode(int code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
