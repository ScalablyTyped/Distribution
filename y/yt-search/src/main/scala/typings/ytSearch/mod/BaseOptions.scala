package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var pageEnd: js.UndefOr[Double] = js.undefined
  var pageStart: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(pageEnd: js.UndefOr[Double] = js.undefined, pageStart: js.UndefOr[Double] = js.undefined): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageEnd)) __obj.updateDynamic("pageEnd")(pageEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageStart)) __obj.updateDynamic("pageStart")(pageStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

