public class Printer <T>{
    <E> void printArray(E[] array){
        for(E e : array)
            System.out.println(e);
    }
}
