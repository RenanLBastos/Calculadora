package com.example.Calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Calculadora {


        public Calculadora() {

        }

        @GetMapping("api/v1/calcular/sum")
        public Number sum(double a, double b) {
            double sum = a + b;
            if ((sum == Math.floor(sum)) &&!Double.isInfinite(sum)) {
                return (int) sum;
            } else {
                return sum;
            }

        }

        @GetMapping("api/v1/calcular/subtract")
        public Number subtract( double a,  double b) {
            double subtract = a - b;
            if ((subtract == Math.floor(subtract)) &&!Double.isInfinite(subtract)) {
                return (int) subtract;
            } else {
                return subtract;
            }
        }

        @GetMapping("api/v1/calcular/multiply")
        public Number multiply(double a, double b) {
            double multiply = a * b;
            if ((multiply == Math.floor(multiply)) &&!Double.isInfinite(multiply)) {
                return (int) multiply;
            } else {
                return multiply;
            }
        }

        @GetMapping("api/v1/calcular/divide")
        public Number divide(double a, double b) {
            double divide = a / b;
            if ((divide == Math.floor(divide)) &&!Double.isInfinite(divide)) {
                return (int) divide;
            } else {
                return divide;
            }
        }

        @GetMapping("api/v1/calcular/module")
        public Number module(double a, double b) {
            double module = a % b;
            if ((module == Math.floor(module)) &&!Double.isInfinite(module)) {
                return (int) module;
            } else {
                return module;
            }
        }
}

