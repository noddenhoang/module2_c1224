package file;

import java.io.*;

public class FileProcessing {
    public static void main(String[] args) throws Exception {
        //Exercise 1: Đọc tất cả nội dung trong file data.txt
        File file = new File("src/file/data.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

        //Exercise 2: Đọc 3 dòng trong file data.txt
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        String line2;
        for (int i = 0; i < 3; i++) {
            line2 = bufferedReader.readLine();
            System.out.println(line2);
        }

        bufferedReader.close();

        //Exercise 3: Đếm số lần xuất hiện của 1 từ trong file data.txt
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        String word = "cô";

        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    count++;
                }
            }
        }
        System.out.println("Số lần xuất hiện của từ '" + word + "' là: " + count);

        bufferedReader.close();

        //Exercise 4: Kiểm tra đường dẫn
        String path = "src/file/data.txt";
        File file2 = new File(path);

        if (file2.exists()) {
            if (file2.isFile()) {
                System.out.println("Đường dẫn là một file");
            } else if (file2.isDirectory()) {
                System.out.println("Đường dẫn là thư mục");
            } else {
                System.out.println("Đường dẫn không phải là file hoặc thư mục");
            }
        } else {
            System.out.println("File không tồn tại");
        }

        //Xoá file hoặc thư mục
        if (file2.exists()) {
            if (file2.delete()) {
                System.out.println("Xoá file thành công");
            } else {
                System.out.println("Xoá file thất bại");
            }
        } else {
            System.out.println("File không tồn tại");
        }

        //Đổi tên file hoặc thư mục
        File file3 = new File("src/file/data.txt");
        File file4 = new File("src/file/data2.txt");

        if (file3.exists()) {
            if (file3.renameTo(file4)) {
                System.out.println("Đổi tên file thành công");
            } else {
                System.out.println("Đổi tên file thất bại");
            }
        } else {
            System.out.println("File không tồn tại");
        }
    }
}
