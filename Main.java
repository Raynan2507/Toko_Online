package shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang();
        Tranksaksi transasi = new Tranksaksi();
        Karyawan karyawan = new Karyawan();
        Member member = new Member();
        Laporan Laporan = new Laporan();
        
        
        Laporan.laporan(barang);
        Laporan.laporan(member);
        Tranksaksi transaksi = null;
        Laporan.laporan(transaksi, barang);
        transaksi.prosesTranksaksi(member, transaksi, barang);
}
    
}
