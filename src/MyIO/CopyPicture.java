package MyIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.*;

/**
 * CopyPicture
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/7/11 9:18
 */
public class CopyPicture {
    public static void main(String[] args) throws IOException {
        try(FileInputStream is = new FileInputStream("C:\\Users\\XiaoBai\\Desktop\\1111\\logo.png");
        FileOutputStream os = new FileOutputStream("C:\\Users\\XiaoBai\\Desktop\\1111\\logo111.png")){
            byte[] bytes = new byte[1024];
            int len;
            while((len = is.read(bytes)) != -1){
                os.write(bytes,0,len);
            }
        }

        String str = "123";

        char c = str.charAt(1);

        int i = str.indexOf(1);

        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                2L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                //new ThreadPoolExecutor.AbortPolicy()
                //new ThreadPoolExecutor.CallerRunsPolicy()
                //new ThreadPoolExecutor.DiscardOldestPolicy()
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );


    }
}
