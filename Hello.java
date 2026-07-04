class calculator {
    int a;

    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

class Hello {

    public static void main(String a[]) {
        int num1 = 5;
        int num2 = 5;
        calculator calc = new calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}