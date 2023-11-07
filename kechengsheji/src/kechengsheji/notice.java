package kechengsheji;

import javax.swing.*;
import java.awt.*;

public class notice {
    public void notic()
    {//提示窗口代码如下
        JFrame jf = new JFrame("提示");
        Container container = jf.getContentPane();
        container.setBackground(Color.white);
        jf.setSize(400, 200);
        jf.setLocation(700,370);
        JLabel jL=new JLabel("                完成！请单击重置复原汉诺塔。   ");
        Font f2=new Font(null,Font.PLAIN,17);
        jL.setFont(f2);
        jL.setBounds(100,20,100,100);
        jf.add(jL);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}