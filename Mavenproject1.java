/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Mavenproject1 {
    public static void main(String[] args) {
        int pilihan;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarWisata = new ArrayList<>();
        
        // Daftar Wisata Di Bontang
        daftarWisata.add("Bukit Bangkirai");
        daftarWisata.add("Pulau Derawan");
        daftarWisata.add("Pulau Maratua");
        daftarWisata.add("Pulau Kakaban");
        daftarWisata.add("Pulau Sangalaki");
        daftarWisata.add("Danau Labuan Cermin");
        daftarWisata.add("Teluk Sumbang");
        daftarWisata.add("Goa Haji Mangku");
        daftarWisata.add("Air Terjun Jantur Mapan");
        daftarWisata.add("Taman Nasional Kutai");
        daftarWisata.add("Kebun Raya Balikpapan");
        daftarWisata.add("Konservasi Orangutan Samboja Lestari");
        daftarWisata.add("Taman Hutan Raya Bukit Soeharto");
        daftarWisata.add("Pantai Melawai");
        daftarWisata.add("Pantai Lamaru");
        daftarWisata.add("Desa Budaya Pampang");
        daftarWisata.add("Museum Mulawarman");
        daftarWisata.add("Lamin Etam Ambors");
        daftarWisata.add("Air Terjun Tembalang");
        daftarWisata.add("Pantai Tanjung Batu");

        
        
        do {
            System.out.println("\n=== Manajemen Daftar Wisata Kalimantan Timur ===");
            System.out.println("1. Tambah Wisata");
            System.out.println("2. Lihat Daftar Wisata");
            System.out.println("3. Update Data Wisata");
            System.out.println("4. Hapus Wisata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama wisata: ");
                    String wisata = scanner.nextLine();
                    daftarWisata.add(wisata);
                    System.out.println("Wisata berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Wisata Kalimantan Timur ---");
                    if (daftarWisata.isEmpty()) {
                        System.out.println("Belum ada data wisata.");
                    } else {
                        for (int i = 0; i < daftarWisata.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarWisata.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Update Data Wisata ---");
                    if (daftarWisata.isEmpty()) {
                        System.out.println("Belum ada data yang bisa diupdate.");
                    } else {
                        for (int i = 0; i < daftarWisata.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarWisata.get(i));
                        }
                        System.out.print("Pilih nomor wisata yang ingin diupdate: ");
                        int idxUpdate = scanner.nextInt();
                        scanner.nextLine(); 
                        if (idxUpdate > 0 && idxUpdate <= daftarWisata.size()) {
                            System.out.print("Masukkan nama baru: ");
                            String wisataBaru = scanner.nextLine();
                            daftarWisata.set(idxUpdate - 1, wisataBaru);
                            System.out.println("Data wisata berhasil diupdate!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Hapus Data Wisata ---");
                    if (daftarWisata.isEmpty()) {
                        System.out.println("Belum ada data yang bisa dihapus.");
                    } else {
                        for (int i = 0; i < daftarWisata.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarWisata.get(i));
                        }
                        System.out.print("Pilih nomor wisata yang ingin dihapus: ");
                        int idxHapus = scanner.nextInt();
                        scanner.nextLine();
                        if (idxHapus > 0 && idxHapus <= daftarWisata.size()) {
                            String terhapus = daftarWisata.remove(idxHapus - 1);
                            System.out.println("Wisata " + terhapus + " berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}