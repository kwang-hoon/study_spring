package kr.re.kitri.kitribook.exception;

import org.springframework.jdbc.BadSqlGrammarException;

public class BizException extends RuntimeException {

    public BizException(){}

    public BizException(String msg) {
        super(msg);
    }

    public BizException(String msg, BadSqlGrammarException bsg) {
        super(msg, bsg);
    }
}
