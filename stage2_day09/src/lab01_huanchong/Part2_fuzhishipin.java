package lab01_huanchong;

import java.io.*;

/**
 * 复制视频
 */
public class Part2_fuzhishipin {
    public static void main(String[] args) throws IOException {
        //开始时间
        long startTime=System.currentTimeMillis();
        copyMp4();
        //结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("执行时间:"+(endTime-startTime)+"毫秒");
    }
    public static void copyMp4() throws IOException {
        String targetFile="stage2_day09\\src\\myFile\\target.mp4";
        String resultFile="stage2_day09\\src\\myFile\\result.mp4";
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(targetFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(resultFile));
        byte[] bytes =new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
