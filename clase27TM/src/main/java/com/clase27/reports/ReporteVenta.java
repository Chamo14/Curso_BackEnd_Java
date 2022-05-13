package com.clase27.reports;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.clase27.entity.Venta;

import org.apache.poi.ss.usermodel.Cell;




public class ReporteVenta {
	
	private XSSFSheet sheet;
	
	private XSSFWorkbook workbook;
	
	private List<Venta> ventas;
	
	public ReporteVenta(List<Venta> s){
		this.ventas = s;
		workbook = new XSSFWorkbook();
	}

	//creacion de columnas
	public void readHeader() {
		sheet = workbook.createSheet("Lista Ventas");
		Row row = sheet.createRow(0);
		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(16);
		font.setBold(true);
		style.setFont(font);
		createCell(row, 0, "Nro facturacion", style);
		createCell(row, 1, "dni", style);
		createCell(row, 2, "nombre", style);
		createCell(row, 3, "apellido", style);
	
	}
//convertidor
	private void createCell(Row row, int i, Object string, CellStyle style) {
		sheet.autoSizeColumn(i);
		Cell cell =  row.createCell(i);
		if(string instanceof Integer) cell.setCellValue((Integer) string);
		else if (string instanceof Boolean) cell.setCellValue((Boolean) string);
		else if (string instanceof Long) cell.setCellValue((Long) string);
		else cell.setCellValue((String) string);
		cell.setCellStyle(style);
	}
	
	private void readBody() {
		int rowCounter = 1;
		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(12);
		style.setFont(font);
		for(Venta venta: ventas) {
			Row row = sheet.createRow(rowCounter);
			int counterColumn = 0;
			createCell(row, counterColumn++, venta.getNroFactura(), style);
			createCell(row, counterColumn++, venta.getIdCliente().getDni(), style);
			createCell(row, counterColumn++, venta.getIdCliente().getNombre(), style);
			createCell(row, counterColumn++, venta.getIdCliente().getApellido(), style);
			
			rowCounter++;
		}
	}
	
	//creacion del xcel
	public void crearXcel(HttpServletResponse response) throws IOException {
		readHeader();
		readBody();
		ServletOutputStream stream = response.getOutputStream();
		workbook.write(stream);
		workbook.close();
		stream.close();
	}
}
