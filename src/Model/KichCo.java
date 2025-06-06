package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KichCo {
    private int idKichCo;
    private String maKichCo;
    private String kichThuoc;
    private String moTa;
    private int trangThai;
}
