package typings.zinggrid.ZSoft.ZingGridAttributes

import typings.zinggrid.zinggridStrings.`10Percentsign`
import typings.zinggrid.zinggridStrings.`150`
import typings.zinggrid.zinggridStrings.`150px`
import typings.zinggrid.zinggridStrings.`after-text`
import typings.zinggrid.zinggridStrings.`bottom center`
import typings.zinggrid.zinggridStrings.`bottom left`
import typings.zinggrid.zinggridStrings.`bottom right`
import typings.zinggrid.zinggridStrings.`button-arrows`
import typings.zinggrid.zinggridStrings.`button-text`
import typings.zinggrid.zinggridStrings.`center left`
import typings.zinggrid.zinggridStrings.`center right`
import typings.zinggrid.zinggridStrings.`top center`
import typings.zinggrid.zinggridStrings.`top left`
import typings.zinggrid.zinggridStrings.`top right`
import typings.zinggrid.zinggridStrings.all
import typings.zinggrid.zinggridStrings.android
import typings.zinggrid.zinggridStrings.bar
import typings.zinggrid.zinggridStrings.black
import typings.zinggrid.zinggridStrings.both
import typings.zinggrid.zinggridStrings.bottom
import typings.zinggrid.zinggridStrings.card
import typings.zinggrid.zinggridStrings.center
import typings.zinggrid.zinggridStrings.click
import typings.zinggrid.zinggridStrings.creator
import typings.zinggrid.zinggridStrings.customThemeName
import typings.zinggrid.zinggridStrings.dark
import typings.zinggrid.zinggridStrings.default
import typings.zinggrid.zinggridStrings.disabled
import typings.zinggrid.zinggridStrings.editor
import typings.zinggrid.zinggridStrings.ellipsis
import typings.zinggrid.zinggridStrings.fit
import typings.zinggrid.zinggridStrings.fitcontent
import typings.zinggrid.zinggridStrings.fitheader
import typings.zinggrid.zinggridStrings.hide
import typings.zinggrid.zinggridStrings.horizontal
import typings.zinggrid.zinggridStrings.horz
import typings.zinggrid.zinggridStrings.hover
import typings.zinggrid.zinggridStrings.icon
import typings.zinggrid.zinggridStrings.ios
import typings.zinggrid.zinggridStrings.left
import typings.zinggrid.zinggridStrings.modal
import typings.zinggrid.zinggridStrings.normal
import typings.zinggrid.zinggridStrings.remover
import typings.zinggrid.zinggridStrings.reorder
import typings.zinggrid.zinggridStrings.right
import typings.zinggrid.zinggridStrings.row
import typings.zinggrid.zinggridStrings.stretch
import typings.zinggrid.zinggridStrings.system
import typings.zinggrid.zinggridStrings.text
import typings.zinggrid.zinggridStrings.top
import typings.zinggrid.zinggridStrings.urlToThemeFile
import typings.zinggrid.zinggridStrings.vert
import typings.zinggrid.zinggridStrings.vertical
import typings.zinggrid.zinggridStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZingGrid extends StObject {
  
  /**
    * @description Aligns the contents of all column's cells
    */
  var align: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * @description The caption for the grid
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * @description Specifies the defined "<zg-card>" of the grid.  More appropriate to use "<zg-card>" in most cases or set the property programmatically.
    */
  var card: js.UndefOr[Any] = js.undefined
  
  /**
    * @description The type of "word-break" style for body cells. When not set, "cell-break" style is "normal" by default.
    * If the width of a column is set, "cell-break" is "word" by default.
    * To overwrite "cell-break" for cells in a specific column, set "cell-break" for that column.
    */
  var cellBreak: js.UndefOr[all | ellipsis | normal | word] = js.undefined
  
  /**
    * @description Adds a class to each "<zg-cell>" in the grid. This attribute can be applied to both
    * "<zing-grid>" or "<zg-column>". If the attribute is applied to both, "<zg-column>"'s "cell-class" overwrites "<zing-grid>"'s "cell-class".
    * To set a class conditionally, set "cell-class" to the name of the function, which takes in the arguments: "cellData", "domContainer", "cellObject".
    */
  var cellClass: js.UndefOr[String] = js.undefined
  
  /**
    * @description Turns cell editing on or off. Automatically turned on when setting "editor" or "editor-controls".
    */
  var cellEditor: js.UndefOr[disabled | Boolean] = js.undefined
  
  /**
    * @description Turns off keyboard nav cell focus if set to disabled
    */
  var cellFocus: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Sets the execution method of custom 'icon' type tooltips to either activate on hover or click of the icon
    */
  var cellTooltipAction: js.UndefOr[click | hover] = js.undefined
  
  /**
    * @description Sets the hover delay in milliseconds before displaying the tooltip. If delay is not specified,
    * it is 1000ms on cell tooltips without an icon and 0ms on cell tooltips with an icon.
    */
  var cellTooltipDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Specifies the icon to use for the info column types
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
    * @description Sets the style to use for the tooltips.  Uses the "default" style by default.  Can set to "system" to match the tooltips used on icons throughout "<zing-grid>".
    */
  var cellTooltipType: js.UndefOr[default | system] = js.undefined
  
  /**
    * @description Adds a class to each "<zg-cell>" in targeted "<zg-column>". To
    * apply a class conditionally, set the value to the name of the function to run
    * on each cell value. The function takes the parameters "fieldIndex", "domContainer",
    * and "colObject", and returns a string which is the class name to apply.
    */
  var colClass: js.UndefOr[String] = js.undefined
  
  /**
    * @description Enables column dragging
    */
  var columnDrag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Specifies the action of dragging allowed.  By default, if "column-drag" is
    * enabled then "column-drag-action" is set ""both"".  This property will turn on column-drag if not already set.
    */
  var columnDragAction: js.UndefOr[reorder | hide | both] = js.undefined
  
  /**
    * @description Presence of attribute turns on column resizing for all columns
    */
  var columnResizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Sets the maximum width columns can be set to when resizing
    */
  var columnResizableMaxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the minimum width columns can be set to when resizing
    */
  var columnResizableMinWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Presence of attribute displays column resizing for all columns without hover
    */
  var columnResizablePersistent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Sets the width each of the columns
    */
  var columnWidth: js.UndefOr[
    fit | fitheader | fitcontent | stretch | `10Percentsign` | `150px` | `150` | String | Double
  ] = js.undefined
  
  /**
    * @description Specifies the columns of the grid.  More appropriate to use "<zg-column>" in most cases or set the property programmatically.
    */
  var columns: js.UndefOr[js.Array[ZGColumn]] = js.undefined
  
  /**
    * @description Presence of attribute turns on the menu to show and hide columns
    */
  var columnsControl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Augments internal themes to a compact mode
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Used to set multiple grid properties at once.  This should never be used directly.
    * This is meant for object instantiation.
    */
  var config: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Turns off delete confirmation if set to disable
    */
  var confirmDelete: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Enables the default "<zing-grid>" context menu or set to the id name of a custom "<zg-menu>".  If
    * set to a custom menu and "<zg-menu>" has the "replace" attribute present, then the custom menu will replace the context menu.
    * Otherwise the contents of the custom menu is appended to the end of context menu.
    */
  var contextMenu: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * @description Data for the grid presented as an array or object
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * @description The data to display in each cell where the data value is null or undefined
    */
  var defaultDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets "<zg-dialog>" to display dialog and mask within the grid dimensions instead of the whole screen
    */
  var dialog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The HTML standard direction to indicate direction of grid's columns and text
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /**
    * @description Turns on the grid editor.  Enables single cell editing via double click.
    * Sets the editor to inline (default) or modal.
    */
  var editor: js.UndefOr[modal | Boolean] = js.undefined
  
  /**
    * @description Adds columns for the editor controls.  If it is added, default is "all".
    */
  var editorControls: js.UndefOr[editor | remover | creator | all | Boolean] = js.undefined
  
  /**
    * @description Enables filtering for all columns.  Can be turned on/off individually via column.
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Adds a class to each "<zg-cell>" in the "<zg-foot>". To
    * apply a class conditionally, set the value to the name of the function to run
    * on each cell value. The function takes the parameters "fieldIndex", "domContainer",
    * and "colObject", and returns a string which is the class name to apply.
    */
  var footClass: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets vertical, horizontal or both grid lines to the grid
    */
  var gridlines: js.UndefOr[both | horz | horizontal | vert | vertical] = js.undefined
  
  /**
    * @description Adds a class to each "<zg-cell>" in the "<zg-head>". To
    * apply a class conditionally, set the value to the name of the function to run
    * on each cell value. The function takes the parameters "fieldIndex", "domContainer",
    * and "colObject", and returns a string which is the class name to apply.
    */
  var headClass: js.UndefOr[String] = js.undefined
  
  /**
    * @description Converts camel, dash, and kebab case to properly spaced and capitalized typography.
    * Setting to "disabled" will turn off formatting on headers.  Set to a function name to customize formatting of headers.
    */
  var headerAutoFormat: js.UndefOr[String] = js.undefined
  
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
    * @description Sets what part of the header triggers the tooltip.  If set to 'icon', an info icon is added to the header.
    */
  var headerTooltipTrigger: js.UndefOr[text | icon] = js.undefined
  
  /**
    * @description Sets the style to use for the tooltips.  Uses the "default" style by default.  Can set to "system" to match the tooltips used on icons throughout "<zing-grid>".
    */
  var headerTooltipType: js.UndefOr[default | system] = js.undefined
  
  /**
    * @description Sets the height of the grid.  If the height is less than the size of the content, scrolling is added
    * to grid body.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @description Allows the user to change the grid icon set to an allowed 3rd-party type (e.g., Font-Awesome).
    * To use a custom icon set, the icon set must first be registered.
    */
  var iconSet: js.UndefOr[String] = js.undefined
  
  /**
    * @description If setting [icon-set="custom"], points to the custom JSON key/value mapping
    */
  var iconSetData: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the language to use for the grid
    */
  var lang: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the grid layout to be either "card" or "row" and adds "<zg-layout-controls>" to the grid.
    * The default is based on the size of the user's screen, unless "layout" is set.
    */
  var layout: js.UndefOr[card | row] = js.undefined
  
  /**
    * @description When "layout" is set, by default "layout-controls" is enabled.
    * To hide, set "layout-controls" to "disabled".  Presence of this attribute will enable
    * "<zg-layout-controls>" even if "layout" is not set.
    */
  var layoutControls: js.UndefOr[disabled | Boolean] = js.undefined
  
  /**
    * @description Presence of attribute adds loading state to grid, which triggers "<zg-load-mask>" to show.
    * This attribute allows styling the height of the grid (via CSS) before the data has loaded in the grid.
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Sets the text to display in the "<zg-load-mask>" on data load
    */
  var loadingText: js.UndefOr[String] = js.undefined
  
  /**
    * @description Set "loadmask="disabled"" to prevent the "<zg-load-mask>" from showing on data load.
    */
  var loadmask: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Sets the message that appears in the "<zg-no-data>" element when there are no records
    */
  var noData: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the number of records or rows to display per page. Can be set only if "pager" is set.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the number of cards to display per page when in card mode. Can be set only if "pager" is set.
    */
  var pageSizeCard: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the options for page size in "zg-option-list". Can be set only if "pager" is set.
    */
  var pageSizeOptions: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the number of rows to display per page when in row mode. Can be set only if "pager" is set.
    */
  var pageSizeRow: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Adds pagination functionality and controls to the grid
    */
  var pager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Determines max number of page buttons to display.  Default is 5.
    */
  var pagerButtonLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets pager position. Note: "pager" attribute or "<zg-pager>" must be present in
    * order to position pager.
    */
  var pagerPosition: js.UndefOr[top | bottom] = js.undefined
  
  /**
    * @description Determines which type of pagination to use, input or buttons
    */
  var pagerType: js.UndefOr[`button-text` | `button-arrows`] = js.undefined
  
  /**
    * @description Name/Value pairs of "<zg-param>" values.  More appropriate to use "<zg-param>" in most cases.
    */
  var params: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the total record count.  Useful for "loadByPage" when the response packet
    * does not return total count of records.
    */
  var recordCount: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Adds a class to each "<zg-row>" element. To
    * apply a class conditionally, set the value to the name of the function to run
    * on each cell value. The function takes the parameters "data", "rowIndex" (1-based),
    *  "domRow", and "rowObject", and returns a string which is the class name to apply.
    */
  var rowClass: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the height of each row.  By default, the row height is set to 'auto' where it will auto fit the content.
    * In the case of frozen columns, the default row height is '48px' because there is a performance hit when using 'auto' with
    * frozen columns.
    */
  var rowHeight: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @description Adds "selector" type column to the rows as the first column
    */
  var rowSelector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Turns on the search feature and adds "<zg-search>" to the grid.
    * The search button appears in the caption header.
    */
  var search: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Turns on the selector feature on the grid and adds
    * "<zg-selector-mask>" to the grid
    */
  var selector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Indicates that the grid was completely rendered on the server and embedded in the page
    */
  var serverRendered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Enables sorting on all columns.  It is possible to disable specific columns
    * via the column's object or setting "sort="disabled"" to specified columns.
    */
  var sort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Overrides default behavior for international sorting.  Turn off international sorting with "sort-intl="disabled"".
    */
  var sortIntl: js.UndefOr[disabled] = js.undefined
  
  /**
    * @description Override the column sorting by passing in method name of sort function instead.  Sorter function
    * takes in two values (a, b) and returns 1, -1, or 0 indicating if "a > b", "a < b", or "a = b".
    */
  var sorter: js.UndefOr[String] = js.undefined
  
  /**
    * @description Defines the source of the data in the grid. Adds the "<zg-source>" element.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * @description Specifies the absolute or relative URL to fetch data from to populate the grid
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * @description Adds a display button that launches the contextmenu.
    */
  var staticMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Changes the duration a status message will remain visible until it automatically closes (in milliseconds)
    */
  var statusDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Prevents status messages from automatically closing after a delay
    */
  var statusPersist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Positions the status message in one of nine positions relative to the grid
    */
  var statusPosition: js.UndefOr[
    (`top left`) | (`center left`) | (`bottom left`) | (`top center`) | center | (`bottom center`) | (`top right`) | (`center right`) | (`bottom right`) | bar
  ] = js.undefined
  
  /**
    * @description Defines the regex expression for closing data binding
    */
  var templateEndDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * @description Defines the regex expression for starting data binding
    */
  var templateStartDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the theme of the grid.  Built-in themes are specified by keyword, but custom theme
    * names are also accepted by setting a URL path to your custom css theme file.  For custom themes, on load set "theme"
    * to the path to the custom theme file.  After, set to theme name to switch themes.
    */
  var theme: js.UndefOr[
    android | black | default | dark | ios | urlToThemeFile | customThemeName | String
  ] = js.undefined
  
  /**
    * @description Sets the default validation error message
    */
  var validationErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the default validation required message
    */
  var validationRequiredMessage: js.UndefOr[String] = js.undefined
  
  /**
    * @description Internal attribute.  Should not be set.
    */
  var viewport: js.UndefOr[String] = js.undefined
  
  /**
    * @description Keeps current value of "viewport" and freezes the breakpoint
    */
  var viewportPause: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Removes "viewport" attribute, disabling viewport resizing
    */
  var viewportStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Sets custom "viewport" breakpoints (value string-object must be valid JSON).
    * NOTE: If you don't set "mobile", the grid won't auto-set card or row mode.
    */
  var viewportTypes: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the width of the grid.  If the width is less than the size of the content, scroll is added to "<zg-body>".
    */
  var width: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @description Presence of attribute adds the classes, "zebra-1" and "zebra-2", alternating on "<zg-row>" elements.  Setting to a
    * list of class names will assign classes in sequential order.  For conditional zebra classes, "zebra" also accepts name of function that
    * returns a class name to use for zebra striping.
    */
  var zebra: js.UndefOr[String] = js.undefined
}
object ZingGrid {
  
  inline def apply(): ZingGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZingGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZingGrid] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: center | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCellBreak(value: all | ellipsis | normal | word): Self = StObject.set(x, "cellBreak", value.asInstanceOf[js.Any])
    
    inline def setCellBreakUndefined: Self = StObject.set(x, "cellBreak", js.undefined)
    
    inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    inline def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
    
    inline def setCellEditor(value: disabled | Boolean): Self = StObject.set(x, "cellEditor", value.asInstanceOf[js.Any])
    
    inline def setCellEditorUndefined: Self = StObject.set(x, "cellEditor", js.undefined)
    
    inline def setCellFocus(value: disabled): Self = StObject.set(x, "cellFocus", value.asInstanceOf[js.Any])
    
    inline def setCellFocusUndefined: Self = StObject.set(x, "cellFocus", js.undefined)
    
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
    
    inline def setCellTooltipType(value: default | system): Self = StObject.set(x, "cellTooltipType", value.asInstanceOf[js.Any])
    
    inline def setCellTooltipTypeUndefined: Self = StObject.set(x, "cellTooltipType", js.undefined)
    
    inline def setColClass(value: String): Self = StObject.set(x, "colClass", value.asInstanceOf[js.Any])
    
    inline def setColClassUndefined: Self = StObject.set(x, "colClass", js.undefined)
    
    inline def setColumnDrag(value: Boolean): Self = StObject.set(x, "columnDrag", value.asInstanceOf[js.Any])
    
    inline def setColumnDragAction(value: reorder | hide | both): Self = StObject.set(x, "columnDragAction", value.asInstanceOf[js.Any])
    
    inline def setColumnDragActionUndefined: Self = StObject.set(x, "columnDragAction", js.undefined)
    
    inline def setColumnDragUndefined: Self = StObject.set(x, "columnDrag", js.undefined)
    
    inline def setColumnResizable(value: Boolean): Self = StObject.set(x, "columnResizable", value.asInstanceOf[js.Any])
    
    inline def setColumnResizableMaxWidth(value: Double): Self = StObject.set(x, "columnResizableMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnResizableMaxWidthUndefined: Self = StObject.set(x, "columnResizableMaxWidth", js.undefined)
    
    inline def setColumnResizableMinWidth(value: Double): Self = StObject.set(x, "columnResizableMinWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnResizableMinWidthUndefined: Self = StObject.set(x, "columnResizableMinWidth", js.undefined)
    
    inline def setColumnResizablePersistent(value: Boolean): Self = StObject.set(x, "columnResizablePersistent", value.asInstanceOf[js.Any])
    
    inline def setColumnResizablePersistentUndefined: Self = StObject.set(x, "columnResizablePersistent", js.undefined)
    
    inline def setColumnResizableUndefined: Self = StObject.set(x, "columnResizable", js.undefined)
    
    inline def setColumnWidth(
      value: fit | fitheader | fitcontent | stretch | `10Percentsign` | `150px` | `150` | String | Double
    ): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setColumns(value: js.Array[ZGColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsControl(value: Boolean): Self = StObject.set(x, "columnsControl", value.asInstanceOf[js.Any])
    
    inline def setColumnsControlUndefined: Self = StObject.set(x, "columnsControl", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ZGColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfirmDelete(value: disabled): Self = StObject.set(x, "confirmDelete", value.asInstanceOf[js.Any])
    
    inline def setConfirmDeleteUndefined: Self = StObject.set(x, "confirmDelete", js.undefined)
    
    inline def setContextMenu(value: String | Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefaultDisplay(value: String): Self = StObject.set(x, "defaultDisplay", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayUndefined: Self = StObject.set(x, "defaultDisplay", js.undefined)
    
    inline def setDialog(value: Boolean): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEditor(value: modal | Boolean): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorControls(value: editor | remover | creator | all | Boolean): Self = StObject.set(x, "editorControls", value.asInstanceOf[js.Any])
    
    inline def setEditorControlsUndefined: Self = StObject.set(x, "editorControls", js.undefined)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFootClass(value: String): Self = StObject.set(x, "footClass", value.asInstanceOf[js.Any])
    
    inline def setFootClassUndefined: Self = StObject.set(x, "footClass", js.undefined)
    
    inline def setGridlines(value: both | horz | horizontal | vert | vertical): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
    
    inline def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
    
    inline def setHeadClass(value: String): Self = StObject.set(x, "headClass", value.asInstanceOf[js.Any])
    
    inline def setHeadClassUndefined: Self = StObject.set(x, "headClass", js.undefined)
    
    inline def setHeaderAutoFormat(value: String): Self = StObject.set(x, "headerAutoFormat", value.asInstanceOf[js.Any])
    
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
    
    inline def setHeaderTooltipTrigger(value: text | icon): Self = StObject.set(x, "headerTooltipTrigger", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipTriggerUndefined: Self = StObject.set(x, "headerTooltipTrigger", js.undefined)
    
    inline def setHeaderTooltipType(value: default | system): Self = StObject.set(x, "headerTooltipType", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipTypeUndefined: Self = StObject.set(x, "headerTooltipType", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIconSet(value: String): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
    
    inline def setIconSetData(value: String): Self = StObject.set(x, "iconSetData", value.asInstanceOf[js.Any])
    
    inline def setIconSetDataUndefined: Self = StObject.set(x, "iconSetData", js.undefined)
    
    inline def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLayout(value: card | row): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutControls(value: disabled | Boolean): Self = StObject.set(x, "layoutControls", value.asInstanceOf[js.Any])
    
    inline def setLayoutControlsUndefined: Self = StObject.set(x, "layoutControls", js.undefined)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingText(value: String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLoadmask(value: disabled): Self = StObject.set(x, "loadmask", value.asInstanceOf[js.Any])
    
    inline def setLoadmaskUndefined: Self = StObject.set(x, "loadmask", js.undefined)
    
    inline def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeCard(value: Double): Self = StObject.set(x, "pageSizeCard", value.asInstanceOf[js.Any])
    
    inline def setPageSizeCardUndefined: Self = StObject.set(x, "pageSizeCard", js.undefined)
    
    inline def setPageSizeOptions(value: String): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
    
    inline def setPageSizeRow(value: Double): Self = StObject.set(x, "pageSizeRow", value.asInstanceOf[js.Any])
    
    inline def setPageSizeRowUndefined: Self = StObject.set(x, "pageSizeRow", js.undefined)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerButtonLimit(value: Double): Self = StObject.set(x, "pagerButtonLimit", value.asInstanceOf[js.Any])
    
    inline def setPagerButtonLimitUndefined: Self = StObject.set(x, "pagerButtonLimit", js.undefined)
    
    inline def setPagerPosition(value: top | bottom): Self = StObject.set(x, "pagerPosition", value.asInstanceOf[js.Any])
    
    inline def setPagerPositionUndefined: Self = StObject.set(x, "pagerPosition", js.undefined)
    
    inline def setPagerType(value: `button-text` | `button-arrows`): Self = StObject.set(x, "pagerType", value.asInstanceOf[js.Any])
    
    inline def setPagerTypeUndefined: Self = StObject.set(x, "pagerType", js.undefined)
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRecordCount(value: Double): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
    
    inline def setRecordCountUndefined: Self = StObject.set(x, "recordCount", js.undefined)
    
    inline def setRowClass(value: String): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
    
    inline def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
    
    inline def setRowHeight(value: String | Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setRowSelector(value: Boolean): Self = StObject.set(x, "rowSelector", value.asInstanceOf[js.Any])
    
    inline def setRowSelectorUndefined: Self = StObject.set(x, "rowSelector", js.undefined)
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSelector(value: Boolean): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setServerRendered(value: Boolean): Self = StObject.set(x, "serverRendered", value.asInstanceOf[js.Any])
    
    inline def setServerRenderedUndefined: Self = StObject.set(x, "serverRendered", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortIntl(value: disabled): Self = StObject.set(x, "sortIntl", value.asInstanceOf[js.Any])
    
    inline def setSortIntlUndefined: Self = StObject.set(x, "sortIntl", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorter(value: String): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStaticMenu(value: Boolean): Self = StObject.set(x, "staticMenu", value.asInstanceOf[js.Any])
    
    inline def setStaticMenuUndefined: Self = StObject.set(x, "staticMenu", js.undefined)
    
    inline def setStatusDelay(value: Double): Self = StObject.set(x, "statusDelay", value.asInstanceOf[js.Any])
    
    inline def setStatusDelayUndefined: Self = StObject.set(x, "statusDelay", js.undefined)
    
    inline def setStatusPersist(value: Boolean): Self = StObject.set(x, "statusPersist", value.asInstanceOf[js.Any])
    
    inline def setStatusPersistUndefined: Self = StObject.set(x, "statusPersist", js.undefined)
    
    inline def setStatusPosition(
      value: (`top left`) | (`center left`) | (`bottom left`) | (`top center`) | center | (`bottom center`) | (`top right`) | (`center right`) | (`bottom right`) | bar
    ): Self = StObject.set(x, "statusPosition", value.asInstanceOf[js.Any])
    
    inline def setStatusPositionUndefined: Self = StObject.set(x, "statusPosition", js.undefined)
    
    inline def setTemplateEndDelimiter(value: String): Self = StObject.set(x, "templateEndDelimiter", value.asInstanceOf[js.Any])
    
    inline def setTemplateEndDelimiterUndefined: Self = StObject.set(x, "templateEndDelimiter", js.undefined)
    
    inline def setTemplateStartDelimiter(value: String): Self = StObject.set(x, "templateStartDelimiter", value.asInstanceOf[js.Any])
    
    inline def setTemplateStartDelimiterUndefined: Self = StObject.set(x, "templateStartDelimiter", js.undefined)
    
    inline def setTheme(value: android | black | default | dark | ios | urlToThemeFile | customThemeName | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValidationErrorMessage(value: String): Self = StObject.set(x, "validationErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorMessageUndefined: Self = StObject.set(x, "validationErrorMessage", js.undefined)
    
    inline def setValidationRequiredMessage(value: String): Self = StObject.set(x, "validationRequiredMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationRequiredMessageUndefined: Self = StObject.set(x, "validationRequiredMessage", js.undefined)
    
    inline def setViewport(value: String): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportPause(value: Boolean): Self = StObject.set(x, "viewportPause", value.asInstanceOf[js.Any])
    
    inline def setViewportPauseUndefined: Self = StObject.set(x, "viewportPause", js.undefined)
    
    inline def setViewportStop(value: Boolean): Self = StObject.set(x, "viewportStop", value.asInstanceOf[js.Any])
    
    inline def setViewportStopUndefined: Self = StObject.set(x, "viewportStop", js.undefined)
    
    inline def setViewportTypes(value: String): Self = StObject.set(x, "viewportTypes", value.asInstanceOf[js.Any])
    
    inline def setViewportTypesUndefined: Self = StObject.set(x, "viewportTypes", js.undefined)
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZebra(value: String): Self = StObject.set(x, "zebra", value.asInstanceOf[js.Any])
    
    inline def setZebraUndefined: Self = StObject.set(x, "zebra", js.undefined)
  }
}
