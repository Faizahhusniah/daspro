import javax.swing.JOptionPane;
public class TebakAngka {

    public static void main(String[] args) {
        boolean ulang = false;
        do {
            int rnd = (int) (10 * Math.random());
            int pilih = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pilihan mu !!!"));
            if (pilih == rnd) {
                JOptionPane.showMessageDialog(null, "Angka yang kamu pilih Tepat", "selamat !!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Angka yang kamu piliih salah" + "\nangka yang benar adalah : " + rnd, "Kamu belum beruntung", JOptionPane.INFORMATION_MESSAGE);
            }
            int lagi = JOptionPane.showConfirmDialog(null, "mau mengulang lagi???", "coba lagi", JOptionPane.YES_OPTION);
            if (lagi == JOptionPane.YES_OPTION) {
                ulang = true;
            } else {
                ulang = false;
            }
        } while (ulang == true);

    }
}