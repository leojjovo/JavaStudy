import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    static void main(String[] args) throws IOException {
       File file = new File("File\\aaa");
       file.mkdirs();
       File src = new File(file,"bbb");
        boolean b= src.createNewFile();
        if (b) {
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }

    }
}
