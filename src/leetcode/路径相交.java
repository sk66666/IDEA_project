package leetcode;
public class 路径相交 {
//    给你一个整数数组 distance 。
//
//    从 X-Y 平面上的点?(0,0)?开始，先向北移动 distance[0] 米，然后向西移动 distance[1] 米，向南移动 distance[2] 米，向东移动 distance[3] 米，持续移动。也就是说，每次移动后你的方位会发生逆时针变化。
//
//    判断你所经过的路径是否相交。如果相交，返回 true ；否则，返回 false 。
//
//            ?
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/self-crossing
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static boolean isSelfCrossing(int[] x) {
        float a[][]=new float[10001][10001];
        if(x.length <= 3)
            return false;
        int i, xl = x[1], yl = x[0], px = 0, py = 0;
        //检测a类型路径的变化趋势
        for(i = 2; i < x.length; i++){
            if((i & 0x1) == 1){
                if(x[i] <= xl){
                    //a ---> b
                    if(xl - px <= x[i])
                        yl -= py;
                    xl = x[i];
                    break;
                }
                //用px保存xl的旧值
                px = xl;
                xl = x[i];
            }else {
                if(x[i] <= yl){
                    //a ---> b
                    if(yl - py <= x[i])
                        xl -= px;
                    yl = x[i];
                    break;
                }
                //用py保存yl的旧值
                py = yl;
                yl = x[i];
            }
        }
        //检测b类型路径的变化趋势
        for(i++; i < x.length; i++){
            if((i & 0x1) == 1 && x[i] < xl){
                xl = x[i];
            }else if(x[i] < yl){
                yl = x[i];
            }else{
                return true;
            }
        }
        return false;

//        作者：chenplusplus
//        链接：https://leetcode-cn.com/problems/self-crossing/solution/kong-jian-fu-za-du-o1jie-fa-su-du-da-bai-100-by-ch/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    }

    public static void main(String[] args) {
        int a[]=new int[4];
        a[0]=2;
        a[1]=1;
        a[2]=1;
        a[3]=2;
        //北西南东
        if(isSelfCrossing(a)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
