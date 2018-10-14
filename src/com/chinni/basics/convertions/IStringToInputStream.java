package com.chinni.basics.convertions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;

public class IStringToInputStream {
	public static void main(String[] args) {
		String val = "chinni";
		InputStream is = new ByteArrayInputStream(val.getBytes(StandardCharsets.UTF_8));
		System.out.println(is);
		// or
		InputStreamReader isr = new InputStreamReader(IOUtils.toInputStream(val));
		System.out.println(isr);
	}
}
