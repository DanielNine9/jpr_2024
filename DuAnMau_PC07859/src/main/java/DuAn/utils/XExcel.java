package DuAn.utils;

import DuAn.entity.NhanVien;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author dinhh
 */
public class XExcel {

    public static Object readObject(String path) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(path); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return objectInputStream.readObject();
        }
    }

    public static void writeObject(String path, Object data) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(data);
        }
    }

    public static <T> String writeExcel(Component component, List<T> entityList, String path, T instance) throws IOException {
        try {
            String home = System.getProperty("user.home");
            File file = new File(home + "/Downloads/");
            path = path.replaceAll(" ", "_");
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet();

            Field[] fields = instance.getClass().getDeclaredFields();
            XSSFRow headerRow = sheet.createRow(0);
            for (int i = 0; i < fields.length; i++) {
                Cell headerCell = headerRow.createCell(i, CellType.STRING);
                headerCell.setCellValue(fields[i].getName());
            }

            for (int rowIndex = 0; rowIndex < entityList.size(); rowIndex++) {

                T entity = entityList.get(rowIndex);
                XSSFRow dataRow = sheet.createRow(rowIndex + 1);

                for (int columnIndex = 0; columnIndex < fields.length; columnIndex++) {
                    Cell dataCell = dataRow.createCell(columnIndex, CellType.STRING);

                    // Use reflection to dynamically get field value
                    Field field = fields[columnIndex];

                    field.setAccessible(true); // Make private fields accessible
                    try {
                        
                        Object fieldValue = field.get(entity);
                        // Assuming the field type is String; adjust as needed
                        String attributeValue = (fieldValue != null) ? fieldValue.toString() : "";
                        dataCell.setCellValue(attributeValue);
                    } catch (IllegalAccessException e) {
                        // Handle IllegalAccessException
                        e.printStackTrace();
                    }
                }
            }

            String downloadPath = file + "\\" + path;
            try (FileOutputStream fos = new FileOutputStream(downloadPath)) {
                workbook.write(fos);
            }
            MsgBox.showMessageDialog(component, !Auth.tiengViet ? "The file has been saved to the download folder" : "File đã được lưu vào thư mục download");
            return downloadPath;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                MsgBox.showMessageDialog(component,
                        "Xuất file thất bại, vì nó được sử dụng bởi chương trình khác");

            }
        }
        return null;
    }
}
