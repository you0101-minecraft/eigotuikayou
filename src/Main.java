
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //読み込むファイルにIAmACat.txt、書き出すファイル名にsample2.txtを指定しています。
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\youpa\\OneDrive\\ドキュメント\\動画\\MCWD\\eigo\\eigo.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\youpa\\OneDrive\\ドキュメント\\動画\\MCWD\\eigo\\add.txt"))) {

            //文字ストリームのテキスト行を格納するためのString型の変数lineを宣言します。
            String line;
            int i = 0;
            int j;



            //readLine()メソッドは文字ストリームから1行ずつ読み込むことが出来ますが、
            //終端に達したときにnullを返します。
            //そのため、linebr.readLine()がnullを返すまでwhileループさせるとファイル全体を読み込むことが出来ます。
            while ((line = br.readLine()) != null) {

                i = i+1;
                j = i%2;


                if (j == 1) {

                    String line2 = "add " + "\"" + line + "\"" + " to {tangolist::*}";
                    String line3 = "set {nihongo} to " + "\"" + line + "\"";
                    String line4 = "if {eigo} is \"" + line + "\"";
                    //文字ストリームから読み込んだ内容を出力します。
                    System.out.println(line4);



                    //読み込んだ内容を書き込みます。改行文字はreadLine()メソッドでは読み取らないので、
                    //改行を出力したい場合はnewLine()メソッドを使う必要があります。

                    //bw.write(line2);
                    //bw.write(line3);

                    bw.write(line4);
                    bw.newLine();

                }
                else{
                    String line2 = "add " + "\"" + line + "\"" + " to {tangolist::*}";
                    String line3 = "set {nihongo} to " + "\"" + line + "\"";
                    String line4 = "if {eigo} is \"" + line + "\"";
                    //文字ストリームから読み込んだ内容を出力します。
                    //System.out.println(line3);
                    System.out.println(line3);

                    //読み込んだ内容を書き込みます。改行文字はreadLine()メソッドでは読み取らないので、
                    //改行を出力したい場合はnewLine()メソッドを使う必要があります。

                    //bw.write(line2);
                    bw.write(line3);


                    bw.newLine();

                }


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
