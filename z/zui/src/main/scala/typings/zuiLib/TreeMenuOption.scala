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

