import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien implements QuanLyDiem, Comparator<SinhVien>{
    private ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
    @Override
    public float tinhDiemTrungBinh(SinhVien sv) {
        return (float) (sv.getDiem1() * 0.1 + sv.getDiem2() * 0.3 + sv.getDiem3() * 0.6);
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
        int dem = 0;
        for (SinhVien item : this.sinhViens){
            if(item.getMasv() == sv.getMasv()){
                return false;
            }
        }
        sinhViens.add(sv);
        return true;
    }

    @Override
    public void xoaSinhVien(String masv) {
        for(SinhVien item: sinhViens){
            if(item.getMasv() == masv){
                sinhViens.remove(item);
                break;
            }
        }
    }

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        // Nếu '>' => return 1, '<' => return -1, '==' return 0
        return o1.getDiemtb() > o2.getDiemtb() ? 1 : -1;
    }

}
