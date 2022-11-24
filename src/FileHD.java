import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

    public class FileHD{

        void createFile(String filename, String content) {
            try {
                File f = new File(filename);
                FileWriter fw = new FileWriter(f);
                fw.write(content);
                fw.close();
                System.out.println(filename + " has been created.");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        void readFile(String filename)
        {
            try {

                File f=new File(filename);

                if(f.exists())
                {
                    FileReader fr=new FileReader(f);
                    String data="Deep";
                    int n;

//				n=fr.read();
//				while(n!=-1)
//				{
//					//System.out.println("Data : "+(char)n+" : "+n);
//					data=data+(char)n;
//					n=fr.read();
//				}
//

                    while((n=fr.read())!=-1)
                    {
                        data=data+(char)n;
                    }
                    System.out.println(data);
                    fr.close();

                }
                else
                {
                    System.out.println("File not found");
                }

            }
            catch(Exception e)
            {e.printStackTrace();}
        }

    }

