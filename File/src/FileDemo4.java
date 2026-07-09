import java.io.File;

public class FileDemo4 {
    static void main(String[] args) {
        //路径
findAVI();
    }
    //获取所有盘的路径
    public static void findAVI(){
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }
    }
    public static void findAVI(File src){
        //获取路径
        File[] files = src.listFiles();
        if (files != null) {
            //遍历
            for (File file : files) {
                //判断
                if (file.isFile()) {
                    String name = file.getName();
                    //
                    if(name.endsWith(".txt")) {
                        System.out.println(file);
                    }

                }else {
                    //如果是文件夹就递归
                    findAVI(file);
                }
            }
        }
    }
}
