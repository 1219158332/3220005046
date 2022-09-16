package com.azhu.main;

import com.azhu.utils.HammingUtils;
import com.azhu.utils.SimHashUtils;
import com.azhu.utils.TxtIOUtils;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        str[1] = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_add.txt");
        str[2] = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_del.txt");
        str[3] = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_dis_1.txt");
        str[4] = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_dis_10.txt");
        str[5] = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtIOUtils.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansOrigAndOrigTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_add.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansOrigAndAddTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_del.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansOrigAndDelTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_dis_1.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansOrigAndDis1Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_dis_10.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansOrigAndDis10Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/12191/Desktop/test/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/12191/Desktop/test/ansOrigAndDis15Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans,ansFileName);
    }

}
