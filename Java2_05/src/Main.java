import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static ArrayList<FileObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "src/file.csv";
    public static final String title = "userId"+ ";" + "currencyId"
            + ";" + "amount" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();
        AppData appData = readToObject();

    } // скобка main

    public static void createFileObjects(){

        fIleObjectArrayList.add(new FileObject(1, 1, 100));
        fIleObjectArrayList.add(new FileObject(2, 1, 200));
        fIleObjectArrayList.add(new FileObject(3, 2, 10));
        fIleObjectArrayList.add(new FileObject(4, 2, 20));
        fIleObjectArrayList.add(new FileObject(5, 1, 10000));

    }

    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            writer.write(title);
            for(FileObject fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getUserId() + ";" + fIleObject.getCurrencyId()
                        + ";" + fIleObject.getAmount() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }

}
