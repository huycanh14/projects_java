public abstract  class Nguoi {

    /*
        abstract không có tính triển khai, chỉ có tính trừu tượng
        Không thể khởi tạo một đối tượng trực tiếp từ một class trừu tượng
        Lớp con bắt buộc phải có override
     */
    protected String hoten;
    protected String gioitinh;
    protected int namsinh;
    public Nguoi() {
    }

    public Nguoi(String ten, String gioitinh, int namsinh) {
        this.hoten = ten;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
    }

    public abstract void xuatThongTinCaNhan();
}
