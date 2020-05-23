package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithQuery
  extends BaseOptions
     with Options {
  var query: String
}

object OptionsWithQuery {
  @scala.inline
  def apply(
    query: String,
    pageEnd: js.UndefOr[Double] = js.undefined,
    pageStart: js.UndefOr[Double] = js.undefined
  ): OptionsWithQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(pageEnd)) __obj.updateDynamic("pageEnd")(pageEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageStart)) __obj.updateDynamic("pageStart")(pageStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithQuery]
  }
}

