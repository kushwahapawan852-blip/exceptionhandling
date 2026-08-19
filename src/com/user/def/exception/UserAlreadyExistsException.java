package com.user.def.exception;

// user define or business exception
public class UserAlreadyExistsException extends RuntimeException {
  public UserAlreadyExistsException(String _messege) {
    super(_messege);
  }
}
