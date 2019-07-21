/* file name    : {name}
 * authors      : Adrian
 * created      : {date}
 * copyright    : MIT
 * version      : 0.1
 */
package kolokwiumadi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KolokwiumAdi {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int menu=4;String imie = "", nazwisko = "";int nrIndeksu;

        while(menu!=0){
        System.out.println("Podaj co wybierasz ");
        System.out.println("1 - wyświetlanie");
        System.out.println("2 - dodawanie");
        System.out.println("3 - usuwanie");
        System.out.println("0 - zakoncz ");
        Scanner odczytMenu = new Scanner(System.in);
        menu = odczytMenu.nextInt();
        if (menu == 1){
            BufferedReader odczytaj = new BufferedReader(new FileReader("C:/Test/lista.txt")); // buffered przyspiesza program, dane odczytywane z bufora (z pamieci)
            String tresc = "";
        System.out.println("Lista studentów : " );
            while((tresc = odczytaj.readLine()) != null) // ostatnia wartosc readline to null
            {
                System.out.println(tresc);
            }
        odczytaj.close(); // zamkniecie potoku
        }        
        if (menu == 2){
        System.out.println("Podaj imię : ");
        Scanner odczytywanie = new Scanner(System.in);
        imie = odczytywanie.next(imie);
        
        System.out.println("Podaj nazwisko : ");
        Scanner odczytywanieN = new Scanner(System.in);
        nazwisko = odczytywanieN.next(nazwisko);   
        
        System.out.println("Podaj nr indeksu : ");
        Scanner odczytywanieI = new Scanner(System.in);
        nrIndeksu = odczytywanieI.nextInt();
        // obsługa wyjątku - błędu podczas otwarcia pliku.
        try{
            PrintWriter zapisz = new PrintWriter(new FileWriter("dane.txt",true)); // wartosc true, jesli plik nie ma byc czyszczony
                                                                                      // PrintWriter tylko zapisuje, FileWriter otwiera i zapisuje
            zapisz.println(imie + "\t" + nazwisko + "\t" + nrIndeksu);
            zapisz.close(); //zamkniecie potoku
            }
        catch(Exception e)
        {
            System.out.println("Błąd pliku !!"); // instrukcja informująca o błędzie zapisu do pliku
        }
        if (menu == 3){
        ///////usun       
        }
        }        
        }                
    }
}
