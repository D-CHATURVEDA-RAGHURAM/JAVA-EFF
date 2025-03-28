package com.effigo.paymentintegration;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;

import com.effigo.paymentintegration.security.AESEncryptionAlgo;
import org.junit.jupiter.api.Test;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppUtilTest {

	@Test
	void encryptTest() {
		String secret = "iHofE52hm3LsWNrPK1m_YX5IX2gcWrWjZ8El7baauJg";
		String cipher = "rmBE8DR+Qs11XTLb53HvJQ==";
		String plain = "arun";

		System.out.println(AESEncryptionAlgo.decrypt(cipher, secret));
		System.out.println(AESEncryptionAlgo.encrypt(plain, secret));
	}


}
