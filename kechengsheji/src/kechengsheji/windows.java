package kechengsheji;
//江苏大学物联网2101孙家扬3210611018

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class windows extends JFrame {
    public void create(String title) {
        int yi=460,er=420,san=380,si=340,wu=300;
//窗口代码如下
            JFrame jf = new JFrame(title);
            Container container = jf.getContentPane();
            container.setBackground(Color.white);
            jf.setSize(1650, 900);
            jf.setLocation(100,80);
//塔身代码如下
            towerbody mp = new towerbody();
            jf.add(mp);
//按钮代码如下
            Font f = new Font(null, Font.PLAIN, 20);

            JButton mb1 = new JButton("开始或重置");
            mb1.setFont(f);
            mb1.setBounds(400, 650, 200, 50);

            JButton mb2 = new JButton("自动演示");
            mb2.setFont(f);
            mb2.setBounds(1000, 650, 200, 50);

            mp.add(mb1);
            mp.add(mb2);
//塔环代码如下
        JButton t1 = new JButton("1");
        t1.setBackground(Color.CYAN);
        mp.add(t1);

        JButton t2 = new JButton("2");
        t2.setBackground(Color.GREEN);
        mp.add(t2);

        JButton t3 = new JButton("3");
        t3.setBackground(Color.YELLOW);
        mp.add(t3);

        JButton t4 = new JButton("4");
        t4.setBackground(Color.ORANGE);
        mp.add(t4);

        JButton t5 = new JButton("5");
        t5.setBackground(Color.MAGENTA);
        mp.add(t5);

            t5.addMouseMotionListener(new MouseAdapter() {
                int x,y,a,b,x0,y0,w;
                @Override
                public void mouseDragged(MouseEvent e) {
                    Component com;
                    if (e.getSource() instanceof Component) {
                        com = (Component) e.getSource();
                        if ((t4.getX() - t5.getX() != 15 || t4.getY() > t5.getY())&&(t3.getX()-t5.getX()!=30||t3.getY()>t5.getY())&&(t2.getX()-t5.getX()!=45||t2.getY()>t5.getY())&&(t1.getX()-t5.getX()!=60||t1.getY()>t5.getY()))
                        {
                            a = com.getBounds().x;
                            b = com.getBounds().y;
                            x = e.getX();
                            y = e.getY();
                            if (a < 600) {
                                w = 400 - a;
                            } else if (a < 1000) {
                                w = 800 - a;
                            } else {
                                w = 1200 - a;
                            }

                            a = a + x;
                            b = b + y;

                            if (a - x0 < 600) {
                                if (t1.getX() != 360 && t2.getX() != 345 && t3.getX() != 330 && t4.getX() != 315) {
                                    com.setLocation(400 - w, 460);
                                }
                            } else if (a - x0 < 1000) {
                                if (t1.getX() != 760 && t2.getX() != 745 && t3.getX() != 730 && t4.getX() != 715) {
                                    com.setLocation(800 - w, 460);
                                }
                            } else {
                                if (t1.getX() != 1160 && t2.getX() != 1145 && t3.getX() != 1130 && t4.getX() != 1115) {
                                    com.setLocation(1200 - w, 460);
                                }
                            }
                        }
                    }
                    }
                    @Override
                    public void mousePressed (MouseEvent e){
                        JComponent com;
                        com = (JComponent) e.getSource();
                        a = com.getBounds().x;
                        b = com.getBounds().y;
                        x0 = e.getX();
                        y0 = e.getY();
                    }

            });
            t5.setFont(f);



            t4.addMouseMotionListener(new MouseAdapter() {
                int x,y,a,b,x0,y0,w;
                @Override
                public void mouseDragged(MouseEvent e) {
                    Component com;
                    if (e.getSource() instanceof Component)
                    {
                        com=(Component) e.getSource();
                        if((t3.getX()-t4.getX()!=15||t3.getY()>t4.getY())&&(t2.getX()-t4.getX()!=30||t2.getY()>t4.getY())&&(t1.getX()-t4.getX()!=45||t1.getY()>t4.getY())) {
                            a = com.getBounds().x;
                            b = com.getBounds().y;
                            x = e.getX();
                            y = e.getY();
                            if (a < 600) {
                                w = 400 - a;
                            } else if (a < 1000) {
                                w = 800 - a;
                            } else {
                                w = 1200 - a;
                            }

                            a = a + x;
                            b = b + y;

                            if (a - x0 < 600) {
                                if ((t1.getX() != 360 && t2.getX() != 345 && t3.getX() != 330) && (t5.getX() != 300 || t5.getY() != yi)) {
                                    com.setLocation(400 - w, 460);
                                } else if ((t1.getX() != 360 && t2.getX() != 345 && t3.getX() != 330) && (t5.getX() != 300 || t5.getY() != er)) {
                                    com.setLocation(400 - w, 420);
                                }
                            } else if (a - x0 < 1000) {
                                if ((t1.getX() != 760 && t2.getX() != 745 && t3.getX() != 730) && (t5.getX() != 700 || t5.getY() != yi)) {
                                    com.setLocation(800 - w, 460);
                                } else if ((t1.getX() != 760 && t2.getX() != 745 && t3.getX() != 730) && (t5.getX() != 700 || t5.getY() != er)) {
                                    com.setLocation(800 - w, 420);
                                }
                            } else {
                                if ((t1.getX() != 1160 && t2.getX() != 1145 && t3.getX() != 1130) && (t5.getX() != 1100 || t5.getY() != yi)) {
                                    com.setLocation(1200 - w, 460);
                                } else if ((t1.getX() != 1160 && t2.getX() != 1145 && t3.getX() != 1130) && (t5.getX() != 1100 || t5.getY() != er)) {
                                    com.setLocation(1200 - w, 420);
                                }
                            }
                        }
                    }
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    JComponent com;
                    com=(JComponent) e.getSource();
                    a=com.getBounds().x;
                    b=com.getBounds().y;
                    x0=e.getX();
                    y0=e.getY();
                }
            });
            t4.setFont(f);


            t3.addMouseMotionListener(new MouseAdapter() {
                int x,y,a,b,x0,y0,w;
                @Override
                public void mouseDragged(MouseEvent e) {
                    Component com;
                    if (e.getSource() instanceof Component)
                    {
                        com=(Component) e.getSource();
                        if((t2.getX()-t3.getX()!=15||t2.getY()>t3.getY())&&(t1.getX()-t3.getX()!=30||t1.getY()>t3.getY())) {
                            a = com.getBounds().x;
                            b = com.getBounds().y;
                            x = e.getX();
                            y = e.getY();
                            if (a < 600) {
                                w = 400 - a;
                            } else if (a < 1000) {
                                w = 800 - a;
                            } else {
                                w = 1200 - a;
                            }

                            a = a + x;
                            b = b + y;

                            if (a - x0 < 600) {
                                if ((t1.getX() != 360 && t2.getX() != 345) && (t4.getX() != 315 || t4.getY() != yi) && (t5.getX() != 300 || t5.getY() != yi)) {
                                    com.setLocation(400 - w, 460);
                                } else if ((t1.getX() != 360 && t2.getX() != 345) && (t4.getX() != 315 || t4.getY() != er) && (t5.getX() != 300 || t5.getY() != er)) {
                                    com.setLocation(400 - w, 420);
                                } else if ((t1.getX() != 360 && t2.getX() != 345) && (t4.getX() != 315 || t4.getY() != san) && (t5.getX() != 300 || t5.getY() != san)) {
                                    com.setLocation(400 - w, 380);
                                }
                            } else if (a - x0 < 1000) {
                                if ((t1.getX() != 760 && t2.getX() != 745) && (t4.getX() != 715 || t4.getY() != yi) && (t5.getX() != 700 || t5.getY() != yi)) {
                                    com.setLocation(800 - w, 460);
                                } else if ((t1.getX() != 760 && t2.getX() != 745) && (t4.getX() != 715 || t4.getY() != er) && (t5.getX() != 700 || t5.getY() != er)) {
                                    com.setLocation(800 - w, 420);
                                } else if ((t1.getX() != 760 && t2.getX() != 745) && (t4.getX() != 715 || t4.getY() != san) && (t5.getX() != 700 || t5.getY() != san)) {
                                    com.setLocation(800 - w, 380);
                                }
                            } else {
                                if ((t1.getX() != 1160 && t2.getX() != 1145) && (t4.getX() != 1115 || t4.getY() != yi) && (t5.getX() != 1100 || t5.getY() != yi)) {
                                    com.setLocation(1200 - w, 460);
                                } else if ((t1.getX() != 1160 && t2.getX() != 1145) && (t4.getX() != 1115 || t4.getY() != er) && (t5.getX() != 1100 || t5.getY() != er)) {
                                    com.setLocation(1200 - w, 420);
                                } else if ((t1.getX() != 1160 && t2.getX() != 1145) && (t4.getX() != 1115 || t4.getY() != san) && (t5.getX() != 1100 || t5.getY() != san)) {
                                    com.setLocation(1200 - w, 380);
                                }
                            }
                        }
                    }
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    JComponent com;
                    com=(JComponent) e.getSource();
                    a=com.getBounds().x;
                    b=com.getBounds().y;
                    x0=e.getX();
                    y0=e.getY();
                }
            });
            t3.setFont(f);


            t2.addMouseMotionListener(new MouseAdapter() {
                int x,y,a,b,x0,y0,w;
                @Override
                public void mouseDragged(MouseEvent e) {
                    Component com;
                    if (e.getSource() instanceof Component)
                    {
                        com=(Component) e.getSource();
                        if (t1.getX()-t2.getX()!=15||t1.getY()>t2.getY()) {
                            a = com.getBounds().x;
                            b = com.getBounds().y;
                            x = e.getX();
                            y = e.getY();
                            if (a < 600) {
                                w = 400 - a;
                            } else if (a < 1000) {
                                w = 800 - a;
                            } else {
                                w = 1200 - a;
                            }

                            a = a + x;
                            b = b + y;

                            if (a - x0 < 600) {
                                if (t1.getX() != 360 && (t3.getX() != 330 || t3.getY() != yi) && (t4.getX() != 315 || t4.getY() != yi) && (t5.getX() != 300 || t5.getY() != yi)) {
                                    com.setLocation(400 - w, 460);
                                } else if (t1.getX() != 360 && (t3.getX() != 330 || t3.getY() != er) && (t4.getX() != 315 || t4.getY() != er) && (t5.getX() != 300 || t5.getY() != er)) {
                                    com.setLocation(400 - w, 420);
                                } else if (t1.getX() != 360 && (t3.getX() != 330 || t3.getY() != san) && (t4.getX() != 315 || t4.getY() != san) && (t5.getX() != 300 || t5.getY() != san)) {
                                    com.setLocation(400 - w, 380);
                                } else if (t1.getX() != 360 && (t3.getX() != 330 || t3.getY() != si) && (t4.getX() != 315 || t4.getY() != si) && (t5.getX() != 300 || t5.getY() != si)) {
                                    com.setLocation(400 - w, 340);
                                }
                            } else if (a - x0 < 1000) {
                                if (t1.getX() != 760 && (t3.getX() != 730 || t3.getY() != yi) && (t4.getX() != 715 || t4.getY() != yi) && (t5.getX() != 700 || t5.getY() != yi)) {
                                    com.setLocation(800 - w, 460);
                                } else if (t1.getX() != 760 && (t3.getX() != 730 || t3.getY() != er) && (t4.getX() != 715 || t4.getY() != er) && (t5.getX() != 700 || t5.getY() != er)) {
                                    com.setLocation(800 - w, 420);
                                } else if (t1.getX() != 760 && (t3.getX() != 730 || t3.getY() != san) && (t4.getX() != 715 || t4.getY() != san) && (t5.getX() != 700 || t5.getY() != san)) {
                                    com.setLocation(800 - w, 380);
                                } else if (t1.getX() != 760 && (t3.getX() != 730 || t3.getY() != si) && (t4.getX() != 715 || t4.getY() != si) && (t5.getX() != 700 || t5.getY() != si)) {
                                    com.setLocation(800 - w, 340);
                                }
                            } else {
                                if (t1.getX() != 1160 && (t3.getX() != 1130 || t3.getY() != yi) && (t4.getX() != 1115 || t4.getY() != yi) && (t5.getX() != 1100 || t5.getY() != yi)) {
                                    com.setLocation(1200 - w, 460);
                                } else if (t1.getX() != 1160 && (t3.getX() != 1130 || t3.getY() != er) && (t4.getX() != 1115 || t4.getY() != er) && (t5.getX() != 1100 || t5.getY() != er)) {
                                    com.setLocation(1200 - w, 420);
                                } else if (t1.getX() != 1160 && (t3.getX() != 1130 || t3.getY() != san) && (t4.getX() != 1115 || t4.getY() != san) && (t5.getX() != 1100 || t5.getY() != san)) {
                                    com.setLocation(1200 - w, 380);
                                } else if (t1.getX() != 1160 && (t3.getX() != 1130 || t3.getY() != si) && (t4.getX() != 1115 || t4.getY() != si) && (t5.getX() != 1100 || t5.getY() != si)) {
                                    com.setLocation(1200 - w, 340);
                                }

                            }
                        }
                    }
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    JComponent com;
                    com=(JComponent) e.getSource();
                    a=com.getBounds().x;
                    b=com.getBounds().y;
                    x0=e.getX();
                    y0=e.getY();
                }
            });
            t2.setFont(f);
            final int []flag={0};

            t1.addMouseMotionListener(new MouseAdapter() {
                int x,y,a,b,x0,y0,w;
                @Override
                public void mouseDragged(MouseEvent e) {
                    Component com;
                    if (e.getSource() instanceof Component)
                    {
                        com=(Component) e.getSource();
                        a=com.getBounds().x;
                        b=com.getBounds().y;
                        x=e.getX();
                        y=e.getY();
                        if(a<600)
                        {w=400-a;}
                        else if (a<1000)
                        { w=800-a;}
                        else {w=1200-a;}

                        a=a+x;
                        b=b+y;

                        if (a-x0<600)
                        {if((t2.getX()!=345||t2.getY()!=yi)&&(t3.getX()!=330||t3.getY()!=yi)&&(t4.getX()!=315||t4.getY()!=yi)&&(t5.getX()!=300||t5.getY()!=yi))
                        {com.setLocation(400 - w, 460);}
                        else if((t2.getX()!=345||t2.getY()!=er)&&(t3.getX()!=330||t3.getY()!=er)&&(t4.getX()!=315||t4.getY()!=er)&&(t5.getX()!=300||t5.getY()!=er))
                        {  com.setLocation(400 - w, 420);}
                        else if((t2.getX()!=345||t2.getY()!=san)&&(t3.getX()!=330||t3.getY()!=san)&&(t4.getX()!=315||t4.getY()!=san)&&(t5.getX()!=300||t5.getY()!=san))
                        {  com.setLocation(400 - w, 380);}
                        else if((t2.getX()!=345||t2.getY()!=si)&&(t3.getX()!=330||t3.getY()!=si)&&(t4.getX()!=315||t4.getY()!=si)&&(t5.getX()!=300||t5.getY()!=si))
                        {    com.setLocation(400 - w, 340);}
                        else if((t2.getX()!=345||t2.getY()!=wu)&&(t3.getX()!=330||t3.getY()!=wu)&&(t4.getX()!=315||t4.getY()!=wu)&&(t5.getX()!=300||t5.getY()!=wu)) {com.setLocation(400 - w, 300);}
                        }
                        else if (a-x0<1000)
                        {if((t2.getX()!=745||t2.getY()!=yi)&&(t3.getX()!=730||t3.getY()!=yi)&&(t4.getX()!=715||t4.getY()!=yi)&&(t5.getX()!=700||t5.getY()!=yi))
                        {    com.setLocation(800 - w, 460);}
                        else if((t2.getX()!=745||t2.getY()!=er)&&(t3.getX()!=730||t3.getY()!=er)&&(t4.getX()!=715||t4.getY()!=er)&&(t5.getX()!=700||t5.getY()!=er))
                        {   com.setLocation(800 - w, 420);}
                        else if((t2.getX()!=745||t2.getY()!=san)&&(t3.getX()!=730||t3.getY()!=san)&&(t4.getX()!=715||t4.getY()!=san)&&(t5.getX()!=700||t5.getY()!=san))
                        {    com.setLocation(800 - w, 380);}
                        else if((t2.getX()!=745||t2.getY()!=si)&&(t3.getX()!=730||t3.getY()!=si)&&(t4.getX()!=715||t4.getY()!=si)&&(t5.getX()!=700||t5.getY()!=si))
                        {   com.setLocation(800 - w, 340);}
                        else if((t2.getX()!=745||t2.getY()!=wu)&&(t3.getX()!=730||t3.getY()!=wu)&&(t4.getX()!=715||t4.getY()!=wu)&&(t5.getX()!=700||t5.getY()!=wu)){com.setLocation(800 - w, 300);}
                        }
                        else {if((t2.getX()!=1145||t2.getY()!=yi)&&(t3.getX()!=1130||t3.getY()!=yi)&&(t4.getX()!=1115||t4.getY()!=yi)&&(t5.getX()!=1100||t5.getY()!=yi))
                        {    com.setLocation(1200 - w, 460);}
                        else if((t2.getX()!=1145||t2.getY()!=er)&&(t3.getX()!=1130||t3.getY()!=er)&&(t4.getX()!=1115||t4.getY()!=er)&&(t5.getX()!=1100||t5.getY()!=er))
                        {   com.setLocation(1200 - w, 420);}
                        else if((t2.getX()!=1145||t2.getY()!=san)&&(t3.getX()!=1130||t3.getY()!=san)&&(t4.getX()!=1115||t4.getY()!=san)&&(t5.getX()!=1100||t5.getY()!=san))
                        {   com.setLocation(1200 - w, 380);}
                        else if((t2.getX()!=1145||t2.getY()!=si)&&(t3.getX()!=1130||t3.getY()!=si)&&(t4.getX()!=1115||t4.getY()!=si)&&(t5.getX()!=1100||t5.getY()!=si))
                        { com.setLocation(1200 - w, 340);}
                        else if((t2.getX()!=1145||t2.getY()!=wu)&&(t3.getX()!=1130||t3.getY()!=wu)&&(t4.getX()!=1115||t4.getY()!=wu)&&(t5.getX()!=1100||t5.getY()!=wu)){com.setLocation(1200 - w, 300);}
                        }

                        if(t1.getX()==1160&&t1.getY()==wu&&flag[0]==0) {new notice().notic();flag[0]=1;}
                    }

                }
                @Override
                public void mousePressed(MouseEvent e) {
                    JComponent com;
                    com=(JComponent) e.getSource();
                    a=com.getBounds().x;
                    b=com.getBounds().y;
                    x0=e.getX();
                    y0=e.getY();
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    JComponent com;
                    com=(JComponent) e.getSource();
                    a=com.getBounds().x;
                    b=com.getBounds().y;
                    x0=e.getX();
                    y0=e.getY();
                    if(t1.getX()==1160&&t1.getY()==wu) new notice().notic();
                }
            });
            t1.setFont(f);



//按钮控制代码如下
        final int[] step = {0};
            mb1.addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent e)
                {
                    t1.setBounds(360, wu, 80, 40);
                    t2.setBounds(345, si, 110, 40);
                    t3.setBounds(330, san, 140, 40);
                    t4.setBounds(315, er, 170, 40);
                    t5.setBounds(300, yi, 200, 40);
                    step[0]=1;
                    flag[0]=0;
                }
            });
            mb2.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(step[0]==1&&(t1.getY()!=wu||t2.getY()!=si||t3.getY()!=san||t4.getY()!=er||t5.getY()!=yi))
                    { step[0]--;}
                    switch (step[0]) {
                        case 0:
                        case 32: {
                                t1.setBounds(360, wu, 80, 40);
                                t2.setBounds(345, si, 110, 40);
                                t3.setBounds(330, san, 140, 40);
                                t4.setBounds(315, er, 170, 40);
                                t5.setBounds(300, yi, 200, 40);
                                step[0]=0;
                            flag[0]=0;
                                break;
                                }
                        case 1:
                        case 13:    {t1.setBounds(1160, yi, 80, 40); break;}
                        case 2:
                        case 26:    {t2.setBounds(745 , yi, 110,40); break;}
                        case 3:
                        case 9:
                        case 27:
                        case 21:    {t1.setBounds(760, er, 80, 40); break;}
                        case 4:     {t3.setBounds(1130 , yi, 140,40); break;}
                        case 5:
                        case 11:
                        case 23:    {t1.setBounds(360, san, 80, 40); break;}
                        case 6:
                        case 18:    {t2.setBounds(1145 , er, 110,40); break;}
                        case 7:
                        case 19:
                        case 25:    {t1.setBounds(1160, san, 80, 40); break;}
                        case 8:     {t4.setBounds(715 , yi, 170,40); break;}
                        case 10:
                        case 22:    {t2.setBounds(345 , er, 110,40); break;}
                        case 12:    {t3.setBounds(730 , er, 140,40); break;}
                        case 14:    {t2.setBounds(745 , san, 110,40); break;}
                        case 15:    {t1.setBounds(760, si, 80, 40); break;}
                        case 16:    {t5.setBounds(1100 , yi, 200,40); break;}
                        case 17:
                        case 29:    {t1.setBounds(360, yi, 80, 40); break;}
                        case 20:    {t3.setBounds(330 , yi, 140,40); break;}
                        case 24:    {t4.setBounds(1115 , er, 170,40); break;}
                        case 28:    {t3.setBounds(1130 , san, 140,40); break;}
                        case 30:    {t2.setBounds(1145 , si, 110,40); break;}
                        case 31:    {t1.setBounds(1160 , wu, 80,40); break;}
                    }
                    step[0]++;
                    if(t1.getX()==1160&&t1.getY()==wu) new notice().notic();
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }

            });

            mp.setLayout(null);
//窗口结束代码
            jf.setVisible(true);
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

}