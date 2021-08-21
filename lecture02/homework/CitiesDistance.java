package homework;

import java.util.ArrayList;//引入容器
import java.util.Scanner;//引入扫描函数

//主类
public class CitiesDistance{
    public static void main(String[] args) {
        City city = new City();//新建City类对象city
        city.setDistance();//调用setDistance方法设置距离
        city.getDistance();//调用getDistance方法输出距离
    }
}

//City类
class City{
    private ArrayList<String> city;//容器，存储城市名
    private int distance[][];//二维数组，存储输入的距离矩阵
    Scanner in = new Scanner(System.in);

    //构造函数，初始化
    public City() {
        city=new ArrayList<String>();
        String ctName=in.next();//输入城市名

        //把城市名添加进容器
        while(true) {
            if(ctName.equals("###")) {
                break;//如果输入的是“###”，停止添加城市名
            }
            city.add(ctName);//添加
            ctName=in.next();//输入
        }

        //若输入n个城市，建立n*n大小距离矩阵
        distance=new int[city.size()][city.size()];
    }

    //初始化距离矩阵
    public void setDistance() {
        int mile=0;

        for(int i=0;i<distance.length;i++) {//行
            for(int j=0;j<distance[i].length;j++) {//列
                mile=in.nextInt();//输入距离
                distance[i][j]=mile;//初始化对应坐标距离矩阵
            }
        }
    }

    //得到两城市之间的距离
    public void getDistance() {
        //输入起始城市名，并获取其在容器中的坐标
        int start=city.indexOf(in.next());
        //输入终点城市名，并获取其在容器中的坐标
        int end=city.indexOf(in.next());
        //根据起始和终点坐标在距离矩阵中找到两城市之间的距离
        System.out.println(distance[start][end]);
    }
}
