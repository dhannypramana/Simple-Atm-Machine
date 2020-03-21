import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataUser user1 = new dataUser();
        optionRun user1_option = new optionRun();

        System.out.println("\tATM Local Machine");

        int i = 1;
        while (i != -999){
            System.out.print("\nJika Ingin Keluar, Isikan x pada Account Number dan Password");

            System.out.print("\nInput Account Number: ");
            String accNumber = scanner.next();
            user1.askAccNumber(accNumber);

            System.out.print("Input Password: ");
            String password = scanner.next();
            user1.askPassword(password);

            if (accNumber.toLowerCase().equals("x") && password.toLowerCase().equals("x")){
                System.out.println("Terima Kasih Telah Menggunakan Program ATM Sederhana!");
                break;
            }


            if (!user1.loginToAtm()) {
                    System.err.println("Login Failed!");
                } else {
                i = 0;

                int free = 0;
                while (free != -999){
                    System.out.println("\n\n\t\tLocal ATM Machine");
                    System.out.print("\n" +
                            "1. Informasi Saldo\n" + /* Account Balance View */
                            "2. Setor Tunai\n" + /* deposit */
                            "3. Tarik Tunai\n" + /* WithDraw */
                            "4. Ubah PIN\n" +
                            "5. Keluar");

                    System.out.print("\n\nSilahkan Pilih Menu Anda: ");
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1: {
                            System.out.println("\nPemilik Akun : " + user1.getDataUser());
                            System.out.println("Saldo : " + user1_option.getInformasiSaldo());
                            break;
                        }
                        case 2: {
                            System.out.print("Masukkan Jumlah Uang Yang ingin Anda Simpan: ");
                            float setorTunai = scanner.nextFloat();
                            user1_option.setSetorTunai(setorTunai);
                            break;
                        }
                        case 3: {
                            System.out.print("Masukkan Jumlah Uang Yang ingin Anda Ditarik : ");
                            float tarikTunai = scanner.nextFloat();
                            user1_option.minusTarikTunai(tarikTunai);
                            break;
                        }
                        case 4: {
                            int case4While = 1;
                            while (case4While <= 3){
                                System.out.print("\nMasukkan Password Lama : ");
                                String oldPass = scanner.next();
                                user1.askPassword(oldPass);

                                if (user1.loginToAtm()){
                                    System.out.print("Masukkan Password Baru : ");
                                    String newPass = scanner.next();
                                    user1.setUpdatepassword(newPass);
                                    System.out.println("Password Has Been Setted");
                                    System.out.println("Silahkan Login Kembali");
                                    user1.loginToAtm();
                                    break;
                                }

                                if (!user1.loginToAtm()){
                                    System.err.println("Password Lama Salah!");
                                }
                                if (!user1.loginToAtm() && case4While == 3){
                                    System.err.println("Gagal Login 3x, Silahkan Login Kembali");
                                    break;
                                }
                            case4While++;
                            }

                        }
                        case 5:{
                            free = -999;
                            user1_option.exit();
                        }
                    }
                }
            }

                if (!user1.loginToAtm() && i == 3) {
                    System.err.println("Gagal Login Sebanyak 3 Kali, Akun anda Otomatis terblokir");
                    break;
                }
                i++;
            }
        }
    }