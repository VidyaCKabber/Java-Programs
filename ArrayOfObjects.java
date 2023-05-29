class ArrayOfObjects {
    public static void main(String[] args) {
        HelloWorld1 a = new HelloWorld1();
        HelloWorld2 b = new HelloWorld2();
        HelloWorld3 c = new HelloWorld3();
        
        HelloWorld1[] array = {a, b, c};
        printDetails(array);
    }
    
    public static void printDetails(HelloWorld1[] array){
        
        for(HelloWorld1 s : array){
            s.test();
        }
    }
}

class HelloWorld1 {
    public void test() {
        System.out.println("HelloWorld1");
    }
}

class HelloWorld2 extends HelloWorld1{
    public void test() {
        System.out.println("HelloWorld2");
    }
}

class HelloWorld3 extends HelloWorld1{
    public void test() {
        System.out.println("HelloWorld3");
    }
}
