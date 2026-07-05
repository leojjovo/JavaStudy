import java.io.*;

public class copyTest02 {
    static void main(String[] args) throws IOException {
        //定义要被复制的文件路径
        File src = new File("B:\\aaa\\src");
        //定义要复制到哪的文件路径
        File dest = new File("B:\\aaa\\dest");
        //定义一个方法来复制
        copydir(src,dest);
    }

    private static void copydir(File src,File dest) throws IOException {
        dest.mkdirs();
        //定义一个File数组去接收要复制的文件路径
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            //判断是否为文件夹
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,src.getName()));
                //如果是文件，则复制
                //定义一个字节数组去存放字节，提高复制效率
                byte[] bytes = new byte[5];
                //定义一个整形变量去接收读取到了多少个数据
                int len;
                //利用while循环去制
                while ((len = fis.read(bytes)) != -1) {
                    //写入(从0索引写道len个)
                    fos.write(bytes, 0, len);
                }
                //释放资源
                fos.close();
                fis.close();
            }else {
                copydir(file,new File(file.getName()));
            }
        }
    }
}
