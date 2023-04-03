package tugas3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramIPS
{
    public static void main(String[] args) throws IOException {

        double sks = 3;
        double totalSks = 18;
        double totalNilai;
        double IPS;
        int nilai1, nilai2, nilai3 , nilai4, nilai5, nilai6;
        String nilhuruf1, nilhuruf2, nilhuruf3, nilhuruf4, nilhuruf5, nilhuruf6;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nilai matkul ke - 1 : ");
        nilai1 = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Nilai matkul ke - 2 : ");
        nilai2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai matkul ke - 3 : ");
        nilai3 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai matkul ke - 4 : ");
        nilai4 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai matkul ke - 5 : ");
        nilai5 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai matkul ke - 6 : ");
        nilai6 = Integer.parseInt(br.readLine());

//        KONVERSI NILAI KE DALAM  BOBOT

//        Nilai ke- 1
        if (nilai1 >= 80 && nilai1 <= 100) {
            nilhuruf1 = "A";
        } else if (nilai1 >= 75 && nilai1 <= 79) {
            nilhuruf1 = "B+";
        } else if (nilai1 >= 65 && nilai1 <= 74) {
            nilhuruf1 = "B";
        } else if (nilai1 >= 60 && nilai1 <= 64) {
            nilhuruf1 = "C+";
        } else if (nilai1 >= 55 && nilai1 <= 59) {
            nilhuruf1 = "C";
        } else if (nilai1 >= 40 && nilai1 <= 54) {
            nilhuruf1 = "D";
        } else {
            nilhuruf1 = "E";
        }

        if (nilai2 >= 80 && nilai2 <= 100) {
            nilhuruf2 = "A";
        } else if (nilai2 >= 75 && nilai2 <= 79) {
            nilhuruf2  = "B+";
        } else if (nilai2 >= 65 && nilai2 <= 74) {
            nilhuruf2  = "B";
        } else if (nilai2 >= 60 && nilai2 <= 64) {
            nilhuruf2  = "C+";
        } else if (nilai2 >= 55 && nilai2 <= 59) {
            nilhuruf2  = "C";
        } else if (nilai2 >= 40 && nilai2 <= 54) {
            nilhuruf2  = "D";
        } else {
            nilhuruf2  = "E";
        }

//        Nilai ke- 3
        if (nilai3 >= 80 && nilai3 <= 100) {
            nilhuruf3 = "A";
        } else if (nilai3 >= 75 && nilai3 <= 79) {
            nilhuruf3 = "B+";
        } else if (nilai3 >= 65 && nilai3 <= 74) {
            nilhuruf3 = "B";
        } else if (nilai3 >= 60 && nilai3 <= 64) {
            nilhuruf3 = "C+";
        } else if (nilai3 >= 55 && nilai3 <= 59) {
            nilhuruf3 = "C";
        } else if (nilai3 >= 40 && nilai3 <= 54) {
            nilhuruf3 = "D";
        } else {
            nilhuruf3 = "E";
        }

//        Nilai ke- 4
        if (nilai4 >= 80 && nilai4 <= 100) {
            nilhuruf4 = "A";
        } else if (nilai4 >= 75 && nilai4 <= 79) {
            nilhuruf4 = "B+";
        } else if (nilai4 >= 65 && nilai4 <= 74) {
            nilhuruf4 = "B";
        } else if (nilai4 >= 60 && nilai4 <= 64) {
            nilhuruf4 = "C+";
        } else if (nilai4 >= 55 && nilai4 <= 59) {
            nilhuruf4 = "C";
        } else if (nilai4 >= 40 && nilai4 <= 54) {
            nilhuruf4 = "D";
        } else {
            nilhuruf4 = "E";
        }

//        Nilai ke- 5
        if (nilai5 >= 80 && nilai5 <= 100) {
            nilhuruf5 = "A";
        } else if (nilai5 >= 75 && nilai5 <= 79) {
            nilhuruf5 = "B+";
        } else if (nilai5 >= 65 && nilai5 <= 74) {
            nilhuruf5 = "B";
        } else if (nilai5 >= 60 && nilai5 <= 64) {
            nilhuruf5 = "C+";
        } else if (nilai5 >= 55 && nilai5 <= 59) {
            nilhuruf5 = "C";
        } else if (nilai5 >= 40 && nilai5 <= 54) {
            nilhuruf5 = "D";
        } else {
            nilhuruf5 = "E";
        }

//        Nilai ke- 6
        if (nilai6 >= 80 && nilai6 <= 100) {
            nilhuruf6 = "A";
        } else if (nilai6 >= 75 && nilai6 <= 79) {
            nilhuruf6 = "B+";
        } else if (nilai6 >= 65 && nilai6 <= 74) {
            nilhuruf6 = "B";
        } else if (nilai6 >= 60 && nilai6 <= 64) {
            nilhuruf6 = "C+";
        } else if (nilai6 >= 55 && nilai6 <= 59) {
            nilhuruf6 = "C";
        } else if (nilai6 >= 40 && nilai6 <= 54) {
            nilhuruf6 = "D";
        } else {
            nilhuruf6 = "E";
        }

        double ipk1 = 0, ipk2 = 0, ipk3 = 0, ipk4 = 0, ipk5 = 0, ipk6 = 0;

//        NILAI PADA MATA KULIAH KE - 1
        if (nilhuruf1 == "A") {
            ipk1 = 4.0;
        } else if (nilhuruf1 == "B+") {
            ipk1 = 3.50;
        } else if (nilhuruf1 == "B") {
            ipk1 = 3.0;
        } else if (nilhuruf1 == "C+") {
            ipk1 = 2.50;
        } else if (nilhuruf1 == "C") {
            ipk1 = 2.0;
        } else if (nilhuruf1 == "D") {
            ipk1 = 1.0;
        } else {
            ipk1 = 0.0;
        }

        //NILAI PADA MATA KULIAH KE - 2
        if (nilhuruf2 == "A") {
            ipk2 = 4.0;
        } else if (nilhuruf2 == "B+") {
            ipk2 = 3.50;
        } else if (nilhuruf2 == "B") {
            ipk2 = 3.0;
        } else if (nilhuruf2 == "C+") {
            ipk2 = 2.50;
        } else if (nilhuruf2 == "C") {
            ipk2 = 2.0;
        } else if (nilhuruf2 == "D") {
            ipk2 = 1.0;
        } else {
            ipk2 = 0.0;
        }

//        NILAI PADA MATA KULIAH KE - 3
        if (nilhuruf3 == "A") {
            ipk3 = 4.0;
        } else if (nilhuruf3 == "B+") {
            ipk3 = 3.50;
        } else if (nilhuruf3 == "B") {
            ipk3 = 3.0;
        } else if (nilhuruf3 == "C+") {
            ipk3 = 2.50;
        } else if (nilhuruf3 == "C") {
            ipk3 = 2.0;
        } else if (nilhuruf3 == "D") {
            ipk3 = 1.0;
        } else {
            ipk3 = 0.0;
        }

        if (nilhuruf4 == "A") {
            ipk4 = 4.0;
        } else if (nilhuruf4 == "B+") {
            ipk4 = 3.50;
        } else if (nilhuruf4 == "B") {
            ipk4 = 3.0;
        } else if (nilhuruf4 == "C+") {
            ipk4 = 2.50;
        } else if (nilhuruf4 == "C") {
            ipk4 = 2.0;
        } else if (nilhuruf4 == "D") {
            ipk4 = 1.0;
        } else {
            ipk4 = 0.0;
        }

//        NILAI PADA MATA KULIAH KE - 5
        if (nilhuruf5 == "A") {
            ipk5 = 4.0;
        } else if (nilhuruf5 == "B+") {
            ipk5 = 3.50;
        } else if (nilhuruf5 == "B") {
            ipk5 = 3.0;
        } else if (nilhuruf5 == "C+") {
            ipk5 = 2.50;
        } else if (nilhuruf5 == "C") {
            ipk5 = 2.0;
        } else if (nilhuruf5 == "D") {
            ipk5 = 1.0;
        } else {
            ipk5 = 0.0;
        }

//        NILAI MATKUL KE - 6
        if (nilhuruf6 == "A") {
            ipk6 = 4.0;
        } else if (nilhuruf6 == "B+") {
            ipk6 = 3.50;
        } else if (nilhuruf6 == "B") {
            ipk6 = 3.0;
        } else if (nilhuruf6 == "C+") {
            ipk6 = 2.50;
        } else if (nilhuruf6 == "C") {
            ipk6 = 2.0;
        } else if (nilhuruf6 == "D") {
            ipk6 = 1.0;
        } else {
            ipk6 = 0.0;
        }

        totalNilai = ipk1 * sks + ipk2* sks + ipk3 * sks + ipk4 * sks + ipk5 * sks + ipk6 * sks;
        IPS = totalNilai / totalSks;

        System.out.println("\n Nilai mata kuliah ke - 1 adalah : "+nilhuruf1+"\n Nilai mata kuliah ke - 2 adalah : "+nilhuruf2+"\n Nilai mata kuliah ke - 3 adalah : "+nilhuruf3+"\n Nilai mata kuliah ke - 4 adalah : "+nilhuruf4+"\n Nilai mata kuliah ke - 5 adalah : "+nilhuruf5+"\n Nilai mata kuliah ke - 6 adalah : "+nilhuruf6);
        System.out.print("IPS yang diperoleh adalah: " + IPS);

//        Percabangan pengambilan SKS
        if (IPS < 2.00) {
            System.out.println("\n Maksimal SKS yang bisa anda ambil adalah 18 SKS");
        } else if (IPS >= 2.00 && IPS <= 2.99) {
            System.out.println("\n Maksimal SKS yang bisa anda ambil adalah 20 SKS");
        } else if (IPS >= 3.00 && IPS <= 3.49) {
            System.out.println("\n Maksimal SKS yang bisa anda ambil adalah 22 SKS");
        } else if (IPS >= 3.50) {
            System.out.println("\n Maksimal SKS yang bisa anda ambil adalah 24 SKS");
        }
    }
}