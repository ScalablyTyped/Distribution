package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  /**
    * In case of fixed width column format of the CSV data, specifies the dimensions for each column. Some csv files are formatted based
    *  on the idea of "fixed sized columns", not by the standard comma or semicolon "separator". So, the columns array holds the number
    * of characters for each column so that the parser will be able to split each line in the correct way [...]
    */
  var columns: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the CSV data directly embedded in the JSON, as a string. However new-line characters are not allowed in the definition of an
    * attribute in json syntax, and therefore the row separator character will likely need also be overridden with the "row-separator" a
    * ttribute if "data-string" is used in place of "url". "Apple,25,34\r\nPear,-16,10\r\nLemon,22,-5\r\nOrange,41,21" | ...
    */
  var `data-string`: js.UndefOr[String] = js.undefined
  
  var dataString: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the CSV data contains descriptive headers for each column as the first or second row (depending on title presence). t
    * rue | false | 1 | 0
    */
  var `horizontal-labels`: js.UndefOr[Boolean] = js.undefined
  
  var horizontalLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the CSV data should be processed in a mirrored way (per line instead of per column). Note the different format used f
    * or the data-string. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the separator between the data rows when using a data-string instead of an external .CSV file. The default value is "\r\n". "
    * _" | "&" | "\r\n" | ...
    */
  var `row-separator`: js.UndefOr[String] = js.undefined
  
  var rowSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not each column in the csv data should have its own scale on the chart. true | false | 1 | 0
    */
  var `separate-scales`: js.UndefOr[Boolean] = js.undefined
  
  var separateScales: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the separator between the data cells, default is ",". Any single character can be used as a separator. "*" | "/" | "," | ...
    */
  var separator: js.UndefOr[String] = js.undefined
  
  /**
    * Smart-Scales will analyze the CSV data to determine if each column of data is of a different enough type of data to deserve a sepa
    * rate scale. If it is, smart-scales will assign the unique data columns to separate scales. true | false | 1 | 0
    */
  var `smart-scales`: js.UndefOr[Boolean] = js.undefined
  
  var smartScales: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the CSV data contains a descriptive title on the first line. If this attribute it not included, then the library look
    * s at the data to decide if the first line is intended to be a title or not. If it thinks it is, The first line will become the tit
    * le of the graph. If there is a title line in the CSV and "title":"true" is set, the first line will be the graph title, but if "ti
    * tle":"false" is specified, that first line will become a scale-label. true | false | 1 | 0
    */
  var title: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the url for the CSV data source. "http://www.domain.com/link.php" | "%FILEPATH%/fruit.csv" | "/resources/datacsv.txt" | ...
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the CSV data contains descriptive headers for each row. true | false | 1 | 0
    */
  var `vertical-labels`: js.UndefOr[Boolean] = js.undefined
  
  var verticalLabels: js.UndefOr[Boolean] = js.undefined
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def `setData-string`(value: String): Self = StObject.set(x, "data-string", value.asInstanceOf[js.Any])
    
    inline def `setData-stringUndefined`: Self = StObject.set(x, "data-string", js.undefined)
    
    inline def setDataString(value: String): Self = StObject.set(x, "dataString", value.asInstanceOf[js.Any])
    
    inline def setDataStringUndefined: Self = StObject.set(x, "dataString", js.undefined)
    
    inline def `setHorizontal-labels`(value: Boolean): Self = StObject.set(x, "horizontal-labels", value.asInstanceOf[js.Any])
    
    inline def `setHorizontal-labelsUndefined`: Self = StObject.set(x, "horizontal-labels", js.undefined)
    
    inline def setHorizontalLabels(value: Boolean): Self = StObject.set(x, "horizontalLabels", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLabelsUndefined: Self = StObject.set(x, "horizontalLabels", js.undefined)
    
    inline def setMirrored(value: Boolean): Self = StObject.set(x, "mirrored", value.asInstanceOf[js.Any])
    
    inline def setMirroredUndefined: Self = StObject.set(x, "mirrored", js.undefined)
    
    inline def `setRow-separator`(value: String): Self = StObject.set(x, "row-separator", value.asInstanceOf[js.Any])
    
    inline def `setRow-separatorUndefined`: Self = StObject.set(x, "row-separator", js.undefined)
    
    inline def setRowSeparator(value: String): Self = StObject.set(x, "rowSeparator", value.asInstanceOf[js.Any])
    
    inline def setRowSeparatorUndefined: Self = StObject.set(x, "rowSeparator", js.undefined)
    
    inline def `setSeparate-scales`(value: Boolean): Self = StObject.set(x, "separate-scales", value.asInstanceOf[js.Any])
    
    inline def `setSeparate-scalesUndefined`: Self = StObject.set(x, "separate-scales", js.undefined)
    
    inline def setSeparateScales(value: Boolean): Self = StObject.set(x, "separateScales", value.asInstanceOf[js.Any])
    
    inline def setSeparateScalesUndefined: Self = StObject.set(x, "separateScales", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def `setSmart-scales`(value: Boolean): Self = StObject.set(x, "smart-scales", value.asInstanceOf[js.Any])
    
    inline def `setSmart-scalesUndefined`: Self = StObject.set(x, "smart-scales", js.undefined)
    
    inline def setSmartScales(value: Boolean): Self = StObject.set(x, "smartScales", value.asInstanceOf[js.Any])
    
    inline def setSmartScalesUndefined: Self = StObject.set(x, "smartScales", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def `setVertical-labels`(value: Boolean): Self = StObject.set(x, "vertical-labels", value.asInstanceOf[js.Any])
    
    inline def `setVertical-labelsUndefined`: Self = StObject.set(x, "vertical-labels", js.undefined)
    
    inline def setVerticalLabels(value: Boolean): Self = StObject.set(x, "verticalLabels", value.asInstanceOf[js.Any])
    
    inline def setVerticalLabelsUndefined: Self = StObject.set(x, "verticalLabels", js.undefined)
  }
}
