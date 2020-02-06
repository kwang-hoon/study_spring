package kr.re.kitri.kitribook.exception;

import org.apache.ibatis.type.StringTypeHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BizException.class)
    public String handelBizException(BizException be) {
        if(be.getMessage().contains("KITRI-0023")) {
            return  "25번에러";
        }
        else {
            return "정의되지않은 에러";
        }
    }

    @ExceptionHandler(value = SQLException.class)
    public String handleSQLException(SQLException se) {
        System.out.println(); se.getMessage();
        return "사용에 불편을 드려 죄송합니다.";
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public String handleArithmeticException(ArithmeticException ae) {
        System.out.println(ae.getMessage());
        return "나누다가 잘못 나눴어요.";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e) {
        System.out.println(e.getMessage());
        return "기타 등등 예외... " + e.getMessage();
    }
}
