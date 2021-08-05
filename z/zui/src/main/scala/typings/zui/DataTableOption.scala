package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableOption extends StObject {
  
  var afterLoad: js.UndefOr[js.Function1[/* event */ AfterLoadEvent, Unit]] = js.undefined
  
  var checkByClickRow: js.UndefOr[Boolean] = js.undefined
  
  var checkable: js.UndefOr[Boolean] = js.undefined
  
  var checkedClass: js.UndefOr[String] = js.undefined
  
  var checksChanged: js.UndefOr[js.Function1[/* event */ ChecksChangeEvent, Unit]] = js.undefined
  
  var colHover: js.UndefOr[Boolean] = js.undefined
  
  var fixCellHeight: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeaderOffset: js.UndefOr[Double] = js.undefined
  
  var fixedLeftWidth: js.UndefOr[String] = js.undefined
  
  var fixedRightWidth: js.UndefOr[String] = js.undefined
  
  var flexHeadDrag: js.UndefOr[Boolean] = js.undefined
  
  var minColWidth: js.UndefOr[Double] = js.undefined
  
  var minFixedLeftWidth: js.UndefOr[Double] = js.undefined
  
  var minFixedRightWidth: js.UndefOr[Double] = js.undefined
  
  var minFlexAreaWidth: js.UndefOr[Double] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var rowHover: js.UndefOr[Boolean] = js.undefined
  
  var scrollPos: js.UndefOr[String] = js.undefined
  
  var selectable: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var sizeChanged: js.UndefOr[js.Function1[/* event */ SizeChangeEvent, Unit]] = js.undefined
  
  var sort: js.UndefOr[js.Function1[/* event */ SortEvent, Unit]] = js.undefined
  
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  var storage: js.UndefOr[Boolean] = js.undefined
}
object DataTableOption {
  
  inline def apply(): DataTableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableOption]
  }
  
  extension [Self <: DataTableOption](x: Self) {
    
    inline def setAfterLoad(value: /* event */ AfterLoadEvent => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction1(value))
    
    inline def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
    
    inline def setCheckByClickRow(value: Boolean): Self = StObject.set(x, "checkByClickRow", value.asInstanceOf[js.Any])
    
    inline def setCheckByClickRowUndefined: Self = StObject.set(x, "checkByClickRow", js.undefined)
    
    inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
    
    inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
    
    inline def setCheckedClass(value: String): Self = StObject.set(x, "checkedClass", value.asInstanceOf[js.Any])
    
    inline def setCheckedClassUndefined: Self = StObject.set(x, "checkedClass", js.undefined)
    
    inline def setChecksChanged(value: /* event */ ChecksChangeEvent => Unit): Self = StObject.set(x, "checksChanged", js.Any.fromFunction1(value))
    
    inline def setChecksChangedUndefined: Self = StObject.set(x, "checksChanged", js.undefined)
    
    inline def setColHover(value: Boolean): Self = StObject.set(x, "colHover", value.asInstanceOf[js.Any])
    
    inline def setColHoverUndefined: Self = StObject.set(x, "colHover", js.undefined)
    
    inline def setFixCellHeight(value: Boolean): Self = StObject.set(x, "fixCellHeight", value.asInstanceOf[js.Any])
    
    inline def setFixCellHeightUndefined: Self = StObject.set(x, "fixCellHeight", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderOffset(value: Double): Self = StObject.set(x, "fixedHeaderOffset", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderOffsetUndefined: Self = StObject.set(x, "fixedHeaderOffset", js.undefined)
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setFixedLeftWidth(value: String): Self = StObject.set(x, "fixedLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setFixedLeftWidthUndefined: Self = StObject.set(x, "fixedLeftWidth", js.undefined)
    
    inline def setFixedRightWidth(value: String): Self = StObject.set(x, "fixedRightWidth", value.asInstanceOf[js.Any])
    
    inline def setFixedRightWidthUndefined: Self = StObject.set(x, "fixedRightWidth", js.undefined)
    
    inline def setFlexHeadDrag(value: Boolean): Self = StObject.set(x, "flexHeadDrag", value.asInstanceOf[js.Any])
    
    inline def setFlexHeadDragUndefined: Self = StObject.set(x, "flexHeadDrag", js.undefined)
    
    inline def setMinColWidth(value: Double): Self = StObject.set(x, "minColWidth", value.asInstanceOf[js.Any])
    
    inline def setMinColWidthUndefined: Self = StObject.set(x, "minColWidth", js.undefined)
    
    inline def setMinFixedLeftWidth(value: Double): Self = StObject.set(x, "minFixedLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setMinFixedLeftWidthUndefined: Self = StObject.set(x, "minFixedLeftWidth", js.undefined)
    
    inline def setMinFixedRightWidth(value: Double): Self = StObject.set(x, "minFixedRightWidth", value.asInstanceOf[js.Any])
    
    inline def setMinFixedRightWidthUndefined: Self = StObject.set(x, "minFixedRightWidth", js.undefined)
    
    inline def setMinFlexAreaWidth(value: Double): Self = StObject.set(x, "minFlexAreaWidth", value.asInstanceOf[js.Any])
    
    inline def setMinFlexAreaWidthUndefined: Self = StObject.set(x, "minFlexAreaWidth", js.undefined)
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRowHover(value: Boolean): Self = StObject.set(x, "rowHover", value.asInstanceOf[js.Any])
    
    inline def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
    
    inline def setScrollPos(value: String): Self = StObject.set(x, "scrollPos", value.asInstanceOf[js.Any])
    
    inline def setScrollPosUndefined: Self = StObject.set(x, "scrollPos", js.undefined)
    
    inline def setSelectable(value: Boolean | js.Object): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSizeChanged(value: /* event */ SizeChangeEvent => Unit): Self = StObject.set(x, "sizeChanged", js.Any.fromFunction1(value))
    
    inline def setSizeChangedUndefined: Self = StObject.set(x, "sizeChanged", js.undefined)
    
    inline def setSort(value: /* event */ SortEvent => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setStorage(value: Boolean): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
