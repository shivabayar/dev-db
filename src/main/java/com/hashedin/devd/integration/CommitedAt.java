package com.hashedin.devd.integration;

import com.hashedin.devd.realdata.JavaUrlConnectionReader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.TimeZone;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CommitedAt {

	public int lastCommitedAt() {
		JavaUrlConnectionReader realData = new JavaUrlConnectionReader();
		@SuppressWarnings("unused")
		String output = realData.getUrlContents("url");

		List<String> createdData = createdAt("output");

		int l = createdData.size();

		String timeStamp = createdData.get(l);

		l = differenceCalculator(timeStamp);

		return l;
	}

	public int differenceCalculator(String s) {

		TimeZone tz = TimeZone.getTimeZone("UTC");

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");

		df.setTimeZone(tz);

		@SuppressWarnings("unused")
		String currentDate = df.format(new Date());

		return 0;
	}

	public List<String> createdAt(String output) {

		List<String> list = new ArrayList<String>();

		JSONArray jArray;

		try {
			jArray = new JSONArray(output);

			for (int i = 0; i < jArray.length(); i++) {

				JSONObject jsonObj = jArray.getJSONObject(i);

				String type = (String) jsonObj.get("type");

				if (type.endsWith("PushEvent")) {
					String createdAt = (String) jsonObj.get("created_at");

					list.add(createdAt);
				}
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
