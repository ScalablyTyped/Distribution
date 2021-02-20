package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTableOption extends StObject {
  
  var afterLoad: js.UndefOr[js.Function1[/* event */ AfterLoadEvent, Unit]] = js.native
  
  var checkByClickRow: js.UndefOr[Boolean] = js.native
  
  var checkable: js.UndefOr[Boolean] = js.native
  
  var checkedClass: js.UndefOr[String] = js.native
  
  var checksChanged: js.UndefOr[js.Function1[/* event */ ChecksChangeEvent, Unit]] = js.native
  
  var colHover: js.UndefOr[Boolean] = js.native
  
  var fixCellHeight: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var fixedHeaderOffset: js.UndefOr[Double] = js.native
  
  var fixedLeftWidth: js.UndefOr[String] = js.native
  
  var fixedRightWidth: js.UndefOr[String] = js.native
  
  var flexHeadDrag: js.UndefOr[Boolean] = js.native
  
  var minColWidth: js.UndefOr[Double] = js.native
  
  var minFixedLeftWidth: js.UndefOr[Double] = js.native
  
  var minFixedRightWidth: js.UndefOr[Double] = js.native
  
  var minFlexAreaWidth: js.UndefOr[Double] = js.native
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  
  var rowHover: js.UndefOr[Boolean] = js.native
  
  var scrollPos: js.UndefOr[String] = js.native
  
  var selectable: js.UndefOr[Boolean | js.Object] = js.native
  
  var sizeChanged: js.UndefOr[js.Function1[/* event */ SizeChangeEvent, Unit]] = js.native
  
  var sort: js.UndefOr[js.Function1[/* event */ SortEvent, Unit]] = js.native
  
  var sortable: js.UndefOr[Boolean] = js.native
  
  var storage: js.UndefOr[Boolean] = js.native
}
object DataTableOption {
  
  @scala.inline
  def apply(): DataTableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableOption]
  }
  
  @scala.inline
  implicit class DataTableOptionMutableBuilder[Self <: DataTableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterLoad(value: /* event */ AfterLoadEvent => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
    
    @scala.inline
    def setCheckByClickRow(value: Boolean): Self = StObject.set(x, "checkByClickRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckByClickRowUndefined: Self = StObject.set(x, "checkByClickRow", js.undefined)
    
    @scala.inline
    def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
    
    @scala.inline
    def setCheckedClass(value: String): Self = StObject.set(x, "checkedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedClassUndefined: Self = StObject.set(x, "checkedClass", js.undefined)
    
    @scala.inline
    def setChecksChanged(value: /* event */ ChecksChangeEvent => Unit): Self = StObject.set(x, "checksChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChecksChangedUndefined: Self = StObject.set(x, "checksChanged", js.undefined)
    
    @scala.inline
    def setColHover(value: Boolean): Self = StObject.set(x, "colHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColHoverUndefined: Self = StObject.set(x, "colHover", js.undefined)
    
    @scala.inline
    def setFixCellHeight(value: Boolean): Self = StObject.set(x, "fixCellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixCellHeightUndefined: Self = StObject.set(x, "fixCellHeight", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderOffset(value: Double): Self = StObject.set(x, "fixedHeaderOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderOffsetUndefined: Self = StObject.set(x, "fixedHeaderOffset", js.undefined)
    
    @scala.inline
    def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    @scala.inline
    def setFixedLeftWidth(value: String): Self = StObject.set(x, "fixedLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedLeftWidthUndefined: Self = StObject.set(x, "fixedLeftWidth", js.undefined)
    
    @scala.inline
    def setFixedRightWidth(value: String): Self = StObject.set(x, "fixedRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRightWidthUndefined: Self = StObject.set(x, "fixedRightWidth", js.undefined)
    
    @scala.inline
    def setFlexHeadDrag(value: Boolean): Self = StObject.set(x, "flexHeadDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexHeadDragUndefined: Self = StObject.set(x, "flexHeadDrag", js.undefined)
    
    @scala.inline
    def setMinColWidth(value: Double): Self = StObject.set(x, "minColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinColWidthUndefined: Self = StObject.set(x, "minColWidth", js.undefined)
    
    @scala.inline
    def setMinFixedLeftWidth(value: Double): Self = StObject.set(x, "minFixedLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFixedLeftWidthUndefined: Self = StObject.set(x, "minFixedLeftWidth", js.undefined)
    
    @scala.inline
    def setMinFixedRightWidth(value: Double): Self = StObject.set(x, "minFixedRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFixedRightWidthUndefined: Self = StObject.set(x, "minFixedRightWidth", js.undefined)
    
    @scala.inline
    def setMinFlexAreaWidth(value: Double): Self = StObject.set(x, "minFlexAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFlexAreaWidthUndefined: Self = StObject.set(x, "minFlexAreaWidth", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRowHover(value: Boolean): Self = StObject.set(x, "rowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
    
    @scala.inline
    def setScrollPos(value: String): Self = StObject.set(x, "scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPosUndefined: Self = StObject.set(x, "scrollPos", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | js.Object): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSizeChanged(value: /* event */ SizeChangeEvent => Unit): Self = StObject.set(x, "sizeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSizeChangedUndefined: Self = StObject.set(x, "sizeChanged", js.undefined)
    
    @scala.inline
    def setSort(value: /* event */ SortEvent => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setStorage(value: Boolean): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
