public class HelloWorld {
  public static void main[]{
    System.out.println("HelloWorld");
    int bilangan[] = { 4, 5, 7, 8 , 9 };
        int total = 0, indexArray = 0;
        
        while(indexArray < bilangan.length){
            total += bilangan[indexArray];
            System.out.print(bilangan[indexArray] + " ");
            indexArray++;
}
        float rata2 = (float) total / bilangan.length;
            System.out.println(" rata2-nya : " + rata2 );
  }
}
