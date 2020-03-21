public class optionRun {
    private float informasiSaldo;
    private float setorTunai;
    private float tarikTunai;

    optionRun() {
        informasiSaldo = 0;
        setorTunai = 0;
        tarikTunai = 0;
    }

    //    Start of Menu Option 1
    private void setInformasiSaldo(float informasiSaldo) {
        if (informasiSaldo == 0) {
            this.informasiSaldo = informasiSaldo;
        } else {
            this.informasiSaldo = this.informasiSaldo + informasiSaldo;
        }
    }

    public float getInformasiSaldo() {
        return informasiSaldo;
    }
//    End of Menu Option 1

    //    Start of Menu Option 2
    public void setSetorTunai(float setorTunai) {
        setInformasiSaldo(setorTunai);
        System.out.println("\nSaldo Tersimpan : " + setorTunai);
    }

    public float getSetorTunai() {
        return this.setorTunai;
    }
//End of menu option 2

    //Start of menu option 3
    public void minusTarikTunai(float tarikTunai) {
        if (informasiSaldo <= 0) {
            System.out.println("Saldo : 0");
            System.out.println("Tidak Bisa Diambil!");
        } else {
            this.informasiSaldo = this.informasiSaldo - tarikTunai;
            System.out.println("Saldo Diambil : " + tarikTunai);
        }
    }

    public void getTarikTunai(float tarikTunai) {
        System.out.println("Saldo Diambil : " + tarikTunai);
    }
//End of Menu Option 3

    public int exit() {
        return 0;
    }
}