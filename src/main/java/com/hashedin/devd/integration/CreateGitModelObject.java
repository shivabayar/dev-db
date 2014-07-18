package com.hashedin.devd.integration;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.hashedin.devd.model.GitModel;
import com.hashedin.devd.realdata.JavaUrlConnectionReader;

public class CreateGitModelObject {

	public List<GitModel> gitModelObject(String userName) {

		JavaUrlConnectionReader realData = new JavaUrlConnectionReader();

		String output = realData.getUrlContents(userName);

		List<GitModel> modelObjList = new ArrayList<GitModel>();

		JSONArray jArray;
		try {
			jArray = new JSONArray(output);

			JSONObject readObj = new JSONObject();

			GitModel gitModel = new GitModel();

			for (int i = 0; i < jArray.length(); i++) {

				JSONObject jsonObj = jArray.getJSONObject(i);

				String type = (String) jsonObj.get("type");

				if (type.endsWith("PushEvent")
						|| type.endsWith("PullRequestEvent")) {

					String createdAt1 = (String) jsonObj.get("created_at");

					readObj.put("createdAt", createdAt1);
					readObj.put("eventType", type);

					gitModel.setCreatedAt(createdAt1);
					gitModel.setEventType(type);

					if (type.endsWith("PullRequestEvent")) {

						JSONObject jsonObj1 = jsonObj.getJSONObject("payload");
						JSONObject jsonObj2 = jsonObj1
								.getJSONObject("pull_request");
						Boolean merged = (Boolean) jsonObj2.get("merged");
						readObj.put("pullAction", merged);
						gitModel.setPullAction(merged);

					} else {
						readObj.put("action", "null");
						gitModel.setPullAction(null);
					}
				}
				modelObjList.add(gitModel);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modelObjList;
	}

}
