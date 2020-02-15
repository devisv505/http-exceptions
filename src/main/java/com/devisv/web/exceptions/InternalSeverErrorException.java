package com.devisv.web.exceptions;

import static com.devisv.web.HttpStatus.INTERNAL_SERVER_ERROR;

public class InternalSeverErrorException extends HttpException {

  public InternalSeverErrorException(String message) {
    this(message, null);
  }

  public InternalSeverErrorException(String message, Throwable cause) {
    super(INTERNAL_SERVER_ERROR, message, cause);
  }

}
