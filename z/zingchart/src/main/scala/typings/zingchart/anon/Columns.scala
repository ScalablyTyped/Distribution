package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  /**
    * In case of fixed width column format of the CSV data, specifies the dimensions for each column. Some csv files are formatted based
    *  on the idea of "fixed sized columns", not by the standard comma or semicolon "separator". So, the columns array holds the number
    * of characters for each column so that the parser will be able to split each line in the correct way [...]
    */
  var columns: js.UndefOr[js.Any] = js.native
  /**
    * Sets the CSV data directly embedded in the JSON, as a string. However new-line characters are not allowed in the definition of an
    * attribute in json syntax, and therefore the row separator character will likely need also be overridden with the "row-separator" a
    * ttribute if "data-string" is used in place of "url". "Apple,25,34\r\nPear,-16,10\r\nLemon,22,-5\r\nOrange,41,21" | ...
    */
  var `data-string`: js.UndefOr[String] = js.native
  /**
    * Specifies if the CSV data contains descriptive headers for each column as the first or second row (depending on title presence). t
    * rue | false | 1 | 0
    */
  var `horizontal-labels`: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the CSV data should be processed in a mirrored way (per line instead of per column). Note the different format used f
    * or the data-string. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.native
  /**
    * Sets the separator between the data rows when using a data-string instead of an external .CSV file. The default value is "\r\n". "
    * _" | "&" | "\r\n" | ...
    */
  var `row-separator`: js.UndefOr[String] = js.native
  /**
    * Specifies whether or not each column in the csv data should have its own scale on the chart. true | false | 1 | 0
    */
  var `separate-scales`: js.UndefOr[Boolean] = js.native
  /**
    * Sets the separator between the data cells, default is ",". Any single character can be used as a separator. "*" | "/" | "," | ...
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Smart-Scales will analyze the CSV data to determine if each column of data is of a different enough type of data to deserve a sepa
    * rate scale. If it is, smart-scales will assign the unique data columns to separate scales. true | false | 1 | 0
    */
  var `smart-scales`: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the CSV data contains a descriptive title on the first line. If this attribute it not included, then the library look
    * s at the data to decide if the first line is intended to be a title or not. If it thinks it is, The first line will become the tit
    * le of the graph. If there is a title line in the CSV and "title":"true" is set, the first line will be the graph title, but if "ti
    * tle":"false" is specified, that first line will become a scale-label. true | false | 1 | 0
    */
  var title: js.UndefOr[Boolean] = js.native
  /**
    * Sets the url for the CSV data source. "http://www.domain.com/link.php" | "%FILEPATH%/fruit.csv" | "/resources/datacsv.txt" | ...
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Specifies if the CSV data contains descriptive headers for each row. true | false | 1 | 0
    */
  var `vertical-labels`: js.UndefOr[Boolean] = js.native
}

object Columns {
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def `setData-string`(value: String): Self = this.set("data-string", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-string`: Self = this.set("data-string", js.undefined)
    @scala.inline
    def `setHorizontal-labels`(value: Boolean): Self = this.set("horizontal-labels", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHorizontal-labels`: Self = this.set("horizontal-labels", js.undefined)
    @scala.inline
    def setMirrored(value: Boolean): Self = this.set("mirrored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirrored: Self = this.set("mirrored", js.undefined)
    @scala.inline
    def `setRow-separator`(value: String): Self = this.set("row-separator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRow-separator`: Self = this.set("row-separator", js.undefined)
    @scala.inline
    def `setSeparate-scales`(value: Boolean): Self = this.set("separate-scales", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSeparate-scales`: Self = this.set("separate-scales", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def `setSmart-scales`(value: Boolean): Self = this.set("smart-scales", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmart-scales`: Self = this.set("smart-scales", js.undefined)
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def `setVertical-labels`(value: Boolean): Self = this.set("vertical-labels", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVertical-labels`: Self = this.set("vertical-labels", js.undefined)
  }
  
}

