package com.mylearn;

public class ModularNumber extends Number{
    public ModularNumber(Integer value, Integer module) {
        this.value = value;
        this.module = module;
    }
    public ModularNumber(ModularNumber someNumber) {
        this.value = someNumber.value;
        this.module = someNumber.module;;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getModule() {
        return module;
    }

    public static Integer[] plus(ModularNumber first, ModularNumber second){
        Integer[] result = new Integer[2];
        if(first.getModule() != second.getModule()){
            result[0] = first.getValue();
        } else {
            result[0] = first.getValue() + second.getValue();
        }
        result[1] = first.getModule();
        return result;
    }

    public static Integer[] minus(ModularNumber first, ModularNumber second){
        Integer[] result = new Integer[2];
        if(first.getModule() != second.getModule()){
            result[0] = first.getValue();
        } else {
            result[0] = first.getValue() - second.getValue();
        }
        result[1] = first.getModule();
        return result;
    }
    public static Integer[] asterisk(ModularNumber first, ModularNumber second){
        Integer[] result = new Integer[2];

        if(first.getModule() != second.getModule()){
            result[0] = first.getValue();
        } else {
            result[0] = first.getValue() * second.getValue();
        }
        result[1] = first.getModule();
        return result;
    }

    public static Integer[] slash(ModularNumber first, ModularNumber second){
        Integer[] result = new Integer[2];

        if(checkIfNumberPrime(second)) {
            if(first.getModule() != second.getModule()){
                result[0] = first.getValue();
                result[1] = first.getModule();
            } else {
                Integer invertedElement = (second.getValue() % second.getModule() + second.getModule())
                        % second.getModule();
                ModularNumber buffer =  new ModularNumber(invertedElement, second.getModule());
                result = first.asterisk(first, buffer);
            }

        }
        else { // в случае ошибки
            result[0] = 0 ;
            result[1] = 0;
        }
        return result;
    }


    private static boolean checkIfNumberPrime(ModularNumber v) {
        for (int i = 2; i <= v.getValue() / 2; i++) {
            if (v.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }


    private static Integer pow(Integer base, Integer power, Integer module) {
        if (power == 1) {
            return base;
        }

        if (power % 2 == 0) {
            Integer t = pow(base, power / 2, module);
            return t * t % module;
        } else {
            return pow(base, power - 1, module) * base % module;
        }
    }

    private static Integer invertElement(ModularNumber number) {
        //ModulusNumber casted = ((ModulusNumber) number);

        //return pow(casted.value, casted.N - 2, casted.N);
        return pow(number.getValue(),number.getModule() - 2, number.getModule());
    }
    private Integer value, module;
}
