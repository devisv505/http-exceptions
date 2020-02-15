package com.devisv.web;

public enum HttpStatus {

  // 4xx Client Error

  /**
   * {@code 400 Bad Request}.
   *
   * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.1">HTTP/1.1: Semantics and Content, section 6.5.1</a>
   */
  BAD_REQUEST(400, "Bad Request"),
  /**
   * {@code 401 Unauthorized}.
   */
  UNAUTHORIZED(401, "Unauthorized"),
  /**
   * {@code 403 Forbidden}.
   *
   * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.3">HTTP/1.1: Semantics and Content, section 6.5.3</a>
   */
  FORBIDDEN(403, "Forbidden"),
  /**
   * {@code 404 Not Found}.
   *
   * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.5.4">HTTP/1.1: Semantics and Content, section 6.5.4</a>
   */
  NOT_FOUND(404, "Not Found"),

  // 5xx Server Error

  /**
   * {@code 500 Internal Server Error}.
   *
   * @see <a href="https://tools.ietf.org/html/rfc7231#section-6.6.1">HTTP/1.1: Semantics and Content, section 6.6.1</a>
   */
  INTERNAL_SERVER_ERROR(500, "Internal Server Error");

  private final int value;

  private final String description;

  HttpStatus(int value, String description) {
    this.value = value;
    this.description = description;
  }

  public int value() {
    return value;
  }

  public String description() {
    return description;
  }
}
