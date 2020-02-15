package com.devisv.web.exceptions;

import static com.devisv.web.HttpStatus.FORBIDDEN;

public class ForbiddenException extends HttpException {

  public ForbiddenException(String message) {
    this(message, null);
  }

  public ForbiddenException(String message, Throwable cause) {
    super(FORBIDDEN, message, cause);
  }

}
