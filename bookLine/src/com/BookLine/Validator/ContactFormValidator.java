package com.BookLine.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.BookLine.Pojo.Contact;

@Component("contactFormValidator")
public class ContactFormValidator {
	@SuppressWarnings("unchecked")
	
	public boolean supports(Class clazz)
	{
		return Contact.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object model, Errors errors)
	{
		ValidationUtils.rejectIfEmpty(errors, "name", "required.name","Name is required");
	}
}
