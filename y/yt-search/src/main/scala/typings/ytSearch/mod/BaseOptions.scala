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
  def apply(pageEnd: Int | Double = null, pageStart: Int | Double = null): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (pageEnd != null) __obj.updateDynamic("pageEnd")(pageEnd.asInstanceOf[js.Any])
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

