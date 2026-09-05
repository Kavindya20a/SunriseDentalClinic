package com.sunrisedental.service;

public final class BillCalculatorFactory {

    private BillCalculatorFactory() {
    }

    public static BillCalculator create() {

        return new BillCalculator() {

            @Override
            public double total(double treatmentCost) {
                return treatmentCost;
            }
        };
    }
}