package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
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
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();
        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        }
        else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
