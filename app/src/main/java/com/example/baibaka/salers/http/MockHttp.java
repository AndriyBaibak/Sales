package com.example.baibaka.salers.http;

import com.example.baibaka.salers.domain.Address;
import com.example.baibaka.salers.viewmodel.AddressViewModel;
import com.example.baibaka.salers.viewmodel.CategoryViewModel;
import com.example.baibaka.salers.viewmodel.ProductViewModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by baibak.a on 19.10.2017.
 */

public class MockHttp implements IHttp {

    @Override
    public void getAddresses(Callback<List<AddressViewModel>> callback) {
        Gson gson = new Gson();
        AddressViewModel[] a = gson.fromJson(jsonAddresses, AddressViewModel[].class);
        callback.onData(Arrays.asList(a));
    }

    @Override
    public void getAddressCategories(Integer addrID, Callback<List<CategoryViewModel>> callback) {
        Gson gson = new Gson();
        CategoryViewModel[] a = gson.fromJson(jsonAddressCategories, CategoryViewModel[].class);
        callback.onData(Arrays.asList(a));
    }

@Override
    public void getCategoryProducts(Callback<List<Map<String,List<ProductViewModel>>>> callback) {
        Gson gson = new Gson();
        List<Map<String,List <ProductViewModel>>> a = gson.fromJson(jsonCategoryProduct, new TypeToken<List<Map<String, List<ProductViewModel>>>>() {}.getType());
        callback.onData(a);
    }

    private String jsonAddresses = "[{\"id\":1,\"addrName\":\"Магазин 1\",\"addrInfo\":\"Краснова 36\" },\n" +
                    "    { \"id\":2,\"addrName\":\"Магазин 2\",\"addrInfo\":\"Краснова 26\"},\n" +
                    "    {\"id\":3,\"addrName\":\"Магазин 2\",\"addrInfo\":\"Краснова 16\"}]";

    private String jsonAddressCategories =
            "[" +
                    "{\"id\":1,\"name\":\"Категория 1\",\"imageUrl\":\"https://pbs.twimg.com/profile_images/446522135721164800/pdVA44as.jpeg\" ,\"itemCount\": 1,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":2,\"name\":\"Категория 2\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=5925506 \" ,\"itemCount\": 2,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":3,\"name\":\"Категория 3\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=5925516\" ,\"itemCount\": 3,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":4,\"name\":\"Категория 4\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=6179579\" ,\"itemCount\": 4,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":5,\"name\":\"Категория 5\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=2697700\" ,\"itemCount\": 5,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":6,\"name\":\"Категория 6\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=3236298\" ,\"itemCount\": 6,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":7,\"name\":\"Категория 7\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=3236297\" ,\"itemCount\": 7,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":8,\"name\":\"Категория 8\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=4142457\" ,\"itemCount\": 8,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":9,\"name\":\"Категория 9\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=3363076\" ,\"itemCount\": 9,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":10,\"name\":\"Категория 10\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=3493010\" ,\"itemCount\": 10,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]},\n" +
                    "{\"id\":12,\"name\":\"Категория 111\",\"imageUrl\":\"http://bo.asnova.com:800/anthillservice/getfiles?id=2697723\" ,\"itemCount\": 11,\"products\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}]}\n" +
            "]";

    private String jsonCategoryProduct =

            "[{\"category1\":[" +
                    "{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}\n" +
            "]},{\"category1\":[{\"id\":1,\"name\":\"Tide 1\",\"imageUrl\":\"-\" ,\"productInfo\": \"Велика пачка 3 кг\",\"price\":23.50},\n" +
                    "{\"id\":2,\"name\":\"Ariel 2\",\"imageUrl\":\"-\" ,\"productInfo\": \"Маленька пачка 0.5 кг\",\"price\":3.50}\n" +
                    "]}]";



   /* public interface List<T> {
        void onData(List<T> str);
    }
*/
}





