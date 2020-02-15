package com.devisv.web.exceptions;

import static com.devisv.web.HttpStatus.UNAUTHORIZED;

public class UnauthorizedException extends HttpException {

  public UnauthorizedException(String message) {
    this(message, null);
  }

  public UnauthorizedException(String message, Throwable cause) {
    super(UNAUTHORIZED, message, cause);
  }

}
