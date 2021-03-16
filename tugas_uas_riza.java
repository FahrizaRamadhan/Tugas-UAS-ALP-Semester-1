/*
*	Nama	: Fahriza Ramadhan
*	NIM		: 202013029
*	Prodi	: TIF 1B
*	Makul	: ALP
*
*/

import java.util.*;
public class tugas_uas_riza{
	public static void main (String[]args){

// Tampilan Awal

		System.out.println();
		System.out.println("\t\t\t\t\t\t=======================================");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=        Projek UAS Semester 1        =");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=/////////////////////////////////////=");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=         Program Perhitungan         =");
		System.out.println("\t\t\t\t\t\t=         Volume Bangun Ruang         =");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=======================================");
		System.out.println();
		login();

	}
// Masukkan Username dan Password

		static void login(){
		String data[]={"Riza","202013029"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nMasukkan Username Anda \t: ");
		username=masuk.nextLine();
		System.out.print("Masukkan Password Anda \t: ");
		password=masuk.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan data yang sudah kita inputkan di atas
		 */
		

		if(username.equals(data[0])&&password.equals(data[1])){
			
			System.out.println();
			System.out.println("=============================================");
			System.out.println("=                                           =");
			System.out.println("=            Selamat Datang Di              =");
			System.out.println("=         Program Menghitung Bangun         =");
			System.out.println("=                  Ruang                    =");
			System.out.println("=                                           =");
			System.out.println("=============================================");
			System.out.println();
			menu();
		}else{
			System.out.println();
			System.out.println("Maaf Username atau Password yang Anda Masukkan Salah");
			System.out.println("Silahkan Masukkan Username dan Password Anda Kembali");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			login();
		}
		
		
	}

// Pemilihan di menu awal

	static void menu(){
		
		String menu_utama[]={"Mulai Program","Biodata Pemrogram","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
		System.out.println("3. "+menu_utama[2]);
		
		Scanner pilih=new Scanner(System.in);
		int menu;
		
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			mulai();
		}else if(menu==2){
			biodata();
		}else{
			System.out.println();
			System.out.println("Terima Kasih Telah Berhitung");
			System.out.println("Sistem Sekarang Akan keluar");
			System.out.println("Keluar Dari Sistem");
			System.exit(0);
		}
	}

// Pemilihan bangun ruang yang ingin dihitung

	static void mulai(){

		int daftar_bangun;
		String bangun_ruang[]={"Volume Kubus","Volume Balok","Volume Kerucut","Volume Prisma Segitiga","Semua Bangun Ruang","Keluar"};
		
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_ruang[0]);
		System.out.println("2. "+bangun_ruang[1]);
		System.out.println("3. "+bangun_ruang[2]);
		System.out.println("4. "+bangun_ruang[3]);
		System.out.println("5. "+bangun_ruang[4]);
		System.out.println("6. "+bangun_ruang[5]);
		
		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.println();
		System.out.print("Silahkan Pilih Bangun Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1 :

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Kubus       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Sisi = ");

					double sisi,volume_kubus;

					Scanner terimasisi=new Scanner(System.in);
					sisi=terimasisi.nextDouble();

					volume_kubus=sisi*sisi*sisi;

					System.out.println();
					System.out.println("\tVolume Kubus Adalah "+volume_kubus);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 2:

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Balok       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Panjang = ");

					double panjang_balok,lebar_balok,tinggi_balok,volume_balok;

					Scanner terimapanjang=new Scanner(System.in);
					panjang_balok=terimapanjang.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Lebar = ");
					Scanner terimalebar=new Scanner(System.in);
					lebar_balok=terimalebar.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggi=new Scanner(System.in);
					tinggi_balok=terimatinggi.nextDouble();

					volume_balok=panjang_balok*lebar_balok*tinggi_balok;

					System.out.println();
					System.out.println();
					System.out.println("\tVolume Balok Adalah "+volume_balok);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 3 :

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=      Menghitung Volume Kerucut      =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_kerucut,tinggi_kerucut,volume_kerucut;

					Scanner terimaalaskerucut=new Scanner(System.in);
					luas_alas_kerucut=terimaalaskerucut.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggikerucut=new Scanner(System.in);
					tinggi_kerucut=terimatinggikerucut.nextDouble();

					volume_kerucut=luas_alas_kerucut*tinggi_kerucut/3;

					System.out.println();
					System.out.println("\tVolume Kerucut Adalah "+volume_kerucut);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 4 :

					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Volume Prisma Segitiga    =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_prisma,tinggi_prisma,volume_prisma;

					Scanner terimaalasprisma=new Scanner(System.in);
					luas_alas_prisma=terimaalasprisma.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggiprisma=new Scanner(System.in);
					tinggi_prisma=terimatinggiprisma.nextDouble();

					volume_prisma=luas_alas_prisma*tinggi_prisma/2;

					System.out.println();
					System.out.println("\tVolume Prisma Segitiga Adalah "+volume_prisma);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 5 :

				// Kubus

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Kubus       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Sisi = ");

					double sisi1,volume_kubus1;

					Scanner terimasisi1=new Scanner(System.in);
					sisi1=terimasisi1.nextDouble();

					volume_kubus1=sisi1*sisi1*sisi1;

					System.out.println();
					System.out.println("\tVolume Kubus Adalah "+volume_kubus1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Kubus Telah Selesai");

				// Balok 

					System.out.println();
					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Balok       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Panjang = ");

					double panjang_balok1,lebar_balok1,tinggi_balok1,volume_balok1;

					Scanner terimapanjang1=new Scanner(System.in);
					panjang_balok1=terimapanjang1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Lebar = ");
					Scanner terimalebar1=new Scanner(System.in);
					lebar_balok1=terimalebar1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggi1=new Scanner(System.in);
					tinggi_balok1=terimatinggi1.nextDouble();

					volume_balok1=panjang_balok1*lebar_balok1*tinggi_balok1;

					System.out.println();
					System.out.println();
					System.out.println("\tVolume Balok Adalah "+volume_balok1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Balok Telah Selesai");

				// Kerucut

					System.out.println();
					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=      Menghitung Volume Kerucut      =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_kerucut1,tinggi_kerucut1,volume_kerucut1;

					Scanner terimaalaskerucut1=new Scanner(System.in);
					luas_alas_kerucut1=terimaalaskerucut1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggikerucut1=new Scanner(System.in);
					tinggi_kerucut1=terimatinggikerucut1.nextDouble();

					volume_kerucut1=luas_alas_kerucut1*tinggi_kerucut1/3;

					System.out.println();
					System.out.println("\tVolume Kerucut Adalah "+volume_kerucut1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Kerucut Telah Selesai");

				// Prisma Segitiga

					System.out.println();
					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Volume Prisma Segitiga    =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_prisma1,tinggi_prisma1,volume_prisma1;

					Scanner terimaalasprisma1=new Scanner(System.in);
					luas_alas_prisma1=terimaalasprisma1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggiprisma1=new Scanner(System.in);
					tinggi_prisma1=terimatinggiprisma1.nextDouble();

					volume_prisma1=luas_alas_prisma1*tinggi_prisma1/2;

					System.out.println();
					System.out.println("\tVolume Prisma Segitiga Adalah "+volume_prisma1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Prisma Segitiga Telah Selesai");
					System.out.println();

					double volume[]={volume_kubus1,volume_balok1,volume_kerucut1,volume_prisma1};//array
					double penampung=0;

	
					for(int h=0; h<(volume.length); h++){
						for(int i=0; i<(volume.length-1); i++){
						if(volume[i]>volume[i+1]){
						penampung=volume[i];
						volume[i]=volume[i+1];
						volume[i+1]=penampung;
					}
				 }
						System.out.print(h+1+" = ");
						for(int d=0; d<volume.length; d++){
						System.out.print(volume[d]+"  ");
					}
						System.out.println();
				}

					System.out.println();
					System.out.print("Data pada array hasil[] setelah di urutkan = {");
					for(int i=0; i<volume.length; i++){
					System.out.print(volume[i]+" , ");
					}
					System.out.print("}");
					System.out.println();
					next();

					break;

			case 6 :

					System.out.println();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("~                                          ~");
					System.out.println("~       Terima Kasih Telah Berhitung       ~");
					System.out.println("~        Sistem Sekarang Akan keluar       ~");
					System.out.println("~             Keluar Dari Sistem           ~");
					System.out.println("~                                          ~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.exit(0);

			default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menu2+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Sekarang Akan Keluar");
					System.exit(0);


		}

		// if(menu2==1){
		// 	kubus();
		// }else if(menu2==2){
		// 	balok();
		// }else if(menu2==3){
		// 	kerucut();
		// }else if(menu2==4){
		// 	prisma_segitiga();
		// }else{
		// 	System.out.println();
		// 	System.out.println("Terima Kasih Telah Menggunakan Program Saya");
		// 	System.out.println("Semoga Harimu Menyenangkan");
		// 	System.exit(0);
		// }


	}

// Biodata Pemrogram

	static void biodata(){

		System.out.println("Biodata Saya");
		System.out.println();
		System.out.println("Nama Saya : Fahriza Ramadhan");
		System.out.println("TTL       : Solok, 01 Desember 2000");
		System.out.println("Umur      : 20 Tahun");
		System.out.println("Fakultas  : TIF 1B Politeknik Kampar");
		System.out.println("Status    : Mahasiswa (Aktif)");
		System.out.println();
		System.out.println("Sekian Dan Terima Kasih");
	}

	static void next(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.print("Apakah Anda Akan Melakukan Perhitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			mulai();
		}else{
			penutup();
		}

	}
	static void penutup(){

		System.out.println();
		System.out.println("\tTerima Kasih Telah Berhitung");
		System.out.println("\tProses Telah Selesai");
		System.out.println("\tKeluar Dari Sistem");
	}	
}
