/**
 * Created by toryang on 16/3/9.
 */
public class JumpFloorTest {
    /**
     * 题目描述:
     * 跳台阶,每次跳一级或者每次跳两级
     *
     * 解决方法:递归,斐波那契数列
     * @param n
     * @return
     */

    public static int jumpFloor(int n){
        if (n <= 0){
            return 0;
        } else if (n==1 || n==2){
            return n;
        }else {
          return jumpFloor(n-1) + jumpFloor(n-2);
        }

    }

    /**
     * 题目描述:
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *
     * 解决方法:
     * 因为n级台阶，第一步有n种跳法：跳1级、跳2级、到跳n级
     * 跳1级，剩下n-1级，则剩下跳法是f(n-1)
     * 跳2级，剩下n-2级，则剩下跳法是f(n-2)
     * 所以f(n)=f(n-1)+f(n-2)+...+f(1)
     * 因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
     * 所以f(n)=2*f(n-1)
     *
     */

    public static int jumpFloorII(int n){
        if (n <= 0){
            return 0;
        } else if (n==1 || n==2){
            return n;
        }else {
            return 2*jumpFloorII(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(5));
        System.out.println(jumpFloorII(5));
    }
}

