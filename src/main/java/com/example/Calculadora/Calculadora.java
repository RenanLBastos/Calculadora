package com.example.Calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {


        public Calculadora() {

        }

        @GetMapping("api/v1/calcular/sum")
        public double sum(double a, double b) {
            double sum = a + b;
            if ((sum == Math.floor(sum)) &&!Double.isInfinite(sum)) {
                return (int) sum;
            } else {
                return sum;
            }

        }

        @GetMapping("api/v1/calcular/subtract")
        public double subtract(double a, double b) {
            double subtract = a - b;
            if ((subtract == Math.floor(subtract)) &&!Double.isInfinite(subtract)) {
                return (int) subtract;
            } else {
                return subtract;
            }
        }

        @GetMapping("api/v1/calcular/multply")
        public double multiply(double a, double b) {
            double multiplicy = a * b;
            if ((multiplicy == Math.floor(multiplicy)) &&!Double.isInfinite(multiplicy)) {
                return (int) multiplicy;
            } else {
                return multiplicy;
            }
        }

        @GetMapping("api/v1/calcular/divide")
        public double divide(double a, double b) {
            double divide = a / b;
            if ((divide == Math.floor(divide)) &&!Double.isInfinite(divide)) {
                return (int) divide;
            } else {
                return divide;
            }
        }

        @GetMapping("api/v1/calcular/module")
        public double module(double a, double b) {
            double module = a % b;
            if ((module == Math.floor(module)) &&!Double.isInfinite(module)) {
                return (int) module;
            } else {
                return module;
            }
        }
}

