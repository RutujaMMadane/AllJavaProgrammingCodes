package com.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingDate {
	
	public static Date StringToDate(String dob) throws ParseException{
		
		
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		
		Date date=formatter.parse(dob);
		System.out.println("Date object value:"+date);
		return date;
		
	}

}
