package sliu.config.jwt.vo;

public enum ResponseCodeEnum {

    SUCCESS(0, "成功"),
     FAIL(-1, "失败"),
     LOGIN_ERROR(1000, "用户名或密码错误"),
        LOGIN_CODE_ERROR(1001, "验证码错误"),
     UNKNOWN_ERROR(2000, "未知错误"),
     PARAMETER_ILLEGAL(2001, "参数不合法"),
     TOKEN_INVALID(2002, "无效的Token"),
     TOKEN_SIGNATURE_INVALID(2003, "无效的签名"),
     TOKEN_EXPIRED(2004, "token已过期"),
     TOKEN_MISSION(2005, "token缺失"),
     REFRESH_TOKEN_INVALID(2006, "刷新Token无效");


     private int errorCode;

     private String message;

     ResponseCodeEnum(int errorCode, String message) {
         this.errorCode = errorCode;
         this.message = message;
     }

     public int getErrorCode() {
         return errorCode;
     }

     public String getMessage() {
         return message;
     }
}
