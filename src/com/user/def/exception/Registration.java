package com.user.def.exception;

public class Registration {
  public boolean doRegistration(String _userId) throws UserAlreadyExistsException {
    System.out.println("Registration.doRegistration() START....");
    boolean status = false;
    boolean isUserExists = false;

    // check the userid against the data base then insert the record
    // caller that user is already available in db

    if (!isUserExists) {

      System.out.println("doing registration " + _userId);

      // insert the record to database
      status = true;
    } else {
      System.out.println("user is available in db..." + _userId);

      // inform caller --> throwing user define exception

      throw new UserAlreadyExistsException("user is aleady registerd");
    }
    return status;
  }
}
