package com.app.util;

import java.sql.Time;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.jk.util.JKDateTimeUtil;

@FacesConverter(value="com.smartcloud.timeConvertor",forClass = Time.class)
public class TimeConverter implements Converter {

	private static final String PATTERN = "HH:mm";

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value==null || value.trim().equals("")) {
			return null;
		}
		long time=JKDateTimeUtil.parseDate(value, PATTERN).getTime();
		return new Time(time);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value==null) {
			return "";
		}
		return JKDateTimeUtil.formatDate((Date) value,PATTERN);
	}
}