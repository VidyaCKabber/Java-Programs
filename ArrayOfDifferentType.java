class ArrayOfDifferentType {
    public static void main(String[] args) {
        
        Object[] arr = new Object[3];
        arr[0] = "Vidya";
        arr[1] = 1;
        arr[2] = 19.78;
        
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
