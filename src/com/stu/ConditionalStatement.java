package com.stu;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className ConditionalStatement
 * @description 条件语句
 * @date 2018/10/11 13:58
 */
public class ConditionalStatement {
    public static void main(String[] args) {
        Draw draw = new Draw();
        int l = 3;
        if (l == 1) {
            System.out.println("!");
            return;
        }
        draw.draw(l);
        System.out.println();
    }
}

/**
 * 打印
 */
class Draw {
    private int i, j;

    /**
     * @Description 空心菱形
     * @Date 2018/10/11
     * @Param [h] h*h
     * @Return void
     */
    void draw(int l) {
        //边长l,计算其高h（*）
        int h = l + (l - 1);
        //行
        for (i = 1; i <= h; i++) {
            //行个数
            for (j = 1; j <= h; j++) {
                //菱形四条边的函数，在边上的坐标点，打印*，否则打印空格
                if (j == (h + 3) / 2 - i || j == (h - 1) / 2 + i || j == i - (h - 1) / 2 || j == (3 * h + 1) / 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();//第i行打印完换行
        }
    }
}