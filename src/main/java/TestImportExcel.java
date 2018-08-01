import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import com.ljw.dao.GoodsInfoDao;
import com.ljw.dao.impl.GoodsInfoDaoImpl;
import com.ljw.domain.GoodsChemAttributeInfo;
import com.ljw.domain.GoodsInfo;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;

public final class TestImportExcel {

    public static void main(String[] args) throws Exception  {

        File excelFile = new File("F:\\test.xls");
        HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(excelFile));
        HSSFSheet sheet = wb.getSheetAt(0);

        GoodsInfoDao goodsInfoDao = new GoodsInfoDaoImpl();
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setMenuId(1);
        GoodsChemAttributeInfo goodsChemAttributeInfo = new GoodsChemAttributeInfo();
        goodsInfoDao.insertGoodsChemAttributeInfo(goodsInfo,goodsChemAttributeInfo);
        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getRichStringCellValue().getString());
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(String.valueOf(cell.getDateCellValue()));
                        } else {
                            System.out.print(cell.getNumericCellValue());
                        }
                        System.out.print("|");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        System.out.print("|");
                        break;
                    default:
                }
            }
            System.out.println();
        }

        /*//读取图片
        List<HSSFPictureData> pictures = wb.getAllPictures();
        for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
            if (shape instanceof HSSFPicture) {
                HSSFPicture pic = (HSSFPicture) shape;
                int pictureIndex = pic.getPictureIndex()-1;
                HSSFPictureData picData = pictures.get(pictureIndex);
                System.out.println("image-size:" + picData.getData().length);
            }
        }*/

        System.out.println(wb.getSheetName(0));
    }
}

