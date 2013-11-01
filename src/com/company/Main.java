package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Double> zeroArgs;
    public static double h;

    public static void main(String[] args) {


        int k = 5;
        int xesCount=factors.length;

        Main.zeroArgs = new ArrayList<Double>();

        zeroArgs.add(0.0);
        zeroArgs.add(0.8);
        zeroArgs.add(1.0);

        Main.h = 0.00001; // шаг
        List<Double[][]> results = new ArrayList<Double[][]>();
        for(; r(zeroArgs.get(0), 2)<100.0; zeroArgs.set(0,zeroArgs.get(0)+h)) {
            Double[][] alist = new Double[xesCount][5];
            List<Double> StartArgs;
            List<Double> newArgs=new ArrayList<Double>();
            String output="";
            for (int j=0;j<xesCount;j++) {
                StartArgs = new ArrayList<Double>(zeroArgs);
                alist[j][0] = h * F(j, StartArgs);
                StartArgs.set(0,zeroArgs.get(0)+h/2.0);
                StartArgs.set(1,zeroArgs.get(1)+alist[j][0]/2.0);
                alist[j][1] = h * F(j,StartArgs);
                StartArgs.set(0,zeroArgs.get(0)+h/2.0);
                StartArgs.set(1,zeroArgs.get(1)+alist[j][1]/2.0);
                alist[j][2] = h * F(j,StartArgs);
                StartArgs.set(0,zeroArgs.get(0)+h);
                StartArgs.set(1,zeroArgs.get(1)+alist[j][2]);
                alist[j][3] = h * F(j,StartArgs);
                if(j!=0)
                    alist[j][4] = zeroArgs.get(j) + (alist[j][0] + 2.0*alist[j][1] + 2.0*alist[j][2] + alist[j][3])/6.0;
                else
                    alist[j][4] = zeroArgs.get(j) + h;
                alist[j][4] = r(alist[j][4],k);
                newArgs.add(alist[j][4]);
                output += alist[j][4].toString()+" ";
            }
            System.out.println(output);
            zeroArgs = newArgs;

        }

    }
    public static double[][] factors = {{1,2,5},{3,4,6},{7,-8,-9}};
    /**
     * функция для округления и отбрасывания "хвоста"
     */
    public static double r(double value, int k){
        return (double)Math.round((Math.pow(10, k)*value))/Math.pow(10, k);
    }
    /**
     * функции, которые получаются из системы
     */

    public static double F(int i, List<Double> args){
        double result=0;
        for(int j=0;j<factors.length;j++) {
            result+=factors[i][j]*args.get(j);
        }
        return result;
    }
}
