using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FeiXinQi
{
    class Program
    {
        #region 变量声明
        //静态字段定义全局变量
        static int [] Maps=new int[100];
        //定义玩家的位置
        static int [] playerPlace=new int[2];
        //定义玩家
        static string [] playerName=new string[2];
        #endregion

        /// <summary>
        /// 主方法
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //游戏规则
            Console.WriteLine("游戏规则： 玩家A踩到了玩家B，玩家B退后6格");
            Console.WriteLine("踩到地雷，退后6格\r 踩到时空隧道，前进10格");
            Console.WriteLine("A踩到幸运轮盘，A前进6格，B后退6格\r 踩到暂停，暂停一回合");
            //游戏头画出方法调用
            showHead();
            //玩家确定
            inputName();
            //重新载入
            clearAndShow();
            //游戏正式开始
            while(playerPlace[0]<99&&playerPlace[1]<99)
            {
                Console.WriteLine("{0}按任意键投掷骰子",playerName[0]);
                Console.ReadKey(true);
            }
    
        }
        /// <summary>
        /// 获得玩家姓名
        /// </summary>
        static void inputName()
        {
            #region
            Console.WriteLine("请输入第一个玩家的姓名:");
            playerName[0] = Console.ReadLine();
            while(playerName[0].Equals(""))
            {
                Console.WriteLine("请输入第一个玩家的姓名不能为空，请重新输入:");
                playerName[0] = Console.ReadLine();
            }
            Console.WriteLine("请输入第二个玩家的姓名:");
            playerName[1] = Console.ReadLine();
            while (playerName[1].Equals("") || playerName[1] == playerName[0])
            {
                if (playerName[1].Equals(""))
                {
                     Console.WriteLine("请输入第二个玩家的姓名不能为空，请重新输入:");
                     playerName[1] = Console.ReadLine();
                }
                else
                {
                    Console.WriteLine("请输入第二个玩家的姓名不能与第一个玩家的姓名一样，请重新输入:");
                     playerName[1] = Console.ReadLine();
                }
            }
            #endregion
        }
        /// <summary>
        /// 游戏头部
        /// </summary>
        static void showHead(){
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("***************************");
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("***************************");
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.WriteLine("***************************");
            Console.ForegroundColor = ConsoleColor.Gray;
            Console.WriteLine("**********飞行棋游戏*******");
            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.WriteLine("***************************");
            //游戏说明
            Console.WriteLine("<>表示初始位置 Ω表示普通位置 ※表示幸运轮盘 ◎表示地雷 ＊表示暂停 Δ表示时空隧道");
        }
        /// <summary>
        /// 输出玩家姓名
        /// </summary>
        /// <param name="name1"></param>
        /// <param name="name2"></param>
        static void showName(string name1,string name2)
        {
            Console.WriteLine("\r");
            Console.WriteLine("玩家{0}用士兵A表示,玩家{1}用士兵B表示", name1, name2);
            Console.WriteLine("\r"); Console.WriteLine("\r");
        }
        /// <summary>
        /// 初始化地图
        /// </summary>
        static void initialization()
        {
            int[] luckTurn = {7,10,20,30,60,80};//幸运轮盘
            for (int i = 0; i < luckTurn.Length;++i )
            {
                int index=luckTurn[i];
                Maps[index] = 1;
            }
            int[] landMine = { 4, 9, 18, 24, 6, 7, 45, 87 };//地雷
            for (int i = 0; i < landMine.Length;++i )
            {
                int index=landMine[i];
                Maps[index] = 2;
            }
            int[] pause = { 12, 33, 45, 56, 76, 95 };//暂停
            for (int i = 0; i < pause.Length;++i )
            {
                int index=pause[i];
                Maps[index] = 3;
            }
            int[] timeTunnel = { 35, 44, 77, 88 };//时空隧道
            for (int i = 0; i < timeTunnel.Length;++i )
            {
                int index=timeTunnel[i];
                Maps[index] = 4;
            }
        }
        /// <summary>
        /// 画图(行上)
        /// </summary>
        /// <param name="start"></param>
        /// <param name="end"></param>
        static void draw_map_raws_top(int start,int end)
        {
          #region 画出一行
          for (int i = start; i < end; ++i)
          {
              if (playerPlace[0] == playerPlace[1] && playerPlace[0] == i)
              {
                  Console.Write("<>");
              }
              else if (playerPlace[0] == i)
              {
                  //shift+空格
                  Console.Write("A");
              }
              else if (playerPlace[1] == i)
              {
                  //shift+空格
                  Console.Write("B");
              }
              else
              {
                  switch (Maps[i])
                  {
                      case 0:
                          Console.ForegroundColor = ConsoleColor.Yellow;
                          Console.Write("Ω");
                          break;
                      case 1:
                          Console.ForegroundColor = ConsoleColor.Blue;
                          Console.Write("※");
                          break;
                      case 2:
                          Console.ForegroundColor = ConsoleColor.Red;
                          Console.Write("◎");
                          break;
                      case 3:
                          Console.ForegroundColor = ConsoleColor.Gray;
                          Console.Write("＊");
                          break;
                      case 4:
                          Console.ForegroundColor = ConsoleColor.Yellow;
                          Console.Write("Δ");
                          break;
                  }//switch
              }//else
          }//for
          //换行
          Console.WriteLine();
          #endregion
        }
        /// <summary>
        /// 画图(行下)
        /// </summary>
        /// <param name="start"></param>
        /// <param name="end"></param>
        static void draw_map_raws_bottom(int start, int end)
        {
            #region 画出一行
            for (int i = end-1; i >=start; --i)
            {
                if (playerPlace[0] == playerPlace[1] && playerPlace[0] == i)
                {
                    Console.Write("<>");
                }
                else if (playerPlace[0] == i)
                {
                    //shift+空格
                    Console.Write("A");
                }
                else if (playerPlace[1] == i)
                {
                    //shift+空格
                    Console.Write("B");
                }
                else
                {
                    switch (Maps[i])
                    {
                        case 0:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("Ω");
                            break;
                        case 1:
                            Console.ForegroundColor = ConsoleColor.Blue;
                            Console.Write("※");
                            break;
                        case 2:
                            Console.ForegroundColor = ConsoleColor.Red;
                            Console.Write("◎");
                            break;
                        case 3:
                            Console.ForegroundColor = ConsoleColor.Gray;
                            Console.Write("＊");
                            break;
                        case 4:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("Δ");
                            break;
                    }//switch
                }//else
            }//for
            //换行
            Console.WriteLine();
            #endregion
        }
        /// <summary>
        /// 画出竖行(右)
        /// </summary>
        /// <param name="start"></param>
        /// <param name="end"></param>
        static void draw_map_cols_right(int start,int end)
        {
            #region 画出右竖行
            for (int i = start; i < end; ++i)
            {
                for (int j = 0; j < 58; ++j)
                {
                    Console.Write(" ");
                }
                if (playerPlace[0] == playerPlace[1] && playerPlace[0] == i)
                {
                    Console.Write("<>");
                }
                else if (playerPlace[0] == i)
                {
                    //shift+空格
                    Console.Write("A");
                }
                else if (playerPlace[1] == i)
                {
                    //shift+空格
                    Console.Write("B");
                }
                else
                {
                    switch (Maps[i])
                    {
                        case 0:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("Ω");
                            break;
                        case 1:
                            Console.ForegroundColor = ConsoleColor.Blue;
                            Console.Write("※");
                            break;
                        case 2:
                            Console.ForegroundColor = ConsoleColor.Red;
                            Console.Write("◎");
                            break;
                        case 3:
                            Console.ForegroundColor = ConsoleColor.Gray;
                            Console.Write("＊");
                            break;
                        case 4:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("Δ");
                            break;
                    }//switch
                }//else
                //换行
                Console.WriteLine();
            }//for
         #endregion
        }
        /// <summary>
        /// 画出竖行(左)
        /// </summary>
        /// <param name="start"></param>
        /// <param name="end"></param>
        static void draw_map_cols_left(int start,int end)
        {
            #region 画出左竖行
            for (int i = start; i < end; ++i)
            {
                if (playerPlace[0] == playerPlace[1] && playerPlace[0] == i)
                {
                    Console.Write("<>");
                }
                else if (playerPlace[0] == i)
                {
                    //shift+空格
                    Console.Write("A");
                }
                else if (playerPlace[1] == i)
                {
                    //shift+空格
                    Console.Write("B");
                }
                else
                {
                    switch (Maps[i])
                    {
                        case 0:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("Ω");
                            break;
                        case 1:
                            Console.ForegroundColor = ConsoleColor.Blue;
                            Console.Write("※");
                            break;
                        case 2:
                            Console.ForegroundColor = ConsoleColor.Red;
                            Console.Write("◎");
                            break;
                        case 3:
                            Console.ForegroundColor = ConsoleColor.Gray;
                            Console.Write("＊");
                            break;
                        case 4:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("Δ");
                            break;
                    }//switch
                }//else
                //换行
                Console.WriteLine();
            }//for
            #endregion
        }
        /// <summary>
      /// 画地图
      /// </summary>
        static void drawMap()
      {
          //画出第一行
          draw_map_raws_top(0,30);
          //画出右竖行
          draw_map_cols_right(30, 35);
          //画出第二行
          draw_map_raws_bottom(35,65);
          //画出左竖行
          draw_map_cols_left(65,70);
          //画出第三行
          draw_map_raws_top(70,100);
        }
        /// <summary>
        /// 每次清屏及其后动作
        /// </summary>
        static void clearAndShow()
        {
            #region
            //清理屏幕
            Console.Clear();
            //游戏头画出方法调用
            showHead();
            //输出玩家姓名
            showName(playerName[0], playerName[1]);
            //初始化地图方法调用
            initialization();
            //画地图方法调用
            drawMap();
            #endregion
        }
    }
}
