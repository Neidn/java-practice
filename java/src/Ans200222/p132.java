package Ans200222;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

//파일 복사하기
public class p132 {
    public static void copyUsingFiles(File source, File target) {
        try {
            Files.copy(source.toPath(), target.toPath()); // 파일 복사하기
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File ff = new File("upload");
        File[] ffs = ff.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat fdf = new SimpleDateFormat("yyyyMMdd");
        for (File fff : ffs) {
            String absfile = fff.getAbsolutePath();
            if (fff.isFile()) {
                String f = (absfile).substring(absfile.lastIndexOf("\\") + 1); // 파일 경로의 마지막 부분만 가져간다
                String fre = "";
                if (f.indexOf('.') >= 0) {
                    fre = f.substring(0, f.indexOf('.')); // 확장자명을 자른다
                }
                Date longDay = new Date(Long.parseLong(fre)); // long type을 date로 바꾼다, 즉 파일명이 숫자로만 이루어져야한다
                String fname = sdf.format(longDay);
                String newFname = fdf.format(longDay);
                System.out.println(fname + "\t" + newFname);
                File newFile = new File("upload\\" + newFname); // 옮기려고 하는 디렉토리
                File toFile = new File("upload\\" + newFname + "\\" + f); //옮기려는 파일
                if (!newFile.exists()) {
                    boolean iss = newFile.mkdirs(); //없으면 경로를 만든다
                    if (iss) {
                        copyUsingFiles(fff, toFile);
                    }
                } else {
                    copyUsingFiles(fff, toFile);
                }


            }
        }
    }
}
