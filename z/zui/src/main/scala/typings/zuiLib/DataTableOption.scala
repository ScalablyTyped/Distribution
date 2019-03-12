package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableOption extends js.Object {
  var afterLoad: js.UndefOr[js.Function1[/* event */ AfterLoadEvent, scala.Unit]] = js.undefined
  var checkByClickRow: js.UndefOr[scala.Boolean] = js.undefined
  var checkable: js.UndefOr[scala.Boolean] = js.undefined
  var checkedClass: js.UndefOr[java.lang.String] = js.undefined
  var checksChanged: js.UndefOr[js.Function1[/* event */ ChecksChangeEvent, scala.Unit]] = js.undefined
  var colHover: js.UndefOr[scala.Boolean] = js.undefined
  var fixCellHeight: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeaderOffset: js.UndefOr[scala.Double] = js.undefined
  var fixedLeftWidth: js.UndefOr[java.lang.String] = js.undefined
  var fixedRightWidth: js.UndefOr[java.lang.String] = js.undefined
  var flexHeadDrag: js.UndefOr[scala.Boolean] = js.undefined
  var minColWidth: js.UndefOr[scala.Double] = js.undefined
  var minFixedLeftWidth: js.UndefOr[scala.Double] = js.undefined
  var minFixedRightWidth: js.UndefOr[scala.Double] = js.undefined
  var minFlexAreaWidth: js.UndefOr[scala.Double] = js.undefined
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var rowHover: js.UndefOr[scala.Boolean] = js.undefined
  var scrollPos: js.UndefOr[java.lang.String] = js.undefined
  var selectable: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var sizeChanged: js.UndefOr[js.Function1[/* event */ SizeChangeEvent, scala.Unit]] = js.undefined
  var sort: js.UndefOr[js.Function1[/* event */ SortEvent, scala.Unit]] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  var storage: js.UndefOr[scala.Boolean] = js.undefined
}

object DataTableOption {
  @scala.inline
  def apply(
    afterLoad: /* event */ AfterLoadEvent => scala.Unit = null,
    checkByClickRow: js.UndefOr[scala.Boolean] = js.undefined,
    checkable: js.UndefOr[scala.Boolean] = js.undefined,
    checkedClass: java.lang.String = null,
    checksChanged: /* event */ ChecksChangeEvent => scala.Unit = null,
    colHover: js.UndefOr[scala.Boolean] = js.undefined,
    fixCellHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeaderOffset: scala.Int | scala.Double = null,
    fixedLeftWidth: java.lang.String = null,
    fixedRightWidth: java.lang.String = null,
    flexHeadDrag: js.UndefOr[scala.Boolean] = js.undefined,
    minColWidth: scala.Int | scala.Double = null,
    minFixedLeftWidth: scala.Int | scala.Double = null,
    minFixedRightWidth: scala.Int | scala.Double = null,
    minFlexAreaWidth: scala.Int | scala.Double = null,
    ready: () => scala.Unit = null,
    rowHover: js.UndefOr[scala.Boolean] = js.undefined,
    scrollPos: java.lang.String = null,
    selectable: scala.Boolean | js.Object = null,
    sizeChanged: /* event */ SizeChangeEvent => scala.Unit = null,
    sort: /* event */ SortEvent => scala.Unit = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    storage: js.UndefOr[scala.Boolean] = js.undefined
  ): DataTableOption = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction1(afterLoad))
    if (!js.isUndefined(checkByClickRow)) __obj.updateDynamic("checkByClickRow")(checkByClickRow)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable)
    if (checkedClass != null) __obj.updateDynamic("checkedClass")(checkedClass)
    if (checksChanged != null) __obj.updateDynamic("checksChanged")(js.Any.fromFunction1(checksChanged))
    if (!js.isUndefined(colHover)) __obj.updateDynamic("colHover")(colHover)
    if (!js.isUndefined(fixCellHeight)) __obj.updateDynamic("fixCellHeight")(fixCellHeight)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (fixedHeaderOffset != null) __obj.updateDynamic("fixedHeaderOffset")(fixedHeaderOffset.asInstanceOf[js.Any])
    if (fixedLeftWidth != null) __obj.updateDynamic("fixedLeftWidth")(fixedLeftWidth)
    if (fixedRightWidth != null) __obj.updateDynamic("fixedRightWidth")(fixedRightWidth)
    if (!js.isUndefined(flexHeadDrag)) __obj.updateDynamic("flexHeadDrag")(flexHeadDrag)
    if (minColWidth != null) __obj.updateDynamic("minColWidth")(minColWidth.asInstanceOf[js.Any])
    if (minFixedLeftWidth != null) __obj.updateDynamic("minFixedLeftWidth")(minFixedLeftWidth.asInstanceOf[js.Any])
    if (minFixedRightWidth != null) __obj.updateDynamic("minFixedRightWidth")(minFixedRightWidth.asInstanceOf[js.Any])
    if (minFlexAreaWidth != null) __obj.updateDynamic("minFlexAreaWidth")(minFlexAreaWidth.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover)
    if (scrollPos != null) __obj.updateDynamic("scrollPos")(scrollPos)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sizeChanged != null) __obj.updateDynamic("sizeChanged")(js.Any.fromFunction1(sizeChanged))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1(sort))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (!js.isUndefined(storage)) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[DataTableOption]
  }
}

