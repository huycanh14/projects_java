class SinhVien extends Nguoi{

    private String masv;
    private String malop;
    private String hedaotao;
    private float diem1 = 0;
    private float diem2 = 0;
    private float diem3 = 0;
    private float diemtb;

    /*
        Override: ghi đè lại phương thức từ phương thức cha
        getter, setter:  (tính đóng gói) truy cập vào thuộc tính của đối tượng khi phương thức là private
     */

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getHedaotao() {
        return hedaotao;
    }

    public void setHedaotao(String hedaotao) {
        this.hedaotao = hedaotao;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    // Phương thức khởi tạo
    public SinhVien(){
        super("", "Nữ", 2020);
    }

    public SinhVien(String hoTen, String gioiTinh, String maSv, String heDaoTao){
        super(hoTen, gioiTinh, 2020);
        this.masv = maSv;
        this.hedaotao = heDaoTao;
    }

    public SinhVien(SinhVien sv){
        super(sv.hoten, sv.gioitinh, sv.namsinh);
        this.masv = sv.masv;
        this.malop = sv.malop;
        this.hedaotao = sv.hedaotao;
        this.diem1 = sv.diem1;
        this.diem2 = sv.diem2;
        this.diem3 = sv.diem3;
    }


    @Override
    public void xuatThongTinCaNhan() {
        System.out.println("Sinh viên có thông tin là:");
        System.out.println(String.format("\t Mã sinh viên: %s - Họ tên: %s", this.getMasv(), super.hoten));
        System.out.println(String.format("\t Giới tính: %s - Hệ đào tạo: %s - Mã lớp: %s", super.gioitinh, this.getHedaotao(), this.getMalop()));
    }
}
