package com.alliance.exceptions;

public class ApplicationException extends Exception
{
	public ApplicationException(String arg0,Throwable arg1)
	{
		super(arg0,arg1);
	}
	public ApplicationException(String arg0)
	{
		super(arg0);
	}
	public ApplicationException(Throwable arg1)
	{
		super(arg1);
	}

}
