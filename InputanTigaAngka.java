import javax.swing.JOptionPane;

public class InputanTigaAngka {
    public static void main(String[] args) {
        String[] kb = JOptionPane.showInputDialog("Kode Barang").toUpperCase().split("-");
        int jumlahBarang = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Barang"));
        String kode = kb[0];
        int harga =0;
        String namabarang="";
        int discount = Integer.parseInt(kb[1]);
        switch (kode) {
            case "AND": harga = 1000000;namabarang="Android"; break;
            case "IOS": harga = 2000000;namabarang="Apple"; break;
            case "BLB": harga = 1750000; namabarang="BlackBerry"; break;
            case "WNP": harga = 2500000; namabarang="Windows Phone"; break;
            default:
                System.out.println("inputan salah");


        }
    double hargatotal = harga*jumlahBarang;
        double totaldiskon = (double)hargatotal*(discount/100);
        double totalbayar = hargatotal-totaldiskon;

        JOptionPane.showMessageDialog(null,"Anda Beli"+namabarang+"\nDengan jumlah"+jumlahBarang+"\n" +
                "Dengan Harga Rp"+hargatotal+"0\nDan Diskon sebesar"+discount+"%(Rp"+totaldiskon+"0)\nAnda Bayar"+totalbayar+"0",
                "Information", JOptionPane.WARNING_MESSAGE,null);
    }

}

