import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien implements QuanLyDiem, Comparator<SinhVien>{
    private ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
    @Override
    public void tinhDiemTrungBinh() {
        for(SinhVien sv : sinhViens) {
            sv.setDiemtb((float) (sv.getDiem1() * 0.1 + sv.getDiem2() * 0.3 + sv.getDiem3() * 0.6));
        }
    }

    @Override
    public void hienThongTin() {
        for(SinhVien item: sinhViens) {
            item.xuatThongTinCaNhan();
            System.out.println(String.format("\t Điểm 1: %.3f - Điểm 2: %.3f - Điểm 3: %.3f - Điểm trung bình: %.3f", item.getDiem1(), item.getDiem2(), item.getDiem3(), item.getDiemtb()));
        }
    }

    @Override
    public void sapXepGiamDanTheoDiemTrungBinh() {
        Collections.sort(sinhViens, new QuanLySinhVien());
    }

    @Override
    public boolean themSinhVien(SinhVien sv) {
        for (SinhVien item : this.sinhViens){
            if(item.getMasv() .compareTo(sv.getMasv()) == 0 ){
                return false;
            }
        }
        if (sv.getDiem1() > 10 || sv.getDiem2() > 10 || sv.getDiem3() > 10 ||sv.getDiem1() < 0 || sv.getDiem2() < 0 || sv.getDiem3() < 0 )return false ;
        sinhViens.add(sv);
        return true;
    }

    @Override
    public void xoaSinhVien(String masv) {
        for(SinhVien item: sinhViens){
            if(item.getMasv().compareTo(masv) == 0){
                sinhViens.remove(item);
                break;
            }
        }
    }

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        // Nếu '>' => return 1, '<' => return -1, '==' return 0
        // sắp xếp giảm dần phải đổi người lại
        return o1.getDiemtb() > o2.getDiemtb() ? -1 : 1;
    }

}
