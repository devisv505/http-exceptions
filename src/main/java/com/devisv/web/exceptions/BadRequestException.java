package com.devisv.web.exceptions;

import java.util.Map;
import static com.devisv.web.HttpStatus.BAD_REQUEST;

public class BadRequestException extends HttpException {

  public BadRequestException(String message) {
    this(message, null);
  }

  public BadRequestException(String message, Throwable cause) {
    this(message, cause, null);
  }

  public BadRequestException(String message, Throwable cause, Map<String, String> body) {
    super(BAD_REQUEST, message, cause, body);
  }
}
