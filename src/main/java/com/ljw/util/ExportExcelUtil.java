package com.ljw.util;

import com.ljw.vo.ChemClassInfoVO;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

/**
 * @Description:
 * @Author Created by liangjunwei on 2018/8/2 16:19
 */
public class ExportExcelUtil {

    public static String exportGoodsChemAttributeInfo(List<String> list, String filePath) throws Exception {
        // 第一步，创建一个webbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet();
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        HSSFRow row = sheet.createRow((int) 0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        short i = 0;
        HSSFCell cell = row.createCell(i);
        for (String str : list) {
            cell.setCellValue(str);
            cell = row.createCell(++i);
        }

        // 第六步，将文件存到指定位置
        try {
            FileOutputStream fout = new FileOutputStream(filePath);
            wb.write(fout);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePath;
    }

    public static String exportAllChemClass(List<ChemClassInfoVO> list, String filePath) throws Exception {
        int r = 0;
        int c = 0;
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet();
        HSSFRow row = sheet.createRow(r);
        HSSFCellStyle style = wb.createCellStyle();
        HSSFCell cell = row.createCell(c);
        cell.setCellValue("编号");
        cell = row.createCell(++c);
        cell.setCellValue("名称");
        cell = row.createCell(++c);
        cell.setCellValue("中文别名");
        cell = row.createCell(++c);
        cell.setCellValue("英文名称");
        cell = row.createCell(++c);
        cell.setCellValue("CAS号");
        cell = row.createCell(++c);
        cell.setCellValue("二级栏目名称");
        for (ChemClassInfoVO info : list) {
            c = 0;
            row = sheet.createRow(++r);
            cell = row.createCell(c);
            cell.setCellValue(info.getId());
            cell = row.createCell(++c);
            cell.setCellValue(info.getName());
            cell = row.createCell(++c);
            cell.setCellValue(info.getSubName());
            cell = row.createCell(++c);
            cell.setCellValue(info.getEnglishName());
            cell = row.createCell(++c);
            cell.setCellValue(info.getCas());
            cell = row.createCell(++c);
            cell.setCellValue(info.getMenuName());
        }

        // 第六步，将文件存到指定位置
        try {
            FileOutputStream fout = new FileOutputStream(filePath);
            wb.write(fout);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePath;
    }

}
