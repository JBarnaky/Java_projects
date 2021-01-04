import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
 
public class Task3 {
 
    static ArrayList<File> directory = new ArrayList<File>();
 
    public static void main(String[] args) {
        File path = new File("C:/Users/Default");
        try {
            directory = list(path);
        } catch (IOException e) {
        }
        int size = directory.size();
 
        for (int i = 0; i < directory.size(); i++) {
            System.out.println(directory.get(i).getPath());
        }
    }
 
    public static ArrayList<File> list(File file) throws IOException {
        File[] currentSeekingFolderContent = file.listFiles();
        for (int i = 0; i < currentSeekingFolderContent.length; i++) {
            if (currentSeekingFolderContent[i].isDirectory()) {
                directory.add(currentSeekingFolderContent[i]);
                list(currentSeekingFolderContent[i]);
            }
        }
        return directory;
    }
}
