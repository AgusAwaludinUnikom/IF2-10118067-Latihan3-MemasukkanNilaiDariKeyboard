/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10118067.latihan3;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : Agus Awaludin
 * Kelas    : IF-2
 * NIM      : 10118067
 * Latihan 3. Memasukkan nilai dari keyboard
 */
public class IF210118067Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda = ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
        
    }
    
}
