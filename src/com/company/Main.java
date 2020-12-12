import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien _quanly = new QuanLySinhVien();
        int n;
        String masv;
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Nhập số lượng sinh viên cần thêm = ");
                n = sc.nextInt();
            }while (n <= 0);

            for (int i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println(String.format("Nhập thông tin sinh viên thứ %d:", i +1));
                SinhVien temp = new SinhVien();
                System.out.print("Nhập họ và tên = ");
                temp.hoten = sc.nextLine();
                System.out.print("Nhập giới tính = ");
                temp.gioitinh = sc.nextLine();
                System.out.print("Nhập năm sinh = ");
                temp.namsinh = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập mã sinh viên = ");
                temp.setMasv(sc.nextLine());
                System.out.print("Nhập mã lớp = ");
                temp.setMalop(sc.nextLine());
                System.out.print("Nhập hệ đào tạo = ");
                temp.setHedaotao(sc.nextLine());
                System.out.print("Nhập điểm thứ nhất = ");
                temp.setDiem1(sc.nextFloat());
                System.out.print("Nhập điểm thứ hai = ");
                temp.setDiem2(sc.nextFloat());
                System.out.print("Nhập điểm thứ ba = ");
                temp.setDiem3(sc.nextFloat());
                boolean add = _quanly.themSinhVien(temp);
                if(add == false) {
                    System.out.println("Bạn nhập sai thông tin, xin mời nhập lại");
                    i--;
                }

            }

            _quanly.tinhDiemTrungBinh();
            System.out.println("Danh sách sinh viên sắp xếp theo điểm trung bình giảm dần:");
            _quanly.sapXepGiamDanTheoDiemTrungBinh();
            _quanly.hienThongTin();

            System.out.print("Nhập mã số sinh viên cần xóa = ");
            masv = sc.next();
            _quanly.xoaSinhVien(masv);
            System.out.println("Danh sách sinh viên sau khi xóa là:");
            _quanly.hienThongTin();

        } catch (Exception ex){
            System.out.println("Lỗi " + ex);
        }
    }
}
