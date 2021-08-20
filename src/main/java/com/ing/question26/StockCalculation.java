package com.ing.question26;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


/*
TODO

1 - Measure working time
2 - Can you make this app faster ?

*/

public class StockCalculation {


    private List<StockInfo> getStockInfo(Stream<String> symbols) {
        return symbols
                .map(this::getStock) //slow network operation
                .collect(toList());
    }

    private StockInfo getStock(String s) {

        //Network Operation Simulation
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        StockInfo stockInfo = new StockInfo(s, new BigDecimal(Math.random()* 100000));
        return stockInfo;

    }

    public static void main(String[] args) {
        StockCalculation stockCalculation = new StockCalculation();

        List<String> stockNames = new ArrayList() ;
        for (int i = 0; i <1000 ; i++) {
            stockNames.add("A" + i) ;
        }
        List<StockInfo>  stockInfos =  stockCalculation.getStockInfo(stockNames.stream());
        System.out.println(stockInfos);

    }





}
