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

