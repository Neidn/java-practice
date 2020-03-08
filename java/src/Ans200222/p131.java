package Ans200222;

import Ans200125.RestDay;

import java.io.File;

//파일정보 출력하기
public class p131 {
    public static void printTree(File ff) {
        if (ff.exists()) { //파일이 존재하는가
            File[] fd = ff.listFiles();
            if (fd == null || fd.length == 0) {
                return; // 파일이 없으면 종료
            } else {
                for (File f : fd) {
                    if (f.isDirectory()) { // 디렉토리가 존재하는가
                        System.out.println(f.getAbsolutePath()); // 절대경로로 출력
                    }
                }
            }
        }
    }

    public static void aboutFile(File f) {
        System.out.println("------------------------------");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName()); // 파일 이름
        System.out.println("canRead: " + f.canRead()); // 파일 읽기 여부
        System.out.println(f.length() + " bytes"); //파일 크기
    }

    public static void printTree2(File ff) {
        if (ff.exists()) {
            File[] fd = ff.listFiles();
            if (fd == null || fd.length == 0) {
                return;
            } else {
                for (File f : fd) {
                    if (f.isDirectory()) {
                        System.out.println("---------------" + f.getAbsolutePath());
                        printTree2(f); //재귀 사용, 반복문이 아닌 재귀를 이용해 디렉토리 안의 모든 파일을 읽는다
                    } else {
                        aboutFile(f);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        File[] fs = File.listRoots(); //루트 디렉토리
        for (File f : fs) {
            if (f.isDirectory()) {
                printTree(new File(f.getAbsolutePath()));
            }
        }
        File f = new File("C:\\HONEYVIEW-PORTABLE");
        printTree2(f);
        System.out.println("---------------------------");
        for (char c = 'A'; c <= 'Z'; c++) { // 문자는 아스키코드를 쓰므로 더해도 상관없다
            String dirNames = c + ":/"; //라인 분리용
            File allDirs = new File(dirNames);
            if (allDirs.exists()) {
                long total = (long) allDirs.getTotalSpace();
                long free = (long) allDirs.getFreeSpace();
                double used = (double) (1 - free * 1.0 / total) * 100; // 사용량을 %로 변환
                String str = c + ":\\디렉토리의 사용량 : " + used + "%";
                System.out.println(str);
            }
        }
    }
}
