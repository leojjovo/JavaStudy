import java.io.File;

public class FileDemo5 {
    static void main(String[] args) {
        //创建路径
        File src = new File("B:\\AAA");
        delete(src);

    }
    public static void delete(File src){
        //先删除文件夹里面的所有内容
        File[] files = src.listFiles();
        for (File file : files) {
            //判断，如果是文件，删除
            if (file.isFile()) {
                file.delete();
            }else {
                //判断，如果是文件夹，就递归
                delete(file);
            }
        }
        //再删除直接
        src.delete();
    }
}
