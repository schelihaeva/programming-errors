// Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум. 
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
public class task1{
     public static void main(String[] args) {
        int[] ar = new int[2];
        System.out.println(getArrayLenght(ar, 3));
    }
    public static int getArrayLenght(int[] arr,int min){
        if(arr.length<min) return-1;
        return arr.length;

    }
}