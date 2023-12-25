package kechengsheji;

import javax.swing.*;
import java.awt.*;

class towerbody extends JPanel
{
    //塔身绘图代码如下
    @Override
    public void paint(Graphics g)
    {
// 绘图代码如下
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;

        g2.setStroke(new BasicStroke(1.5f));
        g2.setColor(Color.DARK_GRAY);
        g2.drawLine(400, 250, 400, 500);
        g2.drawLine(800, 250, 800, 500);
        g2.drawLine(1200,250, 1200, 500);

        g2.setStroke(new BasicStroke(6.0f));
        g2.setColor(Color.DARK_GRAY);
        g2.drawLine(275, 500, 525, 500);
        g2.drawLine(675, 500, 925, 500);
        g2.drawLine(1075, 500, 1325, 500);

        Font f=new Font(null, Font.PLAIN,35);
        Font f3=new Font(null,Font.PLAIN,20);
        g2.setFont(f3);
        g2.drawString("1.使用自动演示时，请先重置汉诺塔。2.每次仅可移动一个托盘。3.大盘不能置于小盘上方。4.当所有托盘都被移到三号塔，游戏结束。",210,180);
        g2.setFont(f);
        g2.drawString("Hannoi塔演示程序",660,100);

        Font f2=new Font(null,Font.PLAIN,25);
        g2.setFont(f2);
        g2.drawString("一号塔",365,560);
        g2.drawString("二号塔",765,560);
        g2.drawString("三号塔",1165,560);

    }
}
