package parser;


import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Products;
import entity.RootProducts;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static void parser(InputStream responseStream){
        ObjectMapper mapper = new ObjectMapper();
        RootProducts rootProducts = null;
        try {
            rootProducts = mapper.readValue(responseStream, RootProducts.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(rootProducts);
    }


    public static void parserPath(String path) {

        ObjectMapper objectMapper = new ObjectMapper();
//вывод через объект
        RootProducts rootProducts = null;
// вывод через List
        List<RootProducts> rootProductsList = null;
        try {
            rootProducts = objectMapper.readValue(new File(path), RootProducts.class);

            rootProductsList = Arrays.asList(objectMapper.readValue(new File(path), RootProducts.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
//вывод через объект
        System.out.println(rootProducts);
// вывод через List
        System.out.println(rootProductsList);

    }
}
