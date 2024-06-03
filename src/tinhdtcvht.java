public class tinhdtcvht {
    private double banKinh;
    public tinhdtcvht(double banKinh) {
      this.banKinh = banKinh;
    }
    public double tinhDienTich() {
      return Math.PI * banKinh * banKinh;
    }
    public double tinhChuVi() {
      return 2 * Math.PI * banKinh;
    }
    public static void main(String[] args) {
      tinhdtcvht tinhdtcvht = new tinhdtcvht(4);
      double dienTich = tinhdtcvht.tinhDienTich();
      double chuVi = tinhdtcvht.tinhChuVi();
      System.out.printf("Diện tích hình tròn là: %.2f\n", dienTich);
      System.out.printf("Chu vi hình tròn là: %.2f\n", chuVi);
    }
  }
  
