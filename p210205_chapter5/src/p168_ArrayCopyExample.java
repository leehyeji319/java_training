public class p168_ArrayCopyExample {

//System.arraycopy()를 호출하는 방법
//System.arraycopy(Object src, int srcPos, Object dest, int destPost, int length)
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++){
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
