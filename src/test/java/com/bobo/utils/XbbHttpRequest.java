package com.bobo.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.net.URLEncoder;

@Slf4j
public class XbbHttpRequest {

	public static final String XBB_DING_TALK_ROOT = "https://dingtalk.xbongbong.com";
	public static final String corpid = "ding1c021fafb3d36d5935c2f4657eb6378f";
	public static final String token = "4feda3dc0121407efb71945db68ca852";
	public static final String JSESSIONID = "1x4iq9vq89g0qsg8ke83cl738as32ro7"; // 网页登录之后可获取该值

	public static String getXbbUrl(String uri) {
		return XBB_DING_TALK_ROOT + uri;
	}

	public static String getDataSign(JSONObject data, String token) {
		return getDataSign(data.toJSONString(), token);
	}

	public static String getDataSign(String data, String token) {
		return  DigestUtil.Encrypt(data + token, "SHA-256");
	}

	public static HttpRequest getXbbApiRequest(String url) {
		HttpRequest request = HttpUtil.createPost(url);
		request.header("Host","dingtalk.xbongbong.com");
		request.header("Connection","keep-alive");
		request.header("Accept","application/json, text/plain, */*");
		request.header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
		request.header("Content-Type","application/x-www-form-urlencoded");
		request.header("Origin","https://dingtalk.xbongbong.com");
		request.header("Sec-Fetch-Site","same-origin");
		request.header("Sec-Fetch-Mode","cors");
		request.header("Referer","https://dingtalk.xbongbong.com//jxc.htm");
		request.header("Accept-Encoding","gzip, deflate, br");
		request.header("Accept-Language","zh-CN,zh;q=0.9,en;q=0.8");
		request.header("Cookie","__wpkreporterwid_=4fa3c01b-31ba-476b-2e58-5183b4a3d008; SHAREJSESSIONID=7b91c632-011f-4c95-90d2-42b50cc5ccd7; rememberMe=8f338QFac/sX0u4om+F83P3zAsALjrUaPjwAjqArCkWdltOpnuaKoSAx/iYAZRJt9+ly1i3OKgT7+Fz9mZq383iPD6oRymCFdHOgVPBklBNma6/7aMyx63SJDhBjKVQyxGa59DQB/0O+aOgG2EygZM9731/U+g7aVEEQbwdta7XYP9BkSe5rzTom3Wc0VAU/WqaZAj1KPSqP51OoJJQj023yHGZeKcEEsYm4/E2UgywfwuHeHliJFrUtknpuwqI4vTaZUc6zTUlCAM3jUhyDFH4ygmE+qjMIaYrTlBx+rCo2VPiRnKvTXPPKBOlPocdL8wU/C0bnuWjEBBpMWV7TMAHQt+wKULZcGLCVd2yNBMyPxoBy9elnytOd/9tzUkUSUSZ6LVNVtDVl1hZRWqcR8mbHHVZ6J8SEYS+C7g+Y37Beqf5FpmJ43xpP/rQUXsHthTog+P12qPqOx2qZXCG0NQ3L1naVD90S9B7dUwsnrXzKqo4b85T9I85L9f2NVL3o/b6Q0UJ38XGd0DElrfovwgvhV4Z1NQsDgy7wjq+PiTOn+GqbRTbnJm/9p8I1AF6DJKkTY2+8NCkyTLo74ue8CgsnC9my5wjg9+U6QpacLS0=; t=\"QRcoSRhFRTF8/wJj+Tzk11zqUBj0Yq8Wn61NTwQfwSS0RvkzDbHkjF1M1VKDqd897iqSfah+CNgNbYzcwW1d9Q==\"; nonce=lcg33r; JSESSIONID=1x4iq9vq89g0qsg8ke83cl738as32ro7; xbongbongSid=2trUT~1582876678426; userid=020362533626094503; corpid=ding1c021fafb3d36d5935c2f4657eb6378f; crmvc=new; isFree=0");
		return request;
	}
	public static String xbbHttpExecute(String uri, String params) {
		return xbbHttpExecute(uri, params, null);
	}

	public static String xbbHttpExecute(String uri, String params, String sign) {
		String url = XbbHttpRequest.getXbbUrl(uri);
		if (sign == null) {
			sign = XbbHttpRequest.getDataSign(params, token);
		}
		String responseBody = null;
		try {
			HttpRequest request = getXbbApiRequest(url);
			StringBuilder bodyStr = new StringBuilder();
			bodyStr.append("platform=").append("web").append("&");
			bodyStr.append("frontDev=").append("0").append("&");
			bodyStr.append("params=").append(URLEncoder.encode(params, "UTF-8")).append("&");
			bodyStr.append("JSESSIONID=").append(JSESSIONID).append("&");
			bodyStr.append("sign=").append(sign);
			request.body(bodyStr.toString());
			HttpResponse response = request.execute();
			log.info(request.toString());
			log.info(response.toString());
			responseBody = response.body();
			log.info("\n========================\n" +
					"URL: " + url + "\n" +
					"SIGN: " + sign + "\n" +
					"PARAMS: " + params + "\n" +
					"RESPONSE: " + responseBody + "\n" +
					"========================");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return responseBody;
	}
}
