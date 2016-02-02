package Module3_2;


import java.util.ArrayList;
import java.util.List;

public class Dir {

    private List<File> files = new ArrayList<>();

    public Dir() {
        files.add(new TextFile());
        files.add(new AudioFile());
        files.add(new ImageFile());
    }

    @Override
    public String toString() {

        int counter = 0;
        String output = "Index\tFile_type\n";

            for (File files : files) {
                counter++;
                output = output + counter + "\t\t" + files.getType() + "\n";

        }

        return output;
    }
}

