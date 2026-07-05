import java.io.*;

public class CopyTest01 {
    static void main(String[] args) throws IOException {
        //利用File分别创建源文件src和复制后的文件路径dest
        File src = new File("B:\\aaa\\src");
        File dest = new File("B:\\aaa\\dest");
     //调用复制方法copydir
        copydir(src,dest);

    }
 //创建复制方法copydir
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //创建一个数组去接收src里面的文件内容
        File[] files = src.listFiles();
        //遍历数组去得到里面的每一个文件
        for (File file : files) {
            //判断，如果文件夹里面的是文件，就执行以下的语句
            if (file.isFile()) {
                //创建字节流输入流读取文件内容
            FileInputStream fis = new FileInputStream(file);
            //创建字节流输出流复制输出读取到的内容括号里面的内容为：new一个新File,把复制的文件夹赋值进去，然后把要复制的文件的名字放在后面
            FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
            //定义一个长度为5的字节数组来一次读取5个字节的数组来提高复制效率
           byte[] bytes = new byte[5];
           //定义一个整形侵权接收读取到多少个字节的数量
           int len;
           //利用while去遍历每一个字节，然后到达换行 -1时候停止
                while ((len = fis.read(bytes) )!= -1){
                    //把遍历到的数字写入fos里面然后复制
                    fos.write(bytes,0,len);
                }
                //释放资源
                fos.close();
                fis.close();
                //如果打开的是文件夹，则递归，递归数据：dest文件和src里面得到的文件名再重新执行copydir
            }else {
                copydir(file,new File(dest,file.getName()));

            }

    }

    }
}
