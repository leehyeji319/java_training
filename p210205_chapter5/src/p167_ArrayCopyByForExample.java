public class p167_ArrayCopyByForExample {
    //배열은 한 번 생성하면 크기를 변경할 수 없기때문에 
    //더 많은 저장공간이 필요하다면 보다 큰 배열을 새로 만들고,
    //이전 배열로부터 항목 값들을 복사해야한다.
    //배열 간의 항목 값들을 복사하려면 for문을 사용하거나 System.arraycopy() 메소드를 사용하면 된다.
    //for 문으로 배열 복사
    public static void main(String[] args) {
        
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray.length; i++){
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
