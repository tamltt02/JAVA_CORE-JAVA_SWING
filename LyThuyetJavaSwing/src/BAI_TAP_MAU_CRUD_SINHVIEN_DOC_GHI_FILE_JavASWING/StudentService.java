/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN_DOC_GHI_FILE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {

    List<Student> _lstStudents;
    Utilities _Utilities;

    public StudentService() {
        _lstStudents = new ArrayList<Student>();
        _Utilities = new Utilities();

    }

    public void fake5Data() {
        _lstStudents.add(new Student("AnvPH1", 1, "UDPM.JAVA", 1, "Nguyễn Văn A", "0123456"));
        _lstStudents.add(new Student("BnvPH2", 0, "UDPM.NET", 2, "Nguyễn Văn B", "0123456"));
        _lstStudents.add(new Student("CnvPH3", 2, "UDPM.JAVA", 3, "Nguyễn Văn C", "0123456"));
        _lstStudents.add(new Student("DnaPH4", 1, "UDPM.JAVA", 4, "Nguyễn Anh D", "0123456"));
        _lstStudents.add(new Student("EnvPH5", 1, "UDPM.NET", 5, "Nguyễn Văn E", "0123456"));
    }

    @Override
    public List<Student> getlstStudents() {
        return _lstStudents;
    }

    @Override
    public String add(Student st) {
        if (st == null) {
            return "Không thành công";
        }
        _lstStudents.add(st);
        return "Thêm thành công";
    }

    @Override
    public String edit(Student st) {
        int index = getIndexByID(st.getId());
        if (index == -1) {
            return "Không tìm thấy";
        }
        _lstStudents.get(index).setTen(st.getTen());
        _lstStudents.get(index).setMsv(_Utilities.msvFpoly(st.getTen(), st.getId(), 0));
        _lstStudents.get(index).setSdt(st.getSdt());
        _lstStudents.get(index).setNganhHoc(st.getNganhHoc());
        return "Đã sửa thành công";
    }

    @Override
    public String delete(int id) {
        int index = getIndexByID(id);
        if (index == -1) {
            return "Không tìm thấy";
        }
        _lstStudents.remove(index);
        return "Đã xóa thành công";
    }

    @Override
    public List<Student> find(String txt) {//Tìm kiếm theo msv hoặc ngành học
        var lstFindSTs = new ArrayList<Student>();
        for (Student x : _lstStudents) {
            if (x.getMsv().toLowerCase().startsWith(txt.toLowerCase()) || x.getNganhHoc().toLowerCase().startsWith(txt.toLowerCase())) {
                lstFindSTs.add(x);
            }
        }
        return lstFindSTs;
    }

    @Override
    public int getMaxID() {
        if (_lstStudents.isEmpty()) {
            return 1;
        }
        int max = _lstStudents.get(0).getId();
        for (Student x : _lstStudents) {
            if (max < x.getId()) {
                max = x.getId();
            }
        }
        return max + 1;
    }

    @Override
    public int getIndexByID(int id) {
        for (int i = 0; i < _lstStudents.size(); i++) {
            if (_lstStudents.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String ghiFile(String path) {
        try {
            //Check sự tồn tại
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            //Ghi file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Student x : _lstStudents) {
                oos.writeObject(x);
            }
            oos.close();
            fos.close();
            return "Lưu file tc";
        } catch (IOException iOException) {
            return "lưu file k tc";

        }
    }

    @Override
    public String docFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Không thấy file");
                return "K tìm thấy";
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                var temp = ois.readObject();
                _lstStudents.add((Student) temp);
            }
            for (Student x : _lstStudents) {
                x.inRaManHinh();
            }

            ois.close();
            fis.close();
            
            
            return "Đọc file tc";

        } catch (Exception e) {
            return "DĐọc file k tc";

        }
    }
}
