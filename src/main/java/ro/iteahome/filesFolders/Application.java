/*
List all files and directories from a specific path.
 */

package ro.iteahome.filesFolders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

        public static void main(String[] args) throws IOException, IOException {

            //Path in which we search
            Path pathWithFilesAndDirectories = Paths.get("C:\\JavaCourse\\course6\\filesFolders\\");
            //We collect in allFound (list of paths) all directories and files that we find in the given path
            List<Path> allFound = Files.list(pathWithFilesAndDirectories).collect(Collectors.toList());

            System.out.println("We found in " + pathWithFilesAndDirectories + " the following files and directories:");
            //We print each path we found
            for(Path p : allFound){
                System.out.println(p.getFileName());
            }
        }

}
