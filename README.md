<img width="278" height="41" alt="image" src="https://github.com/user-attachments/assets/33093d08-16ff-4695-97f9-0882e1bb3893" />

Saya menggunakan ini untuk menyimpan daftar Wisata Kalimantan Timur & membaca input dari user, misalnya nama wisata atau pilihan menu.

<img width="614" height="120" alt="image" src="https://github.com/user-attachments/assets/f90aed6e-8f20-4d83-bf2c-224cc8ccc9e9" />

ini adalah pondasi awal dari program CRUD daftar wisata.

<img width="779" height="228" alt="image" src="https://github.com/user-attachments/assets/ef88de20-ffff-44b9-b139-55e7249cb5e1" />

Menampilkan menu utama CRUD Daftar Wisata Kaltim.
Membaca pilihan user dengan Scanner.
Menyimpan pilihan tersebut di variabel pilihan agar bisa dipakai dalam switch-case untuk menentukan aksi berikutnya (tambah, lihat, update, hapus, keluar).

<img width="740" height="412" alt="image" src="https://github.com/user-attachments/assets/281ffc04-a161-4cf8-8677-aac45b00963f" />
<img width="709" height="482" alt="image" src="https://github.com/user-attachments/assets/e11943f2-5e52-4bfd-9753-4590a9392ec8" />
<img width="902" height="692" alt="image" src="https://github.com/user-attachments/assets/e9afca05-6ab5-4ecd-9b76-930750926f60" />


case 1: Tambah Wisata
Meminta input list Wisata Baru.
Menambahkan list tersebut ke dalam ArrayList daftarWisata.

case 2: Lihat Daftar Wisata
Menampilkan semua list Wisata yang sudah ada di ArrayList.
Jika list kosong, tampilkan pesan "Belum ada data".

case 3: Update Data Wisata
Menampilkan daftar Wisata dengan nomor indeks.
User memilih nomor Wisata yang ingin diubah.
Meminta input nama baru, lalu mengganti data lama dengan data baru.

case 4: Hapus Wisata
Menampilkan daftar Wisata dengan nomor indeks.
User memilih nomor wisata yang ingin dihapus.
Menghapus data tersebut dari ArrayList.

case 5: Keluar
Menghentikan perulangan do-while.
Program berhenti dengan pesan keluar.
