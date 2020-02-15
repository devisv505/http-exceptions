package com.devisv.web.exceptions;

import com.devisv.web.HttpStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Root of exception
 */
@JsonIgnoreProperties({"message", "localizedMessage", "stackTrace", "suppressed", "cause", "args", "messageKey", "stackTrace"})
public class HttpException extends RuntimeException {

  @JsonIgnore
  private HttpStatus httpStatus;

  @JsonProperty("exception")
  private String localizedMessage;

  @JsonProperty("body")
  @JsonInclude(Include.NON_NULL)
  private Map<String, String> body;

  public HttpException(HttpStatus httpStatus, String message, Throwable cause, Map<String, String> body) {
    super(message, cause);
    this.httpStatus = httpStatus;
    this.localizedMessage = message;
    this.body = body;
  }

  public HttpException(HttpStatus httpStatus, String message, Throwable cause) {
    super(message, cause);
    this.httpStatus = httpStatus;
    this.localizedMessage = message;
  }

  public Map<String, String> getBody() {
    return body;
  }

  @JsonProperty("status")
  public int getStatus() {
    return httpStatus.value();
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  @Override
  public String getLocalizedMessage() {
    return localizedMessage;
  }
}
