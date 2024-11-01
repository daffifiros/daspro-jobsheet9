import java.util.Scanner;
public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int jumlahMahasiswaLulus = 0, jumlahMahasiswaTidakLulus = 0;
        int totalNilaiMahasiswaLulus = 0, totalNilaiMahasiswaTidakLulus = 0;
        double rataRataLulus, rataRataTidakLulus;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        for (int nilai : nilaiMahasiswa) {
            if (nilai >= 70) {
                jumlahMahasiswaLulus++;
                totalNilaiMahasiswaLulus += nilai;
            } else {
                jumlahMahasiswaTidakLulus++;
                totalNilaiMahasiswaTidakLulus += nilai;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: " + jumlahMahasiswaLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahMahasiswaTidakLulus);
        if (jumlahMahasiswaLulus > 0) {
            rataRataLulus = (double) totalNilaiMahasiswaLulus / jumlahMahasiswaLulus;
            System.out.println("Rata-rata nilai lulus: " + rataRataLulus);
        }
        if (jumlahMahasiswaTidakLulus > 0) {
            rataRataTidakLulus = (double) totalNilaiMahasiswaTidakLulus / jumlahMahasiswaTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus: " + rataRataTidakLulus);
        }
    }
}