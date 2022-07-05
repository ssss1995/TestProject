import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
public class ReadExcelFileDemo {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fs =new FileInputStream(new File("C:\\Users\\SAIKAT\\Desktop.Boo1.xls"));
		HSSFWorkbook wb =new HSSFWorkbook();
		HSSFSheet sheet =wb.getSheetAt(0);
		FormulaEvaluator fe =wb.getCreateHelper().createFormulaEvalutor();
		for(Row row: sheet)
		{
			for(Cell cell:row)
			{
				switch(FormulaEvaluator.evaluatorcell(cell).getCellType())
				
				case Cell.CELL_TYPE_NUMERIC;
				System.out.println(cell.getNumericCellValue()+"\t\t");
				break;
				case Cell.CELL_TYPE_STRING;
				System.out.println(cell.getNumericCellValue()+"\t\t");
				break;
			}
		}
		System.out.println();
		
	}
	
	

}
