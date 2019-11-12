package com.javarush.task.task33.task3308;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
@XmlRootElement
@XmlType(name = "shop")
public class Shop {
    public Goods goods;
    public int count;
    public double profit;
    public String[] secretData;

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        goods.names.stream().forEach(x -> stringBuilder.append("Goods " + x + "\n"));
        stringBuilder.append("count " + count + "\n");
        stringBuilder.append("profit " + profit + "\n");
        stringBuilder.append(secretData.length);
        return stringBuilder.toString();
    }


    public static class Goods{
        @XmlAny
        public List<String> names;
    }
}
