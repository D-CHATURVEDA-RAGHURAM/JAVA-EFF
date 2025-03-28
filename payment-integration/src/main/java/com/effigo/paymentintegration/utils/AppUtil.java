package com.effigo.paymentintegration.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@Slf4j
public class AppUtil {

	public static String getHash(String plaintext) {
		String hash = "";

		log.info("inside encrypt password ");
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA");
			md.update(plaintext.getBytes(StandardCharsets.UTF_8));
			hash = Base64.encodeBase64String(md.digest());
		} catch (Exception e) {
			log.error("Error while creating hash for: {} -  {}", plaintext, e);
		}
		return hash;
	}
}
