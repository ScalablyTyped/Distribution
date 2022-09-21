package typings.zinggrid.ZSoft

import typings.std.CustomEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZingGridEventHandlers extends StObject {
  
  /**
    * @description Fires the "card:click" and "record:click" event when a click occurs on a record (card).
    */
  var onCardClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when mouse is moved out a record (card).
    */
  var onCardMouseout: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when mouse is moved over a record (card).
    */
  var onCardMouseover: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event before a cell is rendered.
    */
  var onCellBeforerender: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when a click occurs to a cell.
    */
  var onCellClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the cell editor is closed.
    */
  var onCellCloseedit: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when copying (ctrl+c) occurs in a cell.
    */
  var onCellCopy: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when mouse is moved out of a cell.
    */
  var onCellMouseout: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when mouse is moved over a cell.
    */
  var onCellMouseover: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the cell editor is opened.
    */
  var onCellOpenedit: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when pasting (ctrl+p) occurs in a cell.
    */
  var onCellPaste: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when right click occurs on a cell.
    */
  var onCellRightclick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires event when click on a column.
    */
  var onColumnClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when a column is filtered.
    */
  var onColumnFilter: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires event when mouseout on a column.
    */
  var onColumnMouseout: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires event when mouseover on a column.
    */
  var onColumnMouseover: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event before a single cell value is changed.
    */
  var onDataCellBeforechange: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event after a single cell value is changed.
    */
  var onDataCellChange: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event every time a new dataset is loaded in the grid.
    */
  var onDataLoad: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event before a record (row) is changed.
    */
  var onDataRecordBeforechange: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event before a record (row) is deleted from the grid.
    */
  var onDataRecordBeforedelete: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event before a new record (row) is added to the grid.
    */
  var onDataRecordBeforeinsert: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event after a record (row) is changed.
    */
  var onDataRecordChange: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when a record (row) is deleted from the grid.
    */
  var onDataRecordDelete: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event after a new record (row) is added to the grid.
    */
  var onDataRecordInsert: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires event when the insert dialog is opened
    */
  var onDataRecordOpeninsert: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event once before the grid renders.
    */
  var onGridBeforerender: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the  event when the contextmenu is closed.
    */
  var onGridContextmenuclose: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the contextmenu is opened.
    */
  var onGridContextmenuopen: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when selection is deselected in the grid.
    */
  var onGridDeselect: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the pre-rendered grid is finished being hydrated.
    */
  var onGridHydrate: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the (Esc) key is pressed.
    */
  var onGridKeydownesc: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when a page changes in the grid.
    */
  var onGridPagechange: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the grid changes to the first page.
    */
  var onGridPagefirst: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the grid changes to the last page.
    */
  var onGridPagelast: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the grid changes to the next page.
    */
  var onGridPagenext: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the grid changes to the previous page.
    */
  var onGridPageprev: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the "page-size" (amount of rows displaying) changes on the grid.
    */
  var onGridPagesizechange: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the grid ready event when grid is ready.
    */
  var onGridReady: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when the grid is refreshed through grid controls or API method "refresh()".
    */
  var onGridRefresh: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event once when grid renders.
    */
  var onGridRender: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when scrolling occurs in grid.
    */
  var onGridScroll: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when a the grid is searched.
    */
  var onGridSearch: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when selection is made in the grid.
    */
  var onGridSelect: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when selecting every cell (ctrl+a) in the grid.
    */
  var onGridSelectall: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires event when click on a header cell.
    */
  var onHeaderClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when custom menu item is clicked.
    */
  var onMenuClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the "row:click" and "record:click" event when a click occurs on a record (row).
    */
  var onRecordClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires when the mouse cursor leaves the record (row).
    */
  var onRecordMouseout: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires when the mouse cursor enter the record (row).
    */
  var onRecordMouseover: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the "row:click" and "record:click" event when a click occurs on a record (row).
    */
  var onRowClick: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when mouse is moved out a record (row).
    */
  var onRowMouseout: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires the event when mouse is moved over a record (row).
    */
  var onRowMouseover: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
  
  /**
    * @description Fires when the row selector changes
    */
  var onRowSelect: js.UndefOr[(js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]) | Null] = js.undefined
}
object ZingGridEventHandlers {
  
  inline def apply(): ZingGridEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZingGridEventHandlers]
  }
  
  extension [Self <: ZingGridEventHandlers](x: Self) {
    
    inline def setOnCardClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCardClick", value.asInstanceOf[js.Any])
    
    inline def setOnCardClickNull: Self = StObject.set(x, "onCardClick", null)
    
    inline def setOnCardClickUndefined: Self = StObject.set(x, "onCardClick", js.undefined)
    
    inline def setOnCardMouseout(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCardMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnCardMouseoutNull: Self = StObject.set(x, "onCardMouseout", null)
    
    inline def setOnCardMouseoutUndefined: Self = StObject.set(x, "onCardMouseout", js.undefined)
    
    inline def setOnCardMouseover(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCardMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnCardMouseoverNull: Self = StObject.set(x, "onCardMouseover", null)
    
    inline def setOnCardMouseoverUndefined: Self = StObject.set(x, "onCardMouseover", js.undefined)
    
    inline def setOnCellBeforerender(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellBeforerender", value.asInstanceOf[js.Any])
    
    inline def setOnCellBeforerenderNull: Self = StObject.set(x, "onCellBeforerender", null)
    
    inline def setOnCellBeforerenderUndefined: Self = StObject.set(x, "onCellBeforerender", js.undefined)
    
    inline def setOnCellClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellClick", value.asInstanceOf[js.Any])
    
    inline def setOnCellClickNull: Self = StObject.set(x, "onCellClick", null)
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnCellCloseedit(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellCloseedit", value.asInstanceOf[js.Any])
    
    inline def setOnCellCloseeditNull: Self = StObject.set(x, "onCellCloseedit", null)
    
    inline def setOnCellCloseeditUndefined: Self = StObject.set(x, "onCellCloseedit", js.undefined)
    
    inline def setOnCellCopy(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCellCopyNull: Self = StObject.set(x, "onCellCopy", null)
    
    inline def setOnCellCopyUndefined: Self = StObject.set(x, "onCellCopy", js.undefined)
    
    inline def setOnCellMouseout(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnCellMouseoutNull: Self = StObject.set(x, "onCellMouseout", null)
    
    inline def setOnCellMouseoutUndefined: Self = StObject.set(x, "onCellMouseout", js.undefined)
    
    inline def setOnCellMouseover(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnCellMouseoverNull: Self = StObject.set(x, "onCellMouseover", null)
    
    inline def setOnCellMouseoverUndefined: Self = StObject.set(x, "onCellMouseover", js.undefined)
    
    inline def setOnCellOpenedit(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellOpenedit", value.asInstanceOf[js.Any])
    
    inline def setOnCellOpeneditNull: Self = StObject.set(x, "onCellOpenedit", null)
    
    inline def setOnCellOpeneditUndefined: Self = StObject.set(x, "onCellOpenedit", js.undefined)
    
    inline def setOnCellPaste(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellPaste", value.asInstanceOf[js.Any])
    
    inline def setOnCellPasteNull: Self = StObject.set(x, "onCellPaste", null)
    
    inline def setOnCellPasteUndefined: Self = StObject.set(x, "onCellPaste", js.undefined)
    
    inline def setOnCellRightclick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onCellRightclick", value.asInstanceOf[js.Any])
    
    inline def setOnCellRightclickNull: Self = StObject.set(x, "onCellRightclick", null)
    
    inline def setOnCellRightclickUndefined: Self = StObject.set(x, "onCellRightclick", js.undefined)
    
    inline def setOnColumnClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onColumnClick", value.asInstanceOf[js.Any])
    
    inline def setOnColumnClickNull: Self = StObject.set(x, "onColumnClick", null)
    
    inline def setOnColumnClickUndefined: Self = StObject.set(x, "onColumnClick", js.undefined)
    
    inline def setOnColumnFilter(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onColumnFilter", value.asInstanceOf[js.Any])
    
    inline def setOnColumnFilterNull: Self = StObject.set(x, "onColumnFilter", null)
    
    inline def setOnColumnFilterUndefined: Self = StObject.set(x, "onColumnFilter", js.undefined)
    
    inline def setOnColumnMouseout(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onColumnMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnColumnMouseoutNull: Self = StObject.set(x, "onColumnMouseout", null)
    
    inline def setOnColumnMouseoutUndefined: Self = StObject.set(x, "onColumnMouseout", js.undefined)
    
    inline def setOnColumnMouseover(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onColumnMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnColumnMouseoverNull: Self = StObject.set(x, "onColumnMouseover", null)
    
    inline def setOnColumnMouseoverUndefined: Self = StObject.set(x, "onColumnMouseover", js.undefined)
    
    inline def setOnDataCellBeforechange(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataCellBeforechange", value.asInstanceOf[js.Any])
    
    inline def setOnDataCellBeforechangeNull: Self = StObject.set(x, "onDataCellBeforechange", null)
    
    inline def setOnDataCellBeforechangeUndefined: Self = StObject.set(x, "onDataCellBeforechange", js.undefined)
    
    inline def setOnDataCellChange(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataCellChange", value.asInstanceOf[js.Any])
    
    inline def setOnDataCellChangeNull: Self = StObject.set(x, "onDataCellChange", null)
    
    inline def setOnDataCellChangeUndefined: Self = StObject.set(x, "onDataCellChange", js.undefined)
    
    inline def setOnDataLoad(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataLoad", value.asInstanceOf[js.Any])
    
    inline def setOnDataLoadNull: Self = StObject.set(x, "onDataLoad", null)
    
    inline def setOnDataLoadUndefined: Self = StObject.set(x, "onDataLoad", js.undefined)
    
    inline def setOnDataRecordBeforechange(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordBeforechange", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordBeforechangeNull: Self = StObject.set(x, "onDataRecordBeforechange", null)
    
    inline def setOnDataRecordBeforechangeUndefined: Self = StObject.set(x, "onDataRecordBeforechange", js.undefined)
    
    inline def setOnDataRecordBeforedelete(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordBeforedelete", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordBeforedeleteNull: Self = StObject.set(x, "onDataRecordBeforedelete", null)
    
    inline def setOnDataRecordBeforedeleteUndefined: Self = StObject.set(x, "onDataRecordBeforedelete", js.undefined)
    
    inline def setOnDataRecordBeforeinsert(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordBeforeinsert", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordBeforeinsertNull: Self = StObject.set(x, "onDataRecordBeforeinsert", null)
    
    inline def setOnDataRecordBeforeinsertUndefined: Self = StObject.set(x, "onDataRecordBeforeinsert", js.undefined)
    
    inline def setOnDataRecordChange(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordChange", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordChangeNull: Self = StObject.set(x, "onDataRecordChange", null)
    
    inline def setOnDataRecordChangeUndefined: Self = StObject.set(x, "onDataRecordChange", js.undefined)
    
    inline def setOnDataRecordDelete(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordDelete", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordDeleteNull: Self = StObject.set(x, "onDataRecordDelete", null)
    
    inline def setOnDataRecordDeleteUndefined: Self = StObject.set(x, "onDataRecordDelete", js.undefined)
    
    inline def setOnDataRecordInsert(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordInsert", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordInsertNull: Self = StObject.set(x, "onDataRecordInsert", null)
    
    inline def setOnDataRecordInsertUndefined: Self = StObject.set(x, "onDataRecordInsert", js.undefined)
    
    inline def setOnDataRecordOpeninsert(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onDataRecordOpeninsert", value.asInstanceOf[js.Any])
    
    inline def setOnDataRecordOpeninsertNull: Self = StObject.set(x, "onDataRecordOpeninsert", null)
    
    inline def setOnDataRecordOpeninsertUndefined: Self = StObject.set(x, "onDataRecordOpeninsert", js.undefined)
    
    inline def setOnGridBeforerender(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridBeforerender", value.asInstanceOf[js.Any])
    
    inline def setOnGridBeforerenderNull: Self = StObject.set(x, "onGridBeforerender", null)
    
    inline def setOnGridBeforerenderUndefined: Self = StObject.set(x, "onGridBeforerender", js.undefined)
    
    inline def setOnGridContextmenuclose(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridContextmenuclose", value.asInstanceOf[js.Any])
    
    inline def setOnGridContextmenucloseNull: Self = StObject.set(x, "onGridContextmenuclose", null)
    
    inline def setOnGridContextmenucloseUndefined: Self = StObject.set(x, "onGridContextmenuclose", js.undefined)
    
    inline def setOnGridContextmenuopen(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridContextmenuopen", value.asInstanceOf[js.Any])
    
    inline def setOnGridContextmenuopenNull: Self = StObject.set(x, "onGridContextmenuopen", null)
    
    inline def setOnGridContextmenuopenUndefined: Self = StObject.set(x, "onGridContextmenuopen", js.undefined)
    
    inline def setOnGridDeselect(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridDeselect", value.asInstanceOf[js.Any])
    
    inline def setOnGridDeselectNull: Self = StObject.set(x, "onGridDeselect", null)
    
    inline def setOnGridDeselectUndefined: Self = StObject.set(x, "onGridDeselect", js.undefined)
    
    inline def setOnGridHydrate(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridHydrate", value.asInstanceOf[js.Any])
    
    inline def setOnGridHydrateNull: Self = StObject.set(x, "onGridHydrate", null)
    
    inline def setOnGridHydrateUndefined: Self = StObject.set(x, "onGridHydrate", js.undefined)
    
    inline def setOnGridKeydownesc(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridKeydownesc", value.asInstanceOf[js.Any])
    
    inline def setOnGridKeydownescNull: Self = StObject.set(x, "onGridKeydownesc", null)
    
    inline def setOnGridKeydownescUndefined: Self = StObject.set(x, "onGridKeydownesc", js.undefined)
    
    inline def setOnGridPagechange(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridPagechange", value.asInstanceOf[js.Any])
    
    inline def setOnGridPagechangeNull: Self = StObject.set(x, "onGridPagechange", null)
    
    inline def setOnGridPagechangeUndefined: Self = StObject.set(x, "onGridPagechange", js.undefined)
    
    inline def setOnGridPagefirst(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridPagefirst", value.asInstanceOf[js.Any])
    
    inline def setOnGridPagefirstNull: Self = StObject.set(x, "onGridPagefirst", null)
    
    inline def setOnGridPagefirstUndefined: Self = StObject.set(x, "onGridPagefirst", js.undefined)
    
    inline def setOnGridPagelast(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridPagelast", value.asInstanceOf[js.Any])
    
    inline def setOnGridPagelastNull: Self = StObject.set(x, "onGridPagelast", null)
    
    inline def setOnGridPagelastUndefined: Self = StObject.set(x, "onGridPagelast", js.undefined)
    
    inline def setOnGridPagenext(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridPagenext", value.asInstanceOf[js.Any])
    
    inline def setOnGridPagenextNull: Self = StObject.set(x, "onGridPagenext", null)
    
    inline def setOnGridPagenextUndefined: Self = StObject.set(x, "onGridPagenext", js.undefined)
    
    inline def setOnGridPageprev(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridPageprev", value.asInstanceOf[js.Any])
    
    inline def setOnGridPageprevNull: Self = StObject.set(x, "onGridPageprev", null)
    
    inline def setOnGridPageprevUndefined: Self = StObject.set(x, "onGridPageprev", js.undefined)
    
    inline def setOnGridPagesizechange(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridPagesizechange", value.asInstanceOf[js.Any])
    
    inline def setOnGridPagesizechangeNull: Self = StObject.set(x, "onGridPagesizechange", null)
    
    inline def setOnGridPagesizechangeUndefined: Self = StObject.set(x, "onGridPagesizechange", js.undefined)
    
    inline def setOnGridReady(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridReady", value.asInstanceOf[js.Any])
    
    inline def setOnGridReadyNull: Self = StObject.set(x, "onGridReady", null)
    
    inline def setOnGridReadyUndefined: Self = StObject.set(x, "onGridReady", js.undefined)
    
    inline def setOnGridRefresh(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridRefresh", value.asInstanceOf[js.Any])
    
    inline def setOnGridRefreshNull: Self = StObject.set(x, "onGridRefresh", null)
    
    inline def setOnGridRefreshUndefined: Self = StObject.set(x, "onGridRefresh", js.undefined)
    
    inline def setOnGridRender(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridRender", value.asInstanceOf[js.Any])
    
    inline def setOnGridRenderNull: Self = StObject.set(x, "onGridRender", null)
    
    inline def setOnGridRenderUndefined: Self = StObject.set(x, "onGridRender", js.undefined)
    
    inline def setOnGridScroll(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridScroll", value.asInstanceOf[js.Any])
    
    inline def setOnGridScrollNull: Self = StObject.set(x, "onGridScroll", null)
    
    inline def setOnGridScrollUndefined: Self = StObject.set(x, "onGridScroll", js.undefined)
    
    inline def setOnGridSearch(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridSearch", value.asInstanceOf[js.Any])
    
    inline def setOnGridSearchNull: Self = StObject.set(x, "onGridSearch", null)
    
    inline def setOnGridSearchUndefined: Self = StObject.set(x, "onGridSearch", js.undefined)
    
    inline def setOnGridSelect(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridSelect", value.asInstanceOf[js.Any])
    
    inline def setOnGridSelectNull: Self = StObject.set(x, "onGridSelect", null)
    
    inline def setOnGridSelectUndefined: Self = StObject.set(x, "onGridSelect", js.undefined)
    
    inline def setOnGridSelectall(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onGridSelectall", value.asInstanceOf[js.Any])
    
    inline def setOnGridSelectallNull: Self = StObject.set(x, "onGridSelectall", null)
    
    inline def setOnGridSelectallUndefined: Self = StObject.set(x, "onGridSelectall", js.undefined)
    
    inline def setOnHeaderClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onHeaderClick", value.asInstanceOf[js.Any])
    
    inline def setOnHeaderClickNull: Self = StObject.set(x, "onHeaderClick", null)
    
    inline def setOnHeaderClickUndefined: Self = StObject.set(x, "onHeaderClick", js.undefined)
    
    inline def setOnMenuClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onMenuClick", value.asInstanceOf[js.Any])
    
    inline def setOnMenuClickNull: Self = StObject.set(x, "onMenuClick", null)
    
    inline def setOnMenuClickUndefined: Self = StObject.set(x, "onMenuClick", js.undefined)
    
    inline def setOnRecordClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRecordClick", value.asInstanceOf[js.Any])
    
    inline def setOnRecordClickNull: Self = StObject.set(x, "onRecordClick", null)
    
    inline def setOnRecordClickUndefined: Self = StObject.set(x, "onRecordClick", js.undefined)
    
    inline def setOnRecordMouseout(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRecordMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnRecordMouseoutNull: Self = StObject.set(x, "onRecordMouseout", null)
    
    inline def setOnRecordMouseoutUndefined: Self = StObject.set(x, "onRecordMouseout", js.undefined)
    
    inline def setOnRecordMouseover(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRecordMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnRecordMouseoverNull: Self = StObject.set(x, "onRecordMouseover", null)
    
    inline def setOnRecordMouseoverUndefined: Self = StObject.set(x, "onRecordMouseover", js.undefined)
    
    inline def setOnRowClick(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRowClick", value.asInstanceOf[js.Any])
    
    inline def setOnRowClickNull: Self = StObject.set(x, "onRowClick", null)
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowMouseout(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRowMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnRowMouseoutNull: Self = StObject.set(x, "onRowMouseout", null)
    
    inline def setOnRowMouseoutUndefined: Self = StObject.set(x, "onRowMouseout", js.undefined)
    
    inline def setOnRowMouseover(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRowMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnRowMouseoverNull: Self = StObject.set(x, "onRowMouseover", null)
    
    inline def setOnRowMouseoverUndefined: Self = StObject.set(x, "onRowMouseover", js.undefined)
    
    inline def setOnRowSelect(value: js.ThisFunction1[/* this */ Window, /* ev */ CustomEvent[Any], Any]): Self = StObject.set(x, "onRowSelect", value.asInstanceOf[js.Any])
    
    inline def setOnRowSelectNull: Self = StObject.set(x, "onRowSelect", null)
    
    inline def setOnRowSelectUndefined: Self = StObject.set(x, "onRowSelect", js.undefined)
  }
}
