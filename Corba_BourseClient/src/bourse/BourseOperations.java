package bourse;


/**
* bourse/BourseOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bourse.idl
* Tuesday, January 16, 2018 3:39:57 PM PST
*/

public interface BourseOperations 
{
  bourse.CCotation[] getCotations (String cs);
  double getMoyennesCotations (String cs);
} // interface BourseOperations
