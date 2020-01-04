import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class readFromFile {

    String [] softSkills = questionsToArray("/Users/bakmac/Desktop/test.txt");
    String [] javaQuestion = questionsToArray("/Users/bakmac/Desktop/DevexStudent.txt");
    String [] codingTask = questionsToArray("");
   public static String [] students = questionsToArray("");
    public String softSkillQ = getRandom(softSkills);
    public static String[] questionsToArray(String path) {
        File file = new File("/Users/bakmac/Desktop/test.txt");
        String line="";
        String s ="";
        try ( BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(new FileInputStream(file))) ) {
            while  ( ( line =bufferedReader.readLine()) !=null ){
                s+=line +" ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        String [] arr = s.split("$");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static String getRandom(String[] arr){
        int size = arr.length;
        Random random = new Random();
        int index = random.nextInt(size);
        return arr[index];
    }
}
