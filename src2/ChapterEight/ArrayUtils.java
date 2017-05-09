package ChapterEight;

/**
 * Created by 世康 on 2016/10/17.
 */
public class ArrayUtils {
    /**
     * 定义一个工具方法，用于返回对应字符串在字符数组中的位置
     * @param array 字符数组
     * @param string 搜索字符串
     * @return 目标串出现的位置，-1表示未找到
     */
    public static int search(String[] array,String string){
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null && array[i].equals(string)){
                return i;
            }
        }
        return -1;
    }
}
