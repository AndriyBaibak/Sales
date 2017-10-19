package com.example.baibaka.salers.http;

import com.example.baibaka.salers.domain.Address;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by baibak.a on 19.10.2017.
 */

public class MockHttp implements IHttp {

    private static Http http = new Http();

    public static Http getInstance() {
        return http;
    }



    @Override
    public void getAddresses(Http.Callback<List<Address>> callback) {
        Gson gson = new Gson();
        List<Address>a = gson.fromJson(jsonAddresses, new TypeToken<List<Address>>(){}.getType());

        callback.onData(a);
    }

    private String json = "{\"ip\":\"178.151.124.194\",\"country_code\":\"UA\",\"country_name\":\"Ukraine\",\"region_code\":\"30\",\"region_name\":\"Kyiv City\",\"city\":\"Kiev\",\"zip_code\":\"\",\"time_zone\":\"Europe/Kiev\",\"latitude\":50.4333,\"longitude\":30.5167,\"metro_code\":0}";
    private String jsonAddresses =
            " \"address\": [\n" +
                      "    \"id\":\"1\",\"addrName\":\"Магазин 1\",\"addrInfo\":\"Краснова 36\",\n" +
                      "    \"id\":\"2\",\"addrName\":\"Магазин 2\",\"addrInfo\":\"Краснова 26\",\n" +
                      "    \"id\":\"3\",\"addrName\":\"Магазин 2\",\"addrInfo\":\"Краснова 16\",\n" +
                      "  ],";
}
