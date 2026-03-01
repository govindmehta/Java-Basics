class Calculate {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of x and y is: " + sum);
    }
}

class One {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        double a = 5.5;
        float b = 3.2f;
        System.out.println("The value of a + b is: " + (a + b));
        
        int x = 10;
        int y = 20;
        
        Calculate calc = new Calculate();
        calc.add(x, y);
    }
}