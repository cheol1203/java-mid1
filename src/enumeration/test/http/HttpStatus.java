package enumeration.test.http;

public enum HttpStatus {
    /*
    HttpStatus 열거형을 만들어라.
    HTTP 상태 코드 정의
        OK
            code: 200
            message: "OK"
        BAD_REQUEST
            code: 400
            message: "Bad Request"
        NOT_FOUND
            code: 404
            message: "Not Found"
        INTERNAL_SERVER_ERROR
            code: 500
            message: "Internal Server Error"

     -참고: HTTP 상태 코드는 200 ~ 299사이의 숫자를 성공을 인정한다.
     HttpStatus 열거형을 완성해라. HttpStatusMain 코드를 참고하자.
     */

    //코드 작성
    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;


    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int httpCodeInput){
        if(httpCodeInput>=200 && httpCodeInput<=299){
            return HttpStatus.OK;
        } else if(httpCodeInput==400){
            return HttpStatus.BAD_REQUEST;
        } else if(httpCodeInput==404){
            return HttpStatus.NOT_FOUND;
        } else if(httpCodeInput==500){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else{
            return null;
        }
    }

    //정답 코드
//    public static HttpStatus findByCode(int code){
//        for(HttpStatus status : values()){
//            if(status.getCode()==code){
//                return status;
//            }
//        }
//        return null;
//    }

    public boolean isSuccess(){
        return code == 200;
    }



//    public boolean isSuccess(){
//        return code >= 200 && code <= 299;
//    }


}
