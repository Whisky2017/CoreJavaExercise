package ChapterFour;

/**
 * Created by 世康 on 2016/9/29.
 */
public class Num2Rmb {
    private static String[] str1 = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    //必须从小到大排列
    private static String[] str2 = {"拾","佰","仟"};

    //返回字符串类型数组是因为方便统计数字长度
    private String[] divide(double num){
        //最高位是0会被过滤掉
        long zheng = (long)num;
        //Math.round是取整操作
        long xiao = Math.round((num-zheng)*100);
        return new String[]{String.valueOf(zheng),String.valueOf(xiao)};
    }

    private String toHanStr(String numStr){
        String result = "";
        int numLen = numStr.length();
        for(int i = 0;i<numLen;i++){
            int num = numStr.charAt(i)-48;
            if((i != numLen-1)&&(num != 0)){
                //charAt获取String中i位置的字符
                result += str1[num]+str2[numLen-2-i];
            }else{
                result += str1[num];
            }
        }
        return result;
    }

    public static void main(String[] args){
        Num2Rmb num2Rmb = new Num2Rmb();
        String str[] = num2Rmb.divide(0234.12);
        System.out.println(str[0]);
        System.out.println(num2Rmb.toHanStr(str[0]));
    }
}
