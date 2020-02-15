package com.devisv.web.exceptions;

import java.util.Map;
import static com.devisv.web.HttpStatus.NOT_FOUND;

public class NotFoundException extends HttpException {

  public NotFoundException(String message) {
    this(message, null);
  }

  public NotFoundException(String message, Throwable cause) {
    this(message, cause, null);
  }

  public NotFoundException(String message, Throwable cause, Map<String, String> body) {
    super(NOT_FOUND, message, cause, body);
  }
}
