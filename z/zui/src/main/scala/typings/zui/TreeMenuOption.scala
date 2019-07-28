package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMenuOption extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var initialState: js.UndefOr[String] = js.undefined
  var itemCreator: js.UndefOr[js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, _]] = js.undefined
  var itemWrapper: js.UndefOr[Boolean] = js.undefined
}

object TreeMenuOption {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[TreeNode] = null,
    initialState: String = null,
    itemCreator: (/* li */ JQuery | js.Object, /* item */ TreeNode) => _ = null,
    itemWrapper: js.UndefOr[Boolean] = js.undefined
  ): TreeMenuOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (data != null) __obj.updateDynamic("data")(data)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (itemCreator != null) __obj.updateDynamic("itemCreator")(js.Any.fromFunction2(itemCreator))
    if (!js.isUndefined(itemWrapper)) __obj.updateDynamic("itemWrapper")(itemWrapper)
    __obj.asInstanceOf[TreeMenuOption]
  }
}

