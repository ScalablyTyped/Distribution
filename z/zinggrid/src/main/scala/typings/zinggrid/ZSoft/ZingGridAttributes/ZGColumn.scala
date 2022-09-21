package typings.zinggrid.ZSoft.ZingGridAttributes

import typings.zinggrid.zinggridStrings.`10Percentsign`
import typings.zinggrid.zinggridStrings.`150`
import typings.zinggrid.zinggridStrings.`150px`
import typings.zinggrid.zinggridStrings.`after-text`
import typings.zinggrid.zinggridStrings.`row-number`
import typings.zinggrid.zinggridStrings.`tokenized string`
import typings.zinggrid.zinggridStrings.all
import typings.zinggrid.zinggridStrings.avg
import typings.zinggrid.zinggridStrings.boolean
import typings.zinggrid.zinggridStrings.bottom
import typings.zinggrid.zinggridStrings.button
import typings.zinggrid.zinggridStrings.center
import typings.zinggrid.zinggridStrings.circle
import typings.zinggrid.zinggridStrings.click
import typings.zinggrid.zinggridStrings.count
import typings.zinggrid.zinggridStrings.currency
import typings.zinggrid.zinggridStrings.custom
import typings.zinggrid.zinggridStrings.date
import typings.zinggrid.zinggridStrings.default
import typings.zinggrid.zinggridStrings.disabled
import typings.zinggrid.zinggridStrings.editor
import typings.zinggrid.zinggridStrings.element
import typings.zinggrid.zinggridStrings.ellipsis
import typings.zinggrid.zinggridStrings.email
import typings.zinggrid.zinggridStrings.fit
import typings.zinggrid.zinggridStrings.fitcontent
import typings.zinggrid.zinggridStrings.fitheader
import typings.zinggrid.zinggridStrings.functionName
import typings.zinggrid.zinggridStrings.hover
import typings.zinggrid.zinggridStrings.icon
import typings.zinggrid.zinggridStrings.iframe
import typings.zinggrid.zinggridStrings.image
import typings.zinggrid.zinggridStrings.left
import typings.zinggrid.zinggridStrings.link
import typings.zinggrid.zinggridStrings.max
import typings.zinggrid.zinggridStrings.min
import typings.zinggrid.zinggridStrings.normal
import typings.zinggrid.zinggridStrings.number
import typings.zinggrid.zinggridStrings.outsidearrow
import typings.zinggrid.zinggridStrings.password
import typings.zinggrid.zinggridStrings.range
import typings.zinggrid.zinggridStrings.remover
import typings.zinggrid.zinggridStrings.right
import typings.zinggrid.zinggridStrings.select
import typings.zinggrid.zinggridStrings.selector
import typings.zinggrid.zinggridStrings.square
import typings.zinggrid.zinggridStrings.stretch
import typings.zinggrid.zinggridStrings.sum
import typings.zinggrid.zinggridStrings.system
import typings.zinggrid.zinggridStrings.tel
import typings.zinggrid.zinggridStrings.text
import typings.zinggrid.zinggridStrings.toggle
import typings.zinggrid.zinggridStrings.top
import typings.zinggrid.zinggridStrings.url
import typings.zinggrid.zinggridStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGColumn extends StObject {
  
  /**
    * @description Aligns the contents of the cell
    */
  var align: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * @description If the index is an array of objects, use array-index to indicate which index of the array object to include
    */
  var arrayIndex: js.UndefOr[String] = js.undefined
  
  /**
    * @description If the index is an array, you can use array-slice to indicate which array indexes to include.
    */
  var arraySlice: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @description The type of "word-break" style for body cells. When not set, "cell-break" style is "normal" by default.
    * If the width of a column is set, "cell-break" is "word" by default.
    */
  var cellBreak: js.UndefOr[all | ellipsis | normal | word] = js.undefined
  
  /**
    * @description The class to be set directly on "<zg-cell>" within the column. "cell-class" applied to
    * "<zg-column>" will overwrite the "cell-class" applied to "<zing-grid>".
    */
  var cellClass: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the execution method of custom 'icon' type tooltips to either activate on hover or click of the icon
    */
  var cellTooltipAction: js.UndefOr[click | hover] = js.undefined
  
  /**
    * @description Sets the hover delay in milliseconds before displaying the tooltip
    */
  var cellTooltipDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Specifies the icon to use for the cell tooltip trigger icon when using the info column type
    */
  var cellTooltipIcon: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the tooltip-position for the cell
    */
  var cellTooltipPosition: js.UndefOr[top | left | right | bottom] = js.undefined
  
  /**
    * @description Gets the name of the user's custom render function, on window, to use the function's return value as the tooltip content
    */
  var cellTooltipRenderer: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the tooltip display
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the tooltip text for the cell of the column.  Can pass this value to renderer or template if using
    */
  var cellTooltipText: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the style to use for the tooltips.  Uses the "default" style by default.  Can set to "system" to match the tooltips used on icons throughout "<zing-grid>".
    */
  var cellTooltipType: js.UndefOr[default | system] = js.undefined
  
  /**
    * @description When an additional HTML element is added to the renderer, as in the case of image and url,
    * "content-style" will be put into a style attribute directly on the element.
    */
  var contentStyle: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the width of the content inside of the cell. Used on cells of column type
    * "element", "iframe", "image", or "url".
    */
  var contentWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @description The data to display in each cell where the data value is null or undefined
    */
  var defaultDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * @description Renderer for the details page of a column.
    * To use a custom renderer, the attribute should be set to the name of the function.
    * The renderer function takes in the following arguments, "value of index" (for each index), "domCell", and "cellObject".
    * The returned value of the renderer function is set as the innerHTML of the details dialog.
    */
  var detailsRenderer: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the column's details
    */
  var detailsTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @description Disables the drag state of a specific column when "column-drag" enabled on "<zing-grid>"
    */
  var drag: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Overrides the default editor for the column.  Can be set to a different built-in editor (based on type of column),
    * custom editor, or "false" to turn off editor.
    * If set to a custom editor, the attribute value should be set to the name of the object.
    * See "Features" page on "Editing: Custom Editor Grid" for more details on custom editor.
    */
  var editor: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the column's editor
    */
  var editorTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @description Overrides the grid level "filter" attribute.  Presence of attribute enables on "filter" column, otherwise
    * set to "disabled" to disable.
    */
  var filter: js.UndefOr[disabled | Boolean] = js.undefined
  
  /**
    * @description Sets the data field index to filter on if index itself has multiple fields.  The value set in index is the default.
    */
  var filterIndex: js.UndefOr[String] = js.undefined
  
  /**
    * @description The aggregate function, tokenized string, or function to evaluate for the foot cell of the column.
    * If using a function, the function takes the parameters "columnData" and "columnFieldIndex".
    */
  var footCell: js.UndefOr[sum | avg | max | min | count | (`tokenized string`) | functionName | String] = js.undefined
  
  /**
    * @description The aggregate function to evaluate for the head cell of the column.
    * If using a function, the function takes the parameters "columnData" and "columnFieldIndex".
    */
  var headCell: js.UndefOr[sum | avg | max | min | count | (`tokenized string`) | functionName | String] = js.undefined
  
  /**
    * @description The header name for the column.   If it is not set, the default is to format the "index" value.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * @description Setting to "disabled" will turn off formatting on the header of the column.  By default, headers will
    * convert camel, dash, or kebab case to a properly spaced and capitalized string.  Or
    * set to a function name to customize formatting of header text.  The custom function takes in two parameters,
    * "index" and "headerText", and returns the formatted header text.
    */
  var headerAutoFormat: js.UndefOr[disabled | functionName | String] = js.undefined
  
  /**
    * @description Sets the execution method of custom 'icon' type tooltips to either activate on hover or click of the icon
    */
  var headerTooltipAction: js.UndefOr[click | hover] = js.undefined
  
  /**
    * @description Sets the hover delay in milliseconds before displaying the header tooltip
    */
  var headerTooltipDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Specifies the icon to use for the header tooltip trigger icon
    */
  var headerTooltipIcon: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the tooltip icon position for the tooltip icon in the header cells
    */
  var headerTooltipIconPosition: js.UndefOr[left | right | `after-text`] = js.undefined
  
  /**
    * @description Sets the tooltip-position for the header cell
    */
  var headerTooltipPosition: js.UndefOr[top | left | right | bottom] = js.undefined
  
  /**
    * @description Gets the name of the user's custom render function, on window, to use the function's return value as the tooltip content
    */
  var headerTooltipRenderer: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the tooltip display
    */
  var headerTooltipTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the tooltip text for the header cell of the column.  Can pass this value to renderer or template if using
    */
  var headerTooltipText: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets what part of the header triggers the tooltip.  If set to 'icon', an info icon is added to the header.
    */
  var headerTooltipTrigger: js.UndefOr[text | icon] = js.undefined
  
  /**
    * @description Sets the style to use for the tooltips.  Uses the "default" style by default.  Can set to "system" to match the tooltips used on icons throughout "<zing-grid>".
    */
  var headerTooltipType: js.UndefOr[default | system] = js.undefined
  
  /**
    * @description Presence of attribute hides the column
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description A single index or multiple indices (separated by comma), to associate information in the data source
    *  to a column in the grid.  Nested data keys are referenced by the member character "." (Ex. data.key).
    */
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * @description Localization code used with column type "currency" and "number"
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * @description The text to display in the control menu for the column.  If it is not set, it is set to the header text.
    */
  var menuText: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the minimum width of the column in pixels
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Overrides the default renderer for the column.  Can be set to a different built-in or custom renderer.
    * To use a custom renderer, the attribute should be set to the name of the function.
    * The renderer function takes in the following arguments, "value of index" (for each index), "domCell", and "cellObject".
    * The returned value of the renderer function is set as the innerHTML of the cell.
    */
  var renderer: js.UndefOr[String] = js.undefined
  
  /**
    * @description Points to an external template element to be used as the template for the column's renderer
    */
  var rendererTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @description Indicates that the column is required to have a value on edit
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Turns on column resizing for single column.  Set to "disabled" to turn off resizing on a single column.
    */
  var resizable: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Sets the maximum width the column can be set to when resizing
    */
  var resizableMaxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the minimum width the column can be set to when resizing
    */
  var resizableMinWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Modifies the default column resizable persistence.  Set to "disabled" to turn off persistence on a single column.
    */
  var resizablePersistent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Turns off the search on a column if "search" is present on "<zing-grid>"
    */
  var search: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description If multiple indices are set, this is the string that separates them in the display.  By default, it is a comma.
    */
  var separator: js.UndefOr[String] = js.undefined
  
  /**
    * @description Turns off the sort on a column if "sort" is present on "<zing-grid>"
    */
  var sort: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Presence of attribute sorts the column data in ascending order
    */
  var sortAsc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Presence of attribute sorts the column data in descending order
    */
  var sortDesc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Overrides default behavior for setting special sort for international data
    */
  var sortIntl: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Overrides the default sorter for the column.  It is also possible to override the column sorting by
    * passing in method name of sort function instead or setting to "disabled" to disable sorting.  Sorter function
    * takes in two values (a, b) and returns 1, -1, or 0 indicating if "a > b", "a < b", or "a = b".
    * Can also be set to a path in the dataset to perform the sort on.  This is useful for sorting object indices.
    */
  var sorter: js.UndefOr[String] = js.undefined
  
  /**
    * @description The type of the data stored in the column.  The column renderer/editor will behave based on the column type.
    */
  var `type`: js.UndefOr[
    boolean | button | currency | custom | date | editor | element | email | icon | image | iframe | number | password | range | remover | `row-number` | select | selector | tel | text | toggle | url
  ] = js.undefined
  
  /**
    * @description Presence of attribute sets the button to be in a disabled state. Can also set to "true" or "false".
    */
  var typeButtonDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description When the column type is set to "button", use "typeButtonHander" to hook up a function call to the button click.
    * Callback receives rowData, zg-cell DOM, and zg-cell object as arguments.
    */
  var typeButtonHandler: js.UndefOr[String] = js.undefined
  
  /**
    * @description When the column type is set to "button", use "typeButtonIcon" to add an icon next to the rendered button in the cell
    */
  var typeButtonIcon: js.UndefOr[String] = js.undefined
  
  /**
    * @description When the column type is set to "button", use "typeButtonLabel" to add a label to the rendered button in the cell
    */
  var typeButtonLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @description When the column type is set to "button", use "typeButtonURL" to add a shortcut handler on button click.  The click will automatically open the url in a new window.
    */
  var typeButtonUrl: js.UndefOr[String] = js.undefined
  
  /**
    * @description When the column type is set to "checkbox", use "typeCheckboxLabel" to add a label next to the rendered checkbox in the cell
    */
  var typeCheckboxLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the color mode to configure the color picker. Choose between HSL, RGBA, and the default Hex.
    */
  var typeColorMode: js.UndefOr[String] = js.undefined
  
  /**
    * @description Disable the default color swatch UI preview with a false value.
    */
  var typeColorPreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The currency to be used in currency formatting.
    * Currency is set using using the 3 letter currency code specified by ISO 4217 specification (https://en.wikipedia.org/wiki/ISO_4217)
    */
  var typeCurrency: js.UndefOr[String] = js.undefined
  
  /**
    * @description The tokenized formatting for a date column
    */
  var typeDateFormat: js.UndefOr[String] = js.undefined
  
  /**
    * @description Indicates if date should be displayed in FromNow format
    */
  var typeDateFromNow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Sets the attribute of the custom-element in the column when "<zg-column>" has "type" set to "element"
    */
  var typeElementAttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the tag to wrap content when "<zg-column>" has "type" set to "element".
    * If "type-element-attribute-name" isn't set, it will put the rendered data into the body of the element.
    * If "type-element-attribute-name" is set, it will set the attribute to the indexed value.
    */
  var typeElementTagName: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets a "square" ratio instead of the default "16:9"
    */
  var typeIframeRatio: js.UndefOr[square] = js.undefined
  
  /**
    * @description The alternative text used with the "image" type column
    */
  var typeImageAlt: js.UndefOr[String] = js.undefined
  
  /**
    * @description The alternative shape to mask the image
    */
  var typeImageMask: js.UndefOr[circle] = js.undefined
  
  /**
    * @description If the column type is "image", use the "type-image-src" attribute to set the src for the image.  The src will be the index value by default.
    */
  var typeImageSrc: js.UndefOr[String] = js.undefined
  
  /**
    * @description Indicates the exact numbers to display after the decimal
    */
  var typeNumberDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Set to "disabled" to turn off default number formatting
    */
  var typeNumberFormatting: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Indicates the maximum numbers to display after the decimal
    */
  var typeNumberMaxDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * @description When the column type is set to "radio", use "typeRadioOptions" to add rendered radio options in the cell.
    * Can also set as array of name/value pairs where the name is displayed for the given value
    */
  var typeRadioOptions: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  /**
    * @description Maximum value for the input box. Used with the "range" type column in edit mode.
    */
  var typeRangeMax: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Minimum value for the input box.  Used with "range" type column in edit mode.
    */
  var typeRangeMin: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Specifies the step between each legal value for the input box.  Used with "range" type column in edit mode.
    */
  var typeRangeStep: js.UndefOr[Double] = js.undefined
  
  /**
    * @description In edit mode, presence of attribute allows column type "select" to have multiple selections, instead of the default
    * of a single selection
    */
  var typeSelectMultiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description To set the options for the select box for a "select" column when "editor" is enabled on "<zing-grid>".
    * Can also set as array of name/value pairs where the name is displayed for the given value
    */
  var typeSelectOptions: js.UndefOr[String | js.Array[Any]] = js.undefined
  
  /**
    * @description When the column type is set to "toggle", use "typeToggleOptions" to set the list of options for the display.
    */
  var typeToggleOptions: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * @description When the column type is set, the render and value will be the same.  This prevents the default creating of true/false for toggles.
    */
  var typeToggleRenderValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description If the column type is "url", use this attribute to reference any "<zg-icon>" within the library
    * to replace the link text with this icon.
    */
  var typeUrlIcon: js.UndefOr[link | outsidearrow] = js.undefined
  
  /**
    * @description If the column type is "url", use the "type-url-src" attribute to set the src for the link.  The link will be the index value by default.
    */
  var typeUrlSrc: js.UndefOr[String] = js.undefined
  
  /**
    * @description If the column type is "url", use the "type-url-text" attribute to set the text displayed for the link.
    */
  var typeUrlText: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the validation error message for the column.  Overrides any other settings.
    */
  var validationErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the validation required message for the column.  Overrides any other settings.
    */
  var validationRequiredMessage: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the validation method for the column.  Overrides the default for the column type
    */
  var validator: js.UndefOr[String] = js.undefined
  
  /**
    * @description Used in the case of automatically removing columns on resize.  Columns without a "visibility-priority" never
    * gets removed. The rest of the columns are removed from highest "visibility-priority" value to the lowest.
    */
  var visibilityPriority: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the width of the column.
    */
  var width: js.UndefOr[
    fit | fitheader | fitcontent | stretch | `10Percentsign` | `150px` | `150` | String | Double
  ] = js.undefined
}
object ZGColumn {
  
  inline def apply(): ZGColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGColumn]
  }
  
  extension [Self <: ZGColumn](x: Self) {
    
    inline def setAlign(value: center | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setArrayIndex(value: String): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
    
    inline def setArrayIndexUndefined: Self = StObject.set(x, "arrayIndex", js.undefined)
    
    inline def setArraySlice(value: String | Double): Self = StObject.set(x, "arraySlice", value.asInstanceOf[js.Any])
    
    inline def setArraySliceUndefined: Self = StObject.set(x, "arraySlice", js.undefined)
    
    inline def setCellBreak(value: all | ellipsis | normal | word): Self = StObject.set(x, "cellBreak", value.asInstanceOf[js.Any])
    
    inline def setCellBreakUndefined: Self = StObject.set(x, "cellBreak", js.undefined)
    
    inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    inline def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
    
    inline def setCellTooltipAction(value: click | hover): Self = StObject.set(x, "cellTooltipAction", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipActionUndefined: Self = StObject.set(x, "cellTooltipAction", js.undefined)
    
    inline def setCellTooltipDelay(value: Double): Self = StObject.set(x, "cellTooltipDelay", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipDelayUndefined: Self = StObject.set(x, "cellTooltipDelay", js.undefined)
    
    inline def setCellTooltipIcon(value: String): Self = StObject.set(x, "cellTooltipIcon", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipIconUndefined: Self = StObject.set(x, "cellTooltipIcon", js.undefined)
    
    inline def setCellTooltipPosition(value: top | left | right | bottom): Self = StObject.set(x, "cellTooltipPosition", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipPositionUndefined: Self = StObject.set(x, "cellTooltipPosition", js.undefined)
    
    inline def setCellTooltipRenderer(value: String): Self = StObject.set(x, "cellTooltipRenderer", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipRendererUndefined: Self = StObject.set(x, "cellTooltipRenderer", js.undefined)
    
    inline def setCellTooltipTemplate(value: String): Self = StObject.set(x, "cellTooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipTemplateUndefined: Self = StObject.set(x, "cellTooltipTemplate", js.undefined)
    
    inline def setCellTooltipText(value: String): Self = StObject.set(x, "cellTooltipText", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipTextUndefined: Self = StObject.set(x, "cellTooltipText", js.undefined)
    
    inline def setCellTooltipType(value: default | system): Self = StObject.set(x, "cellTooltipType", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipTypeUndefined: Self = StObject.set(x, "cellTooltipType", js.undefined)
    
    inline def setContentStyle(value: String): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContentWidth(value: String | Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    inline def setDefaultDisplay(value: String): Self = StObject.set(x, "defaultDisplay", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayUndefined: Self = StObject.set(x, "defaultDisplay", js.undefined)
    
    inline def setDetailsRenderer(value: String): Self = StObject.set(x, "detailsRenderer", value.asInstanceOf[js.Any])
    
    inline def setDetailsRendererUndefined: Self = StObject.set(x, "detailsRenderer", js.undefined)
    
    inline def setDetailsTemplate(value: String): Self = StObject.set(x, "detailsTemplate", value.asInstanceOf[js.Any])
    
    inline def setDetailsTemplateUndefined: Self = StObject.set(x, "detailsTemplate", js.undefined)
    
    inline def setDrag(value: disabled): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplate(value: String): Self = StObject.set(x, "editorTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditorTemplateUndefined: Self = StObject.set(x, "editorTemplate", js.undefined)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setFilter(value: disabled | Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterIndex(value: String): Self = StObject.set(x, "filterIndex", value.asInstanceOf[js.Any])
    
    inline def setFilterIndexUndefined: Self = StObject.set(x, "filterIndex", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFootCell(value: sum | avg | max | min | count | (`tokenized string`) | functionName | String): Self = StObject.set(x, "footCell", value.asInstanceOf[js.Any])
    
    inline def setFootCellUndefined: Self = StObject.set(x, "footCell", js.undefined)
    
    inline def setHeadCell(value: sum | avg | max | min | count | (`tokenized string`) | functionName | String): Self = StObject.set(x, "headCell", value.asInstanceOf[js.Any])
    
    inline def setHeadCellUndefined: Self = StObject.set(x, "headCell", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderAutoFormat(value: disabled | functionName | String): Self = StObject.set(x, "headerAutoFormat", value.asInstanceOf[js.Any])
    
    inline def setHeaderAutoFormatUndefined: Self = StObject.set(x, "headerAutoFormat", js.undefined)
    
    inline def setHeaderTooltipAction(value: click | hover): Self = StObject.set(x, "headerTooltipAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipActionUndefined: Self = StObject.set(x, "headerTooltipAction", js.undefined)
    
    inline def setHeaderTooltipDelay(value: Double): Self = StObject.set(x, "headerTooltipDelay", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipDelayUndefined: Self = StObject.set(x, "headerTooltipDelay", js.undefined)
    
    inline def setHeaderTooltipIcon(value: String): Self = StObject.set(x, "headerTooltipIcon", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipIconPosition(value: left | right | `after-text`): Self = StObject.set(x, "headerTooltipIconPosition", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipIconPositionUndefined: Self = StObject.set(x, "headerTooltipIconPosition", js.undefined)
    
    inline def setHeaderTooltipIconUndefined: Self = StObject.set(x, "headerTooltipIcon", js.undefined)
    
    inline def setHeaderTooltipPosition(value: top | left | right | bottom): Self = StObject.set(x, "headerTooltipPosition", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipPositionUndefined: Self = StObject.set(x, "headerTooltipPosition", js.undefined)
    
    inline def setHeaderTooltipRenderer(value: String): Self = StObject.set(x, "headerTooltipRenderer", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipRendererUndefined: Self = StObject.set(x, "headerTooltipRenderer", js.undefined)
    
    inline def setHeaderTooltipTemplate(value: String): Self = StObject.set(x, "headerTooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipTemplateUndefined: Self = StObject.set(x, "headerTooltipTemplate", js.undefined)
    
    inline def setHeaderTooltipText(value: String): Self = StObject.set(x, "headerTooltipText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipTextUndefined: Self = StObject.set(x, "headerTooltipText", js.undefined)
    
    inline def setHeaderTooltipTrigger(value: text | icon): Self = StObject.set(x, "headerTooltipTrigger", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipTriggerUndefined: Self = StObject.set(x, "headerTooltipTrigger", js.undefined)
    
    inline def setHeaderTooltipType(value: default | system): Self = StObject.set(x, "headerTooltipType", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipTypeUndefined: Self = StObject.set(x, "headerTooltipType", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
    
    inline def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererTemplate(value: String): Self = StObject.set(x, "rendererTemplate", value.asInstanceOf[js.Any])
    
    inline def setRendererTemplateUndefined: Self = StObject.set(x, "rendererTemplate", js.undefined)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setResizable(value: disabled): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableMaxWidth(value: Double): Self = StObject.set(x, "resizableMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setResizableMaxWidthUndefined: Self = StObject.set(x, "resizableMaxWidth", js.undefined)
    
    inline def setResizableMinWidth(value: Double): Self = StObject.set(x, "resizableMinWidth", value.asInstanceOf[js.Any])
    
    inline def setResizableMinWidthUndefined: Self = StObject.set(x, "resizableMinWidth", js.undefined)
    
    inline def setResizablePersistent(value: Boolean): Self = StObject.set(x, "resizablePersistent", value.asInstanceOf[js.Any])
    
    inline def setResizablePersistentUndefined: Self = StObject.set(x, "resizablePersistent", js.undefined)
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSearch(value: disabled): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSort(value: disabled): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortAsc(value: Boolean): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
    
    inline def setSortAscUndefined: Self = StObject.set(x, "sortAsc", js.undefined)
    
    inline def setSortDesc(value: Boolean): Self = StObject.set(x, "sortDesc", value.asInstanceOf[js.Any])
    
    inline def setSortDescUndefined: Self = StObject.set(x, "sortDesc", js.undefined)
    
    inline def setSortIntl(value: disabled): Self = StObject.set(x, "sortIntl", value.asInstanceOf[js.Any])
    
    inline def setSortIntlUndefined: Self = StObject.set(x, "sortIntl", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorter(value: String): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setType(
      value: boolean | button | currency | custom | date | editor | element | email | icon | image | iframe | number | password | range | remover | `row-number` | select | selector | tel | text | toggle | url
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeButtonDisabled(value: Boolean): Self = StObject.set(x, "typeButtonDisabled", value.asInstanceOf[js.Any])
    
    inline def setTypeButtonDisabledUndefined: Self = StObject.set(x, "typeButtonDisabled", js.undefined)
    
    inline def setTypeButtonHandler(value: String): Self = StObject.set(x, "typeButtonHandler", value.asInstanceOf[js.Any])
    
    inline def setTypeButtonHandlerUndefined: Self = StObject.set(x, "typeButtonHandler", js.undefined)
    
    inline def setTypeButtonIcon(value: String): Self = StObject.set(x, "typeButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setTypeButtonIconUndefined: Self = StObject.set(x, "typeButtonIcon", js.undefined)
    
    inline def setTypeButtonLabel(value: String): Self = StObject.set(x, "typeButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setTypeButtonLabelUndefined: Self = StObject.set(x, "typeButtonLabel", js.undefined)
    
    inline def setTypeButtonUrl(value: String): Self = StObject.set(x, "typeButtonUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeButtonUrlUndefined: Self = StObject.set(x, "typeButtonUrl", js.undefined)
    
    inline def setTypeCheckboxLabel(value: String): Self = StObject.set(x, "typeCheckboxLabel", value.asInstanceOf[js.Any])
    
    inline def setTypeCheckboxLabelUndefined: Self = StObject.set(x, "typeCheckboxLabel", js.undefined)
    
    inline def setTypeColorMode(value: String): Self = StObject.set(x, "typeColorMode", value.asInstanceOf[js.Any])
    
    inline def setTypeColorModeUndefined: Self = StObject.set(x, "typeColorMode", js.undefined)
    
    inline def setTypeColorPreview(value: Boolean): Self = StObject.set(x, "typeColorPreview", value.asInstanceOf[js.Any])
    
    inline def setTypeColorPreviewUndefined: Self = StObject.set(x, "typeColorPreview", js.undefined)
    
    inline def setTypeCurrency(value: String): Self = StObject.set(x, "typeCurrency", value.asInstanceOf[js.Any])
    
    inline def setTypeCurrencyUndefined: Self = StObject.set(x, "typeCurrency", js.undefined)
    
    inline def setTypeDateFormat(value: String): Self = StObject.set(x, "typeDateFormat", value.asInstanceOf[js.Any])
    
    inline def setTypeDateFormatUndefined: Self = StObject.set(x, "typeDateFormat", js.undefined)
    
    inline def setTypeDateFromNow(value: Boolean): Self = StObject.set(x, "typeDateFromNow", value.asInstanceOf[js.Any])
    
    inline def setTypeDateFromNowUndefined: Self = StObject.set(x, "typeDateFromNow", js.undefined)
    
    inline def setTypeElementAttributeName(value: String): Self = StObject.set(x, "typeElementAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTypeElementAttributeNameUndefined: Self = StObject.set(x, "typeElementAttributeName", js.undefined)
    
    inline def setTypeElementTagName(value: String): Self = StObject.set(x, "typeElementTagName", value.asInstanceOf[js.Any])
    
    inline def setTypeElementTagNameUndefined: Self = StObject.set(x, "typeElementTagName", js.undefined)
    
    inline def setTypeIframeRatio(value: square): Self = StObject.set(x, "typeIframeRatio", value.asInstanceOf[js.Any])
    
    inline def setTypeIframeRatioUndefined: Self = StObject.set(x, "typeIframeRatio", js.undefined)
    
    inline def setTypeImageAlt(value: String): Self = StObject.set(x, "typeImageAlt", value.asInstanceOf[js.Any])
    
    inline def setTypeImageAltUndefined: Self = StObject.set(x, "typeImageAlt", js.undefined)
    
    inline def setTypeImageMask(value: circle): Self = StObject.set(x, "typeImageMask", value.asInstanceOf[js.Any])
    
    inline def setTypeImageMaskUndefined: Self = StObject.set(x, "typeImageMask", js.undefined)
    
    inline def setTypeImageSrc(value: String): Self = StObject.set(x, "typeImageSrc", value.asInstanceOf[js.Any])
    
    inline def setTypeImageSrcUndefined: Self = StObject.set(x, "typeImageSrc", js.undefined)
    
    inline def setTypeNumberDecimals(value: Double): Self = StObject.set(x, "typeNumberDecimals", value.asInstanceOf[js.Any])
    
    inline def setTypeNumberDecimalsUndefined: Self = StObject.set(x, "typeNumberDecimals", js.undefined)
    
    inline def setTypeNumberFormatting(value: disabled): Self = StObject.set(x, "typeNumberFormatting", value.asInstanceOf[js.Any])
    
    inline def setTypeNumberFormattingUndefined: Self = StObject.set(x, "typeNumberFormatting", js.undefined)
    
    inline def setTypeNumberMaxDecimals(value: Double): Self = StObject.set(x, "typeNumberMaxDecimals", value.asInstanceOf[js.Any])
    
    inline def setTypeNumberMaxDecimalsUndefined: Self = StObject.set(x, "typeNumberMaxDecimals", js.undefined)
    
    inline def setTypeRadioOptions(value: js.Array[Any] | String): Self = StObject.set(x, "typeRadioOptions", value.asInstanceOf[js.Any])
    
    inline def setTypeRadioOptionsUndefined: Self = StObject.set(x, "typeRadioOptions", js.undefined)
    
    inline def setTypeRadioOptionsVarargs(value: Any*): Self = StObject.set(x, "typeRadioOptions", js.Array(value*))
    
    inline def setTypeRangeMax(value: Double): Self = StObject.set(x, "typeRangeMax", value.asInstanceOf[js.Any])
    
    inline def setTypeRangeMaxUndefined: Self = StObject.set(x, "typeRangeMax", js.undefined)
    
    inline def setTypeRangeMin(value: Double): Self = StObject.set(x, "typeRangeMin", value.asInstanceOf[js.Any])
    
    inline def setTypeRangeMinUndefined: Self = StObject.set(x, "typeRangeMin", js.undefined)
    
    inline def setTypeRangeStep(value: Double): Self = StObject.set(x, "typeRangeStep", value.asInstanceOf[js.Any])
    
    inline def setTypeRangeStepUndefined: Self = StObject.set(x, "typeRangeStep", js.undefined)
    
    inline def setTypeSelectMultiple(value: Boolean): Self = StObject.set(x, "typeSelectMultiple", value.asInstanceOf[js.Any])
    
    inline def setTypeSelectMultipleUndefined: Self = StObject.set(x, "typeSelectMultiple", js.undefined)
    
    inline def setTypeSelectOptions(value: String | js.Array[Any]): Self = StObject.set(x, "typeSelectOptions", value.asInstanceOf[js.Any])
    
    inline def setTypeSelectOptionsUndefined: Self = StObject.set(x, "typeSelectOptions", js.undefined)
    
    inline def setTypeSelectOptionsVarargs(value: Any*): Self = StObject.set(x, "typeSelectOptions", js.Array(value*))
    
    inline def setTypeToggleOptions(value: js.Array[Any]): Self = StObject.set(x, "typeToggleOptions", value.asInstanceOf[js.Any])
    
    inline def setTypeToggleOptionsUndefined: Self = StObject.set(x, "typeToggleOptions", js.undefined)
    
    inline def setTypeToggleOptionsVarargs(value: Any*): Self = StObject.set(x, "typeToggleOptions", js.Array(value*))
    
    inline def setTypeToggleRenderValue(value: Boolean): Self = StObject.set(x, "typeToggleRenderValue", value.asInstanceOf[js.Any])
    
    inline def setTypeToggleRenderValueUndefined: Self = StObject.set(x, "typeToggleRenderValue", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeUrlIcon(value: link | outsidearrow): Self = StObject.set(x, "typeUrlIcon", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlIconUndefined: Self = StObject.set(x, "typeUrlIcon", js.undefined)
    
    inline def setTypeUrlSrc(value: String): Self = StObject.set(x, "typeUrlSrc", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlSrcUndefined: Self = StObject.set(x, "typeUrlSrc", js.undefined)
    
    inline def setTypeUrlText(value: String): Self = StObject.set(x, "typeUrlText", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlTextUndefined: Self = StObject.set(x, "typeUrlText", js.undefined)
    
    inline def setValidationErrorMessage(value: String): Self = StObject.set(x, "validationErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorMessageUndefined: Self = StObject.set(x, "validationErrorMessage", js.undefined)
    
    inline def setValidationRequiredMessage(value: String): Self = StObject.set(x, "validationRequiredMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationRequiredMessageUndefined: Self = StObject.set(x, "validationRequiredMessage", js.undefined)
    
    inline def setValidator(value: String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setVisibilityPriority(value: Double): Self = StObject.set(x, "visibilityPriority", value.asInstanceOf[js.Any])
    
    inline def setVisibilityPriorityUndefined: Self = StObject.set(x, "visibilityPriority", js.undefined)
    
    inline def setWidth(
      value: fit | fitheader | fitcontent | stretch | `10Percentsign` | `150px` | `150` | String | Double
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
