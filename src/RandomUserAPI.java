



import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject;

import com.google.gson.Gson;


public class RandomUserAPI {

	private ApiInfo info;
	private List<ApiResults> results;

	public ApiInfo getInfo() {
		return info;
	}

	public void setInfo(ApiInfo info) {
		this.info = info;
	}

	public List<ApiResults> getResults() {
		return results;
	}

	public void setResults(List<ApiResults> results) {
		this.results = results;
	}

}
