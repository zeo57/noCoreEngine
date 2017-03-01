import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.Timer;

import java.util.* ;
import java.util.concurrent.TimeUnit;


import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Dimension;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Window extends JFrame implements ActionListener, KeyListener
{
  Timer timee = new Timer(5, this);
    Timer timer;
  int x = 300, y = 100 , velX = 0, velY = 0 ;
  private JButton startButton;
  private String gameTitle      ="You talkin' to me?";
  private String startString    = "Start";
  private String optionString   = "Option";
  private String helpString     = "Instructions";
  private JPanel mousePanel;
  private JLabel cordinate;
  private  Color colorStart     = Color.GRAY;
  private  Color colorOption    = Color.GRAY;
  private  Color colorHelp      = Color.GRAY;
  private String indexInput     = "Index";
  private boolean answer  = true;
  private boolean indexMouseEvent = true;
  private boolean newLoadGame = false;
  private String languageVariable ="English";
  private String optionVariable   ="Options";
  private String soundVariable    ="Sound";
  private String musicVariable    ="Music";
  private String newGameVariable  ="New Game";
  private String loadGameVariable ="Load Game";
  private String LanguageMetod    ="English";
  private String startVariable    ="Start";
  private boolean OptionMouseMetod = false;
  private String backVariable     ="Back";
  private String helpVariable     ="Instructions";
  private boolean ActionConfirm   =false;
  private boolean inGameOptions   = false;
  private boolean optionVariableFourMouse = false;
  private String  languageName    ="English";
  private boolean SwitchAnimation = false;
  private boolean AtackAnimation  = false;





  public Window()
  {

    timee.start();

      addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(true);

    //super("Dovydas Mankus copyright");
    mousePanel = new JPanel();
    add(mousePanel,BorderLayout.CENTER);


    cordinate = new JLabel("Default");
    add(cordinate,BorderLayout.SOUTH);

    startButton = new JButton("Start");
    startButton.setFont(new Font ("Tahoma", Font.BOLD, 10));
    startButton.setIcon(new ImageIcon("/home/zeo57/Desktop/PHP tibiame/ErebosSurface2nd.png/"));
    startButton.setBorderPainted(false);
    startButton.setContentAreaFilled(false);
    startButton.setOpaque(true);
    startButton.setBackground(Color.BLACK);
  //  startButton.setBorder(new RoundedBorder(10));
  //startButton.setForeground(Color.BLACK);

    //add(startButton);

    validate();

    HandlerClass handler  = new HandlerClass();
    mousePanel.addMouseListener(handler);
    mousePanel.addMouseMotionListener(handler);




  }

  public void UpdateMetod()
  {
    repaint();
  }


    public void keyPressed(KeyEvent e)
    {
      int c = e.getKeyCode();
      if(ActionConfirm == true)

      {
        if (c == KeyEvent.VK_W)
        {
          velY = -1;
        }

        if (c == KeyEvent.VK_D)
        {
          velX = 1;
        }

        if (c == KeyEvent.VK_A)
        {
          velX = -1;
        }
        if(c == KeyEvent.VK_S)
        {
          velY = 1;
        }




        if (c == KeyEvent.VK_LEFT)
        {
 System.out.println(x +" " + y );
           velX = -1;

       }

       if (c == KeyEvent.VK_RIGHT)
       {
           System.out.println(x +" " + y );
           velX = 1;

       }


       if (c == KeyEvent.VK_UP)
       {
          System.out.println(x +" " + y );
           velY = -1;
       }


       if (c == KeyEvent.VK_DOWN)
       {

 System.out.println(x +" " + y );
           velY = 1;

       }}
       if (c == KeyEvent.VK_ESCAPE)
       {
         System.exit(1);
         ActionConfirm = false;
         inGameOptions = true;

       }
    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void keyReleased(KeyEvent e)
    {


        velX = 0;
        velY = 0;

    }




  public void paint (Graphics g)
  {
    super.paint(g);


    ImageIcon PlayerImage = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Hell_Guard.gif/");



    if (indexInput == "Index")
    {





    ImageIcon Background = new ImageIcon("/home/zeo57/Desktop/Zelda/Background.jpeg");
    Image image = Background.getImage(); // transform
    Image newimg = image.getScaledInstance(960,540 ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
    Background = new ImageIcon(newimg);
    Background.paintIcon(this, g, 0, 0);
    g.setColor(Color.BLACK);
    Graphics2D gr2D = (Graphics2D)g;
    BasicStroke aStroke = new BasicStroke(15.0f,
    BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
    gr2D.setStroke(aStroke);
    gr2D.draw(new Rectangle2D.Double(450,450,180,10));
    gr2D.draw(new Rectangle2D.Double(450,480,180,10));
    gr2D.draw(new Rectangle2D.Double(450,510,180,10));

  //  g.fillRect(450,380,100,40);
    Font bigFont = new Font("Purisa", Font.PLAIN, 20);
    gr2D.setFont(bigFont);
    gr2D.setColor(Color.GRAY);

    if(languageName =="English")
    {

      gr2D.drawString(startVariable, 510, 463);
      gr2D.drawString(optionVariable, 498,492);
      gr2D.drawString(helpVariable, 470,524);
    }
    if(languageName == "Lithuanian")
    {
      gr2D.drawString(startVariable, 502, 463);
      gr2D.drawString(optionVariable, 484,492);
      gr2D.drawString(helpVariable, 478,524);
    }

    Font gameTitleFont = new Font("Purisa", Font.PLAIN, 10);
    gr2D.setFont(gameTitleFont);
    gr2D.drawString(gameTitle,600,30);
    indexMouseEvent = true;
  }


  if (indexInput =="Options")
  {

    ImageIcon BluredBackground = new ImageIcon("/home/zeo57/Desktop/Zelda/bluredBackground.png");
    Image image = BluredBackground.getImage();
    Image newimg = image.getScaledInstance(960, 540, java.awt.Image.SCALE_SMOOTH);
    BluredBackground = new ImageIcon(newimg);
    BluredBackground.paintIcon(this, g, 0, 0);
    g.drawRect(270,69,400,400);
    g.setColor(Color.LIGHT_GRAY);
    g.fillRect(270,69,400,400);
    g.setColor(Color.BLACK);
    g.fillRect(270,69,400,25);
    g.setColor(Color.GRAY);
    Font bigFont = new Font("Purisa", Font.PLAIN, 20);
    g.setFont(bigFont);
    g.drawString(optionVariable ,430,90);
    g.setColor(Color.BLACK);
    Graphics2D gr2D = (Graphics2D)g;
    BasicStroke aStroke = new BasicStroke(15.0f,
    BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
    gr2D.setStroke(aStroke);
    gr2D.draw(new Rectangle2D.Double(450,400,50,10));
    gr2D.draw(new Rectangle2D.Double(335,150,100,10));
    gr2D.draw(new Rectangle2D.Double(510,150,100,10));
    gr2D.draw(new Rectangle2D.Double(335,200,100,10));
    gr2D.setColor(Color.RED);

    if(languageName =="English")
    {
      gr2D.drawString(backVariable, 453,413);
    }
    if (languageName =="Lithuanian")
    {
      gr2D.drawString(backVariable, 447,413);
    }

    gr2D.setColor(Color.GRAY);

    gr2D.drawString(musicVariable, 360,162);
    gr2D.drawString(soundVariable, 530,162);
    gr2D.drawString(languageVariable, 352, 213);






    indexMouseEvent = false;
  }


  if (indexInput =="help")
  {

    ImageIcon BluredBackground = new ImageIcon("/home/zeo57/Desktop/Zelda/bluredBackground.png");
    Image image = BluredBackground.getImage();
    Image newimg = image.getScaledInstance(960, 540, java.awt.Image.SCALE_SMOOTH);
    BluredBackground = new ImageIcon(newimg);
    BluredBackground.paintIcon(this, g, 0, 0);
    g.drawRect(270,69,400,400);
    g.setColor(Color.LIGHT_GRAY);
    g.fillRect(270,69,400,400);
    g.setColor(Color.BLACK);
    g.fillRect(270,69,400,25);
    g.setColor(Color.GRAY);
    Font bigFont = new Font("Purisa", Font.PLAIN, 20);
    g.setFont(bigFont);
    g.drawString(helpVariable, 430,90);
    g.setColor(Color.BLACK);
    Graphics2D gr2D = (Graphics2D)g;
    BasicStroke aStroke = new BasicStroke(15.0f,
    BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
    gr2D.setStroke(aStroke);
    gr2D.draw(new Rectangle2D.Double(450,400,50,10));

    gr2D.draw(new Rectangle2D.Double(360,150,25,25));
    gr2D.fill(new Rectangle2D.Double(360,150,25,25));

    gr2D.draw(new Rectangle2D.Double(360,200,25,25));
    gr2D.fill(new Rectangle2D.Double(360,200,25,25));

    gr2D.draw(new Rectangle2D.Double(310,200,25,25));
    gr2D.fill(new Rectangle2D.Double(310,200,25,25));
    gr2D.draw(new Rectangle2D.Double(410,200,25,25));
    gr2D.fill(new Rectangle2D.Double(410,200,25,25));



    gr2D.draw(new Rectangle2D.Double(540,150,25,25));
    gr2D.fill(new Rectangle2D.Double(540,150,25,25));

    gr2D.draw(new Rectangle2D.Double(540,200,25,25));
    gr2D.fill(new Rectangle2D.Double(540,200,25,25));

    gr2D.draw(new Rectangle2D.Double(490,200,25,25));
    gr2D.fill(new Rectangle2D.Double(490,200,25,25));
    gr2D.draw(new Rectangle2D.Double(590,200,25,25));
    gr2D.fill(new Rectangle2D.Double(590,200,25,25));




    gr2D.setColor(Color.RED);

    if(languageName =="English")
    {
      gr2D.drawString(backVariable, 453,413);
    }
    if (languageName =="Lithuanian")
    {
      gr2D.drawString(backVariable, 447,413);
    }


    Font helpArrowsFont = new Font("Purisa", Font.PLAIN, 30);
    gr2D.setFont(helpArrowsFont);
    gr2D.setColor(Color.GRAY);
    gr2D.drawString("W", 360, 173);
    gr2D.drawString("S", 365, 223);
    gr2D.drawString("A", 310, 223);
    gr2D.drawString("D", 410, 223);


    indexMouseEvent = false;
  }

  if (indexInput == "Start")
  {
  ImageIcon BluredBackground = new ImageIcon("/home/zeo57/Desktop/Zelda/bluredBackground.png");
  Image image = BluredBackground.getImage();
  Image newimg = image.getScaledInstance(960, 540, java.awt.Image.SCALE_SMOOTH);
  BluredBackground = new ImageIcon(newimg);
  BluredBackground.paintIcon(this, g, 0, 0);
  g.drawRect(270,69,400,400);
  g.setColor(Color.LIGHT_GRAY);
  g.fillRect(270,69,400,400);
  g.setColor(Color.BLACK);
  g.fillRect(270,69,400,25);
  g.setColor(Color.GRAY);
  Font bigFont = new Font("Purisa", Font.PLAIN, 20);
  g.setFont(bigFont);
  g.drawString(startVariable, 430,90);
  g.setColor(Color.BLACK);
  Graphics2D gr2D = (Graphics2D)g;
  BasicStroke aStroke = new BasicStroke(15.0f,
  BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
  gr2D.setStroke(aStroke);
  gr2D.draw(new Rectangle2D.Double(450,400,50,10));
  gr2D.setColor(Color.RED);

  if(languageName =="English")
  {
    gr2D.drawString(backVariable, 453,413);
  }
  if (languageName =="Lithuanian")
  {
    gr2D.drawString(backVariable, 447,413);
  }


  indexMouseEvent = false;
  gr2D.setColor(Color.BLACK);
  gr2D.draw (new Rectangle2D.Double(370,150,200,25));
  gr2D.fill(new Rectangle2D.Double(370,150,200,25));
  gr2D.draw (new Rectangle2D.Double(370,200,200,25));
  gr2D.fill(new Rectangle2D.Double(370,200,200,25));
  if (languageName == "English")
  {
    Font reallyBigFont = new Font("Purisa", Font.PLAIN, 30);
    gr2D.setFont(reallyBigFont);
    gr2D.setColor(Color.GRAY);
    gr2D.drawString(newGameVariable, 385, 175);
    gr2D.drawString(loadGameVariable, 385, 224);
  }
  if (languageName =="Lithuanian")
  {
    Font reallyBigFont = new Font("Purisa", Font.PLAIN,20);
    gr2D.setFont(reallyBigFont);
    gr2D.setColor(Color.GRAY);
    gr2D.drawString(newGameVariable, 385, 171);
    gr2D.drawString(loadGameVariable, 385, 224);
  }



}
if (inGameOptions == true)
{
  g.drawRect(270,69,400,400);
  g.setColor(Color.LIGHT_GRAY);
  g.fillRect(270,69,400,400);
  g.setColor(Color.BLACK);
  g.fillRect(270,69,400,25);
  g.setColor(Color.GRAY);
  Font bigFont = new Font("Purisa", Font.PLAIN, 20);
  g.setFont(bigFont);
  g.drawString(optionVariable ,430,90);
  g.setColor(Color.BLACK);
  Graphics2D gr2D = (Graphics2D)g;
  BasicStroke aStroke = new BasicStroke(15.0f,
  BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
  gr2D.setStroke(aStroke);
  gr2D.draw(new Rectangle2D.Double(450,400,50,10));
  gr2D.draw(new Rectangle2D.Double(335,150,100,10));
  gr2D.draw(new Rectangle2D.Double(510,150,100,10));
  gr2D.draw(new Rectangle2D.Double(335,200,100,10));
  gr2D.setColor(Color.RED);
  if(languageName =="English")
  {
    gr2D.drawString(backVariable, 453,413);
  }
  if (languageName =="Lithuanian")
  {
    gr2D.drawString(backVariable, 447,413);
  }
  gr2D.setColor(Color.GRAY);

  gr2D.drawString(musicVariable, 360,162);
  gr2D.drawString(soundVariable, 530,162);
  gr2D.drawString(languageVariable, 352, 213);

}








if(indexInput == "FirstTownPaint")
{

      ImageIcon FirstTownSurface  = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/ErebosSurface2nd.png");
for (int i = 0 ; i < 1; i++  )
{
      for (int x = 0; x < 960; x = x + 50)
      {
        for(int y = 0; y < 560; y = y + 50)
        {
        FirstTownSurface.paintIcon(this, g, x, y);
        }
      }
}
    //  UpdateMetod();


}




  if (indexInput == "levelOnePaint")
      {
          ActionConfirm = true;
          ImageIcon BackgroundIce     = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/BlueIceSurface.png");
          ImageIcon Testas            = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/TestasCroped.png");
          ImageIcon IceCubeObstacle   = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/IceCube.png");
          ImageIcon IceTreeObstacle   = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Obstacle.png");
          ImageIcon DownStairs        = new ImageIcon ("/home/zeo57/Desktop/Zelda/Pictures/DownStairs.png");
          ImageIcon IceWallDownEnd2nd            = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/IceWallDownEnd2nd.png");
          ImageIcon IceWallUp1s                    = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/IceWallUp1st.png");
          ImageIcon Monster                        = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Yeti.gif");
          ImageIcon Smoke                          = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/smoke_plume.gif");
          ImageIcon SmokeTest                      = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Smokenumber2.gif");


          for (int x = 0 ;x < 960; x = x + 50)
          {
            for (int y = 0; y < 560; y = y + 50)
            {
              BackgroundIce.paintIcon(this, g, x, y);
              //Testas.paintIcon(this, g, 0,0);
              //ImageIcon IceTreeObstacle = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Obstacle.png");
              IceCubeObstacle.paintIcon(this, g, 225,442);
              IceTreeObstacle.paintIcon(this, g, 400, 200);
              IceTreeObstacle.paintIcon(this, g, 400, 250);
              IceTreeObstacle.paintIcon(this, g, 400, 300);
              IceTreeObstacle.paintIcon(this, g, 400, 350);
              IceTreeObstacle.paintIcon(this, g, 400, 400);
              IceTreeObstacle.paintIcon(this, g, 350, 400);
              IceTreeObstacle.paintIcon(this, g, 350, 400);
              IceTreeObstacle.paintIcon(this, g, 300, 400);
              IceTreeObstacle.paintIcon(this, g, 350, 400);
              DownStairs.paintIcon(this, g, 50, 200);
              Monster.paintIcon(this, g, 600,300);
              //Smoke.paintIcon(this, g, 600, 200);
              //SmokeTest.paintIcon(this, g, 600,200);
            }
          }


          for (int x = 0 ; x < 960; x = x + 50)
          {
            IceWallDownEnd2nd.paintIcon(this, g, x, 50);
            IceWallUp1s.paintIcon(this,g , x ,0);
          }


          for(int i = 0; i < 1000; i++)
          {
            PlayerImage.paintIcon(this, g, x , y );
          }


      if(AtackAnimation == true)
      {
        g.drawLine(10,40,10,40);

      }
}

if(indexInput == "LevelTwoPaint")
{


    ImageIcon GreenGrassSurface            = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/greenSurface.png");
    ImageIcon Oak                          = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Oak.png");
    ImageIcon Tree2nd                      = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Tree2nd.png");
    ImageIcon Tree3th                      = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Tree3th.png");
    ImageIcon Portal                       = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Portal.png");
    ImageIcon Tower                        = new ImageIcon("/home/zeo57/Desktop/Zelda/Pictures/Tower.png");





    for (int x = 0; x < 960; x = x + 50)
    {
      for(int y = 0; y < 560; y = y + 50)
      {


        GreenGrassSurface.paintIcon(this, g, x, y);
      }

    }
      for(int i = 0; i < 1000; i++)
      {
        PlayerImage.paintIcon(this, g, x, y);
        Oak.paintIcon(this, g, 100, 200);
        Oak.paintIcon(this, g, 150 ,400);
        Oak.paintIcon(this, g, 200, 200);
        Tree2nd.paintIcon(this, g, 250, 300);
        Tree2nd.paintIcon(this, g, 300, 450);
        Tree2nd.paintIcon(this, g, 500, 600);
        Portal.paintIcon(this, g, 700, 50);
        Tower.paintIcon(this, g, 200, 420);

      }



}


  if (SwitchAnimation == true)
  {
    for (int x = 0; x < 960; x = x + 20)
    {
      for(int y = 0; y < 560; y = y + 20)
      {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 10);



        try {
                System.out.println("Scanning...");
                Thread.sleep(1); // 1 second
            } catch (InterruptedException ex) {
                // handle error
            }
          }
        }
          for (int x = 0; x < 960; x = x + 20)
          {
            for(int y = 0; y < 560; y = y + 20)
            {
              g.setColor(Color.BLACK);
              g.fillRect(x, y, 20, 20);



              try {
                      System.out.println("Scanning...");
                      Thread.sleep(1); // 1 second
                  } catch (InterruptedException ex) {
                      // handle error
                  }
                }
    }

    SwitchAnimation = false;
  }


  }

  private class HandlerClass implements MouseListener, MouseMotionListener
{

    public void LanguageMetod(String languageName)

    {

      if(languageName == "Russian")
      {
        startVariable       = "rusStart";
        optionVariable      = "rusOption";
        newGameVariable     = "rusNewGam";
        loadGameVariable    = "rusLoadGame";
      }

      if(languageName == "English")
      {
        startVariable       ="Start";
        optionVariable      = "Options";
        newGameVariable     ="New Game";
        loadGameVariable    ="Load Game";
        musicVariable       ="Music";
        soundVariable       ="Sound";
        languageVariable    ="English";
        backVariable        ="Back";
        helpVariable        ="Instructions";
        languageName        ="English";

      }

      if(languageName == "Lithuanian")
      {
        startVariable       = "Pradeti";
        optionVariable      = "Nustatymai";
        newGameVariable     = "Naujas Žaidimas";
        loadGameVariable    = "";
        musicVariable       = "Muzika";
        soundVariable       = "Garsas";
        languageVariable    = "Lietuviu";
        backVariable        = "Atgal";
        helpVariable        = "Instrukcijos";

        languageName        ="Lithuanian";


      }


    }






    public void mouseClicked(MouseEvent event)
    {


      //cordinate.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
      String xCordinate = String.format("%d", event.getX());
    //  cordinate.setText(xCordinate);
      int x = Integer.parseInt(xCordinate.trim());
      String yCordinate = String.format("%d", event.getY());
      int y = Integer.parseInt(yCordinate.trim());
      cordinate.setText(xCordinate +" " + yCordinate);

      if(indexMouseEvent == false)
      {
        if((x > 450) && ( y > 400))
          {
            if((x < 506) && (y < 410))
            {
              indexInput = "Index";

              repaint();
            }
          }
      //    gr2D.drawString("New Game", 385, 175);
      //    gr2D.drawString("Load Game", 385, 224);
    //  gr2D.draw (new Rectangle2D.Double(370,150,200,25));
      //gr2D.fill(new Rectangle2D.Double(370,150,200,25));
      //gr2D.draw (new Rectangle2D.Double(370,200,200,25));
    //  gr2D.fill(new Rectangle2D.Double(370,200,200,25));

    if(optionVariableFourMouse == true)
    {
        if((x > 328) && (y > 145))
        {
          if ((x < 440) && (y <170))
          {

            musicVariable = "off";

            repaint();
          }
        }
        if ((x > 328) && (y > 195))
        {
          if ((x < 439) && (y < 216))
          {
            if (languageName == "Lithuanian")
            {
              LanguageMetod("English");
              languageName ="English";
            }
            else
            {
              LanguageMetod("Lithuanian");
              languageName ="Lithuanian";
            }

            repaint();
          }
        }


    }

    if(newLoadGame == true )
        if((x > 370) && (y > 150))
          {
            if((x < 570) && (y < 175))
            {
              indexInput = "levelOnePaint";
              ActionConfirm = true;
              repaint();
              newLoadGame = false;


            }
          }
      }



      if (indexMouseEvent == true)
      {
        if ((x > 450) && (y >450))
        {
          if ((x < 550) && (y < 460))
          {
            indexInput = "Start";
            newLoadGame = true;
            repaint();
          }
        }



        if ((x > 450) && (y > 480))
        {
          if ((x < 550 ) && (y < 490))
          {
            indexInput = "Options";
             optionVariableFourMouse = true;
            repaint();


          }
        }


        if ((x > 450) && (y > 510))
        {
          if ((x < 550) && (y < 610))
          {
            indexInput = "help";
            repaint();
          }
        }

    }
  }
    public void mousePressed(MouseEvent event)
    {


    }


    public void mouseReleased(MouseEvent event)
    {




    }


    public void mouseEntered(MouseEvent event)
    {




    }

    public void mouseExited(MouseEvent event)
    {

    }
    public void mouseDragged(MouseEvent event)
    {

    }







    public void mouseMoved(MouseEvent event)
    {
      /*
      String xCordinate = String.format("%d", event.getX());
      String yCordinate = String.format("%d", event.getY());
      cordinate.setText("X =" + xCordinate + "Y = " + yCordinate + "    " + answer);

      int x = Integer.parseInt(xCordinate.trim());
      int y = Integer.parseInt(yCordinate.trim());
      //    gr2D.drawString(startString,472,463);

      if ((x >= 446) &&(y >= 444))
      {
        if ((x <= 555) && (y <= 467))
        {
          colorStart = Color.RED;
        //  repaint();
        }

      }
      */
      }
/*
      private class thehandler implements ActionListener
      {




      }
*/
  }

  public void actionPerformed(ActionEvent e)
{
  if ((x > 0) && (y > 127))
  {
    if ((x < 75) && (y < 202))
    {
      SwitchAnimation =  true;
      indexInput= "LevelTwoPaint";





      x = 0;
      y = 0;

      repaint();

    }
  }



    if((x > 537) && (y > 256))
    {
      if((x < 660) && (y < 339))
      {
        //monstro range
        //  AtackAnimation = true;
        indexInput = "FirstTownPaint";

      }
    }

    if (x > 960)
    {
      velX = 1;
      x = 960;
    }

    if (y > 400)
    {
      velY = 1;
      y = 400 ;
    }

    if (x < 0 )
    {
      velX = 0;
      x = 0;
    }

    if(y < 49)
    {
      velY = 0;
      y = 49;

    }

    x = x + velX;
    y = y + velY;


  }





  }
