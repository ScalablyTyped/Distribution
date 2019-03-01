package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMenuOption extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var initialState: js.UndefOr[java.lang.String] = js.undefined
  var itemCreator: js.UndefOr[js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, _]] = js.undefined
  var itemWrapper: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeMenuOption {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Array[TreeNode] = null,
    initialState: java.lang.String = null,
    itemCreator: js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, _] = null,
    itemWrapper: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeMenuOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (data != null) __obj.updateDynamic("data")(data)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (itemCreator != null) __obj.updateDynamic("itemCreator")(itemCreator)
    if (!js.isUndefined(itemWrapper)) __obj.updateDynamic("itemWrapper")(itemWrapper)
    __obj.asInstanceOf[TreeMenuOption]
  }
}

