/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: ImportService
 * Author:   Administrator
 * Date:     2019-03-25 18:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.service;/**
 * Created by Administrator on 2019-03-25.
 */

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-03-25
 * @since 1.0.0
 */
@Service
public class ImportService {

    private static final String DATA_STYLE = "yyyy-MM-dd HH:mm:ss";
    /**
     * 处理上传的文件
     *
     * @param in
     * @param fileName
     * @return
     * @throws Exception
     */
    public List getBankListByExcel(InputStream in, String fileName) throws Exception {
        List sheetList = new ArrayList<>();
        //创建Excel工作薄
        Workbook work = this.getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            List rowList = new ArrayList<>();

            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {

                row = sheet.getRow(j);
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                List<Object> li = new ArrayList<>();
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    if (null != cell) {
                        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                            cell.setCellType(Cell.CELL_TYPE_STRING);
                        }
                        String stringCellValue = cell.getStringCellValue();
                        System.out.println("cell ="+cell + " ……stringCellValue ="+stringCellValue);
                        li.add(cell);
                    }

                }
                rowList.add(li);
            }
            sheetList.add(rowList);
        }
        work.close();
        return sheetList;
    }

    /**
     * 判断文件格式
     *
     * @param inStr
     * @param fileName
     * @return
     * @throws Exception
     */
    public Workbook getWorkbook(InputStream inStr, String fileName) throws Exception {
        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if (".xls".equals(fileType)) {
            workbook = new HSSFWorkbook(inStr);
        } else if (".xlsx".equals(fileType)) {
            workbook = new XSSFWorkbook(inStr);
        } else {
            throw new Exception("请上传excel文件！");
        }
        return workbook;
    }

    public java.sql.Timestamp getStringDate() {
        // java.util.Date currentTime = new java.util.Date();
        // java.sql.Timestamp sqlDate = new java.sql.Timestamp(currentTime.getTime());
        java.sql.Timestamp sqlDate = new java.sql.Timestamp(System.currentTimeMillis());
        System.out.println("sqlDate ="+sqlDate);
        // SimpleDateFormat formatter = new SimpleDateFormat(DATA_STYLE);
        // String dateString = formatter.format(currentTime);
        // java.sql.Date sqlDate1 = new java.sql.Date(dateString);
        // java.sql.Date date = java.sql.Date.valueOf(dateString);
        return sqlDate;
    }

}
