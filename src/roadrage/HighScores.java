

package roadrage;

import java.io.*;

public class HighScores
{
    public static void high (String newName)
    {
        try
        {
            String verify, putData;
            File file = new File("scores.txt");
            String name = newName;
            file.createNewFile();
            //FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(name);
            bw.newLine();
            bw.flush();
            bw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            
            while( ( line = br.readLine()) != null)
            {
                System.out.println(line);
            } 
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}