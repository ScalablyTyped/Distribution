package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTableOption extends js.Object {
  
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
  implicit class DataTableOptionOps[Self <: DataTableOption] (val x: Self) extends AnyVal {
    
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
    def setAfterLoad(value: /* event */ AfterLoadEvent => Unit): Self = this.set("afterLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    
    @scala.inline
    def setCheckByClickRow(value: Boolean): Self = this.set("checkByClickRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckByClickRow: Self = this.set("checkByClickRow", js.undefined)
    
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    
    @scala.inline
    def setCheckedClass(value: String): Self = this.set("checkedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedClass: Self = this.set("checkedClass", js.undefined)
    
    @scala.inline
    def setChecksChanged(value: /* event */ ChecksChangeEvent => Unit): Self = this.set("checksChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChecksChanged: Self = this.set("checksChanged", js.undefined)
    
    @scala.inline
    def setColHover(value: Boolean): Self = this.set("colHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColHover: Self = this.set("colHover", js.undefined)
    
    @scala.inline
    def setFixCellHeight(value: Boolean): Self = this.set("fixCellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixCellHeight: Self = this.set("fixCellHeight", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setFixedHeaderOffset(value: Double): Self = this.set("fixedHeaderOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeaderOffset: Self = this.set("fixedHeaderOffset", js.undefined)
    
    @scala.inline
    def setFixedLeftWidth(value: String): Self = this.set("fixedLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedLeftWidth: Self = this.set("fixedLeftWidth", js.undefined)
    
    @scala.inline
    def setFixedRightWidth(value: String): Self = this.set("fixedRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedRightWidth: Self = this.set("fixedRightWidth", js.undefined)
    
    @scala.inline
    def setFlexHeadDrag(value: Boolean): Self = this.set("flexHeadDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexHeadDrag: Self = this.set("flexHeadDrag", js.undefined)
    
    @scala.inline
    def setMinColWidth(value: Double): Self = this.set("minColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColWidth: Self = this.set("minColWidth", js.undefined)
    
    @scala.inline
    def setMinFixedLeftWidth(value: Double): Self = this.set("minFixedLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFixedLeftWidth: Self = this.set("minFixedLeftWidth", js.undefined)
    
    @scala.inline
    def setMinFixedRightWidth(value: Double): Self = this.set("minFixedRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFixedRightWidth: Self = this.set("minFixedRightWidth", js.undefined)
    
    @scala.inline
    def setMinFlexAreaWidth(value: Double): Self = this.set("minFlexAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFlexAreaWidth: Self = this.set("minFlexAreaWidth", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRowHover(value: Boolean): Self = this.set("rowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHover: Self = this.set("rowHover", js.undefined)
    
    @scala.inline
    def setScrollPos(value: String): Self = this.set("scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPos: Self = this.set("scrollPos", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | js.Object): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSizeChanged(value: /* event */ SizeChangeEvent => Unit): Self = this.set("sizeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSizeChanged: Self = this.set("sizeChanged", js.undefined)
    
    @scala.inline
    def setSort(value: /* event */ SortEvent => Unit): Self = this.set("sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setStorage(value: Boolean): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
