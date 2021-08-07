package com.bobo;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.bobo.utils.XbbHttpRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 测试销帮帮CRM
 */
@Slf4j
public class HttpXBBTest {


    public static HttpRequest getXbbApiRequest(String uri) {
        HttpRequest request = HttpUtil.createPost("https://dingtalk.xbongbong.com" + uri);
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

    @Test
    public void testCommunicateApiListAjax() {
        HttpRequest request = HttpUtil.createPost("https://dingtalk.xbongbong.com/communicateApi/listAjax.html");
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
        request.body("platform=web&frontDev=0&params=%7B%22corpid%22%3A%22ding1c021fafb3d36d5935c2f4657eb6378f%22%2C%22nowUserId%22%3A%22020362533626094503%22%2C%22page%22%3A1%2C%22pageSize%22%3A15%2C%22belongerType%22%3A%220%22%2C%22isMain%22%3A1%2C%22treeType%22%3A%22%22%2C%22pid%22%3A%22%22%2C%22nameLike%22%3A%22%22%2C%22memo%22%3A%22%22%7D&sign=5c8b3e608a041b62fb056ec02fe2fda244c3c860feaa98f3b2c4432417bb58ca");
        HttpResponse response = request.execute();
        log.info(request.toString());
        log.info(response.toString());
    }

    @Test
    public void testCommunicateApiGetCustomers() {
        HttpRequest request = getXbbApiRequest("/customerApi/getCustomers.html");
        request.body("platform=web&frontDev=0&params=%7B%22corpid%22%3A%22ding1c021fafb3d36d5935c2f4657eb6378f%22%2C%22nowUserId%22%3A%22020362533626094503%22%2C%22page%22%3A1%2C%22pageSize%22%3A12%2C%22customerId%22%3A0%2C%22nameLike%22%3A%22%22%2C%22belongerType%22%3A%220%22%2C%22supplierId%22%3A0%2C%22templateId%22%3A531302%2C%22isPublic%22%3A0%7D&JSESSIONID=1x4iq9vq89g0qsg8ke83cl738as32ro7&sign=9e16de88a12e74f5ec5c302f1f5d03ce3ffa30ead8a94cd740173967b1ea1a20");
        HttpResponse response = request.execute();
        log.info(request.toString());
        log.info(response.toString());
    }

    @Test
    public void testXbbGetCustomers() {
        String sign = "9e16de88a12e74f5ec5c302f1f5d03ce3ffa30ead8a94cd740173967b1ea1a20";
        String params = "{\"corpid\":\"ding1c021fafb3d36d5935c2f4657eb6378f\",\"nowUserId\":\"020362533626094503\",\"page\":1,\"pageSize\":12,\"customerId\":0,\"nameLike\":\"\",\"belongerType\":\"0\",\"supplierId\":0,\"templateId\":531302,\"isPublic\":0}";
        XbbHttpRequest.xbbHttpExecute("/customerApi/getCustomers.html", params, sign);
    }

    @Test
    public void testXbbSaveCommunicate() {
        String sign = "55ab414a9d11ba221149c0288b8a9975928b36306d2936491c8228d36e5da45e";
        String params = "{\"corpid\":\"ding1c021fafb3d36d5935c2f4657eb6378f\",\"nowUserId\":\"020362533626094503\",\"defaultData\":{\"customerName\":{\"id\":75596503,\"value\":\"test001\",\"key\":0,\"templateId\":531302},\"contactArray\":[],\"type\":\"20\",\"memo\":\"测试4\",\"communicateTime\":\"2020-02-28 21:47\",\"synchronizeCommunicatePlan\":{\"id\":\"\",\"value\":\"\"},\"images\":[\"https://cdnsaas.xbongbong.com/xbbDingtalk/ding1c021fafb3d36d5935c2f4657eb6378f/none/jpg/15828987828861435a04e064ce0f7b5a345d274e32e7d.jpg?1582898782883\"],\"ifRemind\":false},\"redundantData\":{\"attr5\":\"学员当面\",\"attr6\":[]},\"opUUID\":\"580ebbf6f8ca42a98793e722242fa211\"}";
        XbbHttpRequest.xbbHttpExecute("/communicateApi/save.html", params);
    }
}
