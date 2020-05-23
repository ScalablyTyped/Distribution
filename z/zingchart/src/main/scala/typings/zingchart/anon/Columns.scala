package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  /**
    * In case of fixed width column format of the CSV data, specifies the dimensions for each column. Some csv files are formatted based
    *  on the idea of "fixed sized columns", not by the standard comma or semicolon "separator". So, the columns array holds the number
    * of characters for each column so that the parser will be able to split each line in the correct way [...]
    */
  var columns: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the CSV data directly embedded in the JSON, as a string. However new-line characters are not allowed in the definition of an
    * attribute in json syntax, and therefore the row separator character will likely need also be overridden with the "row-separator" a
    * ttribute if "data-string" is used in place of "url". "Apple,25,34\r\nPear,-16,10\r\nLemon,22,-5\r\nOrange,41,21" | ...
    */
  var `data-string`: js.UndefOr[String] = js.undefined
  /**
    * Specifies if the CSV data contains descriptive headers for each column as the first or second row (depending on title presence). t
    * rue | false | 1 | 0
    */
  var `horizontal-labels`: js.UndefOr[Boolean] = js.undefined
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
  /**
    * Specifies whether or not each column in the csv data should have its own scale on the chart. true | false | 1 | 0
    */
  var `separate-scales`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the separator between the data cells, default is ",". Any single character can be used as a separator. "*" | "/" | "," | ...
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Smart-Scales will analyze the CSV data to determine if each column of data is of a different enough type of data to deserve a sepa
    * rate scale. If it is, smart-scales will assign the unique data columns to separate scales. true | false | 1 | 0
    */
  var `smart-scales`: js.UndefOr[Boolean] = js.undefined
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
}

object Columns {
  @scala.inline
  def apply(
    columns: js.Any = null,
    `data-string`: String = null,
    `horizontal-labels`: js.UndefOr[Boolean] = js.undefined,
    mirrored: js.UndefOr[Boolean] = js.undefined,
    `row-separator`: String = null,
    `separate-scales`: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    `smart-scales`: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    `vertical-labels`: js.UndefOr[Boolean] = js.undefined
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (`data-string` != null) __obj.updateDynamic("data-string")(`data-string`.asInstanceOf[js.Any])
    if (!js.isUndefined(`horizontal-labels`)) __obj.updateDynamic("horizontal-labels")(`horizontal-labels`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrored)) __obj.updateDynamic("mirrored")(mirrored.get.asInstanceOf[js.Any])
    if (`row-separator` != null) __obj.updateDynamic("row-separator")(`row-separator`.asInstanceOf[js.Any])
    if (!js.isUndefined(`separate-scales`)) __obj.updateDynamic("separate-scales")(`separate-scales`.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(`smart-scales`)) __obj.updateDynamic("smart-scales")(`smart-scales`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(`vertical-labels`)) __obj.updateDynamic("vertical-labels")(`vertical-labels`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

