package bourse;


/**
* bourse/CCotation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bourse.idl
* Tuesday, January 16, 2018 3:39:57 PM PST
*/

public final class CCotation implements org.omg.CORBA.portable.IDLEntity
{
  public long numCotation = (long)0;
  public String dateCotation = null;
  public double valAction = (double)0;
  public String codeSociete = null;

  public CCotation ()
  {
  } // ctor

  public CCotation (long _numCotation, String _dateCotation, double _valAction, String _codeSociete)
  {
    numCotation = _numCotation;
    dateCotation = _dateCotation;
    valAction = _valAction;
    codeSociete = _codeSociete;
  } // ctor

} // class CCotation
