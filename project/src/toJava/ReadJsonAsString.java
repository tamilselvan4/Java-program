package toJava;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ReadJsonAsString {

    public static void main(String[] args) throws Exception {
        String file = "project/src/toJava/MyFile.json";
        String json = readFileAsString(file);
        System.out.println(json);
        MyJsonObject myobj = new MyJsonObject(json)
        // String jsonString = "{\n" +
        //     "        \"libraryname\":\"My Library\",\n" +
        //     "                \"mymusic\":[{\"Artist Name\":\"Aaron\",\"Song Name\":\"Beautiful\"},\n" +
        //     "        {\"Artist Name\":\"Britney\",\"Song Name\":\"Oops I did It Again\"},\n" +
        //     "        {\"Artist Name\":\"Britney\",\"Song Name\":\"Stronger\"}]}";
        // System.out.println(jsonString);
        // Map<String, Object> jsonObject = U.fromJsonMap(jsonString);
        // System.out.println(jsonObject);

        // // {libraryname=My Library, mymusic=[{Artist Name=Aaron, Song Name=Beautiful}, {Artist Name=Britney, Song Name=Oops I did It Again}, {Artist Name=Britney, Song Name=Stronger}]}

        // System.out.println(U.<String>get(jsonObject, "mymusic[0].Artist Name"));
    }
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}