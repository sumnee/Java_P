package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {

	public void exercise1() {
		// ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦ /±âÁØÀ¸·Î Àß¶ó¼­ ÄáÁã¸¸ Ãâ·Â

		String data = "ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		StringTokenizer st = new StringTokenizer(data, "/");
		while (st.hasMoreTokens()) {
			if (st.nextToken().equals("ÄáÁã")) {
				System.out.println("ÄáÁã");
			}
		}

	}
}
